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
public class DevolverCambio {
        static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio=0;
        double entrega=0;
        double cambio;
        int opcion;
        
       static String productos[][] = {
        {"KitKat", "1.5", "3"},
        {"Coca-Cola", "2", "3"},
        {"Fanta Limón", "1.85", "2"},
        {"Toke", "1.2", "5"},
        {"Bollicao", "1.25", "4"},
        {"Sandwich", "3", "4"}

    }

    static double monedasCambio[][] = {
        {2,5},
        {1,4},
        {0.5,4},
        {0.2,5},
        {0.1,10},
        {0.05,10},
        {0.02,10},
        {0.01,10}
        
    }
       
       System.out.println("**************");
       System.out.println("MAQUINA EXPENDEDORA");
       System.out.println("***************");
       System.out.println("1. Mostrar productos");
       System.out.println("2. Agregar productos");
       System.out.println("3. Modificar producto.");
       System.out.println("4. Comprar producto");
       System.out.println("5. Reponer producto");
       System.out.println("6. Recoger ganancias.");
       System.out.println("7. Salir");
       System.out.println("***************");
       
        
        
//        System.out.print("Precio: ");
//        precio=Double.parseDouble(teclado.nextLine());
//        
//        cambio=entrega-precio;
//        if(cambio>0)
            cambio=(Math.round(cambio)*100)*0.01;
//        else
//            System.out.println("Introduzca un importe mayor o igual al precio.");
//        
//        
//        DevolverCambio(cambio);
//        
        
       
        
        
        
    }
    
    public static void DevolverCambio(double precio){
        int euro_2=0,euro_1=0,cent_50=0,cent_20=0,cent_10=0,cent_5=0,cent_2=0,cent_1=0;
        
        System.out.print("Entrega: ");
        entrega=Double.parseDouble(teclado.nextLine());
        
        double cambio =entrega-precio;
        
        
        while(cambio!=0){
            if(cambio>=2){
                cambio-=2;
                euro_2++;
                
            }else if(cambio>=1){
                cambio-=1;
                euro_1++;
            System.out.println("1 Euros: "+euro_1);
            
            }else if(cambio>=0.5){
                cambio-=0.5;
                cent_50++;
            System.out.println("50 Cent: "+cent_50);
                
            }else if(cambio>=0.2){
                cambio-=0.2;
                cent_20++;
            System.out.println("20 Cent: "+cent_20);
                
            }else if(cambio>=0.1){
                cambio-=0.1;
                cent_10++;
            System.out.println("10 Cent: "+cent_10);
                
            }else if(cambio>=0.05){
                cambio-=0.05;
                cent_5++;
            System.out.println("5 Cent: "+cent_5);
                
            }else if(cambio>=0.02){
                cambio-=0.02;
                cent_2++;
            System.out.println("2 Cent: "+cent_2);
                
            }else if(cambio>=0.01){
                cambio-=0.01;
                cent_1++;
            }
        }
        System.out.println("2 Euros: "+euro_2);


    }//fin funcion
}//fin main
