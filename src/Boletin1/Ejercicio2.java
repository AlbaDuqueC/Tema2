package Boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Valores
		int a;
		int b;
		
		//nuevo scanner
		Scanner sc= new Scanner(System.in);
		
		//pide dos numeros 
		System.out.println("Introduzca dos numeros");
		
		//escanea los dos numeros introducidos 
		a= sc.nextInt();
		b= sc.nextInt();
		
		//Si los dos numeros son lo mismo o no 
		if ( a==b) {
			System.out.println("Son el mismo numero");
		}
		else {
			System.out.println("No son el mismo numero");
		}
		
		//Cierre del scanner
		sc.close();

	}

}
