/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoRecuperacion;

/**
 *
 * @author toti
 */
public class Jugador {
    private int puntuacion;
    private String nombre;

    public Jugador(int puntuacion, String nombre) {
        this.puntuacion = puntuacion;
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
