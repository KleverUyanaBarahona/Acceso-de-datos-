package com.islasfilipinas.entradasalida;
import java.io.*;
public class MostrarFicheroProfe{
  public static void main(String[] args)  {
    
	if (args.length!=1) {
			  System.out.println("HAY QUE INTRODUCIR UN ARGUMENTO....")	;
	}
	else
	{	
      try {	
		String entrada=args[0]; 		
	    File fichero = new File(entrada); //"ejemplofichtexto.txt";
    
        FileReader fic = new FileReader(fichero);    
        int i;
	    //pinta uno a uno los caracteres   
        while ((i = fic.read()) != -1)
           System.out.println((char) i);
        fic.close();
		}catch (IOException e) {
		   System.out.println("NO EXISTE EL FICHERO....");
		}
	}    
  }//main
}//clase
