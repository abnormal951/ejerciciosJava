package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_023 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("ingresa las horas trabajadas");
		int horas=entrada.nextInt();

		System.out.println("Tu pago es de: "+horas*12+" euros");

		entrada.close();
	}

}
