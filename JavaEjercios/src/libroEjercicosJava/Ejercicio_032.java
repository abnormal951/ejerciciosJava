package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_032 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la altura de caida: ");
		float h = entrada.nextFloat();
		double g = 9.81;
		double t = (Math.sqrt(2*h/g));
		System.out.println("t = "+(String.format("%.2f",t)));		


		entrada.close();
	}

}
