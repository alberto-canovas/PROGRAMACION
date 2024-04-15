/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_figuras;

/**
 *
 * @author toti
 */
public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public double area() {
        return lado*lado;
    }
    
    @Override
    public double perimetro(){
        return lado*4;
    }
    
    @Override
    public void pintar(){
        System.out.printf("Cuadrado %dx%d \n\n",lado,lado);
        System.out.println(colorRelleno);

        for (int i = 0; i < lado; i++) {
            System.out.println(colorRelleno+"* ".repeat(lado));
        }
    }
}
