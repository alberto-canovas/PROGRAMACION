/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosARRAY;

/**
 *
 * @author toti
 */
public class Lista {
    
    int longitud;
    int[] lista;
    int[] aux;

    public int[] getLista() {
        return lista;
    }
    
    //CONSTRUCTOR
    public Lista(){
        this.longitud = 0;
    }
    
    public void add(int num){
        if (this.longitud==0){
            this.longitud++;
            lista = new int [1];
            lista [0]= num;
        }else{
            this.longitud++;
            aux = new int [longitud];
            aux[longitud-1] = num;
            for (int i = 0; i < longitud-1; i++) {
                aux[i] = lista[i];
            }
            lista = aux;
        }
    }//fin add
    
}
