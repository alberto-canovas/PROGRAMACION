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
public class Medico extends Persona{
    int numeroColegiado;
    Especialidad especialidad;
    private static int contadorMedico = 9001;

    public Medico(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.especialidad = especialidad.GENERAL;
        this.numeroColegiado = contadorMedico;
        contadorMedico++;
        
    }

    public int generaCodigo(){
        return 0;
    }

    @Override
    public String generaEmail() {
        int codigo = getNumeroColegiado();
        String email = codigo+"@sms.es";
        return email; 
    }

    @Override
    public String toString() {
        
        return "{Col. Nº (" +getNumeroColegiado() + ") "+ getEspecialidad() +" Doctor"+ super.getApellido()+" ["+super.getDni()+"]";
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
    
    
    
    
}
