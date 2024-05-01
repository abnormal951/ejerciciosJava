package libroEjercicosJavaBucles;

import java.util.Scanner;

public class Ejercicio_049 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		

		int dado1 = (int)(Math.random()*6)+1;
		System.out.println("dado: "+dado1);
		int dado2 = (int)(Math.random()*6)+1;
		System.out.println("dado: "+dado2);
		int dado3 = (int)(Math.random()*6)+1;
		System.out.println("dado: "+dado3);
		
		System.out.println("suma: "+(dado1+dado2+dado3));

		entrada.close();
	}

}
