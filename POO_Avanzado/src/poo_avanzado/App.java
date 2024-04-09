/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_avanzado;

/**
 *
 * @author toti
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Seleccion selFutbol = new Seleccion(0, "Pepe", "Manzanera", 25);
        
        selFutbol.concentrarse();
        
        selFutbol.apellidos="martinez";
        selFutbol.nombre="Juan";
        System.out.println(selFutbol.toString());
        
        
        Futbolista futbolista = new Futbolista(12,"Delantero",2,"alberto","De la Guerra",22);
        System.out.println(futbolista.toString());
        futbolista.jugarPartido();
        
        Entrenador entrenador = new Entrenador("1001", 3, "Carletto", "Ancelloti", 55);
        System.out.println(entrenador.toString());
        entrenador.dirigirEntreno();
        
        Masajista masajista = new Masajista("Fisio", 10, 952, "Pepe", "martinez", 35);
        masajista.darMasaje();
        
        
    }
    
}
