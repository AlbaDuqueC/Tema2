package boletin7;

import java.util.Scanner;

public class Ejercicio1_2 {

	public static void main(String[] args) {
		// Valores
		int hora;
		int min;
		int seg;
		int segIn;
		int segFin;
		int horaFin;
		int minFin;
		String resultado = "";

		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la hora");
		hora = sc.nextInt();

		while (hora < 24 == false) {
			System.out.println("El numero introducido no es correcto, vuelva a introducir la hora");
			hora = sc.nextInt();
		}

		System.out.println("Introduce los minutos");
		min = sc.nextInt();

		while (min < 60 == false) {
			System.out.println("El numero introducido no es correcto, vuelva a introducir los minutos");
			min = sc.nextInt();
		}

		System.out.println("Introduce los segundos");
		seg = sc.nextInt();

		while (seg < 60 == false) {
			System.out.println("El numero introducido no es correcto, vuelva a introducir los segundos");
			seg = sc.nextInt();
		}

		System.out.println("Introduce los segundos para incrementar");
		segIn = sc.nextInt();

		segFin = seg + segIn;
		minFin = min;
		horaFin = hora;

		for (int i = 1; segFin >= 60; segFin -= 60) {

			minFin = min + i;

			for (int j = 1; minFin >= 60; minFin -= 60) {

				horaFin = hora + j;

				for (; horaFin >= 24; horaFin -= 24) {

				}
			}
		}

		resultado += (horaFin < 10 ? "0" : "") + horaFin + ":";
		resultado += (minFin < 10 ? "0" : "") + minFin + ":";
		resultado += (segFin < 10 ? "0" : "") + segFin + ":";

		System.out.println(resultado);

		// Cierre del scanner
		sc.close();
	}

}
