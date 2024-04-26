package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_030 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantas horas trabajaste esta semana?");		
		int horas = entrada.nextInt();
		
		if (horas <= 40) {
			System.out.println("tu pago es de: "+horas*12);
		} else {
			int horasExtra = horas - 40;
			System.out.println("Tu pago es de: "+((horasExtra*16)+480));

		}



		entrada.close();
	}

}
