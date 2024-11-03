package boletin8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		// Contiene el valor introducido en el scanner
		int lado=0;
		boolean error= true;

		// Abrir scanner
		Scanner sc = new Scanner(System.in);
		
		
		do {
		try {
			// Pide por pantalla la dimension del lado
		System.out.println("Introduce las dimensiones del lado");

		// Escanea el valor introducido
		lado = sc.nextInt();
		error= true;
		assert lado >=0 : "Tiene que ser un numero positivo";
		}catch (InputMismatchException e) {
			System.err.println("No pongas letras");
			sc.nextLine();
			error=false;
			
		}catch (AssertionError e) {
			System.err.println(e);
			error=false;
		}
		
		finally {
			System.out.println("");
			
		}
		}while(error==false);
		
		
		

		// Crea el cuadrado con las dimensiones introducidas
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {

				if (i == 1 || i == lado || j == 1 || j == lado) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

		// Cierre del scanner
		sc.close();

	}

}
