package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_020 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Ingrese primer numero");
		num1=entrada.nextInt();
		System.out.println("Ingrese segundo numero");
		num2=entrada.nextInt();

		int suma=num1+num2;
		int resta=num1-num2;
		int multiplicacion=num1*num2;
		float division=(float)num1/num2;
		System.out.println("Suma: " + suma );
		System.out.println("Resta: " + resta );
		System.out.println("Multiplicacion " + multiplicacion );
		System.out.println("Diivision: " + division );
		entrada.close();

	}

}
