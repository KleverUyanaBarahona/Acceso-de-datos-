package avtividad_1_5;

//Programa java que lee fichero creado en Ejemplo6 con DataInputStream y los
//métodos read() adecuados.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Actividad1_5 {

	public static void main(String[] args) {
		
		//Ruta de lectura .dat
		String r="C:\\\\Users\\\\klips\\\\OneDrive\\\\Escritorio\\\\2ªDAM\\\\archivos2.dat";
		
		// Creamos dos variables String name y Int age para agrupar y almacenar nuestros valores
		String name;
		int age;
		try {
			FileInputStream fis=new FileInputStream(r);
			DataInputStream dis=new DataInputStream(fis);
			// Almacenamos los datos del .dat en nuestras variables
			name =dis.readUTF();
			age=dis.readInt();
			System.out.println("Name"+"  "+"Age");
			while(age!=0){
				// Imprimime las variables 
				System.out.println(name+"  "+age);
				
				name =dis.readUTF();
				age=dis.readInt();
				}
			System.out.println("End Read");
			dis.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			age=0;
		}
	}

}