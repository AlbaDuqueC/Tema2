package Boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//HAY QUE CORREGIRLO
		
		//Variables
		String jugador1;
		String jugador2;
		
		
		
		//creamos el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzca tu elección (piedra, papel o tijera)
		System.out.println("¿Pieda papel o tijera?");
		
		System.out.println("Jugador 1");
		jugador1= sc.nextLine();
		
		System.out.println("Jugador 2");
		jugador2= sc.nextLine();
		
		//Dependiendo lo que se haya escogido pondra una respuesta o otra
		if (jugador1.equalsIgnoreCase("PIEDRA") && jugador2.equalsIgnoreCase("PIEDRA")){
			System.out.println("Empate");
			
		}else if(jugador1.equalsIgnoreCase("PIEDRA") && jugador2.equalsIgnoreCase("PAPEL")){
			System.out.println("Gana: Jugador 2");
			
		}else if(jugador1.equalsIgnoreCase("PIEDRA") && jugador2.equalsIgnoreCase("TIJERAS")){
			System.out.println("Gana: Jugador 1");
			
		}else if(jugador1.equalsIgnoreCase("PAPEL") && jugador2.equalsIgnoreCase("PIEDRA")){
			System.out.println("Gana: Jugador 1");
			
		}else if(jugador1.equalsIgnoreCase("PAPEL") && jugador2.equalsIgnoreCase("PAPEL")){
			System.out.println("Empate");
			
		}else if(jugador1.equalsIgnoreCase("PAPEL") && jugador2.equalsIgnoreCase("TIJERAS")){
			System.out.println("Gana: Jugador 2");
			
		}else if(jugador1.equalsIgnoreCase("TIJERAS") && jugador2.equalsIgnoreCase("PIEDRA")){
			System.out.println("Gana: Jugador 2");
			
		}else if(jugador1.equalsIgnoreCase("TIJERAS") && jugador2.equalsIgnoreCase("PAPEL")){
			System.out.println("Gana: Jugador 1");
			
		}else if(jugador1.equalsIgnoreCase("TIJERAS") && jugador2.equalsIgnoreCase("TIJERAS")){
			System.out.println("Empate");
			
		}
		sc.close();

	}

}
