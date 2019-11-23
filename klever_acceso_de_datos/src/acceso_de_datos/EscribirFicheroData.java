package acceso_de_datos;

import java.io.*;
public class EscribirFicheroData {
  public static void main(String[] args) throws IOException {   
 
   File fichero = new File("C:\\Users\\DAM2_Vespertino\\Desktop\\klever\\Acceso a Datos\\Archivos_para_escribir\\escribirbytes2.dat");
   FileOutputStream fileout = new FileOutputStream(fichero);   
   DataOutputStream dataOS = new DataOutputStream(fileout);
 
   String nombres[] = {"Ana","Luis Miguel","Alicia","Pedro","Manuel","Andres",
                       "Julio","Antonio","Maria Jesus"};
					   
   int edades[] = {14,15,13,15,16,12,16,14,13};
	
   for (int i=0;i<edades.length; i++){
      dataOS.writeUTF(nombres[i]); //inserta nombre
      dataOS.writeInt(edades[i]);  //inserta edad
   }     
   dataOS.close();  //cerrar stream 
  }
}
