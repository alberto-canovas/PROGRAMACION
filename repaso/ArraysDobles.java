/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;


public class ArraysDobles {

    
    public static void main(String[] args) {
        
        int[][] coches = new int[3][5];
        
        int contador=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                coches[i][j] = contador;
                System.out.print(coches[i][j]+ " ");
                contador++;
                if(coches[i][j]==6)
                    System.out.println("ENCONTRADO");
            }
            System.out.println("");
        }
        
    }
    
}
