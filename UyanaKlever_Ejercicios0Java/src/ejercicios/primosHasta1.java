package ejercicios;

import java.util.Scanner;

public class primosHasta1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;//contador de los numeros divididos con resto 0
		//recorre los numeros anteriores
		for(int c=n;n>1;n--){
			i=0;
			//dividir cada numero por todos sus anteriores
			for(int b=c;b>1;b--){
				if((n%b)==0){
					i++;
				}
			}
			if(i==2){
				System.out.println(n+" es primo");
			}
		}
		sc.close();
	}
}
