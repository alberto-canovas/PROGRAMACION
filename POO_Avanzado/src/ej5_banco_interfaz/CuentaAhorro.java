/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_banco_interfaz;

/**
 *
 * @author toti
 */
public class CuentaAhorro extends CuentaBancaria implements Interesable{
    private double interes;

    public CuentaAhorro(Persona titular, double saldo) {
        super(titular, saldo);
        this.interes = 0.02;
    }
    
    
    public double calcularInteres(){
        return super.getSaldo()*interes;
    }
    
    @Override
    public double getSaldo(){
        return calcularInteres()+super.getSaldo();
    }
    
    @Override
    public void reintegro(double dinero) {
        if((super.getSaldo()-dinero)>=0){
            super.reintegroAux(dinero);
        }else{
            System.out.println("Operación denegada. "
                    + "La cuenta no puede estar en negativo");
        }
        
    }

    @Override
    public void calcularIntereses() {
        double intereses;
        intereses = super.getSaldo()*interes;
    }
    
}
