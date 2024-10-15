package boletin4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables

		// Esta variable sirve para introducir el numero
		int numA = 0;
		
		int contador=0;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos el bucle
		while (numA >= 0) {
			// Pide que introduzcas un numero
			System.out.println("Introduzca un numero: ");

			// Escanea el numero introducido
			numA = sc.nextInt();
			
			//cuent cada vez que empieza el bucle
			contador++;

		}
		;
		// Imprime por pantalla el numero de veces que has introducido
		System.out.println("Has introducido "+ contador + " veces");

		// cierre del scanner
		sc.close();

	}

}
