/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03_libro;

/**
 *
 * @author toti
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro listaLibros[]= new Libro[10];
        
        listaLibros[0] = new Libro("1948","G. Oswell",1948);
        
        listaLibros[1] = new Libro("L001","Moby Dick","Mervill H.",1851);
        
        listaLibros[2] = new Libro("50 sombras", "Mike M.",2010);
        
        
        
        
        for (int i=0;i<Libro.getContador();i++){
            System.out.println(listaLibros[i].toString());
        }
        
//        System.out.println(libro1.toString());
//        System.out.println(libro2.toString());
//        System.out.println(libro3.toString());
//        System.out.println("");
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());
//        System.out.println(libro3.citaBibliografica());
//        System.out.println("");
//        libro1 = libro2;
//        System.out.println(libro1.toString());
//        System.out.println(libro2.toString());
        
        
        

    }
    
}
