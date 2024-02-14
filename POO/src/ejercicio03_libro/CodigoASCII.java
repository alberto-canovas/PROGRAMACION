/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03_libro;

/**
 *
 * @author toti
 */
public class CodigoASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=60;i<130;i++){
            System.out.println(Character.toString(i) + " ¿Es alfabeto? "+ Character.isAlphabetic(i));
            
        }
        
        for(int i=45;i<60;i++){
            System.out.println(Character.toString(i) + " ¿Es Dígit0? "+ Character.isDigit(i));
            
        }
        
        
    }
    
}
