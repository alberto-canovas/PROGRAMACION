package smsAlumno;

import sms.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/** *
 * @author Usuario
 */
public class Paciente extends Persona{
  
  private int nuss;  

  public Paciente(String nombre, String apellido, LocalDate fechaNacimiento) {
    super(nombre, apellido, fechaNacimiento);
    this.nuss = generaNUSS(getDni());
  }
  
  public static int generaNUSS(String dni) {
    int dniNum = Integer.parseInt(dni.substring(0, dni.length()-1));
    //int control = (LocalTime.now().getNano()/100000)%100;
    return 3*(int)Math.pow(10, dni.length()) + dniNum;
  }  

  @Override
  public String generaEmail() {
    return Util.limpiarAcentos(getNombre().toLowerCase()) + "." 
            + Util.limpiarAcentos(getApellido().toLowerCase()) + "@arcas.es";
  }

  public int getNuss() {
    return nuss;
  }

  @Override
  public String toString() {
    return String.format("(NUSS %d) %s %s [%s]",nuss , getNombre(), getApellido(),getDni());
  }
  
  public void mostrarFicha() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    int edad = (int)ChronoUnit.YEARS.between(getFechaNacimiento(),LocalDate.now());
    System.out.println("=".repeat(40));
    System.out.printf("| Nombre: %-14s NUSS: %7d |%n",getNombre(),nuss);
    System.out.printf("| Apellidos: %-11s  DNI: %7s |%n",getApellido(),getDni());
    System.out.printf("| F. nac.: %-13s Edad: %7d |%n",getFechaNacimiento().format(dtf),edad);
    System.out.printf("| Correo-e: %-26s |%n", getEmail());   
    System.out.println("=".repeat(40));
  }
  
}
