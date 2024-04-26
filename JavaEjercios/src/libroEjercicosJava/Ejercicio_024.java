package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_024 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double PI=Math.PI;

		System.out.println("Ingresa el radio del cono:");
		double radio = entrada.nextDouble();
		System.out.println("Ingresa la altura del cono:");
		double altura = entrada.nextDouble();
		double volumen= ((PI*(radio*radio)*altura)/3);

		System.out.println("El volumen de cono es: "+String.format("%.2f",volumen));
		

		entrada.close();
	}

}
