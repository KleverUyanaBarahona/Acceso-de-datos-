package com.islasfilipinas.entradasalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3buferwrite {

	public static void main(String[] args) throws IOException {
		
		String rutaarchivo = "C:/Users/DAM119_Vespertino/Desktop/programacion texto/prueba.txt";
		
		File fichero1 = new File(rutaarchivo);
				
		BufferedWriter Escribir;
		
		if (fichero1.exists()){
			
			Escribir = new BufferedWriter(new FileWriter (fichero1));
			Escribir.write("Este fichero de texto ya estaba creado");
			Escribir.newLine();
			
			System.out.println("Ya existe");
			
			
		}else{
			
			Escribir = new BufferedWriter(new FileWriter (fichero1));
			Escribir.write("Acabo de crear este fichero de texto");
			Escribir.newLine();
			
			System.out.println("No existe, acabo de crearlo");
		}
		
		for (int i=0; i<10;i++){
			
			Escribir.write("Esta es la línea de texto numero" + i);
			Escribir.newLine();
			
		}
			
		
		Escribir.close();
		
	}

}