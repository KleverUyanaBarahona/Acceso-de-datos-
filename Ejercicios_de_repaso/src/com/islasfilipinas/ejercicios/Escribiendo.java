package com.islasfilipinas.ejercicios;

import java.io.FileWriter;
import java.io.*;

public class Escribiendo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribir es = new Escribir();
		es.escribir();
	}
	
}

class Escribir{
	
public void escribir() {
	
	String frase= "Prueba para escribir";
	
	try {
		FileWriter escritura = new FileWriter("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/prueba2.txt");
		for (int i=0;i<frase.length();i++) {
			escritura.write(frase.charAt(i));
		}
		escritura.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error el la escritura");
		e.printStackTrace();
	}
}
}