/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

/**
 *
 * @author toti
 */
public class Contacto {
    private String nombre;
    private char sexo;
    private int edad;
    private double altura;

    public Contacto(String nombre, char sexo, int edad, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }
    public Contacto(String lineaCSV){
        String[] datos = lineaCSV.split(";");
        
        this.nombre = datos[0];
        this.sexo = datos[1].charAt(0);
        this.edad = Integer.parseInt(datos[2]);
        this.altura = Double.parseDouble(datos[3].replace(',', '.'));
    }
    
    
    @Override
    public String toString() {
        return String.format("%-10s %s %2d %4.2f",nombre, sexo, edad, altura );
        //return "Contacto{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
    public String toCSV(){
        return String.format("%s;%s;%d;%.2f%n",nombre, sexo, edad, altura );

    }
    
    
}
