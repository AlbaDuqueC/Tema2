package boletin7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable

		// Sirve para escanear el numero introducido
		int num;

		// Abre el scanner
		Scanner sc = new Scanner(System.in);

		// Te pide un numero por pantalla
		System.out.println("Introduzca un numero");

		// Escanea el numero introducido
		num = sc.nextInt();

		// Crea el triangulo
		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}

		// Cierre del scanner
		sc.close();

	}

}
