package com.islasfilipinas.ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryScanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero accediende = new Leer_Fichero();
		accediende.lee();
	}
}
class Leer_Fichero {
	//en formato unicode 
	public void lee() {
		try {
			FileReader entrada= new FileReader("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/prueba.txt");
			int c = 0;
			//-1  ?
			while(c!=-1) {
				c=entrada.read();
				if(c!=-1) {
				char letra =(char)c;
				
				System.out.print(letra);
				}
			}
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("Error al buscar Archivo");
			e.printStackTrace();
		}
	}
	

}
