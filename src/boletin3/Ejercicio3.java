package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables
		int numA;
		int numLetra;
		String letra;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Pide que introduzcas un numero de 8 digitos
		System.out.println("Introduzca un numero de 8 digitos: ");

		// escanea el numero introducida
		numA = sc.nextInt();

		// calculamos el numero de la letra
		numLetra = numA % 23;

		// usamos el switch para saber que letra es la que corresponde
		letra = switch (numLetra) {
		case 0 -> {
			yield "T";
		}
		case 1 -> {
			yield "R";
		}
		case 2 -> {
			yield "W";
		}
		case 3 -> {
			yield "A";
		}
		case 4 -> {
			yield "G";
		}
		case 5 -> {
			yield "M";
		}
		case 6 -> {
			yield "Y";
		}
		case 7 -> {
			yield "F";
		}
		case 8 -> {
			yield "P";
		}
		case 9 -> {
			yield "D";
		}
		case 10 -> {
			yield "X";
		}
		case 11 -> {
			yield "B";
		}
		case 12 -> {
			yield "N";
		}
		case 13 -> {
			yield "J";
		}
		case 14 -> {
			yield "Z";
		}
		case 15 -> {
			yield "S";
		}
		case 16 -> {
			yield "Q";
		}
		case 17 -> {
			yield "V";
		}
		case 18 -> {
			yield "H";
		}
		case 19 -> {
			yield "L";
		}
		case 20 -> {
			yield "C";
		}
		case 21 -> {
			yield "K";
		}
		case 22 -> {
			yield "E";
		}
		default -> {
			System.out.println("Vuelva a introducir el numero");
			yield "NO SIRVE";
		}

		};
		// Imprime por pantalla el numero del DNI mas su letra correspondiente
		if (numA < 100000000) {
			System.out.println(numA + "" + letra);
		} else if (numA > 100000000) {
			System.out.println("Numero incorrecto, vuelva a introducir el numero");
		}

		// cerramos el scanner
		sc.close();

	}

}
