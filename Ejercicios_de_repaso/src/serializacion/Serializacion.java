package serializacion;

import java.io.*;
import java.util.*;

public class Serializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList personal[];
		Empleado n1=new Empleado("Ana", 2500);
		Empleado n2=new Empleado("Luis",1800);
		
		try {
		ObjectOutputStream escribiendo_fichero= new ObjectOutputStream(new FileOutputStream("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/empleado.dat"));
		
		escribiendo_fichero.writeObject(n1);
		escribiendo_fichero.close();
		
		ObjectInputStream recuperar_fichero = new ObjectInputStream(new FileInputStream("C:/Users/klips/OneDrive/Escritorio/Pruebas_Archivos/empleado.dat"));
		
		personal=(ArrayList[]) recuperar_fichero.readObject(); 
		
		recuperar_fichero.close();
		for(ArrayList e: personal )
		System.out.print(e);
		
		}catch(Exception e)
		{
			
		}
	}

}


