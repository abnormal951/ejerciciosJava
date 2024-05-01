package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_047 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el numero a elevar");
		int entrdaNumero=entrada.nextInt();
		int numero=entrdaNumero;
		int numero2=entrdaNumero;


	
		int contador=0;
		while(contador<5) {
			contador++;
			
			int resCubo=numero*=numero*=numero;
			int resCuadrado =(numero2*=numero2);
			System.out.println(entrdaNumero+ " al cuadrado = "+resCuadrado +" "+ entrdaNumero +" al cubo = "+  resCubo);

		}
		


		entrada.close();

	}

}
