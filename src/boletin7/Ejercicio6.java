package boletin7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable

		int num;
		int contador;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println();
			contador = 1;
			
			for ( int j= i; j>=contadorEspacio) {

			for (int k = i; k >= contador; contador++) {
				System.out.print(" * ");
			}
			}

		}

		sc.close();

	}

}
