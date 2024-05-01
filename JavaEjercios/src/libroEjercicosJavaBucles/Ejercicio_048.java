package libroEjercicosJavaBucles;

import java.util.Scanner;
public class Ejercicio_048 {
		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int contador = 0;
		int positivos = 0;
		int negativos=0;

		System.out.println("ingresa 10 numeros positivos o negativos");
		while (contador <= 4) {
				numero = entrada.nextInt();

				if (numero >=0){
				positivos++;
				}
					else{
						negativos++;
				}
				contador++;


			}
			System.out.println("positivos ="+positivos);
			System.out.println("negativos ="+negativos);



		entrada.close();
	}
}