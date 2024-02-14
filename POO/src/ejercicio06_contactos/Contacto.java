/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06_contactos;

/**
 *
 * @author toti
 */
public class Contacto {
    //Atributos
    
    private int id;
    private String nombre, email, telefono;
    private static int contador = 0;
    
    
    //Constructor new

    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        contador++;
        this.id = contador;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }
    
    public void imprimirContacto(){
        
        System.out.printf("%-4d %13s %25s %15s\n",id,nombre,email,telefono);
    }
}

