/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author toti
 */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected LocalDate fechaEntrada;
    protected int minutos;
    protected int numPlazaAparcamiento;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getNumPlazaAparcamiento() {
        return numPlazaAparcamiento;
    }

    public void setNumPlazaAparcamiento(int numPlazaAparcamiento) {
        this.numPlazaAparcamiento = numPlazaAparcamiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.matricula);
        hash = 83 * hash + Objects.hashCode(this.marca);
        hash = 83 * hash + Objects.hashCode(this.fechaEntrada);
        hash = 83 * hash + this.minutos;
        hash = 83 * hash + this.numPlazaAparcamiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.minutos != other.minutos) {
            return false;
        }
        if (this.numPlazaAparcamiento != other.numPlazaAparcamiento) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.fechaEntrada, other.fechaEntrada);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", fechaEntrada=" + fechaEntrada + ", minutos=" + minutos + ", numPlazaAparcamiento=" + numPlazaAparcamiento + '}';
    }
    
    
    public float calcularImporte(){
        return Parking.PRECIO_BASE_POR_MINUTO*minutos;
    }
    
}
