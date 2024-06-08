/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Central {

    private static HashMap<Integer, Medico> mapaMedicos = new HashMap();
    private static HashMap<Integer, Paciente> mapaPacientes = new HashMap();
    private static HashMap<Medico, Paciente[][]> mapaCitas = new HashMap();
    private static ArrayList<Receta> listaRecetas = new ArrayList<>();
    ;
  
  private static Connection conexion;

    private static Central central = new Central();

    private Central() {
        //Paciente[][] horarioPacientes = new Paciente[3][5];
        // Añadir médicos
        Medico medico = new Medico("Alfonso", "López", LocalDate.parse("1980-02-20"));
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
        mapaCitas.put(medico, new Paciente[3][5]);
        medico = new Medico("Rocio", "Belmonte", LocalDate.parse("1985-10-02"));
        medico.setEspecialidad(Especialidad.ALERGIA);
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
        mapaCitas.put(medico, new Paciente[3][5]);
//    medico = new Medico("Julián","Alcántara",LocalDate.parse("1982-05-14"));
//    medico.setEspecialidad(Especialidad.CARDIOLOGÍA);
//    mapaMedicos.put(medico.getNumeroColegiado(), medico);

        //Añadir pacientes
        Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
        mapaPacientes.put(paciente.getNuss(), paciente);
        //mapaRecetas.put(paciente.getNuss(),listaRecetas);
        paciente = new Paciente("Mario", "Ponce", LocalDate.parse("2015-03-14"));
        mapaPacientes.put(paciente.getNuss(), paciente);
        //mapaRecetas.put(paciente.getNuss(),listaRecetas);
    }

//  public static void addCita(LocalDate fecha, LocalTime hora, int numColegiado, int nuss) {
//    if (mapaMedicos.containsKey(numColegiado)) {
//      if (mapaPacientes.containsKey(nuss)) {
//        mapaCitas.put(LocalDateTime.of(fecha, hora),
//                new Cita(fecha, mapaMedicos.get(numColegiado), 
//                        mapaPacientes.get(nuss)));
//      } else {
//        System.out.println("Cita anulada: paciente inexistente.");
//      }
//    } else {
//      System.out.println("Cita anulada: médico inexistente.");
//    }
//      
//  }
    public static Medico getMedico(int colegiado) {
        if (mapaMedicos.containsKey(colegiado)) {
            return mapaMedicos.get(colegiado);
        }
        return null;
    }

    public static boolean identificarMedico(int colegiado) {
        return mapaMedicos.containsKey(colegiado);
    }

    public static boolean identificarPaciente(int nuss) {
        return mapaPacientes.containsKey(nuss);
    }

    public static Paciente getPaciente(int nuss) {
        return mapaPacientes.get(nuss);
    }

    // Mostrar
    public static void listarMedicos() {
        System.out.println("** MEDICOS *************************************");
        Iterator it = mapaMedicos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //Integer key = (Integer) entry.getKey();
            Medico value = (Medico) entry.getValue();
            System.out.println(value.toString());
        }
        System.out.println("");
    }

    // Pedir
    public static void listarPacientes() {
        System.out.println("** PACIENTES ***********************************");
        for (Map.Entry entry : mapaPacientes.entrySet()) {
            System.out.println(((Paciente) entry.getValue()).toString());
        }
        System.out.println("************************************************");
        System.out.println("");
    }

    public static void altaReceta(Medico medico, Paciente paciente, LocalDate fecha, Medicamento medicamento, int duracion, double dosis) {

        Receta receta = new Receta(medico, paciente, medicamento, fecha, duracion, dosis);
        listaRecetas.add(receta);
        receta.mostrarFicha();

        try {
            cargarDriverBBDD();
            conectar();
            Statement statement = conexion.createStatement();
            String sql = "INSERT INTO receta VALUES(NULL, " + medico.getNumeroColegiado() + ", " + paciente.getNuss() + ", '" + medicamento + "', '" + fecha + "', " + duracion + ", " + dosis + ")";
            statement.executeUpdate(sql);
            statement.close();
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarRecetas(Paciente paciente) {
        try {
            cargarDriverBBDD();
            conectar();
            int nuss = paciente.getNuss();
            String sql = "SELECT NumeroColeg, Medicamento, Fecha, Duracion, Dosis  FROM receta WHERE nuss=" + nuss;
            Statement statement;
            statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int NumeroColeg = rs.getInt("NumeroColeg");
                Medicamento medicamento = Medicamento.valueOf(rs.getString("Medicamento"));
                LocalDate Fecha = LocalDate.parse(rs.getDate("Fecha").toString());
                int Duracion = rs.getInt("Duracion");
                double Dosis = rs.getDouble("Dosis");
                Receta r = new Receta(mapaMedicos.get(NumeroColeg), paciente, medicamento, Fecha, Duracion, Dosis);
                listaRecetas.add(r);
            }
            rs.close();
            statement.close();
            desconectar();

        } catch (SQLException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!listaRecetas.isEmpty()) {

            System.out.println("-".repeat(50));
            System.out.printf("%-10s  %-15s   %-5s  %4s  %s%n",
                    "Fecha", "Medicamento", "Dosis", "Días", "Médico");
            System.out.println("-".repeat(50));

            for (Receta receta : listaRecetas) {
                if (receta.getPaciente().equals(paciente)) {
                    System.out.println(receta.toString());
                }
            }
            System.out.println("-".repeat(50));
        } else {
            System.out.println("No hay recetas para el paciente " + paciente.getNuss());
        }

    }

    public static boolean añadirCita(Medico medico, int dia, int hora, Paciente paciente) {
        boolean añadida = false;
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        if ((dia >= 0 && dia < 5) && (hora >= 0 && hora < 3) && horarioPacientes[hora][dia] == null) {
            horarioPacientes[hora][dia] = paciente;
            añadida = true;
        } else {
            System.out.println("Error: no se ha podido guardar su cita");
        }
        return añadida;
    }

    public static boolean liberarCita(Medico medico, int dia, int hora) {
        boolean liberada = false;
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        if ((dia >= 0 && dia < 5) && (hora >= 0 && hora < 3)) {
            horarioPacientes[hora][dia] = null;
            liberada = true;
        } else {
            System.out.println("Error: no se ha podido liberar la cita");
        }
        return liberada;
    }

    public static Paciente getPacienteCita(Medico medico, int dia, int hora) {
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        return horarioPacientes[hora][dia];
    }

    public static void imprimirCalendario(Medico medico) {
        Paciente[][] horarioPacientes = mapaCitas.get(medico);
        System.out.println("** Calendario de citas **");
        System.out.printf("Doctor: %s %nEspecialidad: %s%n", medico.getApellido(), medico.getEspecialidad());
        System.out.println("      | LUN | MAR | MIE | JUE | VIE |");
        System.out.println("-------------------------------------");
        int horaS = 10;
        for (int hora = 0; hora < 3; hora++) {
            horaS += hora;
            System.out.print(horaS + ":00 | ");
            for (int dia = 0; dia < 5; dia++) {
                String texto = (horarioPacientes[hora][dia] == null) ? " - " : "*" + horarioPacientes[hora][dia].getDni().substring(4, 6);
                //pacientes[hora][dia] = " - ";
                System.out.print(texto + " | ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");
    }

    private static void cargarDriverBBDD() {
        // Cargar driver
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void conectar() {

        // Conectar
        String url = "jdbc:mariadb://localhost:3306/smsarcas";
        String user = "root";
        String password = "";

        try {
            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
