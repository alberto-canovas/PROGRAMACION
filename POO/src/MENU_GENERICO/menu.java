/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MENU_GENERICO;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        int opcion;
        
        do{
            System.out.println("=".repeat(15));
            System.out.println("MENU CONTACTOS");   
            System.out.println("=".repeat(15));
            System.out.println("1. Nuevo Contacto");
            System.out.println("2. Listar Contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Salir");
            
            System.out.print("Elige opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            
            
        } while(opcion!=4);
    }
    
}
