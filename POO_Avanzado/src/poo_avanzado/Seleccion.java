/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class Seleccion {
    
    protected int id;
    protected String nombre, apellidos;
    protected int Edad;
    
    
    public void concentrarse(){
        System.out.println("Estoy concentrandome");   
    }
    
    public void viajar(){
        System.out.println("Estoy de viaje");
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Edad=" + Edad + '}';
    }

    public Seleccion(int id, String nombre, String apellidos, int Edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Edad = Edad;
    }
    
    
}
