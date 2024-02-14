/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02_cubo;

/**
 *
 * @author toti
 */
public class CUBO {
    //ATRIBUTOS
    private int capacidadMax, contenido;
   
    //CONSTRUCTOR
    public CUBO(int capacidadMax){
    this.capacidadMax=capacidadMax;
    this.contenido=0; 
    }
    
    //MÉTODOS
    public void llenarCubo(){
        contenido=capacidadMax;
    }
    
    public void vaciarCubo(){
        contenido=0;
    }
    
    public void rellenarCubocantidad(int cantidad){
        if (contenido+cantidad>capacidadMax){
            System.err.println("Imposible rellenar el cubo.");
        }
        else contenido=cantidad+contenido;

        
    }
    
    public void pintarCubo(){
        System.out.println("Cubo "+capacidadMax+ " litros");
        //Lineas vacias
        for (int i=0;i<capacidadMax-contenido;i++)
            System.out.println("#" + " ".repeat(6)+"#");
        //Lineas con agua
        for (int i=capacidadMax-contenido;i<capacidadMax;i++)
            System.out.println("#" + "~".repeat(6)+"#");
        //SUELO
        System.out.println("#".repeat(8));
        
    }
}
