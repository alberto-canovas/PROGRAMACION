/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6_alquiler_coches;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author toti
 */
public class Alquiler {
    private Vehiculo_alq vehiculo;
    private int kmInicio,kmFin;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double importe;
    
    public Alquiler(Vehiculo_alq vehiculo){
        this.vehiculo = vehiculo;
        this.kmInicio = vehiculo.km;
        this.kmFin = vehiculo.km;
        this.fechaInicio = null;
        this.fechaFin = null;
        this.importe =0;
    }

    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    public void setKmFin(int kmFin) {
        this.kmFin = kmFin;
    }

    public int getKmInicio() {
        return kmInicio;
    }

    public int getKmFin() {
        return kmFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Vehiculo_alq getVehiculo() {
        return vehiculo;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public double calcularImporte(){
        double aux =0;
        if(vehiculo instanceof Furgoneta)
           aux = (kmFin-kmInicio) * ((Furgoneta)vehiculo).getPrecioKilometro();
            
            // PARA ACCEDER A LA CLASE HIJA DE
            // VEHICULO SE UTILIZA ESTE COMANDO
            //((Furgoneta)vehiculo).getPrecioKilometro()
        if(vehiculo instanceof Turismo)
            aux = calcularDias() * ((Turismo)vehiculo).getPrecioDia();
        return aux;
    } 
    
    public void imprimir(){
        System.out.println("*".repeat(40));
        System.out.printf("%s %20s",vehiculo.getMatricula(),vehiculo.getMarcaModelo());
        System.out.println("");
        if(fechaFin == null){
            System.out.println("Km iniciales: "+kmInicio);
            System.out.println("Fecha salida: "+fechaInicio);
            System.out.println("Alquiler abierto");
            
        }else{
            System.out.println("Km realizados: " + (kmFin-kmInicio));
            if (vehiculo instanceof Turismo){
                System.out.println("Fecha devolución: " + fechaFin);
                System.out.printf("Precio: %.2f/dia",((Turismo)vehiculo).getPrecioDia());
                System.out.printf("Importe total: %.2f \n",calcularImporte());
                
            }
            if(vehiculo instanceof Furgoneta){
                System.out.printf("Precio: %.2f/km",((Furgoneta)vehiculo).getPrecioKilometro());
                System.out.printf("Importe total: %.2f",calcularImporte());
            }
        }
        System.out.println("*".repeat(40));
    }
    
    
    private int calcularDias(){
        int dias = (int)ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        if (dias ==0) 
            dias =1;
        return dias;
    }
    
    
}
