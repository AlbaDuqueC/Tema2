package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		//Esta variable sirve para identificar el numero introducido
		int n;
		
		//Scanner
		Scanner sc= new Scanner (System.in);
		
		//Pide por pantalla un numero
		System.out.println("Introduzca un numero:");
		
		//Escanea el numero introducido y se lo da al valor n
		n= sc.nextInt();
		
		//Este sirve para que i se imprima hasta llegar al numero n
		for (int i=1; n>=i; i++) {
			System.out.println(i);
		}
				
		//Cierre del scanner
		sc.close();

	}

}
