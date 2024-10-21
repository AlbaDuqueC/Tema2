package boletin5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variables
		
		//Esta variable sirve para identificar la eleccion del jugador1
		String jugador1;
		
		//Esta variable sirve para identificar la eleccion del jugador2
		String jugador2;
		
		////Esta variable sirve para saber si quieres seguir jugando o no 
		String repetirONo;
		
		
		
		//creamos el scanner
		Scanner sc= new Scanner(System.in);
		
	
		/*Este bucle se seguira repitiendo si insertas una S*/
		do {
			jugador1="";
			jugador2="";
			
			//Pide que introduzca tu elección (piedra, papel o tijera)
			System.out.println("¿Piedra, papel o tijera?");
			
			/*Este bucle se seguira repitiendo hasta que introduzcas pieda, papel o tijera*/
			while((jugador1.equalsIgnoreCase("tijeras") || jugador1.equalsIgnoreCase("papel") || jugador1.equalsIgnoreCase("piedra")) == false) {
				System.out.println("Jugador 1");
				jugador1= sc.next();
			}
			/*Este bucle se seguira repitiendo hasta que introduzcas pieda, papel o tijera*/
			while((jugador2.equalsIgnoreCase("tijeras") || jugador2.equalsIgnoreCase("papel") || jugador2.equalsIgnoreCase("piedra")) == false) {
			System.out.println("Jugador 2");
			jugador2= sc.next();
			}
			
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
			
			System.out.println("¿Quieres volever a jugar?");
			repetirONo= sc.next();
		}while (repetirONo.equalsIgnoreCase("S"));
		
		//CIERRE DEL SCANNER
		sc.close();

	}

}
