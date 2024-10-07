package Boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Valores
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double raiz;
		double dentro;
				
		//nuevo scanner
		Scanner sc= new Scanner(System.in);
				
		//pide tres numeros 
		System.out.println("Introduzca tres numeros");
				
		//escanea los tres numeros introducidos 
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		//Calculo
		dentro=(b*b)-(4*a*c);
		raiz= Math.sqrt(dentro);
		x1= (-a + raiz)/(2*a);
		x2=(-a - raiz)/(2*a);
		
		if (raiz==0) {
			System.out.println("Tiene solo una solución que es: " + x1);
		}else if(dentro<0){
			System.out.println("No hay solución");
		}
		
		//Imprime por pantalla 
		System.out.println(x1 +" y "+ x2);
		
		//cierre del scanner
		sc.close();

	}

}
