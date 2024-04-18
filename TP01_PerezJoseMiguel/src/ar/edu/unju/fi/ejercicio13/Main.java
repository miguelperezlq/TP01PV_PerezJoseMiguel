package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[8];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Ingrese el valor para la posicion " + i + ": ");
			array[i]= scanner.nextInt();
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.println("En la posicion "+ i + " se encuentra en el valor: " + array[i]);
		}
		
		scanner.close();

	}

}
