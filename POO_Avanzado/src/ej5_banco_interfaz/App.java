/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_banco_interfaz;

/**
 *
 * @author toti
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bd_BancoCuentas bd = new Bd_BancoCuentas();
        
        //crear personas
        Persona Pedro = new Persona("1111A", "Pedro", "Martinez", "pedro@mail.com");
        Persona Alicia = new Persona("1112B", "Alicia", "Canovas", "alicia@mail.com");
       
        //crear cuentas
        
        bd.insertar(new CuentaCorriente(Pedro, 1000));
        bd.insertar(new CuentaAhorro(Pedro, 5000));
        bd.insertar(new CuentaCorriente(Alicia, 3000));
        
        //mostrar cuentas
        bd.listar();
        System.out.println("");
        //operaciones entre cuentas
        
        //DOS FORMAS DE HACER LO MISMO
        ((CuentaCorriente)bd.buscar(1001)).transferencia(bd.buscar(1003), 500);
        
        //HACE LO MISMO QUE ARRIBA
//        CuentaBancaria p = bd.buscar(1001);
//        ((CuentaCorriente)p).transferencia(bd.buscar(1003),500);
        bd.listar();
        
        System.out.println("\n AHORA RESTAMOS 1000 A LA CUENTA 1001 \n");
        
        ((CuentaCorriente)bd.buscar(1001)).reintegro(1000);
        bd.listar();
        System.out.println("");
        
        ((CuentaCorriente)bd.buscar(1001)).reintegro(2000);
        bd.listar();
        System.out.println("");
        
        ((CuentaAhorro)bd.buscar(1002)).reintegro(5100);
        bd.listar();
        System.out.println("");
        
        bd.buscar(1003).ingreso(1000);
        //Aquí no hace falta hacer el casting porque el método ingresar esta en 
        //la clase padre, no en las clases hijas(cuentaCorriente y cuentaAhorro), 
        //como si lo estaba transferencia.
        
        bd.listar();
    }
    
}
