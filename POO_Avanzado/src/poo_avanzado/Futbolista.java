/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class Futbolista extends Seleccion {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int Edad) {
        super(id, nombre, apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    


    
    
    
    
 
    
    

    public void jugarPartido(){
        System.out.println("Estoy jugando");
    }
    
    public void entrenar(){
        System.out.println("Estoy entrenando");
    }
}
