/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04_email;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class APP_ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        Persona[] personas = new Persona[10];
        int contador=0;
        String nombre;
        String email;
        String [] nombres = {"Paco","pepe","juan"};
        String [] emails = {"pacogmail.com","pepe@lorcaes","juan.@gmailcom"};
        
        for (int i=0;i<3;i++){
            System.out.println("Dime tu nombre: ");
            nombre = teclado.nextLine();
//              nombre=nombres[i];
            do{
                System.out.println("Dime tu email: ");
                email = teclado.nextLine();
                if (!Utilidades.esEmail(email))
                         System.out.println("--> ERROR: email incorrecto.");
            }while(!Utilidades.esEmail(email));
//              email =emails[i];
            //if (Utilidades.esEmail(email)){
                
            //} else {
            personas[i] = new Persona(nombre,email);
            System.out.println("-".repeat(20)+"añadido " +(i+1)+ " en la lista.");
            }
           
        }
        
//        System.out.println("=".repeat(40));
//        for (int i=0;i<3;i++){
//            System.out.println(personas[i].toString());
//        }
//        System.out.println("=".repeat(40));
        
        
    }
    
//    public static boolean esEmail(String email){
//        boolean esEmail = true;
//        int posArroba=-1,posPunto=-1;
//        for (int i=0; i<email.length();i++){
//            char aux = email.charAt(i);
//            
//            if(aux=='@'){
//                posArroba=i;}
//            if(aux=='.'){
//                posPunto =i;}
//               
//        }
//        if (posArroba==-1 ||posArroba==0 || posPunto==-1 || posPunto==0){
//            esEmail=false;
//        } else if (posArroba>posPunto){
//            esEmail=false;
//        } else esEmail=true;
//
//        
//        return esEmail;
//}
    



