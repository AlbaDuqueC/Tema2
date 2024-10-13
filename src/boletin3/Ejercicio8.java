package boletin3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Valores
		String mes;
		int año;
		int dias;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas el año
		System.out.println(	"Introduzca el año: ");
		
		//escanea el numero introducida
		año= sc.nextInt();
		
		//Pide que introduzcas el mes
		System.out.println(	"Introduzca el mes: ");
		
		//escanea el numero introducida
		mes= sc.next();
		
		dias= switch (mes) {
		case "enero" ->{
			yield 31;
		}
		case "febrero" ->{
			yield 28;
		}
		case "marzo" ->{
			yield 31;
		}
		case "abril" ->{
			yield 30;
		}
		case "mayo" ->{
			yield 31;
		}
		case "junio" ->{
			yield 30;
		}
		case "julio" ->{
			yield 31;
		}
		case "agosto" ->{
			yield 31;
		}
		case "septiembre" ->{
			yield 30;
		}
		case "octubre" ->{
			yield 31;
		}
		case "noviembre" ->{
			yield 30;
		}
		case "diciembre" ->{
			yield 31;
		}
		default->{
			yield -1;
		}
		};
		
		if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
			if (mes=="febrero") {
				System.out.println(29 + " dias");
			}else {
				System.out.println(dias +" dias");
			}
		}else {
			System.out.println(dias + " dias");
		}
		//cierre del scanner
		sc.close();

	}

}
