package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//pedir rango en 3 y 10
		
		int tamanio;
		do {
			System.out.println("Ingrese un numero entero en el rango [3,10]");
			tamanio = scanner.nextInt();
		}while (tamanio<3 || tamanio > 10);
		
		//crear array
		int[] array = new int[tamanio];
		
		//pedir valores
		int suma = 0;
		for (int i=0; i<array.length; i++) {
			System.out.println("Ingrese un numero entero para la posicion "+i+": ");
			array[i] = scanner.nextInt();
			suma += array[i];
		}
		
		//mostrar valores
		System.out.println("Valores en el array: ");
		for(int i=0; i<array.length;i++) {
			System.out.println("Posicion "+i+": " + array[i]);
		}
		System.out.println("Suma de todos los valores: "+ suma);
		
		scanner.close();
		
		
	}

}
