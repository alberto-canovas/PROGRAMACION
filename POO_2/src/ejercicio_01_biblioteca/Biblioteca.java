/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Autor> listaAutores;
    private ArrayList<String> listaCodigos;
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
        listaLibros = new ArrayList<>();
        listaAutores = new ArrayList<>();
        listaCodigos = new ArrayList<>();
    }
    
    public void addLibro(String titulo, Autor autor, int año){
        String codigo;
        boolean repetido = false;
        do{
            repetido = false;
            codigo = Utilidades.generaCodigoLibro();
            for (String cod: listaCodigos){
                if(cod.equals(codigo)){
                    repetido = true;
                    break;
                }
            }
        }while(repetido = true);
        listaCodigos.add(codigo);
        listaLibros.add(new Libro(codigo,titulo, autor, año));
    }
    
    public void addAutor(String nombre, String apellido1, String apellido2, String email){
        listaAutores.add(new Autor(nombre, apellido1, apellido2, email));
    }
    
  
    public boolean prestarLibro(String codigo){
        return false;
    }
    
    public boolean devolverLibro(String codigo){
        return false;
    }
    
    public void listarLibros(){
        System.out.println("       LISTADO DE LIBROS");
        System.out.println("=".repeat(50));
        for (Libro li : listaLibros){
            System.out.println();   
        }  
    } 
    
    public void listarAutores(){
        System.out.println("       LISTA DE AUTORES");
        System.out.println("=".repeat(50));
        System.out.println("Id  Nombre   Apellido1   Apellido2   email");
        for (Autor aut: listaAutores){
            aut.mostrarDetalles();
        }
        
    }
    
    private void inicializar(){
        
    }
    
    public Autor buscarAutor(int id){
        
        
        for (Autor aut : listaAutores) {
            if(aut.getId()== id){
                return aut;
            }
        }
        return null;
    }
    
    
}//fin


