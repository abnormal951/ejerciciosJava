package libroEjercicosJavaBucles;


public class Ejercicio_044 {

	public static void main(String[] args) {

		System.out.println("ejercicio 01");
		for (int i = 0; i <= 100;i+=5){
			System.out.println("for: "+i);
		}
		

		System.out.println("ejercicio 02");
		int i=5;
		while (i<100) {
			System.out.println("while: "+(i));
			i+=5;
		}
		
		
		System.out.println("ejercicio 03");
		int j=5;
		do {
			System.out.println("do-while: "+j);
			j+=5;
		} while (j<=100);
		
		
		System.out.println("ejercicio 04");
		for (int k=360; k>=120;k-=20){
			System.out.println("for: "+k);
		}
		
		
		System.out.println("ejercicio 05");
		int l=320;
		while (l>=120) {
			System.out.println("while: "+l);
			l-=20;
		}
		
		System.out.println("ejercicio 06");
		int m=360;
		do {
			System.out.println("do-while: "+m);
			m-=20;
		} while (m>=120);

	}

}
