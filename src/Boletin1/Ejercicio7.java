package Boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		int n;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide un numero entre 0 y 99999
		System.out.println(	"Introduzca un numero entre el 0 y 99999: ");
		
		//escanea el numero intoducido
		n= sc.nextInt();
		
		
		//Imprime por pantalla cuantas cifras tiene dependiendo del numero introducido
		if (n<10) {
			
			System.out.println("Tiene solo una cifra");
		}else if (n<100) {
			
			System.out.println("Tiene dos cifra");
		}else if (n<1000) {
			
			System.out.println("Tiene tres cifra");
		}else if (n<10000) {
			
			System.out.println("Tiene cuatro cifra");
		}else if (n<100000) {
			
			System.out.println("Tiene cinco cifra");
		}else if (n>=100000) {
			
			System.out.println("Se pide un numero entre 0 y 99999, vuelva a introducir el numero");
		}
		
		//Cierre del scanner
		sc.close();

	}

}
