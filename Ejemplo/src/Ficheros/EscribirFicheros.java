package Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheros {
public static void main(String args[]) {

	String frase ="hello my friend ";
	try {
		FileWriter escribir =new FileWriter("text.txt",true);
		for(int i=0;i<frase.length();i++){
			escribir.write(frase.charAt(i));
			System.out.println("se ha escrito "+frase +"en  la ruta "+"H:\\text.txt" );
		}
		escribir.write(frase);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("el fichero no existe");
	}
}
}
