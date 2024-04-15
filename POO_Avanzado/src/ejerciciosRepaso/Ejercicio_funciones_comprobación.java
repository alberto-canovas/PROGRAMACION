/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class Ejercicio_funciones_comprobación {

        static Scanner teclado = new Scanner(System.in);
        static String entrada;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Double> listaDec = new ArrayList<>();
    ArrayList<Integer> listaNum = new ArrayList<>();
    
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Entrada: ");
            entrada = teclado.nextLine();
            
            if(esNumero(entrada)){
                listaNum.add(Integer.parseInt(entrada));
            }
            else if (esDecimal(entrada)){
                listaDec.add(Double.parseDouble(entrada));
            }
            else{
                System.out.println("Introduce un número");
            }
        }
        
        System.out.println(listaDec.toString());
        System.out.println(listaNum.toString());
    }
    
    public static boolean esNumero (String numero){
        try{
            Integer.parseInt(numero);
            return true; 
        }catch(Exception e){
            return false; 
        }
        
    }
    
    public static boolean esDecimal (String numero){
          try{
            Double.parseDouble(numero);
            return true;
        }catch(Exception e){
            return false;   
        }
        
    }
    
    
    
    
}
