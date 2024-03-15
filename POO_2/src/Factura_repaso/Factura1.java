/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura_repaso;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Factura1 {
    private String cif, numero;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura1> lineas;
    private static int finalIva=21;

    public Factura1(String cif, String numero, LocalDate fechaFactura) {
        this.cif = cif;
        this.numero = numero;
        this.fechaFactura = fechaFactura;
        this.lineas = lineas;
    }
    
    
    public void añadirLinea(Producto1 p, int cantidad){
        lineas.add(new LineaFactura1(p, cantidad));
    }
    
    public void imprimirFactura(){
        
        System.out.println("Imprimiendo Factura...");
        System.out.println("*".repeat(50));
        System.out.println("CIF: " +cif);
        System.out.println("FECHA: "+fechaFactura+"             FACTURA NUM: "+numero);
        
        }
    
    
    }//fin
    
    

