package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_026 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);


		System.out.println("Introduce la nota del primer examen:");
		double notaObtenida = entrada.nextFloat();
		notaObtenida=(notaObtenida*40/100); 
		System.out.println("nota obtenida: "+notaObtenida);
		System.out.println("Introduce la nota deseada:");
		double notaDeseada = entrada.nextFloat();
		notaDeseada=(notaDeseada*60/100); 
		System.out.println("nota deseada: "+(notaDeseada));



		

		entrada.close();
	}

}
