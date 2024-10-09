package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		double numA;
		double numB;
		String eleccion;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas dos numeros
		System.out.println(	"Introduce dos numeros: ");
		
		//escanea el numero intoducido
		numA= sc.nextInt();
		numB= sc.nextInt();
		
		//Pide que elijas de A a D
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("B.RESTAR LOS NÚMEROS");
		System.out.println("C.MULTIPLICAR LOS NÚMEROS");
		System.out.println("D.DIVIDIR LOS NÚMEROS");
		
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
		}
		//cierre del scanner
		sc.close();
		

	}

}
