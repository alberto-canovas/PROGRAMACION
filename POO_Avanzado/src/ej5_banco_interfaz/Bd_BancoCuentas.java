/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_banco_interfaz;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Bd_BancoCuentas implements BD_Banco {
    
    private ArrayList<CuentaBancaria>bd;

    
    public Bd_BancoCuentas(){
        bd = new ArrayList<>();
    }
    
    

    @Override
    public void insertar(CuentaBancaria c) {
        bd.add(c);
        
    }

    @Override
    public CuentaBancaria buscar(int numero) {
        for (CuentaBancaria c: bd){
            if(c.getNumero()==numero){
                return c;
            }
        }return null;
    }

    @Override
    public void listar() {
        System.out.println("Listado cuentas bancarias");
        System.out.println("=".repeat(30));
        System.out.println("Nº    Titular     Saldo");
        for(CuentaBancaria c:bd){
            c.imprimirDatos();
        }

    }
}
