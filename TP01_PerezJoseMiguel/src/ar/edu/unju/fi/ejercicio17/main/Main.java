package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		
		int opcion;
		do {
            System.out.println("Menú:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
    		case 1:
    			try {
    				//Alta de jugador
    				System.out.println("Nombre; ");
    				String nombre = scanner.next();
    				System.out.println("Apellido: ");
    				String apellido = scanner.next();
    				System.out.println("Fecha de nacimiento (yyyy-MM-dd");
    				LocalDate fechaNacimiento = LocalDate.parse(scanner.next());
    				System.out.println("Nacionalidad: ");
    				String nacionalidad = scanner.next();
    				System.out.println("Estatura: ");
    				double estatura = scanner.nextDouble();
    				System.out.println("Peso: ");
    				double peso = scanner.nextDouble();
    				System.out.println("Posicion: ");
    				String posicion = scanner.next();
    				
    				Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
    				jugadores.add(jugador);
    				System.out.println("Jugador agregado correctamente.");
    			}catch (Exception e) {
    				System.out.println("Error al ingresar los datos del jugador. ");
    				scanner.nextLine();
    			}
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		case 4:
    			break;
    		case 5:
    			break;
    		case 6:
    			break;
    		case 7:
    			break;
    		case 8:
    			System.out.println("Saliendo...");
    			break;
    		default:
    			System.out.println("Opcion no valida.");
    			break;
    		}
		} while (opcion != 8);
		
		
		
		scanner.close();
		

	}

}
