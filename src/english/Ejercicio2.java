package english;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables

		// This variable is used to enter the number
		int num = 0;
		
		int conter=0;

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Asks you to enter a number
		System.out.println("Enter a number: ");

		// Scan the entered number
		num = sc.nextInt();
		
		// We create the loop
		while (conter<=10) {
			
			
			System.out.println(conter+"*"+num+" = "+(conter*num));
			conter++;
		};
		sc.close();

	}

}
