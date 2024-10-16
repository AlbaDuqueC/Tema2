package english;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables

		// This variable is used to enter the number
		int num = 0;

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Asks you to enter a number
		System.out.println("Enter a number: ");

		// Scan the entered number
		num = sc.nextInt();

		// We create the loop
		while (num >= 0) {

			if (num % 2 == 0) {
				System.out.println("Pair");
			} else {
				System.out.println("Odd");
			}

			// Asks you to enter a number
			System.out.println("Enter a number: ");

			// Scan the entered number
			num = sc.nextInt();
		}
		;
		// Print the end of the loop on the screen
		System.out.println("Finished program");

		// Scanner closure
		sc.close();

	}

}
