/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichero;

/**
 *
 * @author toti
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad, estatura;

    public Persona(String nombre, String apellido, int edad, int estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    public Persona(String[]datos){
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.edad = Integer.parseInt(datos[2]);
        this.estatura = Integer.parseInt(datos[3]);
    }
            
}
