package entradasalida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class BufferReader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();
	}

}
class Leer_Fichero{
	public void lee(){
		try {
			FileReader entrada= new FileReader("C:/Users/DAM119_Vespertino/Desktop/programacion texto/prueba.txt");
			BufferedReader mibuffer=new BufferedReader(entrada);
			String linea="";
			while(linea!=null){
				linea=mibuffer.readLine();
				//c imprime unico con letra normal
				//char letra=(char)c;
				System.out.print(linea);
			}
			entrada.close();
		} catch(IOException e) {
			// TODO Auto-generated catch block
		System.out.println("No se ha encontrado el fichero");
		}
	}
}
