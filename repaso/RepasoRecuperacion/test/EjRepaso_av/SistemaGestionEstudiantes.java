/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjRepaso_av;

import java.util.HashMap;

/**
 *
 * @author toti
 */
public class SistemaGestionEstudiantes {

    public static HashMap<String,Estudiante> bd_estudiantes = new HashMap();
    
    public static void main(String[] args) {
        
        
        Estudiante pepe = new Estudiante("pepe");
        Estudiante luis = new Estudiante("luis");
        Estudiante nacho = new Estudiante("nacho");
        
        bd_estudiantes.put(nacho.getIdentificacion(), nacho);
        bd_estudiantes.put(luis.getIdentificacion(), luis);
        bd_estudiantes.put(pepe.getIdentificacion(), pepe);
        
        pepe.agregarCurso("musica", 2.5);
        luis.agregarCurso("lengua", 7.5);
        nacho.agregarCurso("matematicas", 9.8);
        luis.agregarCurso("matematicas", 5.0);
        luis.agregarCurso("ciencias", 8.0);
        
        
        listar_estudiantes_y_cursos();
        System.out.println("");
        buscar_estudiante_por_id("pep100");
        calcular_media_estudiante("lui10");
        
//        for(String id : bd_estudiantes.keySet()){
//            System.out.println(id);
//            
//        }


    }//fin main
    
    
    
    public static void agregar_estudiante(Estudiante estudiante){
        
        bd_estudiantes.put(estudiante.getIdentificacion(), estudiante);
        
    }
    
    
    public static Estudiante buscar_estudiante_por_id(String id){
        
        if (bd_estudiantes.containsKey(id)){
            System.out.println(bd_estudiantes.get(id));
            return bd_estudiantes.get(id);
        }
        else{
            System.out.println("La identificación introducida no existe en la base de datos");
            return null;
        }
    }
    
    public static void listar_estudiantes_y_cursos(){
        for(Estudiante estudiante:bd_estudiantes.values()){
            System.out.println(estudiante);
        }
    }//fin listar
    
    public static double calcular_media_estudiante(String id){
        Estudiante estudiante = buscar_estudiante_por_id(id);
        if (estudiante==null){
            System.out.println("El id introducido no existe");
            return 0.0;
        }
        else{
            double suma=0;
            int cuenta =0;
            for(double nota: estudiante.getCursosYnotas().values()){
                suma+=nota;
                cuenta++;
            }

            double media = suma/cuenta;
            System.out.printf("%.2f",media);
            return media;
            
        }
        
    }//fin media
    
    
    
    
    
    
    
    
}//FIN
