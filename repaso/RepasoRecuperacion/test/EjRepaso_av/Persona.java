/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjRepaso_av;

/**
 *
 * @author toti
 */
public abstract class Persona {
    
    private String nombre,identificacion;
    private static int contador=100;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        this.identificacion = generaId();
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String generaId(){
        String id = nombre.substring(0,3)+contador;
        return id;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", identificacion=" + identificacion + '}';
    }
    
    
    
}
