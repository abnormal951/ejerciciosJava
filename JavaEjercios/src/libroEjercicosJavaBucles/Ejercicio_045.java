package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_045 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String convinacion;
		String password="zxcv";
		int contador=0;

		do {
			
		
		System.out.println("¿Cual es la contraseña?");
		convinacion=entrada.nextLine();
		if (password.equals(convinacion) ) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("esa no es la contraseña");
			contador+=1;
		} if (contador>=4) {
			break;
		}
	} while (!password.equals(convinacion));

		System.out.println("intentos: "+contador);

		entrada.close();
	}
}
