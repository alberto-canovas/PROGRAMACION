package sms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SMS {

  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    
//    Medico medico = new Medico("Alfonso", "López", LocalDate.parse("1980-02-20"));
//    Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
//    Receta receta = new Receta(medico, paciente, Medicamento.ANTIBIOTICO,
//            LocalDate.now(), 5, 1500);
//    receta.mostrarReceta();
    Central.listarMedicos();
    Central.listarPacientes();
    
    String entrada, dni;
    int identidad;
    do {
      System.out.println("*********************");
      System.out.println("** Login SMS ARCAS **");
      System.out.println("*********************");
      System.out.print("NºCol.|NUSS> ");
      entrada = sc.nextLine();
      try {
        identidad = Integer.parseInt(entrada);
        if (Central.identificarMedico(identidad)) {
          System.out.println("Médico identificado.\n");
          menuMedico(Central.getMedico(identidad));
        }
        if (Central.identificarPaciente(identidad)) {
          System.out.println("Paciente identificado.\n");
          menuPaciente(Central.getPaciente(identidad));
        }
      } catch(NumberFormatException ex) {
        if (entrada.toLowerCase().equals("exit"))
          break;
        System.out.println("Introduce una identidad válida");
        //System.out.println(ex.getMessage());
      }
      System.out.println("");
    } while(!entrada.toLowerCase().equals("exit"));
    
  }//Main   

  public static void pedirCita(Paciente paciente) {
    int colegiado;
    Medico medico = null;
    boolean continuar = true;
    System.out.println("***************************");
    System.out.println("*  Cita Previa SMS ARCAS  *");
    System.out.println("***************************");
    //System.out.println("");
    System.out.println("Selecciona un médico:");
    Central.listarMedicos();
    do {
      System.out.print("Col. Nº> ");
      try {
        colegiado = Integer.parseInt(sc.nextLine());
        medico = Central.getMedico(colegiado);
        if (medico != null) {
          continuar = false;
          //medico.imprimirCalendario();
          Central.imprimirCalendario(medico);
        } else {
          System.out.println("Introduce un número colegiado válido");
        }
      } catch(NumberFormatException ex) {
        System.out.println("Introduce un número colegiado válido");
        //System.out.println(ex.getMessage());
      }
    } while(continuar);
    String diaS,horaS;
    int dia = 0, hora = 0;
    continuar = true;
    do {
      System.out.print("Dia[L,M,X,J,V]> ");
      diaS = sc.nextLine().toUpperCase();
      System.out.print("Hora[10,11,12]> ");
      horaS = sc.nextLine();
      if (diaS.matches("(L|M|X|J|V)") && horaS.matches("(10|11|12)")) {
        switch(diaS) {
          case "L" -> {dia=0;}
          case "M" -> {dia=1;}
          case "X" -> {dia=2;}
          case "J" -> {dia=3;}
          case "V" -> {dia=4;}
        }
        switch(horaS) {
          case "10" -> {hora=0;}
          case "11" -> {hora=1;}
          case "12" -> {hora=2;}
        }
        if (medico!=null)
          Central.añadirCita(medico, dia, hora, paciente);
          //medico.añadirCita(dia, hora, paciente);
        continuar = false;
      } else {
        System.out.println("Introduce un dia y hora válidos");
      }
    } while(continuar);
    if (medico!=null)
      Central.imprimirCalendario(medico);
     //medico.imprimirCalendario();
  }

  private static void menuPaciente(Paciente paciente) {
    String entrada;
    int opcion;
    boolean continuar = true;
    System.out.println("**********************************");
    System.out.printf("* Bienvenido/a Sr./Sra. %-8s *%n",paciente.getNombre());
    System.out.println("**********************************");
    do {
    System.out.println("1. Cita previa");
    System.out.println("2. Farmacia");
    System.out.println("3. Volver");
      System.out.print("Opcion> ");
      entrada = sc.nextLine();
      if(entrada.matches("[1-3]")) {
        switch (entrada) {
          case "1" -> {pedirCita(paciente);}
          case "2" -> {irFarmacia(paciente);}
          case "3" -> {continuar=false;}
        }
        System.out.println("");
      } else {
        System.out.println("Opción no reconocida");
      }
    } while(continuar);
  }

  private static void menuMedico(Medico medico) {
    //medico.imprimirCalendario();
    Central.imprimirCalendario(medico);
    String diaS,horaS;
    int dia = 0, hora = 0;
    do {
      System.out.println("Indica cita del paciente a atender \n[INTRO para volver]:");
      System.out.print("Dia[L,M,X,J,V]> ");
      diaS = sc.nextLine().toUpperCase();
      System.out.print("Hora[10,11,12]> ");
      horaS = sc.nextLine();
      if (diaS.matches("(L|M|X|J|V)") && horaS.matches("(10|11|12)")) {
        switch(diaS) {
          case "L" -> {dia=0;}
          case "M" -> {dia=1;}
          case "X" -> {dia=2;}
          case "J" -> {dia=3;}
          case "V" -> {dia=4;}
        }
        switch(horaS) {
          case "10" -> {hora=0;}
          case "11" -> {hora=1;}
          case "12" -> {hora=2;}
        }
        //Paciente paciente = medico.getPaciente(dia, hora);
        Paciente paciente = Central.getPacienteCita(medico, dia, hora);
        if (paciente!=null) {
          System.out.printf("La cita del %s a las %s:00 la tiene el paciente:%n",diaS,horaS);
          paciente.mostrarFicha();
          generarReceta(medico,paciente);
          //Liberar cita
          Central.liberarCita(medico, dia, hora);
          break;
        } else {
          System.out.println("No tiene pacientes asignados en esa cita");
          break;
        }        
      } else {
        if (diaS.toLowerCase().equals(""))
          break;
        System.out.println("Introduce un dia y hora válidos");
      }
    } while(true);
  }

  private static void generarReceta(Medico medico, Paciente paciente) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fecha = null;
    Medicamento medicamento = null;
    double dosis = 0;
    int duracion = 0;
    System.out.println("Receta:");
    do{ //Pedir fecha
      System.out.print("  Fecha: ");
      String fechaS = sc.nextLine();
      try {
        fecha = LocalDate.parse(fechaS,dtf);
        break;
      } catch(Exception ex) {
        System.out.println("Esciba la fecha en el formato correcto dd/MM/yyyy");
      }
    } while(true);
    System.out.println("Selecciones medicamento:");
    System.out.println("1. Paracetamol  ");
    System.out.println("2. Ibuprofeno  ");
    if (medico.getEspecialidad()==Especialidad.GENERAL) {
      System.out.println("3. Antibiótico");
    } else if(medico.getEspecialidad()==Especialidad.ALERGIA) {
      System.out.println("3. Antiestamínico");
    }
    do { //Pedir medicamento
      System.out.print("Medicamento> ");
      String medicamentoS = sc.nextLine();
      if (medicamentoS.matches("[1-3]")) {
        switch(medicamentoS) {
          case "1" -> {medicamento = Medicamento.PARACETAMOL;}
          case "2" -> {medicamento = Medicamento.IBUPROFENO;}
          case "3" -> {
            if (medico.getEspecialidad()==Especialidad.GENERAL) {
              medicamento = Medicamento.ANTIBIOTICO;
            } else if(medico.getEspecialidad()==Especialidad.ALERGIA) {
              medicamento = Medicamento.ANTIESTAMINICO;
            }
          }
        }
        break;
      }
    } while(true);
    do {//Cantidad diaria en mg
      System.out.print("Cantidad diaria (mg): ");
      try {
        dosis = Double.parseDouble(sc.nextLine());
        break;
      } catch(NumberFormatException ex) {
        System.out.println("Introduzca un número decimal con .");
      }
    } while(true);
    do {//Duración en días
      System.out.print("Duración (dias): ");
      try {
        duracion = Integer.parseInt(sc.nextLine());
        break;
      } catch(NumberFormatException ex) {
        System.out.println("Introduzca un número entero");
      }
    } while(true);
    Central.altaReceta(medico, paciente, fecha, medicamento, duracion, dosis);
    System.out.println("");    
  }
  
  public static void irFarmacia(Paciente paciente) {
    System.out.println("====================================");
    System.out.println("= Bienvenido/a a la Farmacia ARCAS =");
    System.out.println("====================================");
    System.out.println("Recetas disponibles para Sr./Sra. " + paciente.getApellido());
    Central.mostrarRecetas(paciente);
    System.out.print("Pulse ENTER para volver");
    sc.nextLine();
  }
  
   
  
  
  
} //SMS


////Pruebas
//    if(false) {
//    System.out.println(Util.getEdad(LocalDate.parse("1976-08-07")));
//    String dni = "12345679S";
//    int num = Integer.parseInt(dni.substring(0, dni.length()-1));
//    System.out.println(num);
//    System.out.println(dni.length());
//    System.out.println(Util.generaNUSS(Util.generaDNI()));
//    System.out.println(Util.generaNUSS(Util.generaDNI()));
//    }

// System.out.print("[L|M]>");
//      String entrada = sc.nextLine();
//      if (entrada.matches("10|11"))
//        System.out.println("L o M");
    
//    Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
//    paciente.mostrarFicha();
//    Medico belmonte = new Medico("Pedro", "Belmonte", LocalDate.MIN);
//    generarReceta(belmonte, paciente);
//    Central.mostrarRecetas(paciente);
//    System.out.println(paciente.getNuss());
//    Central.addPaciente(paciente);
//    identificar();
//    pedirCita(paciente);

//    String conAcentos = "Árbol camión";
//    System.out.println(Util.limpiarAcentos(conAcentos));
    
//    if(false) {
//      Medico belmonte = Central.getMedico(3001020);
//      belmonte.imprimirCalendario();
//      Paciente pepe = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
//      belmonte.añadirCita(3, 9, pepe);
//      belmonte.añadirCita(3, 10, pepe);
//      belmonte.añadirCita(4, 9, pepe);
//      belmonte.añadirCita(4, 10, pepe);
//      belmonte.imprimirCalendario();
//      belmonte.liberarCita(4, 9);
//      belmonte.imprimirCalendario();              
//    }