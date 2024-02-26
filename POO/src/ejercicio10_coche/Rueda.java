/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10_coche;

/**
 *
 * @author toti
 */
public class Rueda {
    
    private int radio, kilometros;

    public Rueda(int radio) {
        this.radio = radio;
        this.kilometros = 0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    
     public void addKm(int km){
        this.kilometros += km;
    }
    
}
