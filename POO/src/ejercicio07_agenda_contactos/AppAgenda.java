/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07_agenda_contactos;

import java.util.Scanner;

/**
 *
 * 
 */
public class AppAgenda {
        static Agenda myAgenda = new Agenda();
        static int opcion;
        static Scanner teclado = new Scanner(System.in);

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        generarContactos();
        
        do{
            
            System.out.println("Agenda de Contactos");
            System.out.println("=".repeat(25));
            System.out.println("1. Añadir");
            System.out.println("2. Lista completa");
            System.out.println("3. Modificar");
            System.out.println("4. Buscar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            System.out.println("");
            
            try{
                opcion=Integer.parseInt(teclado.nextLine());
                
            }catch (NumberFormatException e){
                opcion = 0;
                System.out.println(e);
                System.out.println("\nERROR Inserte un número entero entre 1 y 5");
                System.out.println("");
            }
            
            
//            if (opcion<1 || opcion>5){
//                System.out.println("\nERROR Inserte un número entre 1 y 5");
//                System.out.println("");
//            }
            
            switch(opcion){
                case 1->{añadirContacto();}
                    
                case 2->{myAgenda.listarAgenda();}
 
                case 3->{modificarContacto();}
                
                case 4->{}
                
                case 5->{System.out.println("Saliendo...");} 
                
                default-> {System.out.println("\nNúmero no reconocido.");}
                                                
            }

        
            
            
        }while (opcion!=5);
    }//FIN MAIN
    
    
    private static void generarContactos(){
        myAgenda.addContacto("Pepe", "pepito@gmail.es", "666000888");
        myAgenda.addContacto("Pepi", "pepi@gmail.es", "661110888");
        myAgenda.addContacto("María", "mariAAAD@gmail.es", "662220888");
        myAgenda.addContacto("Josefa", "pepaa@gmail.es", "668880888");
        myAgenda.addContacto("Luiz", "lusitio@gmail.es", "665550888");
        myAgenda.addContacto("David", "davidsisldf@gmail.es", "6660004448");
    }
    
    private static void añadirContacto(){
        String nombre;
        String email;
        String tlf;
        
        
        System.out.println("*** AÑADIR CONTACTO ***");
        System.out.print("Nombre: ");
        nombre=teclado.nextLine();
        System.out.print("Email: ");
        email=teclado.nextLine();
        System.out.print("Teléfono: ");
        tlf=teclado.nextLine();
        myAgenda.addContacto(nombre, email, tlf);
        
        
    }
    
    
    private static String modificarContacto(){
        int id;
        myAgenda.listarAgenda();
        System.out.println("*** MODIFICAR CONTACTO ***");
        
        do{
            
        System.out.println("Selecciona Contacto a modificar (ID)");
        
        try{
                id = Integer.parseInt(teclado.nextLine());
                
            }catch (NumberFormatException e){
                id = 0;
                System.out.println(e);
                System.out.println("\nERROR Inserte un número que esté en la lista.");
                System.out.println("");
            }//fin catch
        
        }while(id<1||id>myAgenda.getSize());
        System.out.println("OK");
        
        return null;
        
        
    }
    
    
    
}//FIN 
