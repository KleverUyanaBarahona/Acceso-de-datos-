package com.islasfilipinas.entradasalida;
import java.io.File; 
import java.io.FilenameFilter;
public class Filtrar implements FilenameFilter {
	String extension;
	// Constructor
	Filtrar(String extension){
		this.extension = extension;
	}
	public boolean accept(File dir, String name){
		return name.endsWith(extension);
	}
	public static void main(String[] args) {
		try {
			// Obtendremos el listado de los archivos de ese directorio
			File fichero = new File("C:\\Users\\DAM119_Vespertino\\Desktop\\XML");
			String[] listadeArchivos = fichero.list();
			// Filtraremos por los de extension .txt
			listadeArchivos = fichero.list(new Filtrar(".xml"));
			// Comprobamos el número de archivos en el listado
			int numarchivos = listadeArchivos.length ;
			if (numarchivos< 1) {
				System.out.println("No hay archivos que listar");}
				// Y si hay, escribimos su nombre por consola.
				else {
					for(int conta = 0; conta<listadeArchivos.length; conta++)
						System.out.println(listadeArchivos[conta]);
				}
			} catch (Exception ex) {
				System.out.println("Error al buscar en la ruta indicada");
			}
		}
	static String subsFileSeparatos(String ruta) {
		String separador = "\\";
		try {
			// Si estamos en Windows
			if (File.separator.equals(separador))
				separador = "/";
			return ruta.replaceAll(separador, File.separator);
		} catch(Exception e) {
			return ruta.replaceAll(separador + separador, File.separator);
		}
	}
}


