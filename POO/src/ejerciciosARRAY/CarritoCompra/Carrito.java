/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosARRAY.CarritoCompra;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Carrito {
    
    private Cliente cliente;
    private ArrayList<Articulo> listaArticulos;
    private double total;

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        listaArticulos = new ArrayList<>();
    }
    

    public Carrito(Cliente cliente,Articulo articulo) {
        this.cliente = cliente;
        listaArticulos = new ArrayList<>();
    }
    
    
    
}
