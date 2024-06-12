/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navarro.ponce.candido.exa3;

import java.time.LocalDate;

/**
 *
 * @author candido.navarro
 */
public class Paciente extends Persona{
    int nuss;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.nuss = generaNUSS(super.getDni());
    }
    
    public int generaNUSS(String DNI){
        String nuss1 = 30+getDNIsinLetra(DNI);
        return Integer.parseInt(nuss1);
    }
    
    public String getDNIsinLetra(String DNI){
        return DNI.substring(0, 4);
    }
    
    @Override
    public String generaEmail() {
        String nombre_formateado = Utilidades.limpiarAcentos(super.getNombre());
        String apellido_formateado = Utilidades.limpiarAcentos(super.getApellido());
        String email = nombre_formateado+"."+apellido_formateado+"@arcas.es";
        return email;
    }

    @Override
    public String toString() {
        return "{NUSS " +getNuss() + "} "+ super.getNombre()+" "+super.getApellido()+" ["+super.getDni()+"]";
    }
    
    public void MostrarFicha(){
        System.out.println("==============================================");
        System.out.println("| Nombre: "+super.getNombre()+"       NUSS: "+getNuss()+ " |");
        System.out.println("| Apellidos: "+super.getApellido()+"   DNI: "+super.getDni()+" |");
        System.out.println("| F. nac.: "+super.getFechaNacimiento()+ "                     |");
        System.out.println("| Correo-e: "+generaEmail()+"       |");
        System.out.println("==============================================");
    }

    public int getNuss() {
        return nuss;
    }
    
    
    
    
    
    
    
     
}
