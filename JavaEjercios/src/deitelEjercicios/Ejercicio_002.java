package deitelEjercicios;

import java.util.Scanner;

public class Ejercicio_002 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

		System.out.println("BMI");
		System.out.println("ingresa tu peso en Kg");
		float peso = entrada.nextFloat();
		System.out.println("ingresa tu altura en metros");
		float altura = entrada.nextFloat();

		float BMI=peso/(altura*altura);



		if (BMI <= 18.5) {
			System.out.println("Bajp de peso: "+BMI);
		} else if (BMI > 18.5 && BMI < 24.9){
			System.out.println("normal: "+BMI);
		} else if (BMI > 25 && BMI < 29.9){
			System.out.println("sobrepeso: "+BMI);
		} else{
			System.out.println("obeso: "+BMI);
		}
		
		entrada.close();
	}

}
