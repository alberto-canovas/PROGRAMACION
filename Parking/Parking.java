/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

import java.util.ArrayList;

/**
 *
 * @author toti
 */

public class Parking {
    
    
    
    public static final float PRECIO_BASE_POR_MINUTO = 0.04f;
    public static final float PRECIO_POR_METRO = 0.02f;
    public static final float PRECIO_POR_ASIENTO = 0.25f;
    
    private ArrayList<Vehiculo> vehiculo;
    private PlazaAparcamiento[][] plazasAparcamiento;
    private int numeroPlazasDisponibles;
    private float saldoAcumulado;

}
