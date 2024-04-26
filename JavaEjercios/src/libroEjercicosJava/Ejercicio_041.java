package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_041 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String numero = entrada.nextLine();
		System.out.println("El ultimo numero es: " + numero.substring(numero.length()-1));
		System.out.println("Escribe un numero de 5 digitos: ");
		String numeroDe5Cifras =entrada.nextLine();
		System.out.println("El primer numero es: "+numeroDe5Cifras.charAt(0));
		
		
		System.out.println("Ingresa otro numero de 5 cifras: ");
		String numeroPositivoONegativo = entrada.nextLine();
		if (numeroPositivoONegativo.startsWith("-")) {
			System.out.println("El numero de cifras de tu numero negativo es: "+numeroPositivoONegativo.substring(1).length());
			
		} else {
			System.out.println("El numero de cifras de tu numero positivo es: "+numeroPositivoONegativo.length());
		}
		
		System.out.println("Ingrese numero");
		String numCapicua = entrada.nextLine();

		for (int i = 0, j = numCapicua.length()-1; i <j; i++,j--) {
		if (numCapicua.charAt(i) != numCapicua.charAt(j)) {
			System.out.println("no es capicua");
		} else {
			System.out.println("es capicua");
		}
		}
		entrada.close();
	}

}
