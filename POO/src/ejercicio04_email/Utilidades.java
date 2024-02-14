/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04_email;

/**
 *
 * @author toti
 */
public class Utilidades {
    
    public static boolean esEmail(String email){
        String regex = "[a-z]+@[a-z]+\\.[a-z]{2,3}$";
       return email.matches(regex);
    }
    
}
