package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero para realizar el calculo: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setN(n);
		
		System.out.println("Calculo de la sumatoria es: "+ calculadora.calcularSumatoria());
		System.out.println("Calculo de la productoria es: "+ calculadora.calcularProductoria());
		
		scanner.close();
	}

}
