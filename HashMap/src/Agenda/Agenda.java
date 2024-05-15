/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toti
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Contacto> agenda = new ArrayList<>();
    
    public static void main(String[] args) {
        
        cargarContactosCSV();
        cargarContactosDat();
        int opcion=0;
        String entrada;
        do{
            System.out.println("*".repeat(30));
            System.out.println("          Mi agenda");
            System.out.println("*".repeat(30));
            System.out.println("1. Añadir contactos");
            System.out.println("2. Listar contactos");
            System.out.println("3. Modificar contactos");
            System.out.println("4. Salir CSV");
            System.out.println("5. Salir dat.");
            System.out.print("Opción> ");
            entrada= teclado.nextLine();
            if(entrada.matches("[1-5]")){
                opcion=Integer.parseInt(entrada);
                switch(opcion){
                    case 1->{añadirContacto();}
                    case 2->{listarContactos();}
                    case 3->{modificarContactos();}
                    case 4->{guardarContactosCSV();}
                    case 5->{guardarContactosdat();}
                }
            } else {
                System.out.println("Entrada no válida.");
            }
            System.out.println("");
        }while(opcion!=4);
        
    }

    private static void cargarContactosCSV() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea = br.readLine();
            String[] datos;
                while(linea!=null){
                    datos = linea.split(";");
                    linea = br.readLine();
            } 
 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private static void añadirContacto() {
        System.out.println("        Nuevo contacto");
        System.out.println("*".repeat(30));
        
        System.out.print("Nombre: ");
        String nombre=teclado.nextLine();
        
        System.out.print("Sexo(H/M): ");
        char sexo=teclado.nextLine().charAt(0);
                
        System.out.print("Edad: ");
        int edad=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Altura(m): ");
        double altura=Double.parseDouble(teclado.nextLine());
        
        agenda.add(new Contacto(nombre, sexo, edad, altura));
        
    }

    private static void listarContactos() {
        System.out.println("     LISTA CONTACTOS");
        System.out.println("*".repeat(30));
        for(Contacto c: agenda){
            System.out.println(c.toString());
        }
    }

    private static void modificarContactos() {
        
        
    }

    private static void guardarContactosCSV() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
            for(Contacto c: agenda){
                bw.write(c.toCSV());
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error IO al guardar");
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void guardarContactosdat(){
        Contacto contacto = agenda.get(0);
        FileOutputStream fichero = null;
        
        try{
            fichero = new FileOutputStream("datosDat.dat");
            ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
            agenda.add(contacto);
            for(Contacto c: agenda){
                tuberia.writeObject(contacto);
                
            }fichero.close();
        }catch(FileNotFoundException ex){
            System.out.println("Error FileNotFound al guardar");
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            System.out.println("Error IO al guardar");
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
            try {
                fichero.close();
            } catch (IOException ex) {
                System.out.println("Error IO al guardar y cerrar"); 
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }

    private static void cargarContactosDat() {
        FileInputStream fichero = null;
        
        File archivo = new File("datosDat.dat");
        if(archivo.exists()){
            try{
                fichero = new FileInputStream(archivo);
                ObjectInputStream tuberia = new ObjectInputStream(fichero);
                ArrayList<Contacto> agenda = new ArrayList<>();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
    
}//fin main
