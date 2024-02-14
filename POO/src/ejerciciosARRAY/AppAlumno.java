/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosARRAY;

/**
 *
 * @author toti
 */
public class AppAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alu1 = new Alumno("Mortadelo",15);
        Alumno alu2 = new Alumno("Filemon",25);
        Alumno alu3 = new Alumno("Carpanta",50);
        
        Grupo Daw1 = new Grupo ("DAW 1");
        Daw1.añadirAlumno(alu1);
        Daw1.añadirAlumno(alu2);
        Daw1.añadirAlumno(alu3);
        Daw1.añadirAlumno(new Alumno("Pepe",14));
        
        Daw1.listarGrupo();
        System.out.println("");
        
        System.out.println(Daw1.buscarAlumno(2).toString());
        
        if(Daw1.buscarAlumno(7)==null){
            System.out.println("HA OCURRIDO UN ERROR");
        }else{
            
            Daw1.buscarAlumno(7).imprimirDetalles();
        }
        

    }
    
}
