package ejercicios;

import java.util.Scanner;

public class fecha {
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce el dia");
		int d=sc.nextInt();
		System.out.println("introduce el mes");
		int m=sc.nextInt();
		System.out.println("introduce el año");
		int a=sc.nextInt();
		if((d>=1)&&(d<=30)){
			if((m>=1)&&(m<=12)){
				if((a>=1900)&&(m<=9999)){
					System.out.println("la fecha es correcta "+d+"/"+m+"/"+a);
				}
			}
		}
		sc.close();
	}

}
