/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_alquiler_coches;

import java.time.LocalDate;

/**
 *
 * @author toti
 */
public class Furgoneta extends Vehiculo_alq{
    private double precioKilometro;

    public Furgoneta(String matricula, String marcaModelo, int km) {
        super(matricula, marcaModelo, km);
        precioKilometro = 0.5; // € por km
    }

    public double getPrecioKilometro() {
        return precioKilometro;
    }
    
    
    @Override
    public void alquilar(LocalDate fechaAlquiler) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver(LocalDate fechaDevoler) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
