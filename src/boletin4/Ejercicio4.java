package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		// Esta variable sirve para introducir el numero
		int numA = 0;

		// Esta variable sirve para ir sumando los numeros positivo
		int sumaPosit = 0;

		/* Esta variable sirve para contar cuantas veces a empezado el bucle y para 
		 * hacer que el bucle funcione como nos pide*/
		int contador = 0;

		// Esta variable sirve para ir sumando los numeros negativos
		int sumaNegativo = 0;

		// Esta variable sirve para contar cuantas veces a intoducido un numero negativo
		int contNegativo = 0;

		// Esta variable sirve para contar cuantas veces a intoducido 0
		int contCero = 0;

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos el bucle
		while (contador <= 10) {

			// Pide que introduzcas un numero
			System.out.println("Introduzca un numero: ");

			// Escanea el numero introducido
			numA = sc.nextInt();

			// Este if sirve para separar los numeros positivos, de los negativos y los
			// ceros
			if (numA > 0) {
				// Suma los posirtivos
				sumaPosit = numA + sumaPosit;

			} else if (numA < 0) {
				// Media de los negativos
				sumaNegativo = numA + sumaNegativo;
				contNegativo++;
			} else {
				// Contadore de los ceros
				contCero++;
			}

			// Cuenta cada vez que empieza el bucle
			contador++;
		}
		;

		// Imprime por pantalla el la suma de los numeros positivos
		System.out.println("La suma de los numeros positivos es " + sumaPosit);

		// Imprime por pantalla la media de los numeros negativos
		System.out.println(sumaNegativo == 0 ? "No hay numeros negativos"
				: "La media de los numeros negativos es " + ((double) (sumaNegativo / contNegativo)));

		// Imprime por pantalla cuantas veces has intoducido 0
		System.out.println("La cantidad de ceros introducidos es " + contCero);

		// cierre del scanner
		sc.close();

	}

}
