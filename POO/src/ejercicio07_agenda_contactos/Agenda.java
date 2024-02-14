/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07_agenda_contactos;

import java.util.ArrayList;

/**
 *
 * @author toti
 */
public class Agenda {
    
    private ArrayList<Contacto> agenda;
    private int contadorId=0;
    
    
    public Agenda(){
        agenda = new ArrayList<>();
        
    }
    
    
    public void addContacto(String nombre,String email, String telefono){
        contadorId++;
        agenda.add(new Contacto(contadorId, nombre, email, telefono));
        
    }
    
    
    public void listarAgenda(){
        System.out.println("         Contactos en la Agenda");
        System.out.println("*".repeat(45));
        System.out.println("ID  NOMBRE       EMAIL               TELEFONO");
        System.out.println("*".repeat(45));
//OTRA FORMA DE HACER EL BUCLE PERO EN ESTE CASO HAY QUE ESCRIBIR MÁS CÓDIGO Y agenda.get(i)==c. EN EL CASO FOR (CONTACTO C: AGENDA)

//        for (int i = 0; i < agenda.size(); i++) {
//            agenda.get(i).getNombre();
//        }
        
        for (Contacto c: agenda) {
            System.out.printf("\n%2d %-10s %-25s %6s ",c.getId(),c.getNombre(),c.getEmail(),c.getTelefono());
            
        }
        System.out.println("");
    }
    
    public void modificarContacto(int id){
        
    }
    
    public void modificarContacto(String nombre){
        
    }
    
    private void modificarContacto(Contacto c){
        
    }
    
    
    public ArrayList<Contacto> buscarContactos(String expresion){
        return null;
    }
    
    public int getSize(){
        return agenda.size();
    }
    
    public ArrayList<Contacto> getAgenda() {
        return agenda;
    }

    public int getContador() {
        return contadorId;
    }
    
    
    
    
    
}
