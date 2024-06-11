package repasoRecuperacion;

import java.util.ArrayList;
import java.util.HashMap;


public class Repaso {

    /**
     * @param args the command line arguments
     */
      static HashMap <Equipo, ArrayList <Jugador>> mapaEquipo = new HashMap();
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Jugador pepe = new Jugador(8, "Pepe");
        Jugador mario = new Jugador(10, "Mario");
        Jugador manolo = new Jugador(5, "Manolo");
        
        
        Equipo equipo1 = new Equipo("Madrid");
        Equipo equipo2 = new Equipo("Barça");
        
        ArrayList<Jugador> listaJugador = new ArrayList<>();
        listaJugador.add(pepe);
        listaJugador.add(mario);
        
        ArrayList<Jugador> listaJugador2 = new ArrayList<>();
        listaJugador2.add(manolo);
        
        mapaEquipo.put(equipo1, listaJugador);
        mapaEquipo.put(equipo2, listaJugador2);
        
        int puntuaciones = sumarPuntuaciones(equipo2);
        
        System.out.println(puntuaciones);
        
        System.out.println(sumarPuntuaciones(equipo1));
        
        System.out.println();
        
        
    }
    //SUMA TODAS LAS PUNTUACIONES DE LOS JUGADORES DEL EQUIPO DADO
    private static int sumarPuntuaciones(Equipo equipo){
        //
        ArrayList<Jugador> jugadores = mapaEquipo.get(equipo);
        int contador=0;
        for (Jugador jugador : jugadores){
            contador += jugador.getPuntuacion();
        }
        return contador;
        
    }
    
    // CAMBIA EL JUGADOR DADO DEL EQUIPO1 AL EQUIPO2
    private static void cambiarJugadorEquipo(String nombre, Equipo equipo1, Equipo equipo2){
        //creamos una lista donde se guarden los jugadores del equipo1
        ArrayList<Jugador> jugadores = mapaEquipo.get(equipo1);
        //creamos otra lista donde se guardan los jugadores del equipo2
        ArrayList<Jugador> jugadores2 = mapaEquipo.get(equipo2);
        
        //recorremos la lista jugadores
        for (Jugador jugador : jugadores) {
            //obtenemos el jugador que está en la lista del equipo1 con el nombre que introducimos como parámetro
            if (jugador.getNombre().equals(nombre)){
                //eliminamos al jugador de la lista del equipo1 y lo añadimos a la lista del equipo2
                
                jugadores.remove(jugador);
                jugadores2.add(jugador);
                
                //actualizamos las listas en el hashmap
                mapaEquipo.put(equipo2, jugadores2);
                mapaEquipo.put(equipo1, jugadores);
            }
        }
        
        
    }
    
}
