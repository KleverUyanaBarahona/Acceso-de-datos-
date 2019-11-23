package ejercicios;

import java.util.Scanner;

public class numeroMayor {

	public static void main(String[]args){
		 Scanner sc= new Scanner(System.in);
		 System.out.println("introduce el primer valor");
		 int a=sc.nextInt();
		 System.out.println("introduce el segundo valor");
		 int b=sc.nextInt();
		 // Compruebo si a es mayor que b
		 if(a>b){			
			 System.out.println("El mayor es "+a);
		 }
		 else{
			 //Compruebo si a y b son iguales
			 if(a==b){
				 System.out.println(a+" y "+b+" son iguales");
			 }
			 //si "a" no es mayor ni igual a "b" entonces "b" es mayor
			 else{
				 System.out.println("El mayor es "+b);
			 }
		 }
		 sc.close();
	
		
	}

}
