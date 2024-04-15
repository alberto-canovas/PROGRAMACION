/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_figuras;

/**
 *
 * @author toti
 */
public abstract class Figura {
    protected String colorRelleno;
    static final String NEGRO = "\033[30m";
    static final String ROJO = "\033[31m";
    static final String VERDE = "\033[32m";
    static final String AZUL = "\033[34m";
    
    
    public Figura(){
        colorRelleno = NEGRO;
    }
    
    public void setColor(TipoColor color){
       //String colorAux = color.toString();
       switch(color){
           case NEGRO ->{colorRelleno=NEGRO;}
           case ROJO ->{colorRelleno=ROJO;}
           case VERDE ->{colorRelleno=VERDE;}
           case AZUL ->{colorRelleno=AZUL;}
            
}
    }
    
    
    public abstract double area();
    
    public abstract double perimetro();
    
    public abstract void pintar();
    
}