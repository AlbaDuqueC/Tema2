package boletin7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		// Esta variable sirve para identificar el numero introducido
		int num;

		// variable que te dice si es primo o no
		boolean primo;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pide que introduzcas un numero
		System.out.println("Introduzca un numero:");

		// Escanea un numero
		num = sc.nextInt();

		for (int i = 2; i <= num; i++) {

			primo = true;

			// Si es primo el resultado tiene que ser 0
			if ((double) (i % 2) == 0) {
				primo = false;

			}
			if (primo) {
				// Te imprime los numeros primos
				System.out.println(i);
			}
		}

		// Cierre del scanner
		sc.close();

	}

}
