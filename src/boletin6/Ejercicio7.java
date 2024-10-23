package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		// Esta variable sirve para identificar el numero introducido
		int num;

		//variable que te dice si es primo o no
		boolean primo = false;

		// Scanner
		Scanner sc = new Scanner(System.in);

		//Pide que introduzcas un numero
		System.out.println("Introduzca un numero:");

		//Escanea un numero
		num = sc.nextInt();

		// Te calcula si es primo o no
		for (int i = 2; i < num; i++) {

			// Si es pimo el resultado tiene que ser 0
			if ((double)(num%i) == 0) {
				primo = true;
			}
		}
		//Te dice si es primo o no
		System.out.println(primo == true ? "Es primo" : "No es primo");

		//Cierre del scanner
		sc.close();

	}

}
