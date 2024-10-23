package boletin6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		//Esta variable sirve para identificar el numero introducido
		int n;
		
		//Esta variable sirve como contador
		int contador=0;
		
		//va sumando los numeros introducidos
		int suma = 0;
		
		//Intoducen el resultado de la media
		double resultado;
		
		//Scanner
		Scanner sc= new Scanner (System.in);
		
		//Este sirve para que introduzcas diez numeros
		for (contador=0; contador<10; contador++) {
			
			//Pide por pantalla un numero
			System.out.println("Introduzca un numero:");
			
			//Escanea el numero introducido y se lo da al valor n
			n= sc.nextInt();
			
			//Suma todos los numeros introducidos
			suma=n + suma;
			
		}
		//Hace la media entre los 10 numero 
		resultado=((double) suma/contador);
		
		//Imprime por pantalla la media
		System.out.println("La media es: "+resultado);
				
		//Cierre del scanner
		sc.close();

	}

}
