package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la persona: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
		String fechaStr = scanner.nextLine();
		
		Calendar fechaNacimiento = Calendar.getInstance();
		String[] partesFecha = fechaStr.split("/");
		fechaNacimiento.set(Integer.parseInt(partesFecha[2]),Integer.parseInt(partesFecha[1])-1, Integer.parseInt(partesFecha[0]));
		
		Persona persona = new Persona(nombre, fechaNacimiento);
		
		System.out.println("Datos de la persona: ");
		System.out.println("Nombre: "+ persona.getNombre());
		System.out.println("Fecha de Nacimiento: "+fechaStr);
		System.out.println("Edad: "+ persona.calcularEdad()+ " años");
		System.out.println("Signo del zodiaco: "+ persona.determinarSignoZodiaco());
		System.out.println("Estacion: "+ persona.determinarEstacion());
		
		scanner.close();
		

	}

}
