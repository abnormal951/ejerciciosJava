package libroEjerciciosJavaArrays;

import java.util.Scanner;

public class Ejercicio_051 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//instancia de Scanner para la entrada de datos
		int []numeros = new int[5];// declarar el array de 10 posiciones
		
		
		System.out.println("ingresa 10 numeros");

		for (int i = 0; i < 5; i++) {
			System.out.println("Numero : "+(i+1)+ " :");
			numeros[i] = entrada.nextInt();

		}
		for (int i =4; i >= 0; i--) {
			System.out.println("for "+numeros[i]);
		}
	
		entrada.close();
	}
}
