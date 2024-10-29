package boletin7;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable

		// Es la vaariable del numero introducido
		int num;

		// El resto sirve para sacar el ultimo numero
		int resto;

		// El resultado de invertir el numero
		int invertido = 0;

		// Variable que dice si es capicua o no
		int capicua;

		// Abrir scanner
		Scanner sc = new Scanner(System.in);

		// Introduce y escanea un numero mayor que 0
		do {
			System.out.println("Introduce un numero");
			num = sc.nextInt();
		} while (num < 0);

		// Cambia la variable
		capicua = num;

		// Hace el inverso del numero introducido
		while (num > 0) {
			resto = num % 10;
			invertido = invertido * 10 + resto;
			num /= 10;
		}

		// Dice pr pantalla cual es el numero inverso
		System.out.println("Número invertido: " + invertido);

		// Dice si es capicua o no
		if (capicua == invertido) {
			System.out.println("Es capicua");

		} else if (capicua != invertido) {
			System.out.println("No es capicua");
		}

		// Cierre del scanner
		sc.close();

	}

}
