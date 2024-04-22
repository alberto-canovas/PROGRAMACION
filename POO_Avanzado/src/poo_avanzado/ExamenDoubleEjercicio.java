/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class ExamenDoubleEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(1-0.2);
        System.out.println(0.6-0.2);
        System.out.println(Math.round((0.6-0.2)*100)*0.01);
        
        
        
        double importe = 0.2;
        double entrega = 0.6;
        double cambio = (entrega-importe);
        cambio = Math.round(cambio*100)*0.01;
        System.out.println(cambio);
        
    }
    
    //calcular el cambio, que nos devuelva primero la moneda más grande posible
    //calcular monedas que hay que meter para obtener x precio
    //math.round
    //entregar y recibir monedas mediante un menú
    //maquina expendedora meter articulos
    //meter y sacar dinero double
}
