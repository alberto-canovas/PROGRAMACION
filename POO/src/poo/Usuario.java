/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author toti
 */
public class Usuario {
    //Atributos
    double altura, peso,imc;
    String nombre,composicionCorporal;
    int edad;
    
    //Constructor
    public Usuario() {}
    
    public Usuario(String nombre, int edad, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        getIMC();
        getCompCorporal();
        
    }
    
    
    
    //Métodos
    private void getIMC() {
        imc = peso / (altura * altura);
    }
    
    private void getCompCorporal() {
        if (imc<18.5)
            composicionCorporal =  "inferior al normal";
        else if (imc<24.9)
            composicionCorporal = "normal";
        else if (imc<29.9)
            composicionCorporal = "superior al normal";
        else
            composicionCorporal = "obesidad";
    }
    
    public void muestraResultados (){
    System.out.printf("%s tiene un IMC = %.1f, es decir, su peso es %s\n.", nombre,imc,composicionCorporal);
    
    }
    
    
    
}
