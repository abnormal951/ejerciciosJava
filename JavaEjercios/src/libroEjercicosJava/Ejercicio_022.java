package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_022 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total_sin_iva;
		double IVA =0.16;

		System.out.println("Ingresa el total sin iva");
		total_sin_iva = entrada.nextDouble();
		double total_con_iva=total_sin_iva+(total_sin_iva*IVA);
		System.out.println("El total con iva es:"+total_con_iva);


		entrada.close();
	}

}
