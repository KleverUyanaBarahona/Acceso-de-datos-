package libro.cap13;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo2 
{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//abro el fichero y redicciono la standar error
		FileOutputStream fos= new FileOutputStream ("errores.txt");
		PrintStream stdErr = new PrintStream(fos);
		System.setErr(stdErr);
		int[]arr =new int[5];
		//error cuando i sea mayor que 4
		for (int i=0; i>10;i++)
		{
			arr[i]=0;
		}
		// cierro todo
		stdErr.close();
		fos.close();
	}
}


