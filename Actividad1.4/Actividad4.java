import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Actividad4 {
	public static void main(String[] args) {
		
	
	String line;
	
	try {
		Process hijo = new ProcessBuilder("./Actividad4c").start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
		
		PrintStream ps = new PrintStream(hijo.getOutputStream());
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//para salir de l bucle se puede pulsar Ctrl D
		
		
		while ((line = in.readLine()) != null) {
			ps.println(line);
			
			ps.flush();// IMP: comprueba envio de datos
			
			if ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		System.out.println("Finalizado");
	}catch (IOException e) {
		System.out.println("Error ocurrio durante la ejeccion, Descripcion del error: "+e.getMessage());
		
	}
}
}
