/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlmacenHashMap;

/**
 *
 * @author toti
 */
public class AppAlmacen {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto colacao = new Producto("Cola cao", 2.5, 50);
        Almacen mialmacen = new Almacen();
        Producto limon = new Producto("Limon", 2.5, 50);

        Almacen.añadir(colacao);
        Almacen.añadir(limon);
        Almacen.añadir(new Producto("naranja", 5.6, 100));
        Almacen.modificarPrecio(1001, 10);
        Almacen.listarAlmacen();
        
    }
    
}
