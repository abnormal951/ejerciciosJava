package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_019 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double euro = 0.00601012;
		int peseta;
		System.out.println("ingresa la cantidad de Pesetas a convertir");
		peseta = entrada.nextInt();
		double resultado = euro *peseta;

		System.err.println("El resultado de: "+peseta +" Pesetas son : " + resultado+" Euros");

		entrada.close();

	}

}
