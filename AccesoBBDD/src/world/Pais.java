/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package world;

/**
 *
 * @author toti
 */
public class Pais {
    private String nombre;
    private String region;
    private double surfaceArea;

    public Pais(String nombre, String region,double surfaceArea) {
        this.nombre = nombre;
        this.region = region;
        this.surfaceArea = surfaceArea;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    
    
    
    
}
