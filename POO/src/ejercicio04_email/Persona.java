/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04_email;

/**
 *
 * @author toti
 */
public class Persona {
    private String nombre,email;
    
    public Persona (String nombre,String email){
        this.email = email;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", email=" + email + '}';
        return "%18s - %-18s".formatted(nombre,email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
