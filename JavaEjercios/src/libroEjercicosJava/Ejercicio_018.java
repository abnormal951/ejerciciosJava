package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_018 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		

		int euro;
		double peseta = 166.386;
		System.out.println("ingresa la cantidad de Euros a convertir");
		euro = entrada.nextInt();
		double resultado = euro *peseta;

		System.err.println("El resultado de: "+euro +" Euros son : " + resultado);

		entrada.close();

	}

}
