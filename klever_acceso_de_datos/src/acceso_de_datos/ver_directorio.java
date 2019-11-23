package acceso_de_datos;

import java.io.*;
public class ver_directorio {
public static void main(String[] args) {
  System.out.println("Archivos en el directorio Nueva carpeta (2)");
  File f = new File("C:\\Users\\DAM2_Vespertino\\Desktop\\Nueva carpeta (2)"); //Ruta der dir a listar.
  String[] archivos = f.list();
  for (int i = 0; i < archivos.length; i++) {
    System.out.println(archivos[i]);
  }
  //otro ejemplo
  if (args.length>0) {
    String dir=args[0];  
    System.out.println("Archivos en el directorio " +dir);
    f = new File(dir);
    archivos = f.list();
    for (int i = 0; i < archivos.length; i++) {
      System.out.println(archivos[i]);
    } 
  }  
 }
}
