/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_alquiler_coches;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class App {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        //DATOS
        BD_Empresa.añadirVehiculo(new Turismo ("1111TTT", "VOLVO XC60", 0));
        BD_Empresa.añadirVehiculo(new Turismo ("2222TTT", "AUDI A4", 0));
        BD_Empresa.añadirVehiculo(new Furgoneta ("3333TTT", "MERCEDES", 0));
        BD_Empresa.añadirVehiculo(new Furgoneta ("4444TTT", "CITROEN XC60", 10000));
        
        int opcion =0;
        do{
            BD_Empresa.listarFlota();
            System.out.println("*".repeat(40));
            System.out.println("ALQUILER");
            System.out.println("*".repeat(30));
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Histórico alquileres");
            System.out.println("3. Alquiler vehículo");
            System.out.println("4. Devolver vehículo");
            System.out.println("5. Salir del sistema");
            System.out.println("");
            System.out.print("Elige una opción > ");
            try{
                opcion= Integer.parseInt(teclado.nextLine());
                
            }catch(NumberFormatException e){
                System.out.println(e.getMessage()+"ERROR -> Introduzca un número entre 1 y 5 \n");
                
            }

        switch(opcion){ 
            case 1 -> {añadirVehiculo();
            }
            case 2->{historicoAlquileres();
            }
            case 3->{alquilarVehiculo();
            }
            case 4->{devolverVehiculo();
            }
            case 5->{
            }
            default->{
            System.out.println("Introduzca un número entre 1 y 5.");
            }
        }//fin switch
            
        }while (opcion!=5);
        
    }//fin main

    private static void añadirVehiculo() {
        String tipo;
        
        System.out.print("Seleccione Tipo [T(turismo)/F(furgoneta)]");
     
            tipo=teclado.nextLine();    
        if (tipo.equals("T")||tipo.equals("F")){
            System.out.print("Matricula: ");
            String matricula = teclado.nextLine();
            
            System.out.print("Marca y modelo: ");
            String marca = teclado.nextLine();
            
            System.out.print("KM: ");
            int km;
            try{
                km = Integer.parseInt(teclado.nextLine());
            }catch(NumberFormatException e){
                System.out.println(e.getMessage()+" Introduzca un número.");
                km=0;
            }
            
        if(km>=0 && tipo.equals("T"))
            BD_Empresa.añadirVehiculo(new Turismo(matricula,marca,km));
        
        if(km>=0 && tipo.equals("F"))
            BD_Empresa.añadirVehiculo(new Furgoneta (matricula,marca,km));
                
        }
            
        else{
                System.out.println("Tipo incorrecto");
            
        }
    }
    

    private static void historicoAlquileres() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void alquilarVehiculo() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Aquilar vehículo");
        System.out.print("Matrícula: ");
        String matricula = teclado.nextLine();
        Vehiculo_alq v = BD_Empresa.obtenerVehiculo(matricula);
        if(v!= null){
            if(!v.alquilado){
                System.out.print("Fecha(dd/MM/yyyy): ");
                LocalDate fecha;
                try{
                    fecha = LocalDate.parse(teclado.nextLine(),dtf);
                    v.alquilar(fecha);
                    //fecha correcta
                    /*
                    v.alquilado = true;
                    Alquiler alquiler = new Alquiler(v);
                    alquiler.setFechaInicio(fecha);
                    BD_Empresa.añadirAlquileres(alquiler);
                    System.out.println("");
                    alquiler.imprimir();
                    */
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Formato de fecha incorrecto");
                }
                
            }
            else{
                System.out.println("El vehículo ya está alquilado.");
            }
        }//fin primer if
        else
            System.out.println("La matricula no existe.");
        
    }
    
    private static void devolverVehiculo(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Devolver vehículo");
        System.out.print("Matrícula: ");
        String matricula = teclado.nextLine();
        Vehiculo_alq v = BD_Empresa.obtenerVehiculo(matricula);
        if(v!= null){
            if(v.alquilado){
                System.out.print("Fecha(dd/MM/yyyy): ");
                LocalDate fecha;
                try{
                    fecha = LocalDate.parse(teclado.nextLine(),dtf);
                    System.out.print("Km actuales: ");
                    int Kmfin = Integer.parseInt(teclado.nextLine());
                    
                    v.alquilado = true;
                    //v.alquilar(0);
                    Alquiler alquiler = BD_Empresa.obtenerUltimoAlquiler(matricula);
                    alquiler.setFechaFin(fecha);
                    alquiler.setKmFin(Kmfin);
                    v.km = Kmfin;
                    //BD_Empresa.añadirAlquileres(alquiler);
                    System.out.println("");
                    alquiler.imprimir();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Formato de fecha incorrecto");
                }
                
            }
            else{
                System.out.println("El vehículo no está alquilado.");
            }
        }//fin primer if
        else
            System.out.println("La matricula no existe.");
        
    }        
    
    
}//fin main
