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
public class Turismo extends Vehiculo_alq {
    private double precioDia;
    
    public Turismo(String matricula, String marcaModelo, int km) {
        super(matricula, marcaModelo, km);
        this.precioDia = 30; //€ por día
    }

    public double getPrecioDia() {
        return precioDia;
    }

    
    @Override
    public void alquilar(LocalDate fechaAlquiler) {
        alquilado = true;
        Alquiler alquiler = new Alquiler(this);
        alquiler.setFechaInicio(fechaAlquiler);
        BD_Empresa.añadirAlquileres(alquiler);
        System.out.println("");
        alquiler.imprimir();
        
    }

    @Override
    public void devolver(LocalDate fechaDevolver) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
