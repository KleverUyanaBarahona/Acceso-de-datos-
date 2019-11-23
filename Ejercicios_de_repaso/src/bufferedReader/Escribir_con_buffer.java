package bufferedReader;

import java.io.*;

public class Escribir_con_buffer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribir es = new Escribir();
		es.escribir();
	}
	
}

class Escribir{
	
public void escribir() {
	
	String frase= "Prueba para escribir klever Uyana1"
			+ "Prueba para escribir klever Uyana2"
			+ "Prueba para escribir klever Uyana3"
			+ "Prueba para escribir klever Uyana4"
			+ "Prueba para escribir klever Uyana5"
			+ "Prueba para escribir klever Uyana6"
			+ "Prueba para escribir klever Uyana7"
			+ "Prueba para escribir klever Uyana8"
			+ "Prueba para escribir klever Uyana9"
			+ "Prueba para escribir klever Uyana10"
			+ "Prueba para escribir klever Uyana11";
	
	try {
		FileWriter escritura = new FileWriter("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/prueba4.txt");
		
		BufferedWriter miBuffer = new BufferedWriter(escritura);
		

			miBuffer.write(frase);
			miBuffer.newLine();
			miBuffer.write("este es el final");
			miBuffer.flush();
		
		escritura.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error el la escritura");
		e.printStackTrace();
	}
}
}