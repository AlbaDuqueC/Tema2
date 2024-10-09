package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variables
		int dia;
				
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide un numero entre el 1 y el 7
		System.out.println(	"Introduzca un numero  (1-7): ");
		
		//escanea el numero intoducido
		dia= sc.nextInt();
		
		//creamos un swich para poder identificar el dia
		switch (dia) {
			case 1 ->
			System.out.println("LUNES");
			
			case 2->
			System.out.println("MARTES");
			
			case 3->
			System.out.println("MIERCOLES");
			
			case 4 ->
			System.out.println("JUEVES");
			
			case 5->
			System.out.println("VIERNES");
			
			case 6->
			System.out.println("SABADO");
			
			case 7->
			System.out.println("DOMINGO");
			
			default ->
			System.out.println("No es valido, vuelve a intentarlo");
		
		}
			
		//cierre del scanner
		sc.close();

	}

}
