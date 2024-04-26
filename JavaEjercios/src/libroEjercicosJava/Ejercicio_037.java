package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_037 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ordenar 3 numeros");
		System.out.println("Ingresa el primer numero");
		int A = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		int B = entrada.nextInt();
		System.out.println("Ingresa el tercer numero");
		int C = entrada.nextInt();


		if (A > B && B > C) {
			System.out.println(""+A+""+B+""+ C);
		} else if( A > C && C > B){
			System.out.println(""+A+""+C+""+ B);
		} else if( B > A && A > C){
			System.out.println(""+B+""+A+""+ C);
		} else if( B > C && C > A){
			System.out.println(""+B+""+C+""+ A);
		} else if( C > A && A > B){
			System.out.println(""+C+""+A+""+ B);
		} else if( C > B && B > A){
			System.out.println(""+C+""+B+""+ A);
		}

		entrada.close();
	}

}

/*

 
 */