/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_herencia;

/**
 *
 * @author toti
 */
public class Empleado {
    private String DNI, nombre, email;
    private double salarioBase;
    private int horasExtra;
    private double precioHoraExtra;

    public Empleado(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.salarioBase = 1000;
        this.precioHoraExtra = 10;
        this.horasExtra = horasExtra;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    
    
    public double calcularSueldo(){
        return salarioBase + horasExtra * precioHoraExtra;
    }
}


