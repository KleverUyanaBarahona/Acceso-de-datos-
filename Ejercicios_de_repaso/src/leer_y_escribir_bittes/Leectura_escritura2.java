package leer_y_escribir_bittes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Leectura_escritura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuenta cuantos bites hay.
		int contador = 0;
		
		int datos_entrada[]=new int [203581];
		try {
			FileInputStream archivo_lectura = new FileInputStream("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/box1.jpg");
			
			boolean final_ar= false;
			
			//hasta que final_ar sea diferente
			
			while(!final_ar) {
				
				//guardo la entrada el esta variable 
				int byte_entrada = archivo_lectura.read();
				
				if(byte_entrada!=-1)
				{
					datos_entrada[contador]=byte_entrada;
				}

				//termina cunado en -1, pone final_ar= true para salir del bucle.
				else
				{ 	
					final_ar = true;
				}
					System.out.println(datos_entrada[contador]);
					
				contador++;
			}
			
			archivo_lectura.close();
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}
		System.out.print(contador);
		
		crear_fichero(datos_entrada);
	}
	//realiza una copia de la leida
	static void crear_fichero(int datos_nuevos_fichero[]) {
		
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/box2.jpg");
			
			for(int i= 0;i<datos_nuevos_fichero.length;i++) {
				fichero_nuevo.write(datos_nuevos_fichero[i]);
			}
			fichero_nuevo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}