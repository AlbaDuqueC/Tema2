package boletin7;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables 
		int numA;
		int numB;
		int numMenor;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		numA= sc.nextInt();
		
		System.out.println("Introduzca un numero");
		numB= sc.nextInt();
		if(numA>numB) {
			numMenor=numB;
		}else {
			numMenor=numA;
		}
		for(; 1<=numMenor ; numMenor--) {
			if(numA%numMenor==0 && numB%numMenor==0) {
				System.out.println(numMenor);
				numMenor=1;
			}
			
		}
		sc.close();

	}

}
