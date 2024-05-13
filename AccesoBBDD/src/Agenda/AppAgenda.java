/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agenda;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class AppAgenda {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Contacto> listaContactos = new ArrayList<>();
    
    
    public static void main(String[] args) {
            
        
        BD_Agenda.conectarBD();
//        BD_Agenda.eliminar(14);
//        BD_Agenda.añadir("Alberto", "Cánovas", 99);
//        BD_Agenda.listarContactos();

//        listaContactos = BD_Agenda.getListaPersonas();
//        for(Contacto c: listaContactos){
//            System.out.println(c.toString());
//        }
//        
        int opcion=0;
        String entrada;
        
        
        do{
            System.out.println("********");
            System.out.println("AGENDA ARCAS");
            System.out.println("********");
            System.out.println("1. Listar Contactos");
            System.out.println("2. Añadir Contacto");
            System.out.println("3. Eliminar Contacto");
            System.out.println("4. Salir");
            
            System.out.print("Opción> ");
            entrada = teclado.nextLine();
            if(entrada.matches("[1-4]")){
                //switch
                opcion = Integer.parseInt(entrada);
                
                switch(opcion){
                    case 1->{BD_Agenda.listarContactos();}
                    case 2->{
                        String nombre,apellido;
                        int edad;
                        
                        System.out.println("  Añadir un contacto nuevo");
                        System.out.println("******************************");
                        System.out.print("Nombre: ");
                        nombre=teclado.nextLine();
                        System.out.print("Apellido: ");
                        apellido=teclado.nextLine();
                        System.out.print("Edad: ");
                        edad=Integer.parseInt(teclado.nextLine());
                        
                        BD_Agenda.añadir(nombre, apellido, edad);}
                    case 3->{
                        System.out.println("   Eliminar CONTACTO");
                        System.out.println("****************************");
                        BD_Agenda.listarContactos();
                        System.out.print("INDIQUE EL ID DEL CONTACTO A ELIMINAR");
                        int id=Integer.parseInt(teclado.nextLine());
                        BD_Agenda.eliminar(id);
                    
                    }
                    
                    case 4->{}
                }
                
                
            }else{
                System.out.println("Entrada no válida");
            }
            
            
        }while(opcion!=4);
        
        




        BD_Agenda.desconectarBD();
    }
    
}
