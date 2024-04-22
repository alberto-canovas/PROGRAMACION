/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej5_banco_interfaz;

/**
 *
 * @author toti
 */
public interface BD_Banco {
    
    void insertar(CuentaBancaria c);
    CuentaBancaria buscar (int numero);
    void listar();
}
