package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		// Esta variable sirve para identificar el numero introducido
		int num;

		// va multiplica los numeros
		int factoria = 1;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pide por pantalla un numero
		System.out.println("Introduzca un numero:");

		// Escanea el numero introducido y se lo da al valor n
		num = sc.nextInt();

		// Este sirve para que vya multiplicando n hasta llegar a 1
		for (int i=num; i >= 1; i--) {

			// Calcula la factoria
			factoria = i * factoria;
		}
		
		// Imprime por pantalla la factoria
		System.out.println(num+"! = " + factoria);

		// Cierre del scanner
		sc.close();

	}

}
