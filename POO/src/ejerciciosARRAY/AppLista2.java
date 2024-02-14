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
public class AppLista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iterador = 10;
        
        conArray(iterador);
        conLista(iterador);
        conArrayList(iterador);
        
    }
    
    public static void conArray(int iterador){
        int [] lista = new int[iterador];
        for (int i = 0; i < iterador; i++) {
            lista[i]= i*i+i;
        }
        System.out.println("Fin con Array "+lista[iterador-1]);
    }
    
    public static void conLista(int iterador){
        Lista lista = new Lista();
        for (int i = 0; i < iterador; i++) {
            lista.add(i*i+i);
        }
        System.out.println("Fin conLista "+ lista.lista[iterador-1]);
    }
    
    public static void conArrayList(int iterador){
        ArrayList<Integer> lista = new ArrayList <>();
        for (int i = 0; i < iterador; i++) {
            lista.add(i*i+i);
        }
        System.out.println("Fin conArraylist "+ lista.get(iterador-1));
    }
    
}//fin main
