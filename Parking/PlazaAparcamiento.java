/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

/**
 *
 * @author toti
 */
public class PlazaAparcamiento {
    
    private int numero;
    private boolean libre;

    public PlazaAparcamiento(int numero, boolean libre) {
        this.numero = numero;
        this.libre = true;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.numero;
        hash = 11 * hash + (this.libre ? 1 : 0);
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
        final PlazaAparcamiento other = (PlazaAparcamiento) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.libre == other.libre;
    }
    
    
    
}
