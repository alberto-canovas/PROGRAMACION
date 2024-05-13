/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package world;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toti
 */
public class WorldMain {

    /**
     * @param args the command line arguments
     */
    
    static Connection connection;
    static Scanner teclado = new Scanner(System.in);
    //static Statement statement = connection.createStatement();
    
    public static void main(String[] args) {
        // TODO code application logic here
        conectarBBDD();
        
        getPaisesContinente();

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

    private static void getPaisesContinente() {
        System.out.println("Continente: ");
        String continente = teclado.nextLine();
        HashMap<String,Double> paises = new HashMap<>();
        ArrayList<Pais> paisesList = new ArrayList<>();
        
        String sql = "SELECT Name, Region, SurfaceArea FROM country WHERE Continent='"+continente+"'";
        //String sql = "SELECT name, surfaceArea FROM country WHERE surfaceArea = (SELECT max(surfaceArea) FROM country WHERE continent = 'Europe')";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
//            rs.next();
//                System.out.printf("La superficie máxima de %s la tiene %s con %.2f km2  %n",continente,rs.getString(1),rs.getDouble(2));
//                
           System.out.println("País                 Región                        Superficie");
           System.out.println("-".repeat(70));
            while(rs.next()){
                String name = rs.getString("Name");               String region = rs.getString("Region");
                Double surface = rs.getDouble("SurfaceArea");
                //Guardamos en HashMap
                //paises.put(name, surface);
                
                //Guardamos en ArrayList
                paisesList.add(new Pais(name,region,surface));
                System.out.printf("%-20s %-30s %.2f%n",name,region,surface);
            }
            rs.close();
            statement.close();
            
            
        } catch (SQLException ex) {
                System.out.println("SQLException: "+ex.getMessage());
        }
        
//        Mostrar resultado con HashMap
//        String paisMax = getPaisMaxSuperficie(paises);
//        System.out.printf("Superficie máxima:  %.2f de %s %n ",paises.get(paisMax),paisMax);

//        Mostrar resultado con ArrayList<Pais>
          Pais resultado = maxSurface(paisesList);
          
          System.out.printf("Superficie máxima:  %.2f de %s %n ",resultado.getSurfaceArea(),resultado.getNombre());
    }

    private static Pais maxSurface(ArrayList<Pais> paises){
        Pais maxPais= null;
        double max =paises.get(0).getSurfaceArea();
        
        for(Pais pais: paises){
            if(pais.getSurfaceArea()>max){
                max=pais.getSurfaceArea();
                maxPais = pais;
            }
        }
        
        
        return maxPais;
    }
    
    private static String getPaisMaxSuperficie(HashMap paises) {
        Iterator it = paises.keySet().iterator();
        double max =0;
        String paisMax="";
        while(it.hasNext()){
            String pais = (String)it.next();
            double surface = (double)paises.get(pais);
            
            if(surface>max){
                max= surface;
                paisMax = pais;                
            }
        } return paisMax;
      
    }
    
}//fin main
