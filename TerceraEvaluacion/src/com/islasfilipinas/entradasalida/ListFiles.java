package com.islasfilipinas.entradasalida;

import java.io.File;

public class ListFiles {

    public static void main(String[] args)     {

        // Aquí la carpeta donde queremos buscar
        String path = "C:/Users/DAM119_Vespertino/Desktop/programacion texto/"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 

        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
                System.out.println(files);
            }
        }
    }
    
}