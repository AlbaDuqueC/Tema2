package boletin7;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable

		// Es el valor introducido
		int num;

		// Es el contador
		int contador;

		// Abrir el scanner
		Scanner sc = new Scanner(System.in);

		// Te pide un numero entre el 1 y el 20
		System.out.println("Introduzca un numero entre el 1 y el 20");

		// Escanea el numero introducido
		num = sc.nextInt();

		/*
		 * Si no introduces un numero entre el 1 y el 20, te vuelve a pedir otro hasta
		 * que este bien
		 */
		while (num <= 20 == false) {
			System.out.println("El numero introducido no es correcto, vuelva a introducir la hora");
			num = sc.nextInt();
		}

		// Crea la escala
		for (int i = 1; i <= num; i++) {

			System.out.println();
			contador = 1;

			for (int k = i; k >= contador; contador++) {
				System.out.print(k);

			}

		}
		// Cierre del scanner
		sc.close();

	}

}
