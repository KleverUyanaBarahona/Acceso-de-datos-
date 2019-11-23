import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Actividad1 {
	public static void main(String[] args) {
	String line;
	try {
		Process p1 = new ProcessBuilder("ls","-la").start();
		Process p2 = new ProcessBuilder("tr", "d", "D").start();
		
		PrintStream pos = new PrintStream(p2.getOutputStream());
		BufferedReader br1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));
		
		while((line = br1.readLine()) != null ) {
			pos.println(line);
		}
		pos.close();
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
		
		System.out.println("Finalizacion de la ejecucion ");
		
		while ((line = br2.readLine()) != null) {
			System.out.println(line);
		}
		
	}catch (IOException e) {
		System.out.println("Error ocurido durante la ejecucion");
	}
	
	}
}	
