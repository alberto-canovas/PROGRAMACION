/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio09_libros_y_autores;

/**
 *
 * @author toti
 */
public class autor {
    
    private String nombre,apellido1,apellido2,email;

    public autor(String nombre, String apelllido1, String apellido2, String email) {
        this.nombre = nombre;
        this.apellido1 = apelllido1;
        this.apellido2 = apellido2;
        this.email = email;
    }
    
    
   
    
    public String getNombreCita(){
        String aux = apellido1 + ", ";
        String[] listaNombre = nombre.split(" ");
        for(String nom:listaNombre){
            aux+=nom.charAt(0)+".";
        }
        
        return aux;
    }
    

}
