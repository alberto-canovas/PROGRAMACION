/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_login;
    import java.util.Scanner;
/**
 *
 * @author toti
 */
public class App_login {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner (System.in);

public static void main(String[] args) {
        // TODO code application logic here
        
        BD_usuarios.añadirUsuario(new Usu_Normal("zipi", "zipi", "zipi@gmail.comn"));
        BD_usuarios.añadirUsuario(new Usu_Normal("zape", "zape", "zape@gmail.comn"));
        BD_usuarios.añadirUsuario(new Usu_Admin("root", "0000", "admin@gmail.comn"));
        
        /*
        Usu_Normal zipi = BD_usuarios.obtenerUsuario("zipi");
        zipi.listarUsuarios(BD_usuarios.obtenerBD());
        System.out.println("");
        Usu_Admin root = (Usu_Admin) BD_usuarios.obtenerUsuario("root");
        root.listarUsuarios(BD_usuarios.obtenerBD());
        */
        int numIntentos = 2;
    do{
           
        System.out.println("   Login");
        System.out.printf("***************%d/2\n",numIntentos);
        System.out.print("usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("contraseña:");
        String password = teclado.nextLine();
        
        Usu_Normal user = BD_usuarios.obtenerUsuario(usuario);
        
        if (user!=null && BD_usuarios.verificarLogin(usuario, password)){
            System.out.println("OK");
            menu(user);
            numIntentos = 2;
        }
        else {
            System.out.println("nombre o contraseña incorrecto");
            numIntentos--;
        }
        System.out.println("");
    }while(numIntentos>0);{
        System.out.println("Saliendo...");
        
    }
}

    private static void menu(Usu_Normal user) {
        int opcion;
        String cabecera = (user instanceof Usu_Admin)? "Administrador" : "Usuario";
        System.out.println("*".repeat(20));
        System.out.println(cabecera+"<<" +user.getNombre()+ ">>");
        System.out.println("*".repeat(20));
        
        do{
        System.out.println("1.Salir del sistema");
        System.out.println("2.Listar Usuarios");
        System.out.println("3.Cambiar Password");
        if (user instanceof Usu_Admin)
            System.out.println("4.Cambiar Password Usu");
        
        System.out.print("Elige una opción >");
        opcion=Integer.parseInt(teclado.nextLine());
                
        switch(opcion){ //CON ESTE FORMATO DE SWITCH HAY Q PONER EL BREAK con el [case 1->] NO HACE FALTA
            case 1:
                break;
            case 2:
                user.listarUsuarios(BD_usuarios.obtenerBD());
                break;
            case 3:
                user.cambiarPassword();
                break;
            case 4:
                if(user instanceof Usu_Admin){
                    user.listarUsuarios(BD_usuarios.obtenerBD());
                    ((Usu_Admin) user).cambiarPasswordAdmin();
                    
                }else
                    System.out.println("Sólo se admiten los valores del 1-3");
                    break;
                
                
            default:
                System.out.println("Sólo se admiten los valores del 1-4");
        }
            System.out.println("");
        }while(opcion!=1);

    }
    
}
