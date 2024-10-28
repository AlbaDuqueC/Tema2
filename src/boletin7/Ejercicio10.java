package boletin7;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable
		int num;
		int resto;
		int invertido=0;
		int capicua;
		
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("Introduce un numero mayor");
		num= sc.nextInt();
		}while(num<0);
		
		capicua=num;
		
		while (num > 0) {
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }

        System.out.println("Número invertido: " + invertido);
		
        if (capicua == invertido) {
        	System.out.println("Es capicua");
        	
        } else if(capicua!= invertido) {
        	System.out.println("No es capicua");
        }
        
        sc.close();

	}

}
