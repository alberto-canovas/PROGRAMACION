/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Receta {
  
  private Medico medico;
  private Paciente paciente;
  private Medicamento medicamento;
  private LocalDate fecha;
  private int duracion;
  private double dosis;
  private boolean caducado;

  public Receta(Medico medico, Paciente paciente, Medicamento medicamento, LocalDate fecha, int duracion, double dosis) {
    this.medico = medico;
    this.paciente = paciente;
    this.medicamento = medicamento;
    this.fecha = fecha;
    this.duracion = duracion;
    this.dosis = dosis;
    this.caducado =  false;
  }

  public Paciente getPaciente() {
    return paciente;
  }  
  

  @Override
  public String toString() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return String.format("%s  %-15s  %6.1f  %4d %8d",
            fecha.format(dtf), medicamento, dosis, duracion, medico.getNumeroColegiado());
    //return "Receta{" + "medico=" + medico + ", medicamento=" + medicamento + ", fecha=" + fecha + ", duracion=" + duracion + ", dosis=" + dosis + ", caducado=" + caducado + '}';
  }
  
  public void mostrarFicha() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("=".repeat(40));
    System.out.printf("| Doctor/a: %-12s Nº Col.: %4d |%n",medico.getApellido(),medico.getNumeroColegiado());
    //System.out.println("");
    System.out.println("-".repeat(40));
    System.out.printf("| %-22s NUSS: %7d |%n",paciente.getApellido() + ", " +paciente.getNombre(),paciente.getNuss());
    System.out.println("-".repeat(40));
    System.out.printf("| %-25s %s |%n",medicamento,fecha.format(dtf));
    System.out.printf("| Dosis: %6.1f mg/día                 |%n",dosis);
    System.out.printf("| Duración: %3d días                   |%n", duracion);
     
//    System.out.printf("| Medicamento: %-15s Edad:  |%n",);
//    System.out.printf("| Correo-e: %-26s |%n", getEmail());   
    System.out.println("=".repeat(40));
  }

  
  
  
  
  
}
