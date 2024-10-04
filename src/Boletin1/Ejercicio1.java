package Boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Valores 
		int num;
		
		//Creamos un nuevo scanner
		Scanner sc= new Scanner(System.in);
		
		//pide un numero
		System.out.println("Introduzca un numero");
		
		//Introduzca un numero
		num= sc.nextInt();
		
		//Si es par o impar 
		if (num%2==0) {
			System.out.println("Es par");
			
		}
		else {
			System.out.println("Es impar");
		}
		
		
		//Cerramos el scanner
		sc.close();
		

	}

}
