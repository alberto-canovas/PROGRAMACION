/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_banco_interfaz;

/**
 *
 * @author toti
 */
public class CuentaCorriente extends CuentaBancaria {
    private double maxDescubierto;

    public CuentaCorriente(Persona titular, double saldo) {
        super(titular, saldo);
        this.maxDescubierto = -1000;
    }
    
    public void transferencia(CuentaBancaria c, double dinero){
        if((super.getSaldo()-dinero)>=maxDescubierto){
            super.reintegroAux(dinero);
            c.ingreso(dinero);
        }else{
            System.out.println("Operación denegada, se supera el máximo descubierto.");
        }
}
    
    @Override
    public void reintegro(double dinero) {
        if((super.getSaldo()-dinero)>=maxDescubierto){
            super.reintegroAux(dinero);
        }else{
            System.out.println("Operación denegada, se supera el máximo descubierto.");
        }//fin else
    }
    
}//fin class
