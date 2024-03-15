/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura_repaso;

/**
 *
 * @author User
 */
public class LineaFactura1 {
    private Producto1 producto;
    private int cantidad;
    private double ImporteLinea;

    public LineaFactura1(Producto1 producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.ImporteLinea = cantidad * producto.getPrecioUnitario();
    }

    public Producto1 getProducto() {
        return producto;
    }

    public void setProducto(Producto1 producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return ImporteLinea;
    }

    public void setImporteLinea(double ImporteLinea) {
        this.ImporteLinea = ImporteLinea;
    }
    
    

            
    
}
