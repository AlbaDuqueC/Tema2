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
				
		//nuevo scanner
		Scanner sc= new Scanner(System.in);
				
		//pide tres numeros 
		System.out.println("Introduzca tres numeros");
				
		//escanea los tres numeros introducidos 
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		//Calculo
		x1= (-a + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		x2=(-a - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
		//Imprime por pantalla 
		System.out.println(x1 +" y "+ x2);
		
		//cierre del scanner
		sc.close();

	}

}
