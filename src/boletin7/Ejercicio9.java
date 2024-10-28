package boletin7;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Variables
		int num;
		int resultado;
		int cifra=1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero y te dira cuantos digitos tiene:");
		num = sc.nextInt();
		
		resultado=num;
		
		while(resultado>9) {
			resultado=resultado/10;
			cifra++;
			
		}
		System.out.println("Tiene "+ cifra +" cifras" );
		
		
		
		

	}

}
