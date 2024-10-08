package Boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
				//Valores
				int a;
				int b;
				
				//nuevo scanner
				Scanner sc= new Scanner(System.in);
				
				//pide dos numeros 
				System.out.println("Introduzca dos numeros");
				
				//escanea los dos numeros introducidos 
				a= sc.nextInt();
				b= sc.nextInt();
				
				//Ordenar
				if (a>b ) {
					System.out.println( a+", "+ b);
				} else if ( a<b ){
					System.out.println(b + ", "+ a);
				}else {
					System.out.println("Es el mismo numero");
				}
				
				//Cierre del scanner
				sc.close();


	}

}
