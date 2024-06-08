/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Medico extends Persona{
  
  private int numeroColegiado;
  private Especialidad especialidad;
  private static int contadorMedico = 0;

  public Medico(String nombre, String apellido, LocalDate fechaNacimiento) {
    super(nombre, apellido, fechaNacimiento);
    this.numeroColegiado = generaCodigo();
    this.especialidad = Especialidad.GENERAL;
  }
  
  public static int generaCodigo() {
    contadorMedico++;
    return 9000 + contadorMedico;
  }

  @Override
  public String generaEmail() {
    return numeroColegiado + "@sms.es";
  }  

  public int getNumeroColegiado() {
    return numeroColegiado;
  }

  public Especialidad getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
  }

  @Override
  public String toString() {
    return String.format("(Col. Nº %d) %-7s Doctor %s [%s]",numeroColegiado ,especialidad, getApellido(),getDni());
  }
  
//  public boolean añadirCita(int dia, int hora, Paciente paciente) {
//    boolean añadida = false;
//    if ((dia>=0 && dia<5) && (hora>=0 && hora<3) && pacientes[hora][dia]==null) {
//      pacientes[hora][dia] = paciente;  
//      añadida = true;
//    }else {
//      System.out.println("Error: no se ha podido guardar su cita");
//    }
//    return añadida;
//  }
  
//  public boolean liberarCita(int dia, int hora) {
//    boolean liberada = false;
//    if ((dia>=0 && dia<5) && (hora>=0 && hora<3)) {
//      pacientes[hora][dia] = null;  
//      liberada = true;
//    }else {
//      System.out.println("Error: no se ha podido liberar la cita");
//    }
//    return liberada;
//  }
  
//  public void imprimirCalendario() {
//    System.out.println("** Calendario de citas **");
//    System.out.println("Doctor: " + getApellido());
//    System.out.println("      | LUN | MAR | MIE | JUE | VIE |");
//    System.out.println("-------------------------------------");
//    for(int hora=0; hora<3; hora++) {
//      System.out.print("%2d:00 | ".formatted(hora+10));
//      for(int dia=0; dia<5; dia++) {
//        String texto = (pacientes[hora][dia]==null)? " - " : "*"+pacientes[hora][dia].getDni().substring(4, 6);
//        //pacientes[hora][dia] = " - ";
//        System.out.print(texto + " | ");
//      }
//      System.out.println("");
//    }
//    System.out.println("-------------------------------------");
//  }
      
  
//  public Paciente getPaciente(int dia, int hora) {
//    return pacientes[hora][dia];
//  }
  
  
  
  
}
