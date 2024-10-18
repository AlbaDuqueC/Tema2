package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		
		int respuesta;
		int numRand;

		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la respuesta: ");
		respuesta = sc.nextInt();
		
		
		do {
			Random rand = new Random();
			numRand = rand.nextInt(1, 101);
			System.out.println("¿Tu numero es "+numRand + "?");
			
		}while (numRand != respuesta) ;
		System.out.println(numRand + " Es correcto");
		
		sc.close();

	}

}
