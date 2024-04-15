/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_figuras;

/**
 *
 * @author toti
 */
public class Rectangulo extends Figura {
    
    private int ladoLargo;
    private int ladoCorto;

    public Rectangulo(int ladoLargo, int ladoCorto) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
    }
    
    
    
    
    @Override
    public double area(){
        return ladoCorto*ladoLargo;
    }
    
    @Override
    public double perimetro(){
        return ladoCorto*2+ladoLargo*2;
    }
    
    @Override
    public void pintar(){
        if (this instanceof cuadrado2)
            System.out.printf("Cuadrado %dx%d\n",ladoLargo,ladoCorto);
        else
            System.out.printf("Rectangulo %dx%d\n",ladoLargo,ladoCorto);
        System.out.println(colorRelleno);
        for (int i = 0; i < ladoCorto; i++) {
            System.out.println(colorRelleno+"* ".repeat(ladoLargo));
        }
                
       
    }
    
}
