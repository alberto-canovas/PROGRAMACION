
package Parking;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class MeterRegistroABDD {

  
    public static void main(String[] args) {

        
        
        
        // 1º cargar Driver
        try {//nos lo da
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK");
        } catch (Exception ex) {
            System.out.println("Error no se ha podido cargar el driver");
        }
        
        
         //2º conexión a la base de datos
        String url = "jdbc:mariadb://127.0.0.1/personas";
        String username = "root";
        String password = "";
        Connection connection;
        try{
            //nos da las dos lineas siguientes
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
      
            Vehiculo coche = new Vehiculo("6666TOP");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse("15/05/2024",dtf);

            coche.setFechaEntrada(fecha);
            
            coche.setNumPlazaAparcamiento(0);
            
            String sql =  "INSERT INTO personas VALUES(null,'"+coche.getMatricula()+"','"+coche.getFechaEntrada()+"',"+coche.getNumPlazaAparcamiento()+")";
            statement.executeUpdate(sql);
            
            
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("SQLEXCEPTION" +ex.getMessage());
        }
      
            
        }//fin main
    }//fin
    

