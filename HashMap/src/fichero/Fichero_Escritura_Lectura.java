/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author toti
 */
public class Fichero_Escritura_Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,apellidos;
        int edad;
        int estatura;
        String [] datos;
        int sumaEdad=0, sumaEstatura=0;
        double Alturamedia=0;
        int edadMedia=0;
        int contador=0;
         try {
            BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("datosprocesados.txt"));
            System.out.println("Fichero encontrado");
             
             //Aquí leemos la primera línea que es el encabezado 
             //para que no nos de fallos en el bucle
             //cabecera
             String linea=bf.readLine();
             //bw.write(linea+"\n");
             datos=linea.split(",");
             System.out.printf("%-6s %-6s  %8s  %s\n",datos[0],datos[1],datos[2],datos[3]);

             //primer linea de datos
             linea = bf.readLine();
           
             while(linea!=null){
                 //System.out.println(linea);
                 //bw.write(linea+"\n");
                 //Alberto, Pérez, 22, 175
                 datos = linea.split(",");
                 nombre=datos[0];
                 apellidos=datos[1];
                 edad=Integer.parseInt(datos[2]);
                 sumaEdad+=edad;
                 estatura=Integer.parseInt(datos[3]);
                 sumaEstatura+=estatura;
                 contador++;
                 System.out.printf("%-8s %-12s  %d  %5d\n",nombre,apellidos,edad,estatura);
                 char Inap=apellidos.charAt(0);
                 char Inno=nombre.charAt(0);
                 bw.write(Inno+". "+Inap+". "+(edad+estatura)+"\n");
                
                
                 linea=bf.readLine();
                
                 
             }
             
             bf.close();
             bw.close();
             
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
            
        } catch (IOException ex) {
             System.out.println("No se puede leer el fichero");
        }
         
         
         System.out.println("-".repeat(38));
         System.out.println("Calcular altura media: "+sumaEstatura/(double)contador);
        
         
         System.out.println("Calcular edad media: "+sumaEdad/(double)contador);
    }
    
}
