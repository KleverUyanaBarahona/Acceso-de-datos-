package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ficheros1 {
public static void main(String arg[]) {
	try {
		FileReader fichero=new FileReader("C:\\Users\\DAM2_Profesor\\Desktop\\h\\kvothe.txt");
		int c =fichero.read();
		/*while(c!=-1) {
			char letra=(char)c;
			c=fichero.read();
			System.out.print(letra);
		}*/
		while(c!=-1) {
			char letra=(char)c;
			c=fichero.read();
			if(c%20==0) {
				System.out.print(letra);
			}
			}
		}
		
	catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("el fichero existe");
	}
	
	
}
}

