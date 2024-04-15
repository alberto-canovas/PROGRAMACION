/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_vehiculos;

/**
 *
 * @author toti
 */
public class Turismo extends Vehiculo {

    public Turismo(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
    }

    public Turismo(String matricula, String marca_modelo, int km_motor) {
        super(matricula, marca_modelo, km_motor);
    }

    
    @Override
    public boolean checkAceite() {
         if(km_aceite>=15000){
            //System.out.println("Cambio de aceite");
            km_aceite=0;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkRuedas() {
         if(km_ruedas>=30000){
            //System.out.println("Cambio de ruedas");
            km_ruedas=0;
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
