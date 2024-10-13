package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Valores
		Random rand1= new Random ();
		Random rand2= new Random ();
		int respuesta;
		int solucion;
		
		//creamos los valores numericos randoms
		int num1= rand1.nextInt(100)+1;
		int num2=rand2.nextInt(100)+1;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Imprime por pantalla un calculo a realizar
		System.out.println(	num1 +"+"+ num2 + "=" );
		
		//escanea el numero introducida
		respuesta= sc.nextInt();

		solucion= num1 + num2;
		
		//Si la respuesta es correcta o no
		if (respuesta==solucion) {
			System.out.println("La respuesta es correcta");
			
		}else if (respuesta!=solucion) {
			System.out.println("La respuesta es erronea");
		}
		
		//cierre del scanner
		sc.close();

	

	
	}

	

	
		
	

}
