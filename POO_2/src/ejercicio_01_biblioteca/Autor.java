/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_biblioteca;

/**
 *
 * @author toti
 */
public class Autor {
    private String nombre1, apellido1, apellido2,email;
    private int id;

    public Autor(String nombre1, String apellido1, String apellido2, String email) {
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.id = generarId();
    }

    public int getId() {
        return id;
    }
    
    
    private int generarId(){
        return (int)(Math.random()*1000);
    }
    
    public String getNombreCita(){
        String [] nombres = nombre1.split(" ");
        String iniciales = "";
        for (String nom :nombres)
            iniciales += nom.charAt(0) + ".";
        return apellido1 + ", " + iniciales;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre1=" + nombre1 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", id=" + id + '}';
    }
    
    public void mostrarDetalles(){
        System.out.printf(" %2d  %-8s  %-8s  %-8s  %-15s %n", 
                id,nombre1, apellido1,apellido2,email);
    }
}
