/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02_factura_referencia;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class AppFactura {

        static Scanner teclado = new Scanner(System.in);
        private static BD_Productos mibd = new BD_Productos();
        private static Factura factura1 = new Factura("B123456", "54321", LocalDate.EPOCH);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos
        mibd.add("Leche Puleva", 1.2);
        mibd.add("Chocolate", 2);
        mibd.add("Pan", 0.75);
        mibd.add("Agua 1,5L", 1.5);
        
        
        /*
        System.out.println(mibd.getProducto(0).toString());
        System.out.println(mibd.getProducto(1).toString());
        System.out.println(mibd.getProducto(2).toString());
        System.out.println(mibd.getProducto(3).toString());
        System.out.println(mibd.getProducto(4).toString());
        */
        
        System.out.println();
        System.out.println(mibd.buscar("REF001"));
        
        //Menu
        
        
        int opcion = 0;
        do{
            System.out.println("Menu Factura");
            System.out.println("*".repeat(45));
            System.out.println("1. Añadir linea");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Listar productos");
            System.out.println("4. Añadir productos");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            try{
                opcion= Integer.parseInt(teclado.nextLine());
            
            }catch (Exception e){
                System.out.println(e.getMessage()+ " no es válido");
                opcion=0;
            }
            
            switch (opcion){
                
                case 1:
                case 2:
                case 3:
                    mibd.listarProducto();
                case 4:
                    añadirProducto();
                case 5:
                    break;
                default:
                    System.out.println("Introduce un número entre 1 y 5.");
        }
            
            
        }while (opcion !=5);
    
        
                    
    
    }
    
    public static void añadirProducto(){
            System.out.println("Añadir producto");
            System.out.println("*".repeat(25));
            System.out.print("Descripcion: ");
            String descripcion = teclado.nextLine();
            boolean paso = false;
            double precio = 0; //TENEMOS QUE DEFINIR SIEMPRE LA VARIABLE FUERA DEL TRY CATCH, SINO DA ERROR
            do{
                System.out.print("Precio: ");
                try{
                    precio = Double.parseDouble(teclado.nextLine());
                    paso = false;
                
                }catch(NumberFormatException e){
                    System.out.println(e.getMessage() + " no es un precio válido.");
                    paso = true;
            }
            
            }while(paso);
            mibd.add(descripcion, precio);
            
        }//FIN AÑADIR PRODUCTO
    
    
    private static void añadirLinea(){
        mibd.listarProducto();
        System.out.println("");
        System.out.println("Producto (REF): ");
        String ref = teclado.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = Integer.parseInt(teclado.nextLine());
        factura1.añadirLinea(mibd.buscar(ref), cantidad);
        
    }
    
    
    
}//FINN
