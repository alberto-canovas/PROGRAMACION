/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjRepaso_av;

import java.util.HashMap;

/**
 *
 * @author toti
 */
public class Estudiante extends Persona{
    private HashMap<String,Double> cursosYnotas;
    
    //String nombres de los cursos
    //Double notas del estudiante de cada curso

    public Estudiante(String nombre) {
        super(nombre);
        cursosYnotas = new HashMap<>();
    }

    public HashMap<String, Double> getCursosYnotas() {
        return cursosYnotas;
    }
    
    

    public void setCursosYnotas(HashMap<String, Double> cursosYnotas) {
        this.cursosYnotas = cursosYnotas;
    }
    
    public void agregarCurso(String curso,Double nota){
        cursosYnotas.put(curso, nota);
    }
    
    public double obtenerNota(String curso){
        return cursosYnotas.get(curso);
    }

    @Override
    public String toString() {
        return Estudiante.super.getNombre()+"{" + "cursos=" + cursosYnotas.keySet() + "Notas"+cursosYnotas.values()+'}';
    }
    
    
    
    
    
}
