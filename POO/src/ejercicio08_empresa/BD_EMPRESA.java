/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08_empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class BD_EMPRESA {
    Scanner teclado = new Scanner (System.in);
    
    private ArrayList<Empresa> bd;
    
    public BD_EMPRESA(){
        bd = new ArrayList<>();
    }

    public void addEmpresa(String cif,String nombre,String localidad){
        bd.add(new Empresa(cif,nombre,localidad));
    }
    //CON ESTE METODO EN LA APP NO HAY QUE PONER EL NEW EMPRESA            baseDatos.addEmpresa("B12345678", "Nike", "Oregon (USA)");

    public void addEmpresa(Empresa e){
        bd.add(e);
    }
    //CON ESTE METODO ES MÁS SENCILLO PERO EN LA APP HAY QUE PONER         baseDatos.addEmpresa(new Empresa("B11111111", "Nitro", "Murcia (SPA)"));
    
    public Empresa buscarCif(String cif){
        Empresa auxiliar=null;
 
        for (int i = 0; i < bd.size(); i++) {
            if(bd.get(i).getCif().equals(cif)){
                auxiliar=bd.get(i);
                break;
            }
        }    
            
        return auxiliar;  
    }
    
    public void imprimir(){
        System.out.println("*".repeat(50));
        System.out.println("                 BD EMPRESA");
        System.out.println("*".repeat(50));
        System.out.println("   CIF            NOMBRE    LOCALIDAD");
        for (Empresa e : bd){
            e.imprimir();
            //System.out.println(e.toString()); //LA DIFERENCIA ES QUE EL TO STRING DEVUELVE UN STRING PERO HAY QUE PONERLE EL SOUT, EN EL METODO IMPRIMIR YA SE IMPRIME SIN SOUT
            
        }
            
    }
    
//    public ArrayList<Empresa> buscarNombre(String expresion){
//        ArrayList<Empresa> lista = new ArrayList<>();
//        expresion = expresion.toLowerCase();
//
//        for (int i = 0; i < bd.size(); i++) {
//            if (bd.get(i).getNombre().startsWith(expresion)){
//                lista.add(bd.get(i));
//            }
//        }
//        return lista;
//        
//    }
    
    public ArrayList<Empresa> buscarNombre(String nombre){
        ArrayList<Empresa> lista = new ArrayList<>();
        for(Empresa e:bd){
            if(e.getNombre().startsWith(nombre)){
                lista.add(e);
            }
        }
        return lista;
        
    }
    
    
    
}
