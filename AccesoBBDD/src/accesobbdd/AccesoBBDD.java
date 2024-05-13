/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesobbdd;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author toti
 */
public class AccesoBBDD {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // 1º cargar Driver
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver OK");
        } catch (Exception ex) {
            System.out.println("Error no se ha podido cargar el driver");
            Logger.getLogger(AccesoBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int opcion = 0;
        String entrada;
        do{
            System.out.println("*******************");
            System.out.println("   Agenda con BBDD");
            System.out.println("*******************");
            System.out.println("1. Alta");
            System.out.println("2. Listar");
            System.out.println("3. Salir");
            System.out.print("opcion> ");
            entrada = teclado.nextLine();
            //expresión regular que hace referencia a que solo valen números entre el 1 y el 3
            if(entrada.matches("[1-3]")){
                //pasamos String(entrada) a int(en la variable opcion)
                opcion = Integer.parseInt(entrada);
                switch(opcion){
                    case 1 ->{añadirDatos();}
                    case 2 ->{listar();}
                    case 3 ->{}
                }
            }
            else{
                System.out.println("Entrada no válida");
            }
            System.out.println("");
        }while(opcion!=3);
        
        
        //2º conexión a la base de datos
        String url = "jdbc:mariadb://127.0.0.1/personas";
        String username = "root";
        String password = "";
        
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            
            //  INSERT TO
            //statement.executeUpdate("INSERT INTO personas VALUES(NULL,'David','Costa',19)");
            /*
            String nombre = "Paco";
            String apellido = "Martínez";
            int edad = 25;
            
            String sql = String.format("INSERT INTO personas VALUES(NULL,'%s','%s',%d)", nombre, apellido,edad);
            statement.executeUpdate(sql);
            System.out.println("Datos cargados correctamente");
            */
            
            
            /*
            String[] nombres = {"Alicia","José","Rodrigo"};
            String[] apellidos ={"Ros", "Cánovas","García"};
            int[] edades = {22,50,99};
            
            for (int i = 0; i < nombres.length; i++) {
                String sql = String.format("INSERT INTO personas VALUES(NULL,'%s','%s',%d)", nombres[i], apellidos[i],edades[i]);
                statement.executeUpdate(sql);
                
            }
            */

            
            /*
            System.out.println("Datos cargados correctamente");
            //SELECT
            ResultSet rs = statement.executeQuery("SELECT * FROM personas");
            //con este bucle obtenemos los datos de la base de datos y los guardamos en variables
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                
                System.out.printf("%2d %-8s %-8s %2d%n",id , nombre, apellido, edad);
            }   
            
            rs.close();
            statement.close();
            connection.close();
            */
            
            
        } catch (SQLException ex) {
            System.out.println("Error: no conecta a BD");
            System.out.println(ex.getMessage());
        }
        
        
        
        
    }//fin main

    private static void listar() {
 //2º conexión a la base de datos
        String url = "jdbc:mariadb://127.0.0.1/personas";
        String username = "root";
        String password = "";
        
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            //SELECT
            ResultSet rs = statement.executeQuery("SELECT * FROM personas");
            //con este bucle obtenemos los datos de la base de datos y los guardamos en variables
            System.out.println("*********************************");
            System.out.println("ID NOMBRE APELLIDO EDAD");
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                
                System.out.printf("%2d %-8s %-8s %2d%n",id , nombre, apellido, edad);
            }   
            
            rs.close();
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            System.out.println("Error: no conecta a BD");
            System.out.println(ex.getMessage());
        }    }

    private static void añadirDatos() {
 //2º conexión a la base de datos
        String url = "jdbc:mariadb://127.0.0.1/personas";
        String username = "root";
        String password = "";
        
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            
            System.out.println("Nueva persona... ");
            String nombre;
            String apellido;
            int edad;
            String entrada;
            
            
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Apellido: ");
            apellido = teclado.nextLine();
            
            //BUCLE PARA QUE HASTA QUE NO METAMOS UNA EDAD ENTRE 1 Y 9 EL PRIMER DIGITO Y EL SEGUNDO ENTRE 0 Y 9
            //PARA QUE TAMBIÉN NOS ACEPTE EDADES DE UNA SOLA CIFRA HAY QUE PONER EL * ENTRE LOS CORCHETES
            do{
                System.out.print("Edad: ");
                entrada = teclado.nextLine();
                if (entrada.matches("[1-9]*[0-9]"))
                    edad = Integer.parseInt(entrada);
                else
                    edad = -1;

            }while (edad ==-1);
                
            String sql = String.format("INSERT INTO personas VALUES(NULL,'%s','%s',%d)", nombre, apellido,edad);
            statement.executeUpdate(sql);
            
            
            
            //  INSERT TO
            //statement.executeUpdate("INSERT INTO personas VALUES(NULL,'David','Costa',19)");
            /*
            String nombre = "Paco";
            String apellido = "Martínez";
            int edad = 25;
            
            String sql = String.format("INSERT INTO personas VALUES(NULL,'%s','%s',%d)", nombre, apellido,edad);
            statement.executeUpdate(sql);
            System.out.println("Datos cargados correctamente");
            */
            
            
            /*
            String[] nombres = {"Alicia","José","Rodrigo"};
            String[] apellidos ={"Ros", "Cánovas","García"};
            int[] edades = {22,50,99};
            
            for (int i = 0; i < nombres.length; i++) {
                String sql = String.format("INSERT INTO personas VALUES(NULL,'%s','%s',%d)", nombres[i], apellidos[i],edades[i]);
                statement.executeUpdate(sql);
                
            }
            */

            System.out.println("Datos cargados correctamente");
            //SELECT
           
            
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            System.out.println("Error: no conecta a BD");
            System.out.println(ex.getMessage());
        }

    }
 
   
    
}
