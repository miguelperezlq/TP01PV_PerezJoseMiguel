package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			Pizza pizza = new Pizza();
			System.out.println("Ingrese el diametro de la pizza (20,30 o 40);");
			pizza.setDiametro(sc.nextInt());
			System.out.println("La pizza tiene ingredientes especiales? (true o false):");
			pizza.setIngredientesEspeciales(sc.nextBoolean());
			
			pizza.calcularPrecio();
			pizza.calcularArea();
			
			System.out.println(pizza);
		}
	}

}
