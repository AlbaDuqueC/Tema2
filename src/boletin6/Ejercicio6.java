package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable 
		//variable que escanea las notas
		int nota;
		//variable que te dice si hay un suspenso o no
		boolean suspenso= false;
		
		//Scanner
		Scanner sc= new Scanner(System.in);
		
		//Introduce 5 notas y te dice si hay algun suspenso o no
		for( int i=1; i<=5;i++){
			
			System.out.println("Introduzca una nota:");
			
			nota= sc.nextInt();
			
			//Si es menor de 5 esta suspenso
			if (nota<5) {
				suspenso= true;
			}
		}
		//Imprime por pantalla si hay un suspenso o no 
		System.out.println(suspenso== true ? "hay un suspenso": "No hay un suspenso");
		
		//Cierre del scanner
		sc.close();

	}

}
