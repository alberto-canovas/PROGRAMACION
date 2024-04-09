/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class Entrenador extends Seleccion{
    
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int Edad) {
        super(id, nombre, apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    public void dirigirPartido(){
        System.out.println("Estoy dirigiendo un partido.");
    }
    public void dirigirEntreno(){
        System.out.println("Estoy dirigiendo un entreno.");
    }
}
