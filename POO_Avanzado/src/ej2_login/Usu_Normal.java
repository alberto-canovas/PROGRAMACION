/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_login;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toti
 */

public class Usu_Normal {
    private String nombre, password, email;
    
    
    
    public Usu_Normal(String nombre, String password, String email){
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
    
    public void cambiarPassword(){
        Scanner teclado = new Scanner (System.in);
        String actualPassword;
        
        System.out.println("Introduzca contraseña actual: ");
        actualPassword = teclado.nextLine();
        
        if(password.equals(actualPassword)){
            System.out.println("Introduzca una nueva contraseña: ");
            password = teclado.nextLine();
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


    
    public void listarUsuarios(ArrayList<Usu_Normal> listado){
        String tipo;
        System.out.println("             LISTA DE USUARIOS");
        System.out.println("=".repeat(40));
        
        for(Usu_Normal usuario: listado){
            tipo = (usuario instanceof Usu_Admin)? "A" : " ";
            System.out.printf("%s %-10s ********  %-15s%n",tipo,usuario.nombre,usuario.email);
            
        }
        
    }

    @Override
    public String toString() {
        return "Usu_Normal{" + "nombre=" + nombre + ", password=" + password + ", email=" + email + '}';
    }
    
    
    
}
