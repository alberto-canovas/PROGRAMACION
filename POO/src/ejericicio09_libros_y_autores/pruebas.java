/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio09_libros_y_autores;

/**
 *
 * @author toti
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        //COMPROBACIONES COMO SEPARAR NOMBRES POR ESPACIOS   
        /**
        String nombre = "Alicia";
        String nombre1 = "Jose Pedro";
        String[] nombreLista = nombre.split(" ");
        String[] nombreLista1 = nombre1.split(" ");
        
        System.out.println(nombreLista.length);
        System.out.println(nombreLista1.length);
        
        System.out.println(nombreLista[0]);
        
        System.out.println(nombreLista1[0]);
        System.out.println(nombreLista1[1]);
        
        
        String aux = "";
        for (String nom:nombreLista){
            aux+= nom.charAt(0)+".";
        }
        
        System.out.println(aux);
        */
        
        
        //COMPROBACIONES AÑADIR CODIGO ALEATORIO
        /*
        StringBuilder sb = new StringBuilder();
        int digito;
        char letra;
        letra = (char)((int)(Math.random() * 26 + 65));
        sb.append(letra);
        letra = (char)((int)(Math.random() * 26 + 65));
        sb.append(letra);
        sb.append((int)(Math.random()*10));
        sb.append((int)(Math.random()*10));
        sb.append((int)(Math.random()*10));
        
        System.out.println(sb.toString());
        System.out.println(" ");
        **/
        
        System.out.println(Utilidades.generarCodigoLibro());
        System.out.println(Utilidades.generarCodigoLibro());
        System.out.println(Utilidades.generarCodigoLibro());
        
        
        
        
        
    }
    
}
