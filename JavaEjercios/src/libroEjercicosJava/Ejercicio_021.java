package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_021 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double base;
		double altura;

		System.out.println("Ingresa la base del rectangulo");
		base=entrada.nextDouble();
		System.out.println("Ingresa la la altura del rectangulo");
		altura=entrada.nextDouble();
		System.out.println("El area del rectangulo es:"+base*altura);
		System.out.println("Ingresa la base del triangulo");
		base=entrada.nextDouble();
		System.out.println("Ingresa la la altura del triangulo");
		altura=entrada.nextDouble();
		System.out.println("El area del triangulo es:"+(base*altura)/2);

		entrada.close();
	}

}
