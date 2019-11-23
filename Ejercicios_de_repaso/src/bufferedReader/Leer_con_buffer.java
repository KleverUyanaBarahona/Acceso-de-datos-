package bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer_con_buffer {

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
			FileReader entrada= new FileReader("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/prueba3.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			//int c = 0;
			//-1  ?
			while(linea!= null) {
				
				
				linea = miBuffer.readLine();
				if(linea!= null)
				System.out.println(linea);
				}
			
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("Error al buscar Archivo");
			e.printStackTrace();
		}
	}
	

}
