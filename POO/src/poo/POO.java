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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double altura, peso,imc;
        String nombre,composicionCorporal;
        int edad;
        Usuario usuario;
        
        
        Scanner teclado = new Scanner (System.in);
        
        // Solicitar datos
        
        System.out.println("Datos del usuario: ");
        System.out.println("----------------------");
        System.out.println("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(teclado.nextLine());
         System.out.println("Altura(metros): ");
        altura = Double.parseDouble(teclado.nextLine());
         System.out.println("Peso: ");
        peso = Double.parseDouble(teclado.nextLine());
        
        //Cálculo IMC
        imc = getIMC(altura,peso);
        
        //Composición Corporal
        
        composicionCorporal = getCompCorporal(imc);
       
        
        //Mostrar resultados
        
        System.out.printf("%s tiene un IMC = %.1f, es decir, su peso es %s", nombre,imc,composicionCorporal);
        
    }
    
        
         public static double getIMC(double altura, double peso) {
             return peso / (altura * altura);
         }
        
        public static String getCompCorporal(double imc) {
             if (imc<18.5)
            return  "inferior al normal";
        else if (imc<24.9)
            return "normal";
        else if (imc<29.9)
            return "superior al normal";
        else
            return "obesidad";
        }
        
     }
    

