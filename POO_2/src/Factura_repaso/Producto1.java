/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura_repaso;

/**
 *
 * @author User
 */
public class Producto1 {
    
    private String ref,descripcion;
    private double precioUnitario;

    public Producto1(String ref, String descripcion, double precioUnitario) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto1{" + "ref=" + ref + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
    public void imprimir(){
        System.out.printf("%2s  %-10s  %10.2f \n",ref,descripcion,precioUnitario);
    }
    
    public String getRef(){
        
        return ref;
    }
    
    
    
}
