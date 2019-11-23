package ejercicios;

import java.util.Scanner;

public class numero100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un numero");
		double a=sc.nextInt();
		if(a<=0){
			System.out.println("Has introducido un numero negativo");
		}else{
			if(a<=100){
			while(a<=1000){			//1000^2=1000000
				a= Math.pow(a,2);
				System.out.println(a);
			}
		}
		}
		sc.close();
	}
}
