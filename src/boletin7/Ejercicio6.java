package boletin7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			
			for ( int j= 0; j<num - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <i ; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}

		sc.close();

	}

}
