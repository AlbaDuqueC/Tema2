package boletin3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variable
		double distancia;
		int dias;
		double precio1;
		double precioD;

		// Constante
		final double PRECIO_KILOMETRO = 2.5;
		final double DESCUENTO = 0.3;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Pide que introduzcas la distancia
		System.out.println("Introduzca la distancia: ");

		// escanea el numero introducida
		distancia = sc.nextInt();

		// Pide que introduzcas los dias
		System.out.println("Introduzca los dias: ");

		// escanea el numero introducida
		dias = sc.nextInt();

		// Calculo
		precio1 = distancia * PRECIO_KILOMETRO;
		precioD = precio1 - (precio1 * DESCUENTO);

		// Imprime cuanto te cuesta el billerte
		if (dias >= 7 && distancia >= 800) {
			System.out.println(precioD + "€");
		} else {
			System.out.println(precio1 + "€");
		}

		// cierre del scanner
		sc.close();

	}

}
