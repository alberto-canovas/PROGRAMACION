/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepaso;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class Ejercicio_try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero;
        String entrada;
        double decimal;
        
        do{
            System.out.println("Entrada:");
            entrada = teclado.nextLine();
            
        }while(!entrada.equals("exit"));
        
       
        
        try{
            
            numero = Integer.parseInt(entrada);
            System.out.println("Ha introducido el numero "+numero);
            
        }catch(Exception e){
            
            try{
                decimal = Double.parseDouble(entrada);
                System.out.println("Ha introducido el decimal: "+decimal);
                
            }catch(Exception e1){
                
                System.out.println("HA INTRODUCIDO EL TEXTO: "+entrada);
            }
            
        }
       
        
    }
    
}
