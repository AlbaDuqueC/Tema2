package english;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		int answer;
		int numRand = rand.nextInt(1,101) ;

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Asks you to enter a number
		System.out.println("Enter a number: ");

		// Scan the entered number
		answer = sc.nextInt();
		
		while ( numRand != answer) {
			if(answer<numRand) {
				System.out.println("is less");
			}
			if(answer>numRand) {
				System.out.println("is greater");
			}
			// Asks you to enter a number
			System.out.println("Enter a number: ");

			// Scan the entered number
			answer = sc.nextInt();
		}
		System.out.println("You were right, the number was " + numRand);

	}

}
