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
public class Fichero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona;
        String linea;
        String datos[];
        try {
            BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
            //cabecera
            linea= bf.readLine();
            datos=linea.split(",");
            System.out.printf("%-6s %-6s  %8s  %s\n",datos[0],datos[1],datos[2],datos[3]);

            while(linea!=null){
                linea=bf.readLine();
                datos=linea.split(",");
//                persona = new Persona(datos[0],datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
                persona = new Persona(datos);
                        

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("No se ha podido leer el fichero");
        }
        
    }
    
}
