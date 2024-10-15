package boletin4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables

		// Esta variable sirve para introducir el numero
		int numA = 0;
		// Este servira para hacer que el bucle funcione como nos pide
		int suma = 0;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Pide que introduzcas un numero
		System.out.println("Introduzca un numero: ");

		// Escanea el numero introducido
		numA = sc.nextInt();

		// Creamos el bucle
		while (numA >= 0) {
			
			// sumamos el numero anterior con el que acabamos de introducir
			suma = numA + suma;

			// Imprime la suma
			System.out.println(suma);

			// Vuelve a pedir un numero
			System.out.println("Introduzca un numero: ");

			// Vueleve a escanear el numero
			numA = sc.nextInt();
		}
		;
		// Imprime por panta el finalización del bucle
		System.out.println("Programa acabado");

		// cierre del scanner
		sc.close();

	}

}
