package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_039 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De que sibmolo quieres tu piramide"
				+ " '*', '+' ,'-', '$' o '&' ");
		String simbolo = entrada.nextLine();
		System.out.println("Dureccion de la piramide"
				+ " 'izquierda', 'derecha' ,'arriba' o 'abajo' ");
		String direccionPiramide = entrada.nextLine();

		switch (simbolo) {
			case "*":
				if (direccionPiramide.equalsIgnoreCase("izquierda")) {
					System.out.println("   *");
					System.out.println("  **");
					System.out.println(" ***");
					System.out.println("****");
					System.out.println(" ***");
					System.out.println("  **");
					System.out.println("   *");
				} else if(direccionPiramide.equalsIgnoreCase("derecha")) {
					System.out.println("*   ");
					System.out.println("**  ");
					System.out.println("*** ");
					System.out.println("****");
					System.out.println("*** ");
					System.out.println("**  ");
					System.out.println("*   ");
				} else if(direccionPiramide.equalsIgnoreCase("abajo")) {
					System.out.println("*******");
					System.out.println(" ***** ");
					System.out.println("  ***  ");
					System.out.println("   *   ");
				} else if(direccionPiramide.equalsIgnoreCase("arriba")) {
					System.out.println("   *   ");
					System.out.println("  ***  ");
					System.out.println(" ***** ");
					System.out.println("*******");
				}
				break;
			case "$":
			if (direccionPiramide.equalsIgnoreCase("izquierda")) {
				System.out.println("   $");
				System.out.println("  $$");
				System.out.println(" $$$");
				System.out.println("$$$$");
				System.out.println(" $$$");
				System.out.println("  $$");
				System.out.println("   $");
			} else if(direccionPiramide.equalsIgnoreCase("derecha")) {
				System.out.println("$   ");
				System.out.println("$$  ");
				System.out.println("$$$ ");
				System.out.println("$$$$");
				System.out.println("$$$ ");
				System.out.println("$$  ");
				System.out.println("$   ");
			} else if(direccionPiramide.equalsIgnoreCase("abajo")) {
				System.out.println("$$$$$$$");
				System.out.println(" $$$$$ ");
				System.out.println("  $$$  ");
				System.out.println("   $   ");
			} else if(direccionPiramide.equalsIgnoreCase("arriba")) {
				System.out.println("   $   ");
				System.out.println("  $$$  ");
				System.out.println(" $$$$$ ");
				System.out.println("$$$$$$$");
			}
				break;
			case "&":
			if (direccionPiramide.equalsIgnoreCase("izquierda")) {
				System.out.println("   &");
				System.out.println("  &&");
				System.out.println(" &&&");
				System.out.println("&&&&");
				System.out.println(" &&&");
				System.out.println("  &&");
				System.out.println("   &");
			} else if(direccionPiramide.equalsIgnoreCase("derecha")) {
				System.out.println("&   ");
				System.out.println("&&  ");
				System.out.println("&&& ");
				System.out.println("&&&&");
				System.out.println("&&& ");
				System.out.println("&&  ");
				System.out.println("&   ");
			} else if(direccionPiramide.equalsIgnoreCase("abajo")) {
				System.out.println("&&&&&&&");
				System.out.println(" &&&&& ");
				System.out.println("  &&&  ");
				System.out.println("   &   ");
			} else if(direccionPiramide.equalsIgnoreCase("arriba")) {
				System.out.println("   &   ");
				System.out.println("  &&&  ");
				System.out.println(" &&&&& ");
				System.out.println("&&&&&&&");
			}
				break;

				case "+":
				if (direccionPiramide.equalsIgnoreCase("izquierda")) {
					System.out.println("   +");
					System.out.println("  ++");
					System.out.println(" +++");
					System.out.println("++++");
					System.out.println(" +++");
					System.out.println("  ++");
					System.out.println("   +");
				} else if(direccionPiramide.equalsIgnoreCase("derecha")) {
					System.out.println("+   ");
					System.out.println("++  ");
					System.out.println("+++ ");
					System.out.println("++++");
					System.out.println("+++ ");
					System.out.println("++  ");
					System.out.println("+   ");
				} else if(direccionPiramide.equalsIgnoreCase("abajo")) {
					System.out.println("+++++++");
					System.out.println(" +++++ ");
					System.out.println("  +++  ");
					System.out.println("   +   ");
				} else if(direccionPiramide.equalsIgnoreCase("arriba")) {
					System.out.println("   +   ");
					System.out.println("  +++  ");
					System.out.println(" +++++ ");
					System.out.println("+++++++");
				}
					break;

					case "-":
					if (direccionPiramide.equalsIgnoreCase("izquierda")) {
						System.out.println("   -");
						System.out.println("  --");
						System.out.println(" ---");
						System.out.println("----");
						System.out.println(" ---");
						System.out.println("  --");
						System.out.println("   -");
					} else if(direccionPiramide.equalsIgnoreCase("derecha")) {
						System.out.println("-   ");
						System.out.println("--  ");
						System.out.println("--- ");
						System.out.println("----");
						System.out.println("--- ");
						System.out.println("--  ");
						System.out.println("-   ");
					} else if(direccionPiramide.equalsIgnoreCase("abajo")) {
						System.out.println("-------");
						System.out.println(" ----- ");
						System.out.println("  ---  ");
						System.out.println("   -   ");
					} else if(direccionPiramide.equalsIgnoreCase("arriba")) {
						System.out.println("   -   ");
						System.out.println("  ---  ");
						System.out.println(" ----- ");
						System.out.println("-------");
					}
						break;
		
			default:
				break;
		


		}


		entrada.close();
	}

}
