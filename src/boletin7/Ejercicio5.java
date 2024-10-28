package boletin7;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable
		
		int num;
		int contador;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entre el 1 y el 20");
		num= sc.nextInt();
		
		while (num <=20 == false) {
			System.out.println("El numero introducido no es correcto, vuelva a introducir la hora");
			num = sc.nextInt();
		}
		
		for(int i=1; i<=num ; i++) {
			
			System.out.println();
			contador=1;
			
			for(int k = i; k >=contador; contador++) {
				System.out.print(k);
				
			}
			
			
		}
		
		sc.close();

	}

}
