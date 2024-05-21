/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canovas_lopez_alberto_ticket_autobus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author toti
 */
public class Ticket_Normal extends Ticket implements Facturable{

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    
    
    
    public Ticket_Normal(LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        super("Normal", fecha, horaIn, paradaIn);
    }
    
    
    @Override
    public double calcularImporte() {
        return 0.0;
    }

    @Override
    public void imprimirTic() {
         System.out.println("*".repeat(30));
       System.out.printf("* Ticket: %-18s *%n",super.getNombre());
       System.out.printf("* Nº: %-22s *%n",super.getNumero());
       System.out.println("*"+ "-".repeat(28)+"*");
       System.out.printf("* Fecha: %-19s *%n",getFecha().format(dtf));
       System.out.printf("* Hora: %-20s *%n",super.getHoraIn());
       System.out.printf("* Parada: %-18s *%n",super.getParadaIn());
       System.out.println("*"+ "-".repeat(28)+"*");
       if(getHoraOut()==null){
           System.out.println("* Pasajero viajando...       *");
       }
       else{
            System.out.printf("* Hora: %-20s *%n",super.getHoraOut());
            System.out.printf("* Parada: %-18s *%n",super.getParadaOut());
            System.out.println("*"+ "-".repeat(28)+"*");
            int tiempo = calcularTiempo();
            int horas = tiempo/3600;
            int minutos =(tiempo%3600)/60;
            int segundos =(tiempo%3600)%60;
            System.out.printf("* Tiempo: %2d:%02d:%02d        *%n",horas,minutos,segundos);
            System.out.printf("* Distancia: %-13.1f *%n",super.calcularDistancia());
            System.out.println("*"+ "-".repeat(28)+"*");
            System.out.printf("* Importe: %.2f€          *",calcularImporte());
           
       }
        System.out.println("*".repeat(30));
       
       


    }



    
    

}

   
   
    

