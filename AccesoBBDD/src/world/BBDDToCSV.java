/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package world;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static world.WorldMain.connection;
import static world.WorldMain.teclado;

/**
 *
 * @author toti
 */
public class BBDDToCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conectarBBDD();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs= statement.executeQuery("SELECT name, district, population from city WHERE CountryCode ='ESP'");
            
           FileWriter fw = new FileWriter("CiudadesESP.csv");
           BufferedWriter bw = new BufferedWriter(fw);
           
           //cabecera fichero
           
           bw.write("NombreCiudad; Distrito; Población\n");
           
           while(rs.next()){
               String linea =String.format("%s;%s;%s\n",
                       rs.getString(1),
                       rs.getString(2),
                       rs.getString(3));
               bw.write(linea);
           }
            
           
           bw.close();
           rs.close();
           statement.close();
            
            
        }catch(SQLException ex){
            System.out.println("SQL EXCEPTION "+ex.getMessage());
            
        } catch (IOException ex) {
            System.out.println("IO EXCEPTION "+ex.getMessage());        
        }
        
        desconectarBBDD();
        
        
    }
     private static void conectarBBDD() {
        //cargar driver
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK");
        } catch (Exception ex) {
            System.out.println("Error no se ha podido cargar el driver");
            System.out.println(ex.getMessage());
        }// fin conectar
        
        //conexión a la BD
        String url = "jdbc:mariadb://127.0.0.1:3306/world";
        String username = "root";
        String password = "";    
        try {
            connection = (Connection)DriverManager.getConnection(url, username, password);
            System.out.println("Conexión abierta");
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void desconectarBBDD() {
        //desconexión a la BD
        try{
            connection.close();
            System.out.println("Conexión cerrada");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//fin desconectar
    
    
}
