package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables

		// Variable que sirve para introducir el valor de numA
		int numA;

		// Variable que sirve para introducir el valor de numB
		int numB;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pide el numA
		System.out.println("Introduzca un numero");

		// Escanea el numA
		numA = sc.nextInt();

		// Pide el numB
		System.out.println("Introduzca un numero");

		// Escanea el numB
		numB = sc.nextInt();

		// Si numA es menor que numB
		if (numA < numB) {
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
		}
		// Si numB es menor que numA
		else if (numB < numA) {
			for (int i = numB; i <= numA; i++) {
				System.out.println(i);
			}
		}
		// Si numb y numA son iguales
		else
			System.out.println("Es igual");

		// Cierre del scanner
		sc.close();

	}

}
