package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_043 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		String res;
		do {
		System.out.print("Dime un número: ");
		numero = Integer.parseInt(System.console().readLine());
		System.out.println("¿Quiere continuar? (s/n)");
		res = entrada.nextLine();
		if (numero % 2 == 0) {// comprueba si el número introducido es par
		System.out.println("Qué bonito es el " + numero);
		} else {
		System.out.println("No me gustan los números impares, adiós.");
		}
		} while (res.equals("si"));
		entrada.close();
		}
	
	}



