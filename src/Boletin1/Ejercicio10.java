package Boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Valores
		int numA;
		int numB;
		int numC;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
				
		//Pide tres numeros
		System.out.println(	"Introduzca tres numeros enteros: ");
		
		//escanea el numero intoducido
		numA= sc.nextInt();
		numB= sc.nextInt();
		numC= sc.nextInt();
		
		//Verificamos si alguno es la suma de los otros dos numeros o no
		if(numA==numB+numC) {
			System.out.println(numA+ " es la suma de " + numB + " mas " + numC);
			
		}else if (numB==numA+numC) {
			System.out.println(numB+ " es la suma de " + numA + " mas " + numC);
			
		}else if (numC==numA+numB) {
			System.out.println(numC+ " es la suma de " + numA + " mas " + numB);
			
		}else 
			System.out.println("Ninguno es la suma del otro");
		
		//cierre del scanner
		sc.close();

	}

}
