package ejercicio_02_factura_referencia;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toti
 */
public class BD_Productos {
    
    private ArrayList<Producto> bd;

    public BD_Productos() {
        bd = new ArrayList<>();
    }
    
    public void add(String descripcion, double precio){
        if(bd.size()<1000)
            bd.add(new Producto(generarREF(),descripcion,precio));
        else 
            System.out.println("La base de datos no puede añadir más productos");
    }
    
    
    public Producto buscar (String ref){
        for (Producto p : bd){
            if (p.getRef().equals(ref)){
                return p;
            }
        }
    return null;
    }
    
    public Producto getProducto (int indice){
        if (indice < 0 || indice >= bd.size()){
            return null;
        } else {
            return bd.get(indice);
        }
    }
            
    public void listarProducto(){
        System.out.println("REF      DESCRIPCION        PRECIO");
        System.out.println("-------------------------------------");
        
        for (Producto p: bd){
            p.mostrarProducto();
        }
    }
    
    private String generarREF(){
        int num = bd.size()+1;
        String ref = "REF";
        if (num < 10){
            ref += "00" + num;
        } else if (num<100){
            ref += "0" + num;
        } else if (num<1000){
            ref += + num;
        } else{
            System.out.println("ERROR no se pueden añadir más productos.");
        }
        
        
        return ref;
    }
    

    
    
    
}
