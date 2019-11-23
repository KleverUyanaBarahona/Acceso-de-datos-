package com.islasfilipinas.entradasalida;
import java.io.*;
public class Actividad3 {
	public static void main(String[]args){
		
		try{
			String sFichero="ruta";
			BufferedWriter bw =new BufferedWriter (new FileWriter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 (sFichero));
			for(int x=0; x<10;x++){
				bw.write ("Fila numero "+x);
				bw.newLine();
			}
			bw.close();
			
		}catch(FileNotFoundException e){
			
		}
		catch(IOException e){
			
		}
	}
}
