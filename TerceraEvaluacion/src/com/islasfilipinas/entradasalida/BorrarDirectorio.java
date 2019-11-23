package com.islasfilipinas.entradasalida;
import java.io.*;
public class BorrarDirectorio {
	
	static void bDirectorio(File borrar){
		if (borrar.isDirectory()) {
		try{
			for (File listFile : borrar.listFiles()) {
				if (listFile.isFile()) {
					listFile.delete();
					//listFile.deleteOnExit();
				} else { 
					if (listFile.isDirectory()) {
						bDirectorio(listFile);
						listFile.delete();
					}
				} 
			}
		}catch(NullPointerException e){
			System.out.println(e);
			}
		} 
		borrar.delete();
		//borrar.deleteOnExit(); 
		}
	
	public static void main(String[] args) {	
	
		// TODO Auto-generated method stub
		
		File directorio = new File("E:\\Carolina\\Borrar");
		bDirectorio(directorio);

	}

}