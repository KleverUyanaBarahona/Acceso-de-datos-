package acceso_de_datos;

import java.io.*;
public class EscribirFicheroBytes {
  public static void main(String[] args) throws IOException {   
   File fichero = new File("C:\\Users\\DAM2_Vespertino\\Desktop\\klever\\Acceso a Datos\\Archivos_para_escribir\\escribirbytes.dat");//declara fichero
   //crea flujo de salida hacia el fichero  
   FileOutputStream fileout = new FileOutputStream(fichero,true);   
   //crea flujo de entrada
   FileInputStream filein = new FileInputStream(fichero);   
   int i;

   for (i=1; i<200; i++)
       fileout.write(i); //escribe datos en el flujo de salida 	  
   fileout.close(); //cerrar stream de salida   
   
   //visualizar los datos del fichero	   
   while ((i = filein.read()) != -1) //lee datos del flujo de entrada
	    System.out.println(i);		
   filein.close();  //cerrar stream de entrada 
  }
}
