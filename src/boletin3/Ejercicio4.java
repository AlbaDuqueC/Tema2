package boletin3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		int numA;
		int numPrimero;
		String numLetra1;
		String numLetra2;
		String numLetraCero;
		
		//Crea el scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas un numero entre el 1 y el 99
		System.out.println(	"Introduzca un numero entre el 1 y el 99: ");
		
		//escanea el numero introducida
		numA= sc.nextInt();
		
		//calculamos el primer digito
		numPrimero=numA%10;
		
		
		//usamos el switch para saber que letra es la que corresponde al ultimo digito
		numLetra1= switch (numPrimero) {
		
		case 1 ->{
			yield "uno";
		}
		case 2 ->{
			yield "dos";
		}
		case 3 ->{
			yield "tres";
		}
		case 4 ->{
			yield "cuatro";
		}
		case 5 ->{
			yield "cinco";
		}
		case 6 ->{
			yield "seis";
		}
		case 7 ->{
			yield "siete";
		}
		case 8 ->{
			yield "ocho";
		}
		case 9 ->{
			yield "nueve";
		}
		default->{
			yield "erroneo";
		}
		};
		
		//si es un numero entre 11 y 15
		numLetra2= switch (numA){
		
		case 11 ->{
			yield "once";
		}
		case 12 ->{
			yield "doce";
		}
		case 13 ->{
			yield "trece";
		}
		case 14 ->{
			yield "catorce";
		}
		case 15 ->{
			yield "quince";
		}
		
		default -> {
			yield "erroneo";
		}
		};
		
		//Si la ultima cifra es 0
		numLetraCero= switch (numA) {
		case 10 ->{
			yield "diez";
		}
		case 20 ->{
			yield "veinte";
		}
		case 30 ->{
			yield "trenta";
		}
		case 40 ->{
			yield "cuarenta";
		}
		case 50 ->{
			yield "cincuenta";
		}
		case 60 ->{
			yield "sesenta";
		}
		case 70 ->{
			yield "setenta";
		}
		case 80 ->{
			yield "ochenta";
		}
		case 90 ->{
			yield "noventa";
		}
		default -> {
			yield "erroneo";
		}
		};
		
		//Imprime por pantalla el numero escrito
		if (numA<10) {
			System.out.println(numLetra1);
			
		}else if (numA%10==0) {
			System.out.println(numLetraCero);
			
		}
		else if (numA<16) {
			System.out.println(numLetra2);
			
		}else if (numA<20) {
			System.out.println("Dieci"+numLetra1);
			
		}else if (numA<30) {
			System.out.println("Veinti"+numLetra1);
			
		}else if (numA<40) {
			System.out.println("Treinta y "+numLetra1);
			
		}else if (numA<50) {
			System.out.println("Cuarenta y "+numLetra1);
			
		}else if (numA<60) {
			System.out.println("Cincuenta y "+numLetra1);
			
		}else if (numA<70) {
			System.out.println("Sesenta y "+numLetra1);
			
		}else if (numA<80) {
			System.out.println("Setenta y "+numLetra1);
			
		}else if (numA<90) {
			System.out.println("Ochenta y "+numLetra1);
			
		}else if (numA<100) {
			System.out.println("Noventa y "+numLetra1);
			
		}else if (numA>99) {
			System.out.println("Vuelve a introducir el numero");
			
		}
		
		//Cierre del scanner
		sc.close();

	}

}
