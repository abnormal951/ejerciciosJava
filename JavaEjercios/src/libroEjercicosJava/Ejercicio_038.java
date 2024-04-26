package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_038 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero, te dire si es par y/o divisible entre 5");
		int numero = entrada.nextInt();

		if(numero % 2 == 0 && numero % 5 == 0) {

			System.out.println("es par y tambien divisible entre 5");

		}else if(numero % 2 == 0 ) {
			System.out.println("Es par ");
		}else {
			System.out.println("No es par");
		}

		entrada.close();
	}

}
