/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01_bicicleta;

/**
 *
 * @author toti
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta orbea = new Bicicleta("Alberto");
        Bicicleta bmx = new Bicicleta("Pepe");
        
        
        orbea.subirPiñon();
        orbea.subirPiñon();
        orbea.subirPiñon();        
        orbea.mostrarVelocidad();
       
        
        

        
         
       
    }
    
}
