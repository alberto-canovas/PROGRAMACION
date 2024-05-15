/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_alquiler_coches;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class BD_Empresa {
    private static ArrayList<Vehiculo_alq> listaVehiculos = new ArrayList<>();
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    
    public static void añadirVehiculo (Vehiculo_alq v){
        listaVehiculos.add(v);
    }
    
    public static void añadirAlquileres(Alquiler a){
        listaAlquileres.add(a);
    }
    
    public static void listarFlota(){
        
        
        System.out.println("         TURISMO");
        System.out.println("=".repeat(30));
        for (Vehiculo_alq v: listaVehiculos) {
            if (v instanceof Turismo)
            System.out.println(v.toString());
        }
        System.out.println("");
        System.out.println("        FURGONETA");
        System.out.println("=".repeat(30));
        for (Vehiculo_alq v: listaVehiculos) {
            if (v instanceof Furgoneta)
            System.out.println(v.toString());
        }
        
    }
    
    public static Vehiculo_alq obtenerVehiculo(String matricula){
        for(Vehiculo_alq v: listaVehiculos)
            if(v.getMatricula().equals(matricula)){
                return v;
        }
        
        return null;
    }
    
    public static Alquiler obtenerUltimoAlquiler(String matricula){
        Alquiler auxiliar=null;
        //METODO MÁS EFICIENTE
        for (int i = listaAlquileres.size()-1; i >= 0; i--) {
            if(listaAlquileres.get(i).getVehiculo().getMatricula().equals(matricula))
                return listaAlquileres.get(i);
        } return null;
       
//        for(Alquiler alquiler: listaAlquileres){
//            if(alquiler.getVehiculo().getMatricula().equals(matricula))
//                auxiliar=alquiler; 
//        }
//        return auxiliar;
    } 
    
    public static void imprimirHistoricoAlquileres(){
        System.out.println("===============HISTORICO DE ALQUILERES==================");
        
        for(Alquiler alquiler:listaAlquileres)
            System.out.println("%s %s %");
        
        System.out.println("========================================================");

    }
    
    
    
    
}//fin class


