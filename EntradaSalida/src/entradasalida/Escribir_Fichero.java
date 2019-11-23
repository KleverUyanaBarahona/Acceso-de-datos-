package entradasalida;
import java.io.*;
public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo accede_es =new Escribiendo();
		accede_es.escribir();
	}

}
class Escribiendo{
	public void escribir(){
		String frase="esto en una prueba de estritura2";
		try {
			FileWriter escritura= new FileWriter("C:/Users/DAM119_Vespertino/Desktop/programacion texto/prueba_nueva.txt",true);
			for(int i=0;i<frase.length();i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}