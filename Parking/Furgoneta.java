/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

/**
 *
 * @author toti
 */
public class Furgoneta extends Vehiculo{
    
    
    private float longitud; //float ocupa menos memoria que double

    public Furgoneta(float longitud, String matricula, String marca) {
        super(matricula, marca);
        this.longitud = longitud;
    }
    
    @Override
    public float calcularImporte(){
        return super.calcularImporte()+ Parking.PRECIO_POR_METRO*longitud;
    }
    
    
}
