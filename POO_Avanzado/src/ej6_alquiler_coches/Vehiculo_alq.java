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
public abstract class Vehiculo_alq {
    private String matricula;
    private String marcaModelo;
    protected int km;
    protected boolean alquilado;

    public Vehiculo_alq(String matricula, String marcaModelo, int km) {
        this.matricula = matricula;
        this.marcaModelo = marcaModelo;
        this.km = km;
        this.alquilado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    
    
    public abstract void alquilar(LocalDate fechaAlquiler);
    public abstract void devolver(LocalDate fechaDevolver);

    
    @Override
    public String toString() {
        String alquiladoTexto = (alquilado)? "A": " ";
        return String.format("%s %s %-15s [%d km]", alquiladoTexto,
                matricula,marcaModelo,km);
    }
    
    
    
    
}
