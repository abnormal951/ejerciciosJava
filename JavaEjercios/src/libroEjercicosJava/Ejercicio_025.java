package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_025 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Ingresa MB a convertir a KB");
		int MB = entrada.nextInt();
		System.out.println("Los "+MB+" que ingresaste equivalen a:"+MB*1000);

		System.out.println("Ingresa KB a convertir a MB");
		double KB = entrada.nextInt();
		System.out.println("Los "+KB+" que ingresaste equivalen a:"+KB/1000);


		entrada.close();
	}

}
