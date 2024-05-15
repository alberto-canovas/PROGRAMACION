/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toti
 */
public class Fichero3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String linea;
        String[] datos;
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\toti\\Downloads\\biostats.csv"));
            System.out.println("Fichero encontrado");
            //Cabecera
            linea=br.readLine();
            System.out.println(linea);
            //PRIMERA LINEA
            linea=br.readLine();
            while(linea!=null){
                datos = linea.split(",");
                for(String dato: datos){
                    System.out.println(dato+" ");
                }
            br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero");
        }
        
        
    }
    
}
