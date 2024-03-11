/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_biblioteca;

/**
 *
 * @author toti
 */
public class Libro {
    private String codigo,titulo;
    private Autor autor;
    private int año;
    private Boolean prestado;
    
    


    public Libro(String codigo,String titulo, Autor autor, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.prestado = false;
    }
    
    public void imprimir(){
        System.out.printf(%s+"-"+%s "("+%d+") -"+%s,codigo,titulo,año,autor);
    }
    
}
