package leer_y_escribir_bittes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Leectura_escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuenta cuantos bites hay.
		int contador = 0;
		
		//int datos_entrada[]=new int [203581];
		try {
			FileInputStream archivo_lectura = new FileInputStream("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/box1.jpg");
			
			boolean final_ar= false;
			
			//hasta que final_ar sea diferente
			
			while(!final_ar) {
				
				//guardo la entrada el esta variable 
				int byte_entrada = archivo_lectura.read();

				//termina cunado en -1, pone final_ar= true para salir del bucle.
				if(byte_entrada ==-1) 
				{ 	
					final_ar = true;
				}
					System.out.println(byte_entrada);
					
				contador++;
			}
			
			archivo_lectura.close();
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}
		System.out.print(contador);
	}

}
