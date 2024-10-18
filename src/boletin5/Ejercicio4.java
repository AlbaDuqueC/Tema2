package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable

		//
		int num = 0;

		int conter = 0;

		//
		Scanner sc = new Scanner(System.in);

		//
		System.out.println("Introduzca un numero: ");

		//
		num = sc.nextInt();
		do {
			System.out.println(conter + "*" + num + " = " + (conter * num));
			conter++;
		} while (conter <= 10);

		sc.close();

	}

}
