package boletin7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables

		// Sirve para escanear el numero introducido
		int num;

		// Abre el scanner
		Scanner sc = new Scanner(System.in);

		// Te pide un numero por pantalla
		System.out.println("Introduzca un numero");

		// Escanea el numero introducido
		num = sc.nextInt();

		// Triangulo numeros
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for (int k = i; k > 0; k--) {
				System.out.print(k);
			}
			System.out.println();

		}

		// Cierre del scanner
		sc.close();

	}

}
