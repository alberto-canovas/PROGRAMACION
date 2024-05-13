/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author toti
 */
public class BD_Agenda {
        private static final String url = "jdbc:mariadb://127.0.0.1/personas";
        private static final String username = "root";
        private static final String password ="";
        private static Connection connection;

    
    
    public static void conectarBD(){
        //cargar driver
        try{
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK");
        }catch(Exception ex){
            System.out.println("Error no se ha podido cargar el driver");
            System.out.println(ex.getMessage());
        }
        
        //conexión a la BD
        
        try{
            connection = (Connection)DriverManager.getConnection(url,username,password);
            System.out.println("Conexión abierta");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }//fin conectar
    
    public static void desconectarBD(){
        try{
            connection.close();
            System.out.println("Conexión cerrada");
        }catch(SQLException ex){
            System.out.println("Error al desconectarse");
            System.out.println(ex.getMessage());
        }
    }
    
    public static void listarContactos(){
        String listar = "SELECT * FROM personas";
        System.out.printf("ID NOMBRE         APELLIDOS           EDAD\n");
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(listar);//para realizar consultas    QUERY
            
            
//            while(rs.next()){
//                String nombre = rs.getString("Nombre");
//                String apellidos = rs.getString("Apellidos");
//                int edad = rs.getInt("Edad");
//                int id = rs.getInt("Id");
//                
//                System.out.printf("%-2d %-15s %-20s %2d %n", id,nombre,apellidos,edad);
//            }
            
            //OTRA FORMA DE HACER LA LISTA
            
            while(rs.next()){
                System.out.printf("%-2d %-15s %-20s %2d %n", 
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
            rs.close();
            statement.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }//fin listarContactos
    
    public static ArrayList<Contacto> getListaPersonas(){
        ArrayList<Contacto> listaAux = new ArrayList<>();
        String listar = "SELECT * FROM personas";
        System.out.printf("ID NOMBRE         APELLIDOS           EDAD\n");
        
         try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(listar);
            
            
            while(rs.next()){
                listaAux.add(new Contacto(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
                        
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return listaAux;
    }
    
    public static void añadir(String nombre, String apellidos, int edad){
        String sql =String.format("INSERT INTO personas VALUES(NULL,'%s','%s','%d')",nombre,apellidos,edad);
            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql); //Para insert valores UPDATE
                
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Sql exception: " + ex.getMessage());
            }
    
    }
    
    public static void eliminar(int id){
        String sql = "DELETE FROM personas WHERE id = '"+id+"'";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            
            statement.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}//fin class
