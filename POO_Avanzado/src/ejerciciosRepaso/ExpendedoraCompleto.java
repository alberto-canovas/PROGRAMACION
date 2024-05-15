/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepaso;

import java.util.Scanner;


    public class ExpendedoraCompleto {
    
    static String productos [][] = {
        {"KitKat","2.50","3"},
        {"Balon","20","2"},
        {"Fanta","1.20","5"},
        {"CocaCola","1","2"}
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("MAQUINA EXPENDEDORA");
            System.out.println("====================");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Agregar productos");
            System.out.println("3. Modificar productos");
            System.out.println("4. Salir");
            
            System.out.print("Elige opcion > ");
            opcion = teclado.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    agregarProductos();
                    break;
                case 3:
                    cambiarProducto();
                    break;
            }
            
        }while(opcion !=4);
        
    }
    
    public static void mostrarProductos(){
        System.out.println("");
        System.out.println("                 PRODUCTOS               ");
        System.out.println("=========================================");
        for(int i = 0; i <= productos.length-1; i++){
            System.out.println("Producto -> " +productos[i][0]+ " | Precio -> " +productos[i][1]+ " | Stock -> " +productos[i][2]);
        }
        System.out.println("");
    }
    
    public static void agregarProductos(){
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Escribe el nombre del nuevo producto: ");
        String nuevoProducto = teclado.nextLine();
        System.out.print("Escribe el precio del nuevo producto: ");
        double nuevoPrecio = teclado.nextInt();
        System.out.print("Escribe el stock del nuevo producto: ");
        int nuevoStock = teclado.nextInt();
        
        String [][] nuevoArray = new String[productos.length+1][3];
        
        
        for(int i = 0; i <= productos.length-1; i++){
            nuevoArray[i] = productos[i];
        }
        
        nuevoArray[productos.length][0] = nuevoProducto;
        nuevoArray[productos.length][1] = String.valueOf(nuevoPrecio);
        nuevoArray[productos.length][2] = String.valueOf(nuevoStock);
        
        productos = nuevoArray;
        
        
        
    }
    
    public static void cambiarProducto(){
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("");
        System.out.println("                 PRODUCTOS               ");
        System.out.println("=========================================");
        for(int i = 0; i <= productos.length-1; i++){
            System.out.println((i+1)+ ". Producto -> " +productos[i][0]+ " | Precio -> " +productos[i][1]+ " | Stock -> " +productos[i][2]);
        }
        System.out.println("");
        
        System.out.print("Elige una opcion > ");
        int opcion = teclado.nextInt();
        
        System.out.print("Indica el nuevo precio del producto: ");
        double nuevoPrecio = teclado.nextDouble();
        System.out.print("Indica el nuevo stock del producto: ");
        int nuevoStock = teclado.nextInt();
        
        
        productos[opcion-1][1] = String.valueOf(nuevoPrecio);
        productos[opcion-1][2] = String.valueOf(nuevoStock);
        
        
        
    }
    
    
    
}



