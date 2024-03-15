/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factura_repaso;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App_Factura1 {

    /**
     * @param args the command line arguments
     */
    private static Bd_Productos1 mibd = new Bd_Productos1();
    public static Scanner teclado = new Scanner(System.in);
    private static Factura1 factura = new Factura1("B123456", "9999", LocalDate.EPOCH);
    public static void main(String[] args) {
        // TODO code application logic here
        mibd.add("Puleva", 1.5);
        mibd.add("Chocapics", 2);
        mibd.add("Pan", 0.75);
        mibd.add("agua", 1);
        mibd.ImprimirLinea();
        
        
        System.out.println(mibd.buscar("001"));
        int opcion = 0;
        do{
            System.out.println("MENÚ FACTURA");
            System.out.println("*".repeat(50));
            System.out.println("1. Añadir Linea");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Listar productos");
            System.out.println("4. Añadir productos");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            try{
                opcion = Integer.parseInt(teclado.nextLine());
                
            }catch(NumberFormatException e){
                System.out.println(e.getMessage()+" ERROR Inserte un número.");
                opcion=0;
            }
            
            if(opcion<1 || opcion>5){
                System.out.println("Inserte un número entero entre 1 y 5.");
            }
            
            System.out.println("");
            switch(opcion){
                case 1:
                    añadirLinea();
                    break;
                case 2:
                    break;
                case 3:
                    mibd.ImprimirLinea();
                    break;
                case 4:
                    añadirProducto();
                    break;
                case 5:
                    break;
                default:
            }
            
        }while(opcion!=5);
        
        
        
        
        
    }
    
    public static void añadirLinea(){
        mibd.ImprimirLinea();
        do{
        System.out.println("Ref(num 3 digitos): ");
        String ref = teclado.nextLine();
        System.out.println("Cantidad");
        int cantidad = Integer.parseInt(teclado.nextLine());
        
        factura.añadirLinea(mibd.buscar(ref), cantidad);
        
        }while(teclado.nextLine().isEmpty());
    }
    
    
    private static void añadirProducto(){
        
        System.out.println("Añadir Producto");
        System.out.println("---INTRO PARA FINALIZAR---");
        do{
            System.out.println("Descripcion: ");
            String descripcion = teclado.nextLine();
            System.out.println("Precio unidad:  ");
            int precioU = Integer.parseInt(teclado.nextLine());
            System.out.println("Producto añadido...");
            mibd.add(descripcion, precioU);
            
        }while(teclado.nextLine().isEmpty());
    }
    
}//FIN MAIN
