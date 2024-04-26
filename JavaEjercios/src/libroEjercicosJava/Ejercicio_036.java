package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_036 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int puntos=0;
		System.out.println("1.- ¿Cuál es la capital de Australia? "
				+ "a) Sydney b) Melbourne c) Canberra");
		String opcion = entrada.nextLine();
		switch (opcion) {
			case "A":				
				break;
			case "B":
				puntos++;
				break;
			case "C":
				break;
			default:
				break;
				
			
		}
		System.out.println("2.- ¿Cuál es la capital de Australia? "
				+ "a) Sydney b) Melbourne c) Canberra");
		String opcion2 = entrada.nextLine();
		switch (opcion2) {
			case "A":				
			puntos++;
				break;
			case "B":
				break;
			case "C":
				break;
			default:
				break;
				
			
		}
		System.out.println("3.- ¿Cuál es la capital de Australia? "
				+ "a) Sydney b) Melbourne c) Canberra");
		String opcion3 = entrada.nextLine();
		switch (opcion3) {
			case "A":				
				break;
			case "B":
			break;
			case "C":
			puntos++;
			break;
			default:
				break;
				
			
		}
		System.out.println("4.- ¿Cuál es la capital de Australia? "
				+ "a) Sydney b) Melbourne c) Canberra");
		String opcion4 = entrada.nextLine();
		switch (opcion4) {
			case "A":				
				break;
			case "B":
				puntos++;
				break;
			case "C":
				break;
			default:
				break;
				
			
		}
		System.out.println("5.- ¿Cuál es la capital de Australia? "
				+ "a) Sydney b) Melbourne c) Canberra");
		String opcion5 = entrada.nextLine();
		switch (opcion5) {
			case "A":				
				break;
			case "B":
			break;
			case "C":
			puntos++;
				break;
			default:
				break;
				
			
		}
		System.out.println("puntos obtenidos: "+puntos);

		entrada.close();
	}

}


