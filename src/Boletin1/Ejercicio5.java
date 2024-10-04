package Boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Valores
		int a;
		int b;
		int c;
		
		//nuevo scanner
		Scanner sc= new Scanner(System.in);
		
		//pide tres numeros 
		System.out.println("Introduzca tres numeros");
		
		//escanea los tres numeros introducidos 
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		//Ordenar
		if (a>b && b>c) {
			System.out.println( a+", "+ b + ", "+ c);
			
		} else if ( a>c && c>b  ){
			System.out.println(a+", "+ c + ", "+ b);
			
			}else if ( b>a && a>c  ){
				System.out.println(b+", "+ a + ", "+ c);
				
			}else if ( b>c && c>a  ){
				System.out.println(b+", "+ c + ", "+ a);
				
			}else if ( c>a && a>b  ){
				System.out.println(c+", "+ a + ", "+ b);
				
			}else if ( c>b && b>a  ){
				System.out.println(c+", "+ b + ", "+ a);
				
			}else if ( a==b && b>c  ){
				System.out.println("a y b son iguales y c es menor");
				
			}else if ( a==b && b<c  ){
				System.out.println("a y b son iguales y c es mayor");
				
			}else if ( a==c && a>b  ){
				System.out.println("a y c son iguales y b es menor");
				
			}else if ( a==c && a<b  ){
				System.out.println("a y c son iguales y b es mayor");
				
			}else if ( c==b && b>a  ){
				System.out.println("c y b son iguales y a es menor");
				
			}else if ( c==b && b<a  ){
				System.out.println("c y b son iguales y a es mayor");
				
			}else {
			System.out.println("Es el mismo numero");
		}
		
		//Cierre del scanner
		sc.close();

	}

}
