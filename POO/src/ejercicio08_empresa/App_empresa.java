/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08_empresa;

/**
 *
 * @author toti
 */
public class App_empresa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BD_EMPRESA baseDatos = new BD_EMPRESA();
        
        baseDatos.addEmpresa("B12345678", "Nike", "Oregon (USA)");
        
        baseDatos.addEmpresa("B00044562", "Apple", "California (USA)");
        
        baseDatos.addEmpresa(new Empresa("B11111111", "Nitro", "Murcia (SPA)"));
        
        baseDatos.imprimir();
        System.out.println("");
        // Buscar empresa con cif = B00044562
        baseDatos.buscarCif("B00044562").imprimir();
        System.out.println("");
        System.out.println(baseDatos.buscarCif("B00044562").toString());
        System.out.println("");
        //Buscar empresa que empiece con "Ni"
        
        for(Empresa e : baseDatos.buscarNombre("Ni"))
            e.imprimir();
    }
    
}
