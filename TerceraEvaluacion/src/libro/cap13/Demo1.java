package libro.cap13;
import java.io.FileInputStream;
import java.util.Scanner;
public class Demo1 {
	//El archivo de texto demo.txt debe estar ubicado en la carpeta padre del package root.
	public static void main(String[] args) throws Exception{
		// abro el archivo
		FileInputStream fis = new FileInputStream("demo.txt");
		
		//instanciamos Scanner pasandoloe el FileInputStream
		
		Scanner sc = new Scanner(fis);
		
		int i =sc.nextInt();
		String n = sc.next();
		
		while( !n.equals("FIN")){
			System.out.println(i+", "+ n);
			i=sc.nextInt();
			n=sc.next();
		}
		// cierro el archivo
		fis.close();
	}

}
