package boletin5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Variables
		int numA;
		int numB;
		String tirada1;
		String tirada2;
		String salir;
		
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Si no introduces Si, sigue el bucle
		do {
		//Pide que introduzcas dos numeros
		System.out.println(	"¿Cuantos has sacado en cada dado? ");
		
		//escanea el numero intoducido
		tirada1= sc.next();
		tirada2= sc.next();
		
		//creamos un swich para poder identificar el dia
		numA = switch (tirada1) {
			case "UNO" ->{
				yield 1;
			}
			case "DOS" ->{
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}
			case "CUATRO" ->{
				yield 4;
			}
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
			default ->{
				System.out.println("Vuelva a introducir el numero");
				yield -1;
			}
			
			
		};
		
		numB = switch (tirada2) {
			case "UNO" ->{
				yield 1;
			}
			case "DOS" ->{
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}
			case "CUATRO" ->{
				yield 4;
			}
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
			default ->{
				System.out.println("Vuelva a introducir el numero");
				yield -1;
			}
			
			
		};
		System.out.println(numA+numB);
		
		//Salir o no
		System.out.println("¿Quieres salir?");
		salir= sc.next();
		
		}while(salir.equalsIgnoreCase("SI")==false);
		
		System.out.println("Salistes del bucle");
		
		sc.close();

	}

}
