/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01_bicicleta;

/**
 *
 * @author toti
 */
public class Bicicleta {
    
    //Atributos
    private int revoluciones,piñonActual;
    private double velocidad;
    private String propietario;
    
    //Constructor
    public Bicicleta(String propietario) {
        this.propietario = propietario;
        revoluciones = 0;
        piñonActual = 3;
                
    }
    
    //MÉTODOS
    
    public void pedalear(){
        if (revoluciones == 0 ){
            revoluciones = 1;
        }
        else
        revoluciones *= 2;
        
    }
    
    public void frenar(){
        if (revoluciones <=1){
            revoluciones = 0;
        }
        else
        
        revoluciones /= 2;
        
    }
    
    public void subirPiñon(){
        if (piñonActual==5){
        System.err.println("No se puede subir más piñones");
    } 
        else piñonActual ++;
    }
    
    public void bajarPiñon(){
        if (piñonActual==1){
        System.err.println("No se puede bajar más piñones");
    } 
        else piñonActual --;
    }
    
    public void mostrarVelocidad(){
        System.out.println("Esta bici pertenece a: "+propietario);
        System.out.printf("Rev = %d - Piñon = %d\n",revoluciones,piñonActual);
        System.out.println("La velocidad actual es "+calcularVelocidad());
        System.out.println("");

        
    }
    
    public double calcularVelocidad(){
        
        switch (piñonActual) {
            case 1:
                velocidad=revoluciones*2;
                break;
            case 2:
                velocidad=revoluciones*1.5;
                break;
            case 3:
                velocidad=revoluciones*1;
                break;
            case 4:
                velocidad=revoluciones*0.5;
                break;
            case 5:
                velocidad=revoluciones*0.3;
                break;
            default:
                break;
        }
        return velocidad;
        
    }
    
}
