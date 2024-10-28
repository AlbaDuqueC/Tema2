package boletin7;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
		int num;
		int num2;
		int contador=0;
		int fallos=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num= sc.nextInt();
		
		do {
			System.out.println("Introduce un numero");
			num2= sc.nextInt();
			
			if(num2>=num){			
				contador++;			
			}
			else if(num2<num) {				
				fallos++;			
			}
			
		}while (num2!=0 );
			
		System.out.println("total de números introducidos: " + contador);
		System.out.println("total de números fallados: " + fallos);

	}

}
