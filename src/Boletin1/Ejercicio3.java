package Boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Valores
		double a;
			
		//nuevo scanner
		Scanner sc= new Scanner(System.in);
				
		//pide un numero
		System.out.println("Introduzca dos numeros");
				
		//escanea un numero  
		a= sc.nextDouble();
				
		//Si esta en el interbalo de (-1,1) menos -1, 0 y 1 
		if (a<=-1 || a==0|| a>=1 ) {
			System.out.println("No es casi 0");
		}
		else {
			System.out.println("Si es casi 0");
		}
				
		//Cierre del scanner
		sc.close();


	}

}
