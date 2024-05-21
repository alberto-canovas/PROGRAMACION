/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canovas_lopez_alberto_ticket_autobus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Locale;

/**
 *
 * @author toti
 */
public  abstract class Ticket implements Medible{
    private String numero;
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaIn;
    private LocalTime horaOut;
    private Parada paradaIn;
    private Parada paradaOut;
    private HashMap<Parada,Double> lineaBus ;
    private static int contador=1000;

    
    private void cargarDistancias() { lineaBus.put(Parada.HOSPITAL,-5.04); 
    lineaBus.put(Parada.CEMENTERIO,-3.52); lineaBus.put(Parada.VIÑA,-1.31); 
    lineaBus.put(Parada.SANJOSE,-0.71); 
    lineaBus.put(Parada.OVALO,0.0); 
    lineaBus.put(Parada.COLUMNAS,0.35); 
    lineaBus.put(Parada.ARCAS,0.73); 
    lineaBus.put(Parada.BASILIO,1.26); 
    lineaBus.put(Parada.ESTACION,1.7); 
    lineaBus.put(Parada.APOLONIA,2.34); }

    
    public Ticket(String nombre, LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaIn = horaIn;
        this.horaOut = null;
        this.paradaIn = paradaIn;
        this.paradaOut = null;
        this.numero = generaNumero();
        lineaBus = new HashMap<>();
        cargarDistancias();
        contador++;
    }
    

 
    
   public void finalizarViaje(Parada paradaOut, LocalTime horaOut){
       this.horaOut = horaOut;
       this.paradaOut = paradaOut;
       System.out.println("Viaje finalizado");
   }
    
 
   
   private String generaNumero(){
       
       return String.format("%d%02d%02d%d", fecha.getYear(),fecha.getMonthValue(),fecha.getDayOfMonth(),contador);
   }
   
   
   
   
   
   
   
   
   
   public abstract void imprimirTic();

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraIn() {
        return horaIn;
    }

    public LocalTime getHoraOut() {
        return horaOut;
    }

    public Parada getParadaIn() {
        return paradaIn;
    }

    public Parada getParadaOut() {
        return paradaOut;
    }
   
   public void imprimirTicket(){
       
       System.out.println("*".repeat(30));
       System.out.println("* Ticket: "+nombre);
       System.out.println("* Nº: "+generaNumero());
       if(this instanceof Ticket_Estudiante)
           System.out.println("* Centro: "+ ((Ticket_Estudiante)this).getCentroEducativo());
       
       System.out.println("*"+ "-".repeat(28)+"*");
       System.out.println("* Fecha: "+fecha);
       
   }

    @Override
    public int calcularTiempo() {
        if (horaOut==null)
            return 0;
        return (int)ChronoUnit.SECONDS.between(horaIn, horaOut);
    }

    @Override
    public double calcularDistancia() {
        if(paradaOut == null){
            return 0.0;
        }
        return lineaBus.get(paradaOut) - lineaBus.get(paradaIn);
    }
   
   
   
    
}//fin


