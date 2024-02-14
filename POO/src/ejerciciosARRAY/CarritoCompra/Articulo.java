/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosARRAY.CarritoCompra;

/**
 *
 * @author toti
 */
public class Articulo {
    private int ref;
    private String nombre;
    private double precio;
    private int stock;
    private static int contador=0;

    
    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        contador++;
        ref=contador;
        
    }

    
    //GETTER & SETTER
    
    public int getRef() {
        return ref;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void AñadirStock(int stock) {
        this.stock = this.stock + stock;
    }
    
    
    
    
}
