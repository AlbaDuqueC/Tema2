package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int nota;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide un numero entre 0 y el 10
		System.out.println(	"Introduzca tu nota (0-10): ");
		
		//escanea el numero intoducido
		nota= sc.nextInt();
		
		//creamos un swich para poder identificar la nota
		switch (nota) {
			case 0, 1, 2, 3, 4 ->
			System.out.println("INSUFICIENTE");
			
			case 5->
			System.out.println("SUFICIENTE");
			
			case 6->
			System.out.println("BIEN");
			
			case 7, 8 ->
			System.out.println("NOTABLE");
			
			case 9, 10->
			System.out.println("SOBRESALIENTE");
			
			default ->
			System.out.println("Nota incorrecta, vuelve a intentarlo");
		
		}
			
		//cierre del scanner
		sc.close();

	}

}
