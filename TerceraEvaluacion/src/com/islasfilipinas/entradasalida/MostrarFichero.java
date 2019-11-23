package com.islasfilipinas.entradasalida;
import java.io.*;

public class MostrarFichero {
	 // Aquí la carpeta donde queremos buscar
    String path = "C:/Users/DAM119_Vespertino/Desktop/programacion texto"; 

    String files;
    File folder = new File(path);
    File[] listOfFiles = folder.listFiles(); 


    public static void mostrarFichero() {
        FileReader fr = null;
 
        try {
            File fichero = new File("prueba.txt");
            fr = new FileReader(fichero);
 
            leerFichero(fr);
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public static void leerFichero(FileReader fr) throws Exception{

    	BufferedReader rc = new BufferedReader (new FileReader ("C:/Users/DAM119_Vespertino/Desktop/programacion texto"));
    		
        int letra;
        char caracter;
        letra = rc.read();
        while (letra != -1) {
        	
            caracter=(char)letra;
            
            System.out.print(caracter);
            
            letra = fr.read();
        }
    }
    public static void main(String[] args) throws IOException {
        //mostrarFichero();
        
    	BufferedReader rc = new BufferedReader (new FileReader ("C:/Users/DAM119_Vespertino/Desktop/programacion texto/prueba.txt"));
		
        int letra;
        char caracter;
        letra = rc.read();
        while (letra != -1) {
        	
            caracter=(char)letra;
            
            
            letra = rc.read();
        }
        
    }
 
}