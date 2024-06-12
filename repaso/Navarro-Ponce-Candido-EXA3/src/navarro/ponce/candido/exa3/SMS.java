/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navarro.ponce.candido.exa3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author candido.navarro
 */


public class SMS {
    
    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nuss = " ";
        while(nuss != "exit"){
            Central.listarMedicos();
            Central.listarPacientes();
            System.out.println("*".repeat(21));
            System.out.println("** Login SMS ARCAS **");
            System.out.println("*".repeat(21));
            System.out.print("Nº Col |NUSS> ");
            nuss = teclado.nextLine();
            int codigo = Integer.parseInt(nuss);
            if(Central.identificarMedico(codigo) == true){
                System.out.println("Médico identificado");
                Medico m = Central.getMedico(codigo);
                menuMedico(m);
            }
            if(Central.identificarPaciente(codigo) == true){
                System.out.println("Paciente identificado");
                Paciente p = Central.getPaciente(codigo);
                menuPaciente(p);
            }
        }
        
    }
    public static void pedirCita(Paciente paciente) {
        Central.listarMedicos();
        System.out.print("Dime el colegiado del medido que quieras> ");
        int colegiado = Integer.parseInt(teclado.nextLine());
        Medico m = Central.getMedico(colegiado);
        Central.imprimirCalendario(m);
        System.out.print("Dime el dia para la cita (L,M,X,J,V)>");
        String dia = teclado.nextLine();
        int numero_dia = 0;
        switch(dia){
            case "L" -> {numero_dia = 0;}
            case "M" -> {numero_dia = 1;}
            case "X" -> {numero_dia = 2;}
            case "J" -> {numero_dia = 3;}
            case "V" -> {numero_dia = 4;}
            
        }
        System.out.print("Dime la hora para la cita(10,11,12)> ");
        int hora = Integer.parseInt(teclado.nextLine());
        int numero_hora = 0;
        switch(hora){
            case 10 -> {numero_hora = 0;}
            case 11 -> {numero_hora = 1;}
            case 12 -> {numero_hora = 2;}
            
        }
        Central.añadirCita(m, numero_dia, numero_hora, paciente);
        Central.imprimirCalendario(m);
        
        
        
        
  }

    private static void menuMedico(Medico medico) {
        System.out.println("Medico identificado");
        System.out.println("** Calendario de citas **");
        System.out.println("Doctor: "+medico.getApellido());
        System.out.println("Especialidad: "+medico.getEspecialidad());
        Central.imprimirCalendario(medico);
        System.out.println("Indica la cita del paciente a atender ");
        System.out.print("[INTRO para volver]");
        System.out.print("Dime el dia(L,M,X,J,V)>");
        String dia = teclado.nextLine();
        int numero_dia = 0;
        switch(dia){
            case "L" -> {numero_dia = 0;}
            case "M" -> {numero_dia = 1;}
            case "X" -> {numero_dia = 2;}
            case "J" -> {numero_dia = 3;}
            case "V" -> {numero_dia = 4;}
            
        }
        System.out.print("Dime la hora(10,11,12)> ");
        int hora = Integer.parseInt(teclado.nextLine());
        int numero_hora = 0;
        switch(hora){
            case 10 -> {numero_hora = 0;}
            case 11 -> {numero_hora = 1;}
            case 12 -> {numero_hora = 2;}
            
        }
        System.out.println("La cita del "+dia+" a las "+hora+":00 la tiene el paciente:");
        if(Central.getPacienteCita(medico,numero_dia,numero_hora)!= null){
            Paciente p = Central.getPacienteCita(medico,numero_dia,numero_hora);
            p.MostrarFicha();
            
            generarReceta(medico, p);
            Central.liberarCita(medico, numero_dia, numero_hora);
            
        }
        
  }
  
    private static void menuPaciente(Paciente paciente) {
        int opcion = 0;
        System.out.println("*".repeat(25));
        System.out.println("* Bienvenido/a Sr./Sra. "+paciente.getNombre()+ " *");
        System.out.println("*".repeat(25));
        while(opcion != 3){
            System.out.println("1. Cita previa");
            System.out.println("2. Farmacia");
            System.out.println("3. Volver");
            opcion = Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:{
                    pedirCita(paciente);
                    break;
                }
                case 2:{
                    irFarmacia(paciente);
                    break;
                }
                case 3:{
                    opcion = 3;
                    break;
                }

            }
        }
  }

    private static void generarReceta(Medico medico, Paciente paciente) {
        System.out.println("Receta: ");
            System.out.print("    Fecha:");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fecha = teclado.nextLine();
            LocalDate fecha_formateada = LocalDate.parse(fecha,dtf);
            System.out.println("Seleccione medicamento: ");
            System.out.println("1.Paracetamol");
            System.out.println("2.Ibuprofeno");
            if(medico.getEspecialidad() == Especialidad.GENERAL){
                System.out.println("3.Antibiotico");
            }
            if(medico.getEspecialidad() == Especialidad.ALERGIA){
                System.out.println("3.Antihistaminico");
            }
            System.out.print("Medicamento> ");
            int num_medicamento = Integer.parseInt(teclado.nextLine());
            Medicamento medicamento = null;
            switch(num_medicamento){
                case 1 -> {medicamento = medicamento.PARACETAMOL;}
                case 2 -> {medicamento = medicamento.IBUPROFENO;}
                case 3 -> {
                    if(medico.getEspecialidad() == Especialidad.GENERAL){
                        medicamento = medicamento.ANTIBIOTICO;
                    }else if(medico.getEspecialidad() == Especialidad.ALERGIA){
                        medicamento = medicamento.ANTIESTAMINICO;
                    }}
            }
            System.out.print("Cantidad diaria (mg): ");
            int cantidad = Integer.parseInt(teclado.nextLine());
            System.out.println("\nDuracion (dias): ");
            int duracion = Integer.parseInt(teclado.nextLine());
            
            
            Central.altaReceta(medico, paciente, fecha_formateada, medicamento, duracion, cantidad);
    
  }
  
    public static void irFarmacia(Paciente paciente) {
        Central.mostrarRecetas(paciente);
  }
    
    
}
