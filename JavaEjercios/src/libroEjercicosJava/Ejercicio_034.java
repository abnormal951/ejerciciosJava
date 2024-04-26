package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_034 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que resuelve una ecuación "
				+ "de segundo grado (del tipo ax2 +bx+c =0)");

		System.out.println("Ingrese valorr de 'a' ");
		double a = entrada.nextDouble();	
		System.out.println("Ingrese valorr de 'b' ");
		double b = entrada.nextDouble();	
		System.out.println("Ingrese valorr de 'c' ");
		double c = entrada.nextDouble();	
		
		double x1 = (-b+(Math.sqrt((b*b)-(4*a*c))))/2*a; 
		double x2 = (-b-(Math.sqrt((b*b)-(4*a*c))))/2*a; 
	



		System.out.println("el resultado de X1 es: "+x1);
		System.out.println("el resultado de X2 es: "+x2);

		entrada.close();
	}

}
 