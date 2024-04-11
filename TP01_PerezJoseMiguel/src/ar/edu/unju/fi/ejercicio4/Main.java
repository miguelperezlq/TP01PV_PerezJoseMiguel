package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero para calcular su factorial entre 0 y 10: ");
		int numero = scanner.nextInt();
		
		if(numero<0 || numero> 10) {
			System.out.println("Numero fuera del rango permitido");
			return;
		}
		
		int factorial = 1;
		int i = 1;
		
		while(i <= numero) {
			factorial *= i;
			i++;
		}
		System.out.println("El factorial de " + numero+ "es: "+ factorial);
		scanner.close();
		

	}

}
