package boletin7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for (int k = i; k > 0; k--) {
				System.out.print(k);
			}
			System.out.println();

		}

		sc.close();

	}

}
