package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Valores
		int numA;
		int numSInv;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas un numero
		System.out.println(	"Introduzca un numero: ");
		
		//escanea el numero introducida
		numA= sc.nextInt();
		
		//Calcula el valor entero del numero introducido
		if (numA<0) {
			numSInv= -1 * numA;
			System.out.println(numSInv);
		}else if (numA>=0) {
			System.out.println(numA);
			
		}
		
		//cierre del scanner
		sc.close();

	}

}
