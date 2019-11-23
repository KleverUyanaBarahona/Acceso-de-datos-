package entradasalida;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int datos_entrada[]= new int[32988];
		try{
		
			FileInputStream archivo_lectura=new FileInputStream("C:/Users/DAM119_Vespertino/Desktop/programacion texto/foto.jpg");
		boolean final_ar=false;
			while(!final_ar){
				int byte_entrada=archivo_lectura.read();
				if(byte_entrada!=-1)
					datos_entrada[contador]=byte_entrada;
				else
				//if(byte_entrada==-1)
				final_ar=true;
				//System.out.println(byte_entrada);
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			archivo_lectura.close();
		}catch(IOException e){
			System.out.println("Error el acceder a la imagen");
		}
		System.out.println(contador);
		crea_fichero(datos_entrada);
	}
	static void crea_fichero(int datos_nuevo_fichero[]){
		try{
			FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/DAM119_Vespertino/Desktop/programacion texto/foto_copia.jpg");
			for(int i=0;i<datos_nuevo_fichero.length;i++){
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
		}catch(IOException e){
			System.out.println("Error al crear el archivo");
		}
		
	}
	
}
