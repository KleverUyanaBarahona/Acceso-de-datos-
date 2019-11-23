package ejercicios;

import java.util.Scanner;

public class pedirnumHastaCero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int s=0;
		do{						//hacer suma hasta que se introduzca un cero
			a=sc.nextInt();
			s=s+a;
		}while(a!=0);
		System.out.println("la suma de los numeros introducidos es "+s);
		sc.close();
	}
}
