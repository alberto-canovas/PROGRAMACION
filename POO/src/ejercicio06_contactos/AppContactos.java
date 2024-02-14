/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06_contactos;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class AppContactos {
        static Contacto[] agenda = new Contacto[100];
        static Scanner teclado = new Scanner (System.in);
        static int id;
        static String telefono;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        String nombre,email,telefono;
        
        agenda[Contacto.getContador()] = new Contacto("Pepe","pepe@gmail.com","96842542");
        
        //TODO Menu
        
        
        do{
            System.out.println("=".repeat(15));
            System.out.println("MENU CONTACTOS");   
            System.out.println("=".repeat(15));
            System.out.println("1. Nuevo Contacto");
            System.out.println("2. Listar Contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Salir");
            
            System.out.print("Elige opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                    nuevoContacto();
                    break;
                case 2:
                    listarContactos();
                    break;
                case 3:
                    listarContactos();
                    modificarContacto();
                    break;
                case 4:
                    break;
            }
            
            
        } while(opcion!=4);
    }  
        
        //TODO Modificar contacto
        
        
        //TODO listar contactos
        
    public static void listarContactos(){
            System.out.println("======================= LISTA DE CONTACTOS =============================");
            System.out.println("ID           NOMBRE            EMAIL                TELÉFONO");
            for (int i=0;i<Contacto.getContador();i++){
                //System.out.println(agenda[i].toString());
                agenda[i].imprimirContacto();
            }
            System.out.println("=========================================================================");
        }

    public static void nuevoContacto() {
        System.out.println("---Añadir nuevo contacto---");
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Correo electrónico: ");
        String email = teclado.nextLine();
        System.out.println("teléfono");
        String telefono=teclado.nextLine();
        agenda[Contacto.getContador()] = new Contacto (nombre,email,telefono);


        
    }

    public static void modificarContacto() {
        int indice;
        do{
        System.out.println("Seleccione el telefono del contacto a modificar: ");
        telefono=teclado.nextLine();
        indice=buscarContacto(telefono);
        if (indice==-1){
            System.out.println("ERROR: telefono no encontrado");
        }
        } while(indice==-1);
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Correo electrónico: ");
        String email = teclado.nextLine();
        System.out.println("Teléfono: ");
        String telefono=teclado.nextLine();
        if(nombre.isEmpty())
            nombre = agenda[indice].getNombre();
        if(email.isEmpty())
            email = agenda[indice].getEmail();
        if(telefono.equals(""))
            telefono = agenda[indice].getTelefono();
        agenda[indice].setNombre(nombre);
        agenda[indice].setEmail(email);
        agenda[indice].setTelefono(telefono);
    }

    public static int buscarContacto(String telefono) {
        int indice = -1;
        for(int i=0;i<Contacto.getContador();i++){
            if (agenda[i].getTelefono().equals(telefono))
                return i;
        }
        return -1;
    }
    
    
//    public static int buscarContacto(int id) {
//        int indice = -1;
//        for(int i=0;i<Contacto.getContador();i++){
//            if (agenda[i].getId().equals(id))
//                return i;
//        }
//        return -1;
//    }
}





    

