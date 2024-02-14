/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosARRAY;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class AppLista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("¿Está vacío? "+lista.isEmpty());
        System.out.println("Longitud = "+lista.size());
        System.out.println(lista.toString());
        System.out.println("");
        
        lista.add(5);
        System.out.println("¿Está vacío? "+lista.isEmpty());
        System.out.println("Longitud = "+lista.size());
        System.out.println(lista.toString());
        System.out.println("");
        
        lista.add(8);
        System.out.println("¿Está vacío? "+lista.isEmpty());
        System.out.println("Longitud = "+lista.size());
        System.out.println(lista.toString());
        System.out.println("");
        
        for (int i = 1; i < 5; i++) {
            System.out.println(lista.add(i*i));
        }
        System.out.println("Longitud = "+lista.size());
        System.out.println(lista.toString());
        System.out.println("");
        
//        lista.add(0,-1);
//        System.out.println("Longitud = "+lista.size());
//        System.out.println(lista.toString());
//        System.out.println("");
        
        lista.add(2,-1);
        System.out.println("Longitud = "+lista.size());
        System.out.println(lista.toString());
        System.out.println("");
        
        System.out.println("¿Está el elemento 9? "+lista.contains(9));
        System.out.println("lista[5] "+lista.get(5));
        System.out.println("Posición elemento -1 = "+lista.indexOf(-1));
        System.out.println("Posición elemento 10 = "+lista.indexOf(10));

        System.out.println("");
        System.out.println("\nRemove");
        lista.remove(1); //BORRA EL NÚMERO QUE ESTÁ EN LA POSICIÓN [1]
        System.out.println(lista.toString());
        lista.removeIf(x->x<5);//BORRA CON UNA CONDICIÓN (BORRA LOS NÚMEROS MENORES QUE 5)
        System.out.println(lista.toString());
        lista.set(2,100);
        System.out.println(lista.toString());
        
        System.out.println("lista[1] = "+lista.toArray()[1]);
        System.out.println("lista[1] = "+lista.get(1));
        
    }
    
}
