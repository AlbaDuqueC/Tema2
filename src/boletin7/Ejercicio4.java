package boletin7;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		
		// Esta variale se usa para escanear el primer numero introducido
		int numA;
		
		// Esta variale se usa para escanear el segundo numero introducido
		int numB;
		
		/* Esta variable se usa para identificar cual de las dos variables anteriores es
		 menor*/
		int numMenor;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Pide un numero por pantalla
		System.out.println("Introduzca un numero");
		
		// Escanea el numero
		numA = sc.nextInt();

		// Pide otro numero por pantalla
		System.out.println("Introduzca un numero");
		
		// Escanea el numero
		numB = sc.nextInt();
		
		// Comprobamos cual de los dos es el menor
		if (numA > numB) {
			numMenor = numB;
		} else {
			numMenor = numA;
		}
		//Calcula el minimo comun multiplo
		for (int i = 2; i >= 2 && i <= numMenor; i++) {

			if (i >= numMenor) {
				System.out.println("Lo numeros no compraten ningun multiplo");
			}

			if (numA % i == 0 && numB % i == 0) {
				System.out.println(i);
				i = ++numMenor;
			}

		}
		//Cierre del scanner
		sc.close();

	}

}
