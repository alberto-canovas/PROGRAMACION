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

public abstract class Persona {
  //Mostrar
  private String dni;
  private String nombre;
  private String apellido;
  private LocalDate fechaNacimiento;
  private String email;
  private static int contadorDNI = 0;
  
  //Mostrar
  public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.dni = generaDNI();
    this.email = generaEmail();
  }
  
  //Mostrar
  public String generaDNI() {    
    contadorDNI++;
    int numero = 25000+contadorDNI;
    String letra = Character.toString('A' + numero%26);
    return numero + letra;
  }
  
  //No mostrar
  public abstract String generaEmail();

  //No mostrar, el alumno los implementará si son necesarios
  public String getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }  

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getEmail() {
    return email;
  }
  
  
  
}
