package xml_tutorial;

import java.io.*;

public class Main {

     public static void main(String[] args) throws IOException, ClassNotFoundException{

          // Propiedades
          Acciones a = new Acciones();
          ConfigurarXML x = new ConfigurarXML();
         
          // Código para probar
          //
          a.escribirDat();
          a.cargarDatEnXML("personas.xml");
          System.out.println(x.leerXML("personas.xml"));
     }
}