package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_047 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el numero a elevar");
		int elevarCuadrado=entrada.nextInt();
		int elevarCubo=elevarCuadrado;

	
		int contador=0;
		while(contador<5) {
			contador++;
			
			int resCuadrado =(elevarCuadrado*=elevarCuadrado);
			System.out.println(" :"+resCuadrado);

		}
		
		contador=0;
		while(contador<5) {
			contador++;

			int resCubo=elevarCubo*=elevarCubo*=elevarCubo;
		    System.out.println(" :"+resCubo);
		}

		entrada.close();

	}

}
