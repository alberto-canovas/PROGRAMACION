/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class Masajista extends Seleccion{
    private String Titulacion;
    private int añosExp;

    public Masajista(String Titulacion, int añosExp, int id, String nombre, String apellidos, int Edad) {
        super(id, nombre, apellidos, Edad);
        this.Titulacion = Titulacion;
        this.añosExp = añosExp;
    }
    
    public void darMasaje(){
        System.out.println("Estoy dando un masaje.");
    }
    
}
