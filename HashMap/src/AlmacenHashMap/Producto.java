/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenHashMap;

/**
 *
 * @author toti
 */
public class Producto {
    private String descripcion;
    private double precio;
    private int unidades;

    public Producto(String descripcion, double precio, int unidades) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public void añadir(int unidades){
        this.unidades += unidades; //sumamos las unidades a las q ya tenemos 
    }
}
