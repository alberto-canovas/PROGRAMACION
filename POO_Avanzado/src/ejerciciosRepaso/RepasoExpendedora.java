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
public class RepasoExpendedora {
        static String productos[][] = {
        {"KitKat", "1.5", "3"},
        {"Coca-Cola", "2", "3"},
        {"Fanta Limón", "1.85", "2"},
        {"Toke", "1.2", "5"},
        {"Bollicao", "1.25", "4"},
        {"Sandwich", "3", "4"}

    };
        static double monedasCambio[][] = {
        {2,5},
        {1,4},
        {0.5,4},
        {0.2,5},
        {0.1,10},
        {0.05,10},
        {0.02,10},
        {0.01,10}
        
    };
    static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        do{
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
            System.out.print("opcion > ");
        
        try{
            opcion=Integer.parseInt(teclado.nextLine());
            
        }catch(NumberFormatException e){
            System.out.println(e.getMessage()+" Introduzca un número ");
        }
       
        switch(opcion){
            case 1->{mostrar();}
            case 2->{agregar();}
            case 3->{cambiarProducto();}
            case 4->{}
            case 5->{}
            case 6->{}
            case 7->{}
            
            default->{System.out.println("Número incorrecto");}
        }
        }while(opcion!=7);
        
        
        
        
       
    }
    
    public static void mostrar(){
            System.out.println("LISTA PRODUCTOS");
            System.out.println("=".repeat(20));
            System.out.println("Producto          Precio           Stock");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("ID->"+(i++)+". Producto -> " +productos[i][0]+ " | Precio -> " +productos[i][1]+ " | Stock -> " +productos[i][2]);
        }
        
    }
    
    
    public static void agregar(){
        System.out.println("AGREGAR PRODCUTOS");
        System.out.println("=".repeat(20));
        System.out.print("Nombre del nuevo producto: ");
        String nuevoProducto= teclado.nextLine();
        
        System.out.println("Precio: ");
        double precioNuevoProducto= Double.parseDouble(teclado.nextLine());
        
        System.out.println("Stock: ");
        int stockNuevoProducto= Integer.parseInt(teclado.nextLine());
        
        String nuevoArray[][] = new String [productos.length+1][3];
        
        
        for (int i = 0; i <= productos.length; i++) {
            nuevoArray[i] = productos[i];
        }
        
    }
    
    public static void cambiarProducto(){
        mostrar();
        
        System.out.println("");
        System.out.println("Seleccione un Producto(id)");
        int id=Integer.parseInt(teclado.nextLine());
        
        System.out.println("Seleccione el nuevo precio");
        double precioNuevo=Double.parseDouble(teclado.nextLine());
        
        System.out.println("Seleccione el nuevo stock");
        int stockNuevo = Integer.parseInt(teclado.nextLine());
        
        productos[id-1][1]=String.valueOf(precioNuevo);
        productos[id-1][2]=String.valueOf(stockNuevo);
        
   
    }
    
    public static void comprarProducto(){
        mostrar();
        System.out.println("");
        System.out.print("Seleccione un Producto(id) ");
        int id=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Introduzca el dinero ");
        double entrega=Double.parseDouble(teclado.nextLine());
        double precio=0;
        
        productos[id-1][1]=String.valueOf(precio);
        
    }
    
    
    public static void devolverCambio(double entrega, double precio){
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i][1]);
        }
    }
    
}//fin main
