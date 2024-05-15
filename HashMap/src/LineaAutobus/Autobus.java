/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LineaAutobus;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

/**
 *
 * @author toti
 */
public class Autobus {

    static HashMap<Parada,Integer> linea = new HashMap<>();
    static Parada paradaSubir, paradaBajar;
    static LocalTime horaSubir, horaBajar;
            
    
    public static void main(String[] args) {
        //cargar Distancias
        cargarDistancia();
        
        //subir
        subir(Parada.Aguilas,LocalTime.parse("08:05:00"));
        System.out.println("");
        
        //bajar
        bajar(Parada.Lorca,LocalTime.parse("09:35:10"));
        System.out.println("");
        //ticket
        generarTicket();
    }

    private static void cargarDistancia() {
        linea.put(Parada.Aguilas, -35);
        linea.put(Parada.Lorca, 0);
        linea.put(Parada.Totana, 20);
        linea.put(Parada.Alhama, 35);
        linea.put(Parada.Murcia, 60);
        
    }//fin cargarDistancia()

    private static void subir(Parada parada, LocalTime hora) {
        paradaSubir = parada;
        horaSubir = hora;
        System.out.println("*".repeat(40));
        System.out.println("* Hora subida: "+ hora.toString());
        System.out.println("* Parada: "+ parada);
        System.out.println("*".repeat(40));

    }//fin subir

    private static void bajar(Parada parada, LocalTime hora) {
        paradaBajar = parada;
        horaBajar = hora;
        System.out.println("*".repeat(40));
        System.out.println("* Hora bajada: "+ hora.toString());
        System.out.println("* Parada: "+ parada);
        System.out.println("*".repeat(40));

    }//fin bajar

    private static void generarTicket() {
        //Tiempo
        
//        int horas = (int)ChronoUnit.HOURS.between(horaSubir, horaBajar); 
//        int minutos = (int)ChronoUnit.MINUTES.between(horaSubir, horaBajar)
//                - horas*60; 
//        int segundos = (int)ChronoUnit.SECONDS.between(horaSubir, horaBajar)
//                - horas*3600 - minutos*60; 
//        
        //  OTRA FORMA DE HACERLO PARTIENDO DESDE LOS SEGUNDOS
        
        int segundos = (int)ChronoUnit.SECONDS.between(horaSubir, horaBajar);
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        segundos = (segundos%3600)%60;
        
        
        //long segundos = ChronoUnit.SECONDS.between(horaSubir, horaBajar); 
        //Long es lo mismo que int, pero para guardar números grandes
        int distancia =linea.get(paradaBajar) - linea.get(paradaSubir);
        System.out.println("*".repeat(35));
        System.out.printf("* Tiempo :  %02d:%2d:%d %n",horas, minutos, segundos);
        System.out.printf("* Distancia: %d km %n",distancia);
        System.out.println("*".repeat(35));

    }
    
    
    
    
}//fin main
