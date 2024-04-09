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
public class Usu_Admin extends Usu_Normal{
    
    public Usu_Admin(String nombre, String password, String email){
        super(nombre,password,email);
        
    }
    
    @Override
    public void listarUsuarios(ArrayList<Usu_Normal> listado){
      String tipo;
        System.out.println("             LISTA DE USUARIOS");
        System.out.println("=".repeat(40));
        
        for(Usu_Normal usuario: listado){
            tipo = (usuario instanceof Usu_Admin)? "A" : " ";
            System.out.printf("%s %-10s %-5s  %-15s%n",tipo,usuario.getNombre(),usuario.getPassword(),usuario.getEmail());
            
        }
    }
    
    
    public void cambiarPasswordAdmin(){
        
        Scanner teclado = new Scanner (System.in);
        
        
        
        System.out.println("Introduzca usuario: ");
        String usuarioCambio = teclado.nextLine();
        Usu_Normal user = BD_usuarios.obtenerUsuario(usuarioCambio);
        if(usuarioCambio!=null){
            System.out.println("Introduzca contraseña actual: ");
            String actualPassword = teclado.nextLine();
            if(user.getPassword().equals(actualPassword)){
                System.out.println("Introduzca una nueva contraseña: ");
                user.setPassword(teclado.nextLine());
                
            } else {
                System.out.println("Contraseña incorrecta.");
              }
            
        }
        
    }
            
}
