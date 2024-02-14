/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_casa;

import java.util.Scanner;

/**
 *
 * @author toti
 */
public class AppCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        casa[] listaCasas = new casa[50];
        Scanner teclado = new Scanner (System.in);
        int opcion=0;
        String propietario;
        int supPlanta1,supPlanta2;
        double precio;
        String respuesta;
        
        listaCasas[casa.getContador()]= new casa("Juan",30,45,120_000);
        listaCasas[casa.getContador()]= new casa("Pedro",120,100_000);
        listaCasas[casa.getContador()]= new casa("Alicia",70,70,120_000);

        
        do{
            System.out.println("=".repeat(15));
            System.out.println("MENU CASAS");   
            System.out.println("=".repeat(15));
            System.out.println("1. Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propietario");
            System.out.println("4. Salir");
            
            System.out.print("Elige opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1: 
                    System.out.println("---Añadir nueva casa---");
                    System.out.print("Propietario: ");
                    propietario = teclado.nextLine();
                    System.out.print("Superficie Planta 1: ");
                    supPlanta1 = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("¿Tiene segunda planta?");
                    respuesta=teclado.nextLine();
                    if("si".equals(respuesta)||"SI".equals(respuesta)||"Si".equals(respuesta)){
                        System.out.print("Superficie Planta 2: ");
                        supPlanta2 = Integer.parseInt(teclado.nextLine());
                    } else supPlanta2=0;
//                    System.out.print("SupPlanta2: ");
//                    if(!teclado.nextLine().isEmpty())
//                        supPlanta2 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Precio: ");
                    precio = Double.parseDouble(teclado.nextLine());
                    listaCasas[casa.getContador()]= new casa(propietario,supPlanta1,supPlanta2,precio);

                    break;
                case 2: 
                    mostrarCasas(listaCasas);
                    break;
                case 3:
                    mostrarCasas(listaCasas); 
                    System.out.println("--- Cambiar propietario ---");
                    int posicion;
                    do{
                        System.out.println("Propietario anterior: ");
                        propietario = teclado.nextLine();
                        posicion = buscarCasa(listaCasas,propietario);
                        if (posicion==-1)
                            System.out.println(" ERROR   No se ha encontrado al propietario");
                    } while(posicion==-1);
                    
                    System.out.println("Propietario nuevo: ");
                    propietario =teclado.nextLine();
                    listaCasas[posicion].setPropietario(propietario);
                    break;
                        
                case 4: break;
            }
            
            
        }while(opcion!=4);
        
        System.out.println("Bye,bye...");
    }
    
    
    public static void mostrarCasas(casa[]listaCasas){
        System.out.println("====Listado de casas====");
        for (int i=0;i<casa.getContador();i++){
            System.out.print("CASA --> %d".formatted(i+1));
            listaCasas[i].imprimirDatos();
                    }
        
    }
    
    
    public static int buscarCasa(casa [] listaCasas, String propietario){
         for(int i=0;i<casa.getContador();i++){
            if (listaCasas[i].getPropietario().equals(propietario))
                return i;
         }
    return -1;
    }


}
