package xml_tutorial;

import java.io.*;
import java.util.Scanner;

public class Acciones {

     // Propiedades
     Persona p = new Persona();
     ConfigurarXML c = new ConfigurarXML();
    
     // Constructor
     public Acciones(){}
    
     // Métodos
    
     private void generarPersona(){
          Scanner sc = new Scanner(System.in);
         
          System.out.println("Generador de personas");
          System.out.println("Escribe nombre");
          p.setNombre(sc.nextLine());
          System.out.println("Escribe edad");
          p.setEdad(Integer.parseInt(sc.nextLine()));
          sc.close(); // Cierro el scanner
     }
    
     public void escribirDat() throws IOException, ClassNotFoundException{
          File people = new File("personas.dat");
         
          generarPersona();
          // Escribir en fichero
          if(people.exists()){
                EscribirSinCabecera salida = new EscribirSinCabecera(new FileOutputStream("personas.dat", true));
                p.writeExternal(salida);
               salida.close();
          }
          else{
                ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("personas.dat", true));
                p.writeExternal(salida);
                salida.close();
          }
     }
    
     // Agrego datos al xml conforme voy leyendo
     public void cargarDatEnXML(String ruta) throws IOException, ClassNotFoundException{
          boolean finFichero = false;
          File f = new File(ruta);
          ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("personas.dat"));
         
          // Machaco el anterior (en caso de que exista) para no duplicar datos
          c.crearXML("Gente", ruta);
         
          do{
                try{
                     p.readExternal(entrada);
                     c.anadirDOM(p.getNombre(), String.valueOf(p.getEdad()), ruta);
                }
                catch(EOFException e){
                     finFichero = true;
                }
          }while(!finFichero);
     }
}