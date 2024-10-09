package Boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
				double n;
				
				//Crea el scanner
				Scanner sc= new Scanner(System.in);
				
				//Pide un numero entre 0 y 10
				System.out.println(	"Introduzca tu nota (0-10): ");
				
				//escanea el numero intoducido
				n= sc.nextDouble();
				
				//Dependiendo de la nota ingresada te saldra el resultado correspondiente
				if(n<5) {
					
					System.out.println("INSUFICIENTE");
					
				}else if (n<6) {
					
					System.out.println("SUFICIENTE");
					
				}else if (n<7) {
					
					System.out.println("BIEN");
					
				}else if (n<9) {
					
					System.out.println("NOTABLE");
					
				}else if (n<=10) {
					
					System.out.println("SOBRESALIENTE");
					
				}else if (n>10) {
					
					System.out.println("Vuelve a introducir su nota correspondiente (0-10)");
				}  
				
				sc.close();

	}

}
