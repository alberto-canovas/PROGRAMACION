/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_figuras;

/**
 *
 * @author toti
 */
public class Piramide extends Figura {

    int altura,base;

    public Piramide(int altura) {
        this.altura = altura;
        this.base = 2*altura-1;
    }
    
     
    
    
    @Override
    public double area() {
        return (base*altura)/2;
    }

    
    @Override
    public double perimetro() {
        return 2*altura+base;
    }

    @Override
    public void pintar() {
        System.out.printf("Piramide %dx%d\n\n",altura,base);
        System.out.println(colorRelleno);

        for (int i = 0; i < altura; i++) {
            System.out.println(colorRelleno+" ".repeat(altura-i)+"*".repeat(2*i+1));
            
        }
    }
    
}
