/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toti
 */
public class FicheroEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {            
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("escritura.txt"));
            bw.write("Primera linea\n");
            bw.write("Segunda linea\n");
            
        } catch (IOException ex) {
            Logger.getLogger(FicheroEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
