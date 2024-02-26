/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio09_libros_y_autores;

/**
 *
 * @author toti
 */
public class Utilidades {
    
    public static String generarCodigoLibro(){
        StringBuilder sb = new StringBuilder();
//        sb.append(letra); //—> añade una letra al String
//        sb.append(digito); //—> añade un entero al String
//        sb.toString(); //—> devuelve el String formado
        int digito;
        char letra;
        letra = (char)((int)(Math.random() * 26 + 65));
        sb.append(letra);
        letra = (char)((int)(Math.random() * 26 + 65));
        sb.append(letra);
        sb.append((int)(Math.random()*10));
        sb.append((int)(Math.random()*10));
        sb.append((int)(Math.random()*10));
        return sb.toString();
    }
    
    public static boolean checkEmail(String email){
        return true;
    }
    
    
}
