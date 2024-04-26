package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_040 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿FIEL O INFIEL?");
		System.out.println("Escoge: a) Verdadero  b) Falso");
		
		int puntos=0;



		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		char a=entrada.next().charAt(0);
		if (a == 'a') {
			puntos+=3;
		}
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		char b=entrada.next().charAt(0);
		if (b == 'a') {
			puntos+=3;
		}
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
		char c=entrada.next().charAt(0);
		if (c == 'a') {
			puntos+=3;
		}
		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		char d=entrada.next().charAt(0);
		if (d == 'a') {
			puntos+=3;
		}
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
		char e=entrada.next().charAt(0);
		if (e == 'a') {
			puntos+=3;
		}
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		char f=entrada.next().charAt(0);
		if (f == 'a') {
			puntos+=3;
		}
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		char g=entrada.next().charAt(0);
		if (g == 'a') {
			puntos+=3;
		}
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		char h=entrada.next().charAt(0);
		if (h == 'a') {
			puntos+=3;
		}
		System.out.println("9. Has notado que últimamente se perfuma más");
		char i=entrada.next().charAt(0);
		if (i == 'a') {
			puntos+=3;
		}
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		char j=entrada.next().charAt(0);
		if (j == 'a') {
			puntos+=3;
		}

		System.out.println("puntos obtenidos: "+puntos+" \n");

		if (puntos >= 0 && puntos <=10) {
			
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		} else if(puntos >= 11 && puntos <=22) {
			
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		} else if(puntos >= 23 && puntos <=30) {
			
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}



		entrada.close();
	}

}
