package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*En este ejercicio tenemos que hacer un codigo que diga si un numero es capicual o no.
		 * Para ello tendre que utilizar if y switch*/
		
		//Variables
		int numA;
		int resto1;
		int resto2;
		int resto3;
		int resto4;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas un numero entre 0 y 9999
		System.out.println(	"Introduzca un numero entre el 0 y el 9999: ");
		
		//escanea el numero introducida
		numA= sc.nextInt();
		
		resto1= (numA%10);
		resto2= (numA/10)%10;
		resto3=(numA/100)%10;
		resto4=(numA/1000)%10;
		
		if (numA<10) {			
			System.out.println(numA +" es capicua");
			
		}else if(numA<100) {			
			if (resto1==resto2) {
				System.out.println(numA + " es capicua");
				
			}else if (resto1!=resto2) {
				System.out.println("no es capicua");
			}
			
		}else if(numA<1000) {			
			if(resto1==resto3) {
				System.out.println(numA +" es capicua");
				
			}else if(resto1!=resto3) {
				System.out.println("no es capicua");
			}
			
		}else if(numA<10000) {			
			if(resto1==resto4 && resto2==resto3) {
				System.out.println(numA +" es capicua");
				
			}else if(resto1!=resto4 && resto2!=resto3) {
				System.out.println("no es capicua");
				
			}else if(resto1==resto4 && resto2!=resto3) {
				System.out.println("no es capicua");
				
			}else if(resto1!=resto4 && resto2==resto3) {
				System.out.println("no es capicua");
			}
			
		}
		sc.close();

	}

}
