package ejercicios;

public class productosImpares {

	public static void main(String[] args) {
		int c=1;
		// recorrer los primeros 10 numeros y combrobar si son impares
		for(int i=0;i<=10;i++){
			if((i%2)==1){
				c=c*i;
			}
		}
		System.out.println("el producto es "+c);

	}

}
