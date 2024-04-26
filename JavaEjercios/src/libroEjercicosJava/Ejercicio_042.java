package libroEjercicosJava;

import java.util.Scanner;

public class Ejercicio_042 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		String comida = entrada.nextLine();
		float suma=0;

		//String palmera = "palmera";
 		//String cafe = "palmera";
		
		if (comida.equalsIgnoreCase("palmera")) {
			suma +=1.40;
		} else if (comida.equalsIgnoreCase("donut")){
			suma +=1;
		} else if (comida.equalsIgnoreCase("pitufo")){
			System.out.println(" ¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
			String bebida = entrada.nextLine();
			if(bebida.equalsIgnoreCase("aceite")) {
				suma +=1.20;
			}else if(bebida.equalsIgnoreCase("tortilla")) {
				suma +=1.60;
			}
		}
		System.out.println(" ¿Qué ha tomado de beber? (zumo o café): ");
		String bebida = entrada.nextLine();
		if (bebida.equalsIgnoreCase("zumo")) {
			suma +=1.50;
		} else if (bebida.equalsIgnoreCase("cafe")){
			suma +=1.20;
		}

		System.out.println("Total del desayuno:"+ suma);

		entrada.close();
	}

}
//La palmera vale 1.40 € y el donut 1 €.
// zumo o café a 1’50 y 1’20 respectivamente.


