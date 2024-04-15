/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_vehiculos;

/**
 *
 * @author toti
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo peugeot = new Turismo("111FFF", "PEUGEOT 308");
        Vehiculo seat = new Turismo("2222AAAA", "Seat Ibiza", 10_000);
        Vehiculo volvo = new Camion("3333GGGG", "Volvo 500");
        Vehiculo scania = new Camion("5555BBB", "Scania 550", 100_000);
        
        Vehiculo[] lista = new Vehiculo[4];
        lista[0] = peugeot;
        lista[1] = seat;
        lista[2] = volvo;
        lista[3] = scania;
        
//        System.out.println(peugeot.toString());
//        System.out.println(seat.toString());
//        System.out.println(volvo.toString());
//        System.out.println(scania.toString());
        System.out.println("TURISMOS");
        System.out.println("-".repeat(30));
        for(Vehiculo v: lista){
            if (v instanceof Turismo)
                System.out.println(v.toString());
        }
        System.out.println("");
        System.out.println("CAMIONES");
        System.out.println("-".repeat(30));
        for(Vehiculo v: lista){
            if (v instanceof Camion)
                System.out.println(v.toString());
        }
        System.out.println("");
        peugeot.avanzar(20_000);
        seat.avanzar(30_000);
        volvo.avanzar(20_000);
        scania.avanzar(60_000);
        seat.avanzar(10_000);
        System.out.println("");
        
       for (Vehiculo v : lista){
           System.out.println(v.toString());
       }
        
    }
    
}
