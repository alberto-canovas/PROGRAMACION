/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01_biblioteca;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class App_Biblioteca {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca("Arcas");
        //Autores
        Datos.cargaAutores(miBiblioteca);
        
        Autor autor = new Autor("Paco José","De Lucía","Sanchez","paco@mail.com");
        
        miBiblioteca.listarAutores();
        System.out.println("id: ");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println(miBiblioteca.buscarAutor(id).getNombreCita());

        //Pruebas genera codigo
        for (int i = 0; i < 10; i++) {
            System.out.println(Utilidades.generaCodigoLibro());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Utilidades.generarCodigoLibrov1());
        }
        
        
        
        
        
        
        
    }//FIN MAIN
    
}//FIN
