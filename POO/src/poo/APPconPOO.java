/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class APPconPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario();
        
       usuario = solicitarDatos();
       usuario.muestraResultados();
    }
    
    public static Usuario solicitarDatos(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Datos del usuario: ");
        System.out.println("----------------------");
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(teclado.nextLine());
        System.out.print("Altura(metros): ");
        double altura = Double.parseDouble(teclado.nextLine());
        System.out.print("Peso: ");
        double peso = Double.parseDouble(teclado.nextLine());
        
        return new Usuario (nombre,edad,altura,peso);
    }
  
    

    
}
