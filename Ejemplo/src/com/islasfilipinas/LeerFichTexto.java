package com.islasfilipinas;

import java.io.*;

public class LeerFichTexto {
  public static void main(String[] args) throws IOException {
    File fichero = new File("FichTexto.txt");
                //declarar fichero
    FileReader fic = new FileReader(fichero); //crear el flujo de entrada   
    int i;

//leer de 20 en 20 caracteres
//char b[] = new char[20];
//while ((i = fic.read(b)) != -1) System.out.println(b);
    while ((i = fic.read()) != -1) //se va leyendo un carácter
      System.out.println((char) i);
    fic.close(); //cerrar fichero   
  }
}
