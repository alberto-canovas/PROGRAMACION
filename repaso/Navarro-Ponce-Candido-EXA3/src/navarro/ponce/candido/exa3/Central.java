/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navarro.ponce.candido.exa3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author candido.navarro
 */
public class Central {
  private static HashMap<Integer,Medico> mapaMedicos = new HashMap();
  private static HashMap<Integer,Paciente> mapaPacientes = new HashMap();
  private static HashMap<Medico,Paciente[][]> mapaCitas = new HashMap();
  private static ArrayList<Receta> listaRecetas = new ArrayList<>();
  //private static Connection conexion = null;
  
  private static Central central = new Central();
  
  private Central() {
    // Añadir médicos
    Medico medico = new Medico("Alfonso", "López", LocalDate.parse("1980-02-20"));
    mapaMedicos.put(medico.getNumeroColegiado(), medico);
    mapaCitas.put(medico, new Paciente[3][5]);
    medico = new Medico("Rocio","Belmonte",LocalDate.parse("1985-10-02"));
    medico.setEspecialidad(Especialidad.ALERGIA);
    mapaMedicos.put(medico.getNumeroColegiado(), medico);
    mapaCitas.put(medico, new Paciente[3][5]);
    
    //Añadir pacientes
    Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
    mapaPacientes.put(paciente.getNuss(), paciente);
    paciente = new Paciente("Mario", "Ponce", LocalDate.parse("2015-03-14"));
    mapaPacientes.put(paciente.getNuss(), paciente);
    
    cargarDriverBBDD();
  }
  
  
  public static Medico getMedico(int colegiado) {
    Medico m = mapaMedicos.get(colegiado);
    return m;
  }
  
  public static boolean identificarMedico(int colegiado) {
    if (mapaMedicos.containsKey(colegiado)){
        return true;
    }
    return false;
  }
  
  public static boolean identificarPaciente(int nuss) {
    if(mapaPacientes.containsKey(nuss)){
        return true;
    }
    return false;
  }
  
  public static Paciente getPaciente(int nuss) {
      Paciente p = mapaPacientes.get(nuss);
    return p;
  }
  
  public static void listarMedicos() {
    System.out.println("** MEDICOS *************************************");
    Iterator it = mapaMedicos.entrySet().iterator();
    while(it.hasNext()){
        Map.Entry entry = (Map.Entry) it.next();
        Integer key = (Integer) entry.getKey();
        Medico value = (Medico) entry.getValue();
        System.out.println(value.toString());
    }
   
  }
  
  public static void listarPacientes() {
    System.out.println("** PACIENTES ***********************************");
    Iterator it = mapaPacientes.entrySet().iterator();
    while(it.hasNext()){
        Map.Entry entry = (Map.Entry) it.next();
        Integer key = (Integer) entry.getKey();
        Paciente value = (Paciente) entry.getValue();
        System.out.println(value.toString());
    }
    
  }
  
  public static void altaReceta(Medico medico, Paciente paciente, LocalDate fecha, Medicamento medicamento, int duracion, double dosis) {
      System.out.println("========================================");
      System.out.println("| Doctor/a: "+medico.getApellido()+"         Nº Col.: "+medico.getDni()+" |");
      System.out.println("----------------------------------------");
      System.out.println("| "+paciente.getApellido()+", "+paciente.getNombre()+"        NUSS: "+paciente.getNuss()+" |");
      System.out.println("----------------------------------------");
      System.out.println("| "+medicamento+"         "+fecha+" |");
      System.out.println("| Dosis: "+dosis+"mg/dia                  |" );
      System.out.println("| Duracion:   "+duracion+" dias           |");
      System.out.println("========================================");
  }
  
  public static void mostrarRecetas(Paciente paciente) {
          
  }
  
  public static boolean añadirCita(Medico medico, int dia, int hora, Paciente paciente) {
    Paciente[][] horarioPacientes = mapaCitas.get(medico);
    for(int i = 0; i<horarioPacientes.length;i++){
        for(int j = 0;j<horarioPacientes.length;j++){
            if(i == hora && j == dia ){
                horarioPacientes[i][j] = paciente;
                return true;
            }
        }
    } 
    
    
    
    return false;
  }
  
  public static boolean liberarCita(Medico medico, int dia, int hora) {
    Paciente[][] horarioPacientes = mapaCitas.get(medico);
    for(int i = 0; i<horarioPacientes.length;i++){
        for(int j = 0;j<horarioPacientes.length;j++){
            if(i == hora && j == dia ){
                horarioPacientes[i][j] = null;
                return true;
            }
        }
    } 
    
    
    
    return false;
  }
  
  public static Paciente getPacienteCita(Medico medico, int dia, int hora) {
    Paciente[][] horarioPacientes = mapaCitas.get(medico);
    for(int i = 0; i<horarioPacientes.length;i++){
        for(int j = 0;j<horarioPacientes.length;j++){
            if(i == hora && j == dia ){
                return horarioPacientes[i][j];
            }
        }
    } 
      return null;
  }
  
  public static void imprimirCalendario(Medico medico) {
    Paciente[][] horarioPacientes = mapaCitas.get(medico);
    System.out.println("** Calendario de citas **");
    System.out.println("Doctor: "+medico.getNombre());
    System.out.println("Especialidad: "+medico.getEspecialidad());  
    System.out.println("      | LUN | MAR | MIE | JUE | VIE |");
    System.out.println("-------------------------------------");
    for(int i = 0; i < horarioPacientes.length; i++){
        System.out.print("1"+i+":00 |");
        for(int j = 0; j< horarioPacientes[i].length; j++){
            if(horarioPacientes[i][j] == null){
                System.out.print("  -  |");
            }
            if(horarioPacientes[i][j] != null){
                Persona p = horarioPacientes[i][j];
                char LetraDNI = p.getDni().charAt(5);
                char ultimoNumeroDNI = p.getDni().charAt(4);
                System.out.print(" *"+ultimoNumeroDNI+LetraDNI+" |");
            }
            
        }
        System.out.println("");
    }
    System.out.println("-------------------------------------");
  }
  
  private static void cargarDriverBBDD() {
    // Cargar driver
      
//      Class.forName("org.mariadb.jdbc.Driver");
     
  }
  
  private static void conectar() {
    
    // Conectar
    String url  = "jdbc:mariadb://localhost:3306/smsarcas";
    String user = "root";
    String password = "";
   
//      conexion = DriverManager.getConnection(url, user, password);
      
  }
  
  private static void desconectar() {
    
  }
}
