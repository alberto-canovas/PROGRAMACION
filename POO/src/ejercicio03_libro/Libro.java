/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03_libro;

/**
 *
 * @author toti
 */
public class Libro {
    
    //ATRIBUTOS
   private String isbn,autor,titulo;
   private int año;
   static int contador=0;
   //CONSTRUCTOR

    public Libro(String isbn,String titulo, String autor,  int año) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        contador++;
    }

    public Libro(String titulo,String autor,int año) {
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        contador++;
    }


   
   //MÉTODOS

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public String citaBibliografica(){
        String mensaje;
        if (isbn==null){
            mensaje="no tiene ISBN";
        }
        else 
            mensaje="ISBN -"+isbn;
        return "*** [%s] %s ***".formatted(titulo,mensaje);
    }

    @Override
    public String toString() {
    return "Libro{" + "isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", a\u00f1o=" + año + '}';

        }

    public static int getContador() {
        return contador;
    }
    
    public static boolean isISBN(String isbn){
        boolean correcto=true;
        if (isbn.length()!=4){
            //System.out.println("longitud");
            correcto=false;
        } 
        else{
            if(isbn.charAt(0)<'A' || isbn.charAt(0)>'Z'){
                //System.out.println("primer char");
                correcto = false;   
            } else{ 
                for (int i=1;i<4;i++){
                    if (isbn.charAt(1)<'0'||isbn.charAt(1)>'9')
                        correcto =  false;
                        break;
            }
            }  
        }
            
            
        return correcto;
    }
    
}








