/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canovas_lopez_alberto_ticket_autobus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author toti
 */
public class Bus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse("15/05/2024",dtf);
        LocalTime hora = LocalTime.parse("08:15:10");
        LocalTime horaOut = LocalTime.parse("09:15:09");
        
          Ticket_Estudiante estudiante = new Ticket_Estudiante("Arcas", fecha, hora, Parada.ARCAS);
          Ticket_Normal normal = new Ticket_Normal(fecha, hora, Parada.ARCAS);
          
          estudiante.imprimirTic();
          estudiante.finalizarViaje(Parada.OVALO, horaOut);
          System.out.println("");
          estudiante.imprimirTic();
          
    }
    
}
