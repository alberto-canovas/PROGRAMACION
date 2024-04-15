/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_figuras;

/**
 *
 * @author toti
 */
public class AppFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figura fig = new Figura();
        
        Rectangulo rect = new Rectangulo(8, 3);
        Cuadrado cuad = new Cuadrado(3);
        Piramide pir = new Piramide(4);
        pir.setColor(TipoColor.ROJO);
        cuad.setColor(TipoColor.VERDE);
        cuadrado2 cuad2 = new cuadrado2(4);
        
        System.out.println("Area rectangulo " +rect.area());
        System.out.println("Area cuadrado "+cuad.area());
        System.out.println("Perimetro rectangulo "+rect.perimetro());
        System.out.println("");
        rect.setColor(TipoColor.AZUL);
        rect.pintar();
        System.out.println("");
        cuad.pintar();
        System.out.println("");
        pir.pintar();
        
        cuad2.setColor(TipoColor.AZUL);
        cuad2.pintar();
    }
    
}
