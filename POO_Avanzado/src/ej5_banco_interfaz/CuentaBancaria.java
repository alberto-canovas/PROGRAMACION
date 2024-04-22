/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5_banco_interfaz;

/**
 *
 * @author toti
 */
public abstract class CuentaBancaria  {
    private int numero;
    private Persona titular;
    private double saldo;
    private static int ultimaCuenta = 1001; 

    public CuentaBancaria(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = ultimaCuenta;
        ultimaCuenta++;
    }
    
    
    
    public void ingreso(double dinero){
        saldo = saldo + dinero;
    }
    
    public abstract void reintegro (double dinero);
    
    public void reintegroAux(double dinero){
        this.saldo = saldo - dinero;
    }
    
    public void imprimirDatos(){
        System.out.printf("%5d %-10s %9.2f \n",numero, titular.getNombre(),saldo);
}

    public int getNumero() {
        return numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
    
    
}// fin clase
