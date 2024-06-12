/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navarro.ponce.candido.exa3;

/**
 *
 * @author candido.navarro
 */
public class Utilidades {
    public static String limpiarAcentos(String texto) {
    String conAcento = "ÁÉÍÓÚáéíóú";
    String sinAcento = "AEIOUaeiou";
    String salida = texto;
    for (int i=0; i<conAcento.length();i++) {
      salida = salida.replace(conAcento.charAt(i), sinAcento.charAt(i));
    }
    return salida;
  }
}
