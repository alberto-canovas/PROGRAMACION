/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_casa;

/**
 *
 * @author toti
 */
public class casa {
    private String propietario;
    private int supPlanta1,supPlanta2;
    private double precioVenta;
    private static int contador;

    
    
    public casa(String propietario,int supPlanta1, int supPlanta2, double precioVenta){
        this.propietario=propietario;
        this.precioVenta=precioVenta;
        this.supPlanta1=supPlanta1;
        this.supPlanta2=supPlanta2;
        contador++;
        
    }
     public casa(String propietario,int supPlanta2, double precioVenta){
        this.propietario=propietario;
        this.precioVenta=precioVenta;
        this.supPlanta2=supPlanta2;
        contador++;
        
    }

    public static int getContador() {
        return contador;
    }
     
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSupPlanta1() {
        return supPlanta1;
    }

    public void setSupPlanta1(int supPlanta1) {
        this.supPlanta1 = supPlanta1;
    }

    public int getSupPlanta2() {
        return supPlanta2;
    }

    public void setSupPlanta2(int supPlanta2) {
        this.supPlanta2 = supPlanta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    private int calcularSupTotal(){
        return supPlanta1 + supPlanta2;
    }
    
    public void imprimirDatos(){
        System.out.println(" %10s %5d m2 %8.2f €".formatted(propietario,calcularSupTotal(),precioVenta));
    }
    
}
