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
public class Ejercicio_numero_exit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String entrada;
        String password="";
        ArrayList <Integer> lista = new ArrayList<>();
        int[] lista2 = new int[5];
        int contador =0;
        
        do{
            System.out.println("Introduce un número:");
            entrada = teclado.nextLine();
            
            try{
                //lista.add(Integer.parseInt(entrada));
                lista2[contador] = Integer.parseInt(entrada);
                contador++;
                
            }catch(NumberFormatException  | ArrayIndexOutOfBoundsException e){
                if(entrada.equals("exit")){
                    System.out.println("Password: ");
                    password = teclado.nextLine();
                    
                }
                System.out.println("Mensaje -> "+e.getMessage());
            }
            
           
            
        }while(!password.equals("1234") && contador<5);
            
        
            
            
        
        System.out.println("");
        System.out.print("Lista = (");
//        for(Integer n : lista)
//            System.out.print(n +" ");
        for (int i = 0; i < lista2.length; i++) {
            
            System.out.print(lista2[i]+(",") );
            
            
        }
     
        
        
        
        
    }
    
}
