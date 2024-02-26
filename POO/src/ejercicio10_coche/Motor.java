/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10_coche;

/**
 *
 * @author toti
 */

public class Motor {
    
    private int caballos, kilometros;
    private TipoCambio cambio;
    private TipoCombustible combustible;

    public Motor(int caballos, TipoCambio cambio, TipoCombustible combustible) {
        this.caballos = caballos;
        this.kilometros = 0;
        this.cambio = cambio;
        this.combustible = combustible;
    }

    public int getCaballos() {
        return caballos;
    }


    public void addKm(int km){
        this.kilometros += km;
    }

    public int getKilometros() {
        return kilometros;
    }


    public TipoCambio getCambio() {
        return cambio;
    }


    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }
    
    
}
