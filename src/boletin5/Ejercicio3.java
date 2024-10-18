package boletin5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables

		// La Variable n sirve para poner el valor maximo que hay que llego
		int n;

		// Esta es la variable que se irá sumando
		int a = 1;

		// Variable del resultado final
		int resultado = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// Te pide por pantalla un numero
		System.out.println("Introduzca un numero");

		// Te escanea el numero introducido
		n = sc.nextInt();

		/*
		 * Para que este ejercicio funcione, tendremos que crear este comando el cual
		 * consiste en la suma de la variable a al resultado constantemente hasta llegar
		 * al numero pedido
		 */
		do {
			resultado += a;
			a++;
		} while (a <= n);

		// Imprime por pantalla el resultado
		System.out.println(resultado);

		// Cierre del scanner
		sc.close();

	}

}
