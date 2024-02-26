/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10_coche;

/**
 *
 * @author toti
 */
public class Coche {
    private String marca,modelo;
    Motor motor;
    Rueda rueda;
    Rueda[] ruedas= new Rueda[5];

    public Coche(String marca, String modelo,int potencia, TipoCambio cambio, TipoCombustible combustible, int radio) {
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor(potencia,cambio,combustible);
        ruedas[1] = new Rueda(radio);
        ruedas[2] = new Rueda(radio);
        ruedas[3] = new Rueda(radio);
        ruedas[4] = new Rueda(radio);
        
    }
    
    
    
    
    
    public void cambiarRueda(int numRueda){
        if (numRueda >=1 || numRueda <= 4){
            ruedas[numRueda].setKilometros(0);
        }
        
        else{
            System.out.println("Número de rueda INCORRECTO");
                }
       
        
    }
    
    public void recorrer(int kilometros){
        motor.addKm(kilometros);
        
        for (int i = 1; i < 5; i++) {
            ruedas[i].addKm(kilometros);
        }
        
    }
    
    public void imprimirFicha(){
        System.out.println("Ficha del coche   "+getFichaSimplificada());
        System.out.println("=".repeat(50));
        System.out.println("Marca/Modelo: "+marca+" "+modelo);
        System.out.println("Motor(CV): "+motor.getCaballos());
        System.out.println("Combustible: "+motor.getCombustible());
        System.out.println("Cambio: "+motor.getCambio());
        System.out.println("KM del motor: "+motor.getKilometros());
        System.out.println("Tamaño de ruedas: "+ruedas[1].getRadio());
        System.out.println("KM de las ruedas: ["+ruedas[1].getKilometros()+"] "+"["+ruedas[2].getKilometros()+"] ["+ruedas[3].getKilometros()+"] ["+ruedas[4].getKilometros()+"]");
        System.out.println("=".repeat(50));
        //System.out.println("");
    }
    
    
    public String getFichaSimplificada(){
        return marca + " " +modelo+ " "+motor.getCaballos()+ " "+motor.getCombustible()+" "+motor.getCambio();
    }
}
