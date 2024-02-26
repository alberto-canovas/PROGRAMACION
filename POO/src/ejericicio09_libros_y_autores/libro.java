/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio09_libros_y_autores;

/**
 *
 * @author toti
 */
public class libro {
    private String codigo, titulo;
    private autor Autor;
    private int año;

    public libro(String codigo, String titulo, autor Autor, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.Autor = Autor;
        this.año = año;
    }
    
    public String citaBibliografica(){
        String cita;
        cita = codigo + " - " + titulo + " - ("+ año+") - " +Autor.getNombreCita();
        return cita;
    }
    
    
}
