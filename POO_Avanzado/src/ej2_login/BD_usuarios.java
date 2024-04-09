/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_login;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class BD_usuarios {
    protected static ArrayList<Usu_Normal> bd = new ArrayList<>();
    
    
    public static void añadirUsuario(Usu_Normal uNormal){
        bd.add(uNormal);
    }
    
    
    public static ArrayList<Usu_Normal> obtenerBD(){
        return bd;
    }
    
    
    public static Usu_Normal obtenerUsuario(String nombre){
        for (Usu_Normal usuario : bd)
            if (usuario.getNombre().equals(nombre))
                return usuario;
        return null;
    }
    
    
    public static boolean verificarLogin(String nombre, String password){
        for(Usu_Normal usuario : bd){
            if(usuario.getNombre().equals(nombre))
                if(usuario.getPassword().equals(password))
                    return true;
            
        }
        return false;
    }
    
    
    
}
