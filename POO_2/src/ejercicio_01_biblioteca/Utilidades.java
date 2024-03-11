/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_biblioteca;

/**
 *
 * @author toti
 */
public class Utilidades {
    
    public static String generaCodigoLibro(){
        StringBuilder sb = new StringBuilder();
        char letra1 = (char)((int)(Math.random()* 26 + 65));
        sb.append(letra1);
        sb.append((char)((int)(Math.random()* 26 + 65)));
        for (int i = 0; i < 3; i++) {
            sb.append(((int)(Math.random()* 10)));
        }
        return sb.toString();
    }
    
    public static String generarCodigoLibrov1(){
        String codigo = "";
        codigo += (char)((int)(Math.random()* 26 + 65));
        codigo += (char)((int)(Math.random()* 26 + 65));
        codigo += (int)(Math.random()*10);
        codigo += (int)(Math.random()*10);
        codigo += (int)(Math.random()*10);
        return codigo;
    }
}
