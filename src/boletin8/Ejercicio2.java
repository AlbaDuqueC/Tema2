package boletin8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*El ejercicio conta de introducir un numero y que te diga */
		
		//Variables
		int num=0;
		
		Boolean error=true;
		
		Scanner sc= new Scanner (System.in);
		
		/*Este bucle servirá para mostrar por pantalla si tiene un error y 
		 * voler a introducir lo pedido por pantalla para que se haga lo 
		 * que pide el ejercicio*/
		do {
			try {
				System.out.println("Ingresa un numero");
				
				num=sc.nextInt();
				
				assert num>=0 : "Tiene que ser un numero positivo";
				
			}catch (InputMismatchException e) {
				
				System.out.println("No son validas las letras");
				
				sc.nextLine();
				
				error=false;
				
			}catch (AssertionError e) {
				
				System.out.println(e);
				
				error=false;
			}
			
		}while(error=false);

	}

}
