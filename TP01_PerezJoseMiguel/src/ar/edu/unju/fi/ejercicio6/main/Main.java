package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//Usando constructor por defecto
		Persona persona1 = new Persona();
		System.out.println("Persona 1: ");
		persona1.mostrarDatos();
		
		//usando constructor parametrizado
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingrese el DNI de la persona 2: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese el nombre de la persona 2: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento de la persona 2(yyyy-mm-dd): ");
		String fechaNacimientoStr = scanner.nextLine();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
		scanner.close();
		
		Persona persona2 = new Persona(dni,nombre,fechaNacimiento);
		System.out.println("\nPersona 2: ");
		persona2.mostrarDatos();

		
		//usando constructor con dni, nombre y fecha de nacimiento
		Persona persona3 = new Persona("12345678","Jose Miguel Perez", LocalDate.of(1996, 8, 10));
		System.out.println("\nPersona 3: ");
		persona3.mostrarDatos();
		
		
		
	}

}
