/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosARRAY;

/**
 *
 * @author toti
 */
public class AppListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lista miLista = new Lista();
        System.out.println("longitud = " + miLista.longitud);
        System.out.println("Lista = "+ miLista.lista);
        System.out.println("Auxiliar = "+miLista.aux);
        System.out.println("");
        miLista.add(7);
        System.out.println("longitud = " + miLista.longitud);
        System.out.println("Lista = "+ miLista.lista);
        System.out.println("Lista[0] = "+ miLista.lista[0]);
        System.out.println("Auxiliar = "+miLista.aux);
        System.out.println("");
        miLista.add(5);
        System.out.println("longitud = " + miLista.longitud);
        System.out.println("Lista = "+ miLista.lista);
        System.out.println("Lista[0] = "+ miLista.lista[0]);
        System.out.println("Lista[1] = "+ miLista.lista[1]);
        System.out.println("Auxiliar = "+miLista.aux);
        System.out.println("Aux[0] = "+ miLista.aux[0]);
        System.out.println("Aux[1] = "+ miLista.aux[1]);
        System.out.println("");
         miLista.add(9);
        System.out.println("longitud = " + miLista.longitud);
        System.out.println("Lista = "+ miLista.lista);
        System.out.println("Lista[0] = "+ miLista.lista[0]);
        System.out.println("Lista[1] = "+ miLista.lista[1]);
        System.out.println("Lista[2] = "+ miLista.lista[2]);
        System.out.println("Auxiliar = "+miLista.aux);
        System.out.println("Aux[0] = "+ miLista.aux[0]);
        System.out.println("Aux[1] = "+ miLista.aux[1]);
        System.out.println("Aux[2] = "+ miLista.aux[2]);
        System.out.println("");
        
//        miLista.add(7);
//        System.out.println("longitud = " + miLista.longitud);
//        System.out.println("Lista = "+ miLista.lista);
//        System.out.println("Lista[0] = "+ miLista.lista[0]);
//        System.out.println("Auxiliar = "+miLista.aux);
//        
        
    }

}
