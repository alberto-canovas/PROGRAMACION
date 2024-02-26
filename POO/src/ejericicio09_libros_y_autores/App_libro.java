/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio09_libros_y_autores;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class App_libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<libro> listaLibros =  new ArrayList<>();
        ArrayList<autor> listaAutores =  new ArrayList<>();
        
        listaAutores.add(new autor("Jorge Javier","Vazquez","Luengo","jorgejvl@gmail.com"));
        listaAutores.add(new autor("Alicia","Carno","Luengo","alicial@gmail.com"));
        
        listaLibros.add(new libro(Utilidades.generarCodigoLibro(),"El hobbiton",listaAutores.get(0),2020));
        listaLibros.add(new libro(Utilidades.generarCodigoLibro(),"Mi vida es bella",listaAutores.get(1),2021));
        
        
        //imprimir autores
        
        System.out.println("LISTA AUTORES["+listaAutores.size()+"]");
        System.out.println("=".repeat(35));
        for(autor a:listaAutores){
            System.out.println(a.getNombreCita());
        }
        //imprimir libros
        System.out.println("");
        System.out.println("LISTA LIBROS["+listaLibros.size()+"]");
        System.out.println("=".repeat(35));
        for(libro l:listaLibros){
            System.out.println(l.citaBibliografica());
        }
        
        
        
    }
    
}
