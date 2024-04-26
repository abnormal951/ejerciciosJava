package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_033 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que calcula la media de tres notas.");

		System.out.println("Ingresa nota 1");
		double nota1 =entrada.nextDouble();
		System.out.println("Ingresa nota 2");
		double nota2 =entrada.nextDouble();
		System.out.println("Ingresa nota 3");
		double nota3 =entrada.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Le media de tus notas es de: "+media);

		if (media < 6) {
			System.out.println("insuficiente");			
		} else if (media >= 6 && media <= 7) {
			System.out.println("suficiente");
			
		} else if (media >= 7 && media <= 8){
			System.out.println("bien");
		} else if (media >= 8 && media <= 9){
			System.out.println("notable");

		} else if (media >= 9 && media <= 10)
		System.out.println("sobresaliente");


		


		entrada.close();
	}

}
