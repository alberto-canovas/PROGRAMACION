/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canovas_lopez_alberto_csv_a_BDD;

import java.sql.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toti
 */
public class BBDD {

   
    static Connection conexion;
    //añadimos java.sql.connection o sql.*
    public static void main(String[] args) {
        //añadimos el archivo productos.csv a la carpeta del proyecto
        //en este caso C:\Users\toti\Documents\NetBeansProjects\Canovas_Lopez_Alberto_Control_17_05_correccion
        
        String archivo = "productos.csv";
        String linea;
        String[] campos;
        
        //creamos las variables que hay en la cabecera
        int id, categoria;
        String nombre, descripcion;
        double coste, precio;
        
        //conectamos a la base de datos para realizar la consulta
        conectar();
        try {
            //Creamos el FileReader para poder leer el archivo productos.csv
            FileReader fr = new FileReader(archivo);
            BufferedReader br =new BufferedReader(fr);
            
            //cabecera
            //ESTA LÍNEA ES LA CABECERA la leemos para quitarla y no añadirla a la base de datos
            linea = br.readLine(); 
            System.out.println(linea);
            
            //AQUÍ VAMOS A LEER TODOS LOS DATOS 
            linea = br.readLine();
            
            //CREAMOS EL STATEMENT FUERA DEL BUCLE
            Statement statement = conexion.createStatement();
                
                
            while(linea!=null){
                
                //separamos los datos por ;
                
                campos = linea.split(";");
                
                //añadimos cada dato de la lista en su variable correspondiente
                
                id = Integer.parseInt(campos[0]);
                nombre = campos[1];
                descripcion = campos[2];
                coste = Double.parseDouble(campos[3]);
                precio = Double.parseDouble(campos[4]);
                categoria = Integer.parseInt(campos[5]);
                
                //System.out.printf("%3d %-40s %-65s %8.2f$ %8.2f$ %d%n",id,nombre,descripcion,coste,precio,categoria);
                
                //INSERT INTO
                //El locale.Us se utiliza en este caso para dejar los decimales de los doubles con puntos (como en el formato US) 
                //OJO CON LAS COMILLAS en `products`, NO HACE FALTA PONERLAS Y SI LAS PONES PON EL ACENTO DOS VECES
                
                String sql = String.format(Locale.US,"INSERT INTO `products` VALUES (%d,'%s','%s',%.2f,%.2f,%d)", id,nombre,descripcion,coste,precio,categoria);
                statement.executeUpdate(sql);
                
                //Lo imprimos para comprobar la consulta
                //System.out.println(sql);
                
                linea = br.readLine();
            }
            
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: "+ex.getMessage());
            
        } catch (IOException ex) {
            System.out.println("IOException: "+ex.getMessage());
            
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ex.getMessage());
        }
        
        
        
        
        desconectar();
        
        
        
        
        
        
        
        
        
    }//fin main
    public static void conectar(){
        //declaramos las variables
            String url = "jdbc:mariadb://localhost:3306/control03";
            String username = "root";
            String password = "";
            
            
        //DRIVER 
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK");
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("ClassNotFoundException "+ex.getMessage());
            System.out.println("DRIVER KO");
            
        } catch (InstantiationException ex) {
            System.out.println("InstantiationException "+ex.getMessage() );
            System.out.println("DRIVER KO");

            
        } catch (IllegalAccessException ex) {
            System.out.println("IllegalAccessException "+ex.getMessage());
            System.out.println("DRIVER KO");
        }
            
        //CONECTAR
        try{
            conexion = DriverManager.getConnection(url,username,password);
            System.out.println("CONEXIÓN OK");
        }
            
         catch (SQLException ex) {
            System.out.println("SQLEXception "+ex.getMessage());
            System.out.println("CONEXIÓN KO");

        }
             
        }//fin conectar
    
    public static void desconectar(){
        try {
            conexion.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//fin desconectar
       
   
}//fin
