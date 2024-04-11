package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero entre 1 y 9:");
		int numero = scanner.nextInt();
		
		if(numero < 1 || numero > 9) {
			System.out.println("El numero ingresado no esta dentro del rango [1-9]");
			return;
		}
		
		System.out.println("Numero ingresado"+ numero);
		for (int i = 1; i<=10; i++) {
			System.out.println(numero + " x " + i +" = " + (numero*i));
		}
		scanner.close();

	}

}
