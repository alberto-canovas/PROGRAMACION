/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_figurasGraficas;

/**
 * 
 *
 * @author toti
 */
import fundamentos.*;
public class ej4_figurasGraficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dibujo dib = new Dibujo("Prueba de dibujo",800,600);
        dib.ponLetra(20);
        
        dib.espera();
        System.exit(0);
    }
    
}
