package boletin7;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Variables

		// Numero introducido
		int num;

		// Variable que cambia
		int resultado;

		// Contdor de cifras
		int cifra = 1;

		// abrir el scanner
		Scanner sc = new Scanner(System.in);

		// Pide un numero por pantalla
		System.out.println("Introduce un numero y te dira cuantos digitos tiene:");

		// Escanea el numero introducido
		num = sc.nextInt();

		resultado = num;

		// Cuenta cuantas cifras tiene
		while (resultado > 9) {
			resultado = resultado / 10;
			cifra++;

		}

		// Imprime cuantas cifras tiene el numero anteriormente introducido
		System.out.println("Tiene " + cifra + " cifras");

		// Cierre del scanner
		sc.close();

	}

}
