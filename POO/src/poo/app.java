/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author toti
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona("Juan","Perez");
        
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Peso: " + p.getPeso());
        
        p.setNombre("Juanito");
        System.out.println("Nombre " +p.getNombre());
    }
    
}
