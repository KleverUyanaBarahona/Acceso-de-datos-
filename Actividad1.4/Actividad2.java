import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Actividad2 {

	public static void main(String[] args) throws IOException {
		 if(args.length<=0) {
			 System.err.println("Needcomando run");
			 System.exit(-1);
		 }
		 
		 Runtime runtime = Runtime.getRuntime();
		 
		 Process process = runtime.exec(args);
		 
		 BufferedReader berr = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		 
		 String line;
		 
		 System.out.println("Error of runing %s is" + Arrays.toString(args));
		 
		 while((line = berr.readLine()) != null) {
			 System.out.println(line);
		 }
		
				 		
		
	}

}
