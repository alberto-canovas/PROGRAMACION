/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenHashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class Almacen {
    private static int ultimoCodigo=1000;
    static HashMap <Integer,Producto> mapaProductos = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    
    
    public static void añadir(Producto p){
        mapaProductos.put(++ultimoCodigo, p);
    }
    
    public static void modificarPrecio(int codigo, double precio){
        Producto producto = mapaProductos.get(codigo);
        producto.setPrecio(precio);
    }
    
    public static void añadirproductos(Producto p){
        String descripcion="";
        double precio=0;
        int unidades=0;
        System.out.print("Descripción del producto: ");
        descripcion=teclado.nextLine();
        System.out.print("Precio: ");
        precio = Double.parseDouble(teclado.nextLine());
        System.out.print("Unidades: ");
        unidades = Integer.parseInt(teclado.nextLine());

        mapaProductos.put(ultimoCodigo, new Producto(descripcion, precio, unidades));
    }//fin añadirProductos
    
    
    public static void listarAlmacen(){
        for(Entry<Integer, Producto> producto: mapaProductos.entrySet()){
            int codigo = producto.getKey();
            Producto p = producto.getValue();
            System.out.printf("[%d] %s (%.2f€) %d %n ",codigo,p.getDescripcion(),p.getPrecio(), p.getUnidades());
        }
    }
    
    public static void añadirUnidades(int codigo, int unidades){
        Producto producto = mapaProductos.get(codigo);
        producto.añadir(unidades);
    }
}// fin Almacen
