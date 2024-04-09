/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_herencia;

import java.util.ArrayList;

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
        ArrayList<Empleado> listado = new ArrayList<>();
        listado.add(new Empleado("AA1", "Paco"));
        listado.add(new Contable("BB2", "Maria"));
        listado.add(new Director("CC3", "Ana",01));
        
        for(Empleado emp: listado){
            if (emp instanceof Contable)
                System.out.println("Contable:");
            else if (emp instanceof Director)
                System.out.println("Director: ");
            else if (emp instanceof Empleado)
                System.out.println("Empleado");
            
            System.out.println(emp.toString());
            System.out.printf("%s -> %2.f%n",emp.getNombre(),emp.calcularSueldo());
            
            System.out.printf("%s -> %2.f%n", emp.getNombre(), emp.calcularSueldo());
        }
    }
    
}
