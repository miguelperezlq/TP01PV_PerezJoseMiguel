package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//pedir rango en 5 y 10
		
		int tamanio;
		do {
			System.out.println("Ingrese un numero entero en el rango [5,10]");
			tamanio = scanner.nextInt();
		}while (tamanio<5 || tamanio > 10);
		
		//crear array
		String[] nombres = new String[tamanio];
		
		//pedir nombres
		for (int i=0; i<nombres.length; i++) {
			System.out.print("Ingrese un nombre para la posicion "+i+": ");
			nombres[i] = scanner.next();
		}
		
		//mostrar nombres
		System.out.println("\nContenido en el array(empezando desde el primer valor) ");
		for(int i=0;i< nombres.length; i++) {
			System.out.println("Posicion " + i+": "+ nombres[i]);
		}
		
		//orden inverso
		System.out.println("\nContenido del array(empezando desde el ultimo valor) ");
		for(int i = nombres.length-1; i>=0; i--) {
			System.out.println("Posicion "+ i +": "+ nombres[i]);
		}
		
		
		
		scanner.close();
		
		
	}

}

