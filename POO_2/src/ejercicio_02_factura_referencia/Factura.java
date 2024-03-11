/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02_factura_referencia;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Factura {
    private String cif,numero;
    private LocalDate fechaFactura;
    private ArrayList<Linea_Factura> lineas;
    private static int IVA =21;

    public Factura(String cif, String numero, LocalDate fechaFactura) {
        this.cif = cif;
        this.numero = numero;
        this.fechaFactura = fechaFactura;
        lineas = new ArrayList <>();
    }
    public void añadirLinea(Producto p,int cantidad){
        
        lineas.add(new Linea_Factura(p, cantidad));
    
    }
    
    
    public void imprimirFactura(){
        
    }
    
    private double getSubtotal(){
        return 0;
    }
    
}
