/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mapas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class JuegoCapitales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> mapaCapitales = new HashMap<>();
        
        mapaCapitales.put("Ecuador", "Quito");
        mapaCapitales.put("Argentina", "Buenos Aires");
        mapaCapitales.put("España", "Madrid");
        mapaCapitales.put("Alemania", "Berlin");
        mapaCapitales.put("Marruecos", "Rabat");
        mapaCapitales.put("Francia", "Paris");
        mapaCapitales.put("Portugal", "Lisboa");
        mapaCapitales.put("Italia", "Roma");

        
        Scanner teclado = new Scanner (System.in);
        String pais="";
        String capital;
        
       do{
           System.out.print("Dime un pais: ");
           pais=teclado.nextLine();
           if(!pais.equals("exit"))
                if(mapaCapitales.containsKey(pais))
                    System.out.println("Su capital es: "+mapaCapitales.get(pais));
                else{
                    System.out.println("No conozco la capital de "+pais);
                    System.out.print("Dime la capital de "+pais);
                    capital = teclado.nextLine();
                    mapaCapitales.put(pais, capital);
               
                }
       }while(!pais.equals("exit"));
    }
}
