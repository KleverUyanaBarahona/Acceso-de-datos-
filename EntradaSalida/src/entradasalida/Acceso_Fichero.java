package entradasalida;

import java.io.*;

public class Acceso_Fichero {

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
			int c=entrada.read();
			while(c!=-1){
				c=entrada.read();
				//c imprime unico con letra normal
				char letra=(char)c;
				System.out.print(letra);
			}
			entrada.close();
		} catch(IOException e) {
			// TODO Auto-generated catch block
		System.out.println("No se ha encontrado el fichero");
		}
	}
}