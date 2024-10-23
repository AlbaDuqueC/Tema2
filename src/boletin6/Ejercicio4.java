package boletin6;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		// va sumando los numeros introducidos
		int suma = 0;

		// Este sirve para que introduzcas diez numeros
		for (int i = 1, contador = 0; contador < 10; contador++, i += 2) {

			// Va sumando los numeros impares
			suma = i + suma;
		}
		// Imprime la suma
		System.out.println(suma);

	}

}
