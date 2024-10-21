package boletin5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//VARIABLES
		
		//Esta variable sirve para escanear el primer numero
		double numA;
		
		//Esta variable sirve para escanear el segundo numero
		double numB;
		
		//Esta variable sirve para identificar la opcion deseada
		String eleccion;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//si no introduces la opción E no saldra en el bucle
		do {
		//Pide que introduzcas dos numeros
		System.out.println(	"Introduce dos numeros: ");
		
		//escanea el numero intoducido
		numA= sc.nextInt();
		numB= sc.nextInt();
		
		//Pide que elijas de A a E
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("B.RESTAR LOS NÚMEROS");
		System.out.println("C.MULTIPLICAR LOS NÚMEROS");
		System.out.println("D.DIVIDIR LOS NÚMEROS");
		System.out.println("E.SALIR");
		
		eleccion= sc.next();
		
		//creamos un swich para poder identificar el dia
		switch (eleccion) {
			case "A" ->
			System.out.println(numA + numB);
			
			case "B"->
			System.out.println(numA-numB);
			
			case "C"->
			System.out.println(numA*numB);
			
			case "D" ->
			System.out.println(numA/numB);
			
			case "E" ->
			System.out.println("");
			
			default->
			System.out.println("Opción no valida");
			
		}
		}while (eleccion.equalsIgnoreCase("E")== false);
		
		//Imprime que termina el programa
		System.out.println("Programa terminado");
		
		//cierre del scanner
		sc.close();
		

	}

}
