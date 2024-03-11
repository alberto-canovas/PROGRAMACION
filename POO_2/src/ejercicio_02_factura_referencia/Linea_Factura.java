/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02_factura_referencia;

/**
 *
 * @author toti
 */
public class Linea_Factura {
    
    private Producto producto;
    private int cantidad;
    private double importeLinea;

    public Linea_Factura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.importeLinea = producto.getPrecioUnitario()*cantidad;
    }

    
    
    
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    
    
    public void imprimirLinea(){
        System.out.println("%s   %d  %f".formatted(producto,cantidad,importeLinea));
    }
   
}
