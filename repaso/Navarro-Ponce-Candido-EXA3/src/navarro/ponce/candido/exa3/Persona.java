/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navarro.ponce.candido.exa3;

import java.time.LocalDate;

/**
 *
 * @author candido.navarro
 */
public abstract class Persona {
    private final String dni;
    private final String nombre;
    private final String apellido;
    private final LocalDate fechaNacimiento;
    private final String email;
    private static int contadorDNI = 0;
  
  public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.dni = generaDNI();
    this.email = generaEmail();
  }
  
  public String generaDNI() {    
    contadorDNI++;
    int numero = 25000+contadorDNI;
    String letra = Character.toString('A' + numero%26);
    return numero + letra;
  }
  
  public String generaEmail(){
      
     return ""; 
  }

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

    public static int getContadorDNI() {
        return contadorDNI;
    }
    
    
}
