/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de un HashMap
        
        HashMap <Integer, String> mapaJugadores = new HashMap();
        
        mapaJugadores.put(7, "Villa");
        mapaJugadores.put(1, "Casillas");
        mapaJugadores.put(8, "Xavi");
        mapaJugadores.put(6, "Iniesta");
        
        //mostrar valores
        
        System.out.println("Tamaño: " +mapaJugadores.size());
        
        System.out.println("Lista claves: "+ mapaJugadores.keySet());
        
        System.out.println("Lista valores: "+mapaJugadores.values());
        
        System.out.println("Valor con clave 6: "+mapaJugadores.get(6));
        
        
        //Recorrer mapa con un iterador
        Iterator it = mapaJugadores.keySet().iterator();
        System.out.println("\nRECORRER MAPA CON ITERADOR");

        while(it.hasNext()){
            Integer key = (Integer) it.next();
            String valor = mapaJugadores.get(key);
            System.out.printf("Dorsal: %d Jugador: %s%n", key,valor);
        }
        
        
        
        //Recorrer mapa con for
        System.out.println("\nRECORRER MAPA CON FOR");
        for(Entry<Integer, String> elemento : mapaJugadores.entrySet()){
            Integer key = elemento.getKey();
            String valor = elemento.getValue();
            System.out.printf("Dorsal: %d Jugador: %s%n", key,valor);
        }
        
        //
        HashMap<String, String> mapaCapitales = new HashMap();
        
        mapaCapitales.put("Ecuador", "Quito");
        mapaCapitales.put("Argentina", "Buenos Aires");
        mapaCapitales.put("España", "Madrid");
        mapaCapitales.put("Alemania", "Berlin");
        mapaCapitales.put("Marruecos", "Rabat");
        mapaCapitales.put("Francia", "Paris");
        mapaCapitales.put("Portugal", "Lisboa");
        mapaCapitales.put("Italia", "Roma");

        
        Scanner teclado = new Scanner (System.in);
        
    }
    
}
