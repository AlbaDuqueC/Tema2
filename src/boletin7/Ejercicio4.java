package boletin7;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		int numA;
		int numB;
		int numMenor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		numA = sc.nextInt();

		System.out.println("Introduzca un numero");
		numB = sc.nextInt();
		if (numA > numB) {
			numMenor = numB;
		} else {
			numMenor = numA;
		}
		for (int i = 2; i >= 2 && i <= numMenor; i++) {

			if (i >= numMenor) {
				System.out.println("Lo numeros no compraten ningun multiplo");
			}

			if (numA % i == 0 && numB % i == 0) {
				System.out.println(i);
				i = ++numMenor;
			}

		}
		sc.close();

	}

}
