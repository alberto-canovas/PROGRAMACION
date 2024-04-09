/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_herencia;

/**
 *
 * @author toti
 */
public class Contable extends Empleado{
    private double plusSalario;
    
    public Contable(String DNI,String nombre){
        super(DNI,nombre);
        this.plusSalario = 200;
    }
    
    
}
