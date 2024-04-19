package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Pais> paises = new ArrayList<>();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		
		//precarga de paises
		paises.add(new Pais("001","Argentina"));
		paises.add(new Pais("002","Bolivia"));
		paises.add(new Pais("003","Brasil"));
		
		int opcion;
		
		do {
            System.out.println("Menú:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
				case 1:
					try {
						// Alta de destino turístico
                        System.out.print("Código del destino: ");
                        String codigo = scanner.next();
                        System.out.print("Nombre del destino: ");
                        String nombre = scanner.next();
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Código del país: ");
                        String codigoPais = scanner.next();
                        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
                        if (pais == null) {
                        	System.out.println("el pais no existe");
                        	break;
                        }
                        System.out.println("Cantidad de dias: ");
                        int cantidadDias = scanner.nextInt();
                        
                        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
                        destinos.add(destino);
                        System.out.println("Destino turistico agregado correctamente. ");
					}catch (Exception e) {
						System.out.println("Error al ingresar los datos del destino turistico.");
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
					break;
				case 9:
					System.out.println("saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
            }

			
		}while (opcion != 9);
		scanner.close();	

	}
	
	private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
		for (Pais pais : paises) {
			if (pais.getCodigo().equals(codigo)) {
				return pais;
			}
		}
		return null;
	}

}
