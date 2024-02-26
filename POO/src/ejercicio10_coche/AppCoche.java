/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10_coche;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class AppCoche {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Coche volvo = new Coche("VOLVO","XC60",140,TipoCambio.AUTOMATICO,TipoCombustible.DIESEL,19);
        Coche porsche = new Coche ("PORSCHE","911",250,TipoCambio.AUTOMATICO,TipoCombustible.DIESEL,19);
        
        
        
        
        
        int opcion= 0;
        
        do{
            System.out.println("Menú");
            System.out.println("*********");
            System.out.println("1.Alta");
            System.out.println("2.Listar");
            System.out.println("3.Mostrar");
            System.out.println("4.Salir");
            System.out.println("Opcion: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch(NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Solo se admiten numeros del 1 al 4");
                
            }
        }while(opcion!=4);
        
        
        
        
        
        
        
        
        
        
        System.out.println(volvo.getFichaSimplificada());
        System.out.println(porsche.getFichaSimplificada());
        volvo.imprimirFicha();
        volvo.recorrer(10000);
        volvo.imprimirFicha();
        porsche.recorrer(5000);
        porsche.imprimirFicha();
        volvo.recorrer(7500);
        volvo.cambiarRueda(4);
        volvo.recorrer(5);
        System.out.println("CAMBIO DE RUEDA");
        volvo.imprimirFicha();
    }
    
}
