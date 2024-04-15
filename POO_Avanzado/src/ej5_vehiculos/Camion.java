/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej5_vehiculos;

/**
 *
 * @author toti
 */
public class  Camion extends Vehiculo {
    private int km_tacografo;   

    public Camion(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
    }

    public Camion(String matricula, String marca_modelo, int km_motor) {
        super(matricula, marca_modelo, km_motor);
    }
    
    
    @Override
    public void avanzar(int km){
        super.avanzar(km);
        this.km_tacografo +=km;
        if(checkTacografo())
            System.out.println(getMarca_modelo()+"- Tacógrafo revisado");
    }
    
    
    @Override
    public boolean checkAceite() {
        if(km_aceite>=30000){
            //System.out.println("Cambio de aceite");
            km_aceite=0;
            return true;
        }else{
            return false;
        }
    }

    
    @Override
    public boolean checkRuedas() {
        if(km_ruedas>=50000){
            //System.out.println("Cambio de ruedas");
            km_ruedas=0;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkTacografo(){
        if(km_tacografo>=50000){
            //System.out.println("Revisión tacógrafo");
            km_tacografo=0;
            return true;
        }else{
            return false;
        }
    }
    
    
}//fin class
