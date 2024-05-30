/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

/**
 *
 * @author toti
 */
public class Autobus extends Vehiculo{
    
    private int asientos;

    public Autobus(int asientos, String matricula, String marca) {
        super(matricula, marca);
        this.asientos = asientos;
    }

    @Override
    public float calcularImporte() {
        return super.calcularImporte()+Parking.PRECIO_POR_ASIENTO*asientos;
    }

    
    
}
