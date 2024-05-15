/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosColecciones;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author toti
 */
public class Ejercicio3_Agenda {
        static HashMap<String,String> agenda = new HashMap();
        static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        agenda.put("Emergencias", "112");
        agenda.put("Violencia Genero", "016");
        agenda.put("AA Carmen", "660112233");
        
        int opcion=0;
        String entrada;
        do{
            System.out.println("**EJERCICIO 3 - AGENDA**");
            System.out.println("*".repeat(30));
            //listarContactos();
            System.out.println("*".repeat(30));
            System.out.println("1. Añadir Contacto");
            System.out.println("2. Elimnar contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Ver Contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion> ");
            entrada=teclado.nextLine();
            if(entrada.matches("[1-5]")){
                opcion = Integer.parseInt(entrada);
            }else{
                System.out.println("Seleccione una opción entre el 1 y el 5.");
            }
            
            switch(opcion){
                case 1->{añadirContacto();}
                case 2->{eliminarContacto();}
                case 3->{modificarContacto();}
                //case 4->{listarContactos();}
                case 5->{break;}                
            }
            
        }while(opcion!=5);
    }
    
    
//    public static void listarContactos(){
//        for(Entry<String,Integer> elemento:agenda.entrySet()){
//            String clave = elemento.getKey();
//            Integer num = elemento.getValue();
//            System.out.printf("%s --> %d%n",clave,num);
//        }
//    }
    
    public static void añadirContacto(){
        String nombre;
        String num;
        System.out.print("Dime el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Dime el número: ");
        num = teclado.nextLine();
        
        agenda.put(nombre,num);
        
    }
    
    public static void eliminarContacto(){
        String opcion;
        System.out.print("Seleccione el contacto a eliminar(nombre): ");
        opcion = teclado.nextLine();
        
        if(agenda.containsKey(opcion)){
            agenda.remove(opcion);
        }
        else{
            System.out.println("El contacto introducido no existe.");
        }
    }
    
    public static void modificarContacto(){
        String opcion;
        System.out.print("Selecciona contacto (nombre) ");
        opcion = teclado.nextLine();
        
        
    }
}
