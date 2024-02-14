/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosARRAY;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno> listaAlumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void añadirAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }
    
    public Alumno buscarAlumno(int id){
        id = id-1; //LA LISTA EMPIEZA EN 1 Y  NO EN 0, POR ESO ESTA LÍNEA
        if (id<0||id >=listaAlumnos.size()){
            System.out.println("ERROR --El tamaño de la lista es menor-- ");
            return null;
        }
        else{            
            return listaAlumnos.get(id);
        }
    }
    
    public void listarGrupo(){
        System.out.println("*".repeat(15));
        System.out.println("      "+nombre);
        System.out.println("*".repeat(15));
        System.out.println("ID  NOMBRE       EDAD");
        
        for(Alumno alumno : listaAlumnos){
            alumno.imprimirDetalles();
        }
    }
    
    

    
}
