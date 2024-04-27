package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_046 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String numero="";
		while (!numero.equals("-1")) {
			
			System.out.println("ingresa un numero: para salir escribe -1");
			numero=entrada.nextLine();
			System.out.println("El numero que introdujiste tiene "+(numero.length())+" digitos");
			
			
		} 
		
		entrada.close();
		 {
			
		}
	}

}
