package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables		
		String categoria;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas una categoria 
		System.out.println(	"Introduce la letra del carnet de conducir: ");
		
		//escanea la categoria introducida
		categoria= sc.next();
		
		//creamos un switch para poder identificar la categoria
		switch (categoria) {
			case "E" ->
			System.out.println("remolques");
			
			case "D"->
			System.out.println("autobuses");
			
			case "C1-C5"->
			System.out.println("camiones");
			
			case "A" ->
			System.out.println("motocicletas");
			
			case "B1-B2" ->
			System.out.println("automóviles");
			
			default ->
			System.out.println("Categoría no contemplada");
		}
		//cierre del scanner
		sc.close();
		
		
				
				

	}

}
