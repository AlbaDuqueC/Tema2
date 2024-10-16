package boletin4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int altura;
		int altMax;
		
		Scanner sc= new Scanner(System.in);
		
		//pedimos la altura al usuario
		System.out.println("Introduce la altura");
		altura= sc.nextInt();
		altMax=altura;
		
		while (altura !=-1){
			
			if (altura>altMax) {
				altMax= altura;
			}
			
			//pedimos la altura al usuario
			System.out.println("Introduce la altura");
			altura= sc.nextInt();
			
		};
		System.out.println(altMax);
		
		sc.close();

	}

}
