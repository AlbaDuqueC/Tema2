package boletin7;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables

		// Esta variable sirve para escanear el numero introducido
		int num;

		// La variable sirve para comprar el numero anterior con el nuevo introducido
		int num2;

		// Cuenta las veces que has introducido bien el numero
		int contador = 0;

		// Cuenta las veces que has fallado
		int fallos = 0;

		// Abrir Scanner
		Scanner sc = new Scanner(System.in);

		// Pide el numero
		System.out.println("Introduce un numero");

		// Escanea el numero
		num = sc.nextInt();

		// Cuenta si has fallado o no
		do {
			System.out.println("Introduce un numero");
			num2 = sc.nextInt();

			if (num2 >= num) {
				contador++;
			} else if (num2 < num) {
				fallos++;
			}

		} while (num2 != 0);

		// Imprime por pantalla cuantos haciertos has tenido
		System.out.println("total de números introducidos: " + contador);

		// Imprime por pantalla cuantos errores has tenido
		System.out.println("total de números fallados: " + fallos);

		// Cierre del scanner
		sc.close();

	}

}
