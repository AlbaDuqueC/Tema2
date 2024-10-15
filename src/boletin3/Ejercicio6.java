package boletin3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Valores
		int h;
		int min;
		int seg;
		int seg1;
		int min1;
		int h1;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Pide que introduzcas las horas
		System.out.println("Introduzca la hora: ");

		// escanea el numero introducida
		h = sc.nextInt();

		// Pide que introduzcas los minutos
		System.out.println("Introduzca los minutos: ");

		// escanea el numero introducida
		min = sc.nextInt();

		// Pide que introduzcas los segundos
		System.out.println("Introduzca los segundos: ");

		// escanea el numero introducida
		seg = sc.nextInt();

		seg1 = seg + 1;
		min1 = min + 1;
		h1 = h + 1;

		// calcula la hora
		if (seg1 >= 60) {

			if (min1 >= 60) {

				System.out.println(h1 + ":" + (min1 - 60) + ":" + (min1 - 60));
			} else if (min < 60) {
				System.out.println(h + ":" + min1 + ":" + (seg1 - 60));
			}
		} else if (seg1 < 60) {
			System.out.println(h + ":" + min + ":" + seg1);
		}

		// cierre del scanner
		sc.close();

	}

}
