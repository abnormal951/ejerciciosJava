package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_027 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que dia quires saber que materia toca a primera hora");
		String dia = entrada.nextLine();

		switch (dia) {
			
			case "Lunes":
				System.out.println("Toca Matematicas");
				break;
			case "Martes":
				System.out.println("Toca Español");
				break;
			case "Miercoles":
				System.out.println("Toca Fisica");
				break;
			case "Jueves":
				System.out.println("Toca Etica");
				break;
			case "Viernes":
				System.out.println("Toca Ingles");
				break;
		
			default:
				break;
		}


		entrada.close();
	}

}
