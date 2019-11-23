import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Actividad3Java {
	public static void main(String[] args) {	
		String line;
		try {
			Process hijo = new ProcessBuilder("./Actividad3Aleatorios").start();
			BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			PrintStream ps = new PrintStream(hijo.getOutputStream());
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			while((in.readLine()).compareTo("fin") != 0){
				ps.println("");//No es necesario escribir nada
				ps.flush();//asegura que los datos se han enviado
				
				
				if ((line= br.readLine()) != null) {
				
					System.out.println(line);
				}
			}
			
		}catch(IOException e) {
			
		}
		
		
		
	}
}
