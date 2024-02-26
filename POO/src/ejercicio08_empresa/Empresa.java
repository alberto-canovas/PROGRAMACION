/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08_empresa;

/**
 *
 * @author toti
 */
public class Empresa {
    private String cif;
    private String nombre;
    private String localidad;

    public Empresa(String cif, String nombre, String localidad) {
        this.cif = cif;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String Empresa(String cif, String nombre, String localidad){
       return null; 
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + ", localidad=" + localidad + '}';
    }
    
    
    public void imprimir(){
//        System.out.println("Nombre: "+nombre);
//        System.out.println("\031[34mCIF: "+cif);
//        System.out.println("Localidad: "+localidad);
        
        System.out.printf(" %10s   %10s   %10s\n",cif, nombre,localidad);
    }
    
    
}
