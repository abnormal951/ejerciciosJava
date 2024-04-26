package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_017 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num1;
		int num2;
		System.out.println("ingresa el primer numero");
		num1 = entrada.nextInt();
		System.out.println("ingresa el segundo numero");
		num2 = entrada.nextInt();
		int result = num1*num2;
		System.out.println("El resultado de la multiplicacion es: "+result);


		entrada.close();
	}

}
