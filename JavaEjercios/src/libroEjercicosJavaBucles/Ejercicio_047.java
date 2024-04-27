package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_047 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el numero a elevar");
		int elevar=entrada.nextInt();

		
		for (int i = elevar; i <5000; i*=i) {
			System.out.println(i);
			
		}
	
		int contador=0;
		int i=0;
		while(contador<5) {
			System.out.println(" :"+i++);
			contador++;
		}
		
		entrada.close();

	}

}
