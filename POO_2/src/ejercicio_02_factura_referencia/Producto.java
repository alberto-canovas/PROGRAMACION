/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02_factura_referencia;

/**
 *
 * @author toti
 */
    public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;
    //private static int contador =0;
    
    
    public Producto(String ref, String descripcion, double precioUnitario) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getRef() {
        return ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "ref=" + ref + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }


    public void mostrarProducto(){
        System.out.println(" %s  %s %f ".formatted(ref,descripcion,precioUnitario));    
    }


}
