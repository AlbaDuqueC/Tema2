package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//CORREGIR
		
		//Variables
		int numA;
		int numB;
		String tirada1;
		String tirada2;
		
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
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
		
		numB = switch (tirada1) {
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
		
		sc.close();

	}

}
