package english;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable

		double height;
		double heightMax;
		double heightMin;

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Asks you to enter a height
		System.out.println("Enter a height: ");

		// Scan the entered height
		height = sc.nextDouble();
		
		heightMax = height;
		heightMin = height;
		
		while (height > 0) {

			if (height > heightMax) {
				heightMax = height;
			}
			if (height < heightMin) {
				heightMin = height;
			}
			// Asks you to enter a height
			System.out.println("Enter a height: ");

			// Scan the entered height
			height = sc.nextDouble();

		}
		;

		if (height == 0) {
			System.out.println("Re-enter the height");
		} 
			System.out.println("Maximum height: " + heightMax);
			System.out.println("Minimum height: " + heightMin);

		
		sc.close();
	}

}
