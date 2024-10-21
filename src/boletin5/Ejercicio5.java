package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		
		int respuesta;
		int numRand;
		String masMenos;
		int max=101;
		int menor=1;

		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la respuesta: ");
		respuesta = sc.nextInt();
		
		
		do {
			Random rand = new Random();
			
			numRand = rand.nextInt(menor, max);
			
			System.out.println("¿Tu numero es "+numRand + "?");
			
			masMenos= sc.next();
			
			if (masMenos.equalsIgnoreCase("mayor")) {
				menor=numRand +1;
				
			}else if (masMenos.equalsIgnoreCase("menor")) {
				max=numRand;
				
			}else if (masMenos.equalsIgnoreCase("si")) {
				System.out.println(numRand + " Es correcto");
				
			}else {
				System.out.println("Codigo no valido");
			}
			
		}while (numRand != respuesta) ;
		System.out.println("Cierre del programa");
		
		
		sc.close();

	}

}
