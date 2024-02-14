/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosARRAY;

/**
 *
 * @author toti
 */
public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    private static int contador;
    
    public Alumno (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        contador++;
        this.id=contador;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void imprimirDetalles(){
        System.out.printf("%d %-15s %3d \n",id,nombre,edad);
        
    }
    
    
}
