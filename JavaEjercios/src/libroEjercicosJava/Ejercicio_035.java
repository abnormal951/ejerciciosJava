package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_035 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("te dire cuantos segundos faltan para la medianoche");
		System.out.println("ingresa solo la hora del dia");
		int hora = entrada.nextInt();
		System.out.println("ingresa solo el minuto del dia");
		int minuto = entrada.nextInt();
		System.out.println("La hora ingresada es: "+hora+":"+minuto);
		int dia = 86400;
		System.out.println("los segundos que hacen falta para la medida noches son: "+(dia-((hora*3600)+(minuto*60))));


		entrada.close();
	}

}

