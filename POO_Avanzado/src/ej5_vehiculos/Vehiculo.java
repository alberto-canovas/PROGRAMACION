/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_vehiculos;

/**
 *
 * @author toti
 */
public abstract class Vehiculo {
    private String matricula;
    private String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;

    //vehículo nuevo
    public Vehiculo(String matricula, String marca_modelo) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km_motor = 0;
        this.km_aceite = 0;
        this.km_ruedas = 0;
    }

    //vehículo 2ª mano
    public Vehiculo(String matricula, String marca_modelo, int km_motor) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km_motor = km_motor;
        this.km_aceite = 0;
        this.km_ruedas = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }
    
    
    
    public void avanzar(int km){
        this.km_aceite +=km;
        this.km_motor +=km;
        this.km_ruedas +=km;
        if (checkAceite())
            System.out.println(marca_modelo+"- Cambio de aceite");
        
        if (checkRuedas())
            System.out.println(marca_modelo+"- Cambio de ruedas");
        
//        if(this instanceof Camion){
//            if(checkTacografo())
//                System.out.println("Revisión tacógrafo");
//        }
    }

    @Override
    public String toString() {
        String km = (km_motor==0)? "Nuevo" : Integer.toString(km_motor);
        return String.format("%s - %s - %s", marca_modelo, matricula, km);
                //"Vehiculo{" + "matricula=" + matricula + ", marca_modelo=" + marca_modelo + ", km_motor=" + km_motor + ", km_aceite=" + km_aceite + ", km_ruedas=" + km_ruedas + '}';
    }
    
    public abstract boolean checkAceite();
        
    public abstract boolean checkRuedas();
    
    
    
    
    
}
