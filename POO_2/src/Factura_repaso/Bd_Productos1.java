/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura_repaso;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Bd_Productos1 {
    private ArrayList<Producto1> bd;

    public Bd_Productos1() {
        bd = new ArrayList<>();
        
    }
    
    public void add(String descripcion,double precio){
        bd.add(new Producto1(generarRef(), descripcion, precio));
    }
    
    public void ImprimirLinea(){
        System.out.println("REF  DESCRIPCIÓN     PRECIOU");
        for (Producto1 p: bd){
            p.imprimir();
        }
    }
    
    
    public Producto1 buscar(String ref){
       
        for (Producto1 p: bd){
            if (p.getRef().equals(ref)){
                
                return p;
            }
        }
        return null;
    }
    
    
    public String generarRef(){
        int num=bd.size()+1;
        String aux = "REF";
        if(num<10){
            aux = "00"+num;
        }
        else if (num<=99){
            aux = "0"+num;
        }
        else if(num<=999){
            aux = "REF"+num;
        }
        else{
            System.out.println("El número de productos se ha excedido.");
        }
        return aux;
        
    }
    
    
}
