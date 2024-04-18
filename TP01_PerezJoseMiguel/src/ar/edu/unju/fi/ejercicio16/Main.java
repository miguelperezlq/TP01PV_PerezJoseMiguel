package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//array de tamaño 5
		String[] nombres = new String[5];
		
		//pedir al usuario los datos para el array
		for (int i=0; i< nombres.length; i++) {
			System.out.println("Ingrese el nombre de la persona "+(i+1)+ ": ");
			nombres[i] = scanner.nextLine();
		}
		
		//mostrar el arrary usando while
		System.out.println("\nValores en el array: ");
		int index = 0;
		while (index < nombres.length) {
			System.out.println("pos"+ index +": " +nombres[index]);
			index++;
		}
		
		//mostrando el tamaño del arrat con la propiedad lengh
		System.out.println("\nTamaño del array: "+nombres.length);
		
		//solicitar al usuario elindice del elemento a eliminar
		byte indiceEliminar;
		do {
			System.out.println("\nIngrese el indice del elemnto a eliminar (0-"+ (nombres.length - 1)+"): ");
			indiceEliminar = scanner.nextByte();
		}while (indiceEliminar < 0 || indiceEliminar >= nombres.length);
		
		//eliminar elemento array
		for (int i = indiceEliminar; i<nombres.length -1;i++) {
			nombres[i] = nombres[i+1];
		}
		nombres[nombres.length-1]="";
		
		//mostrar array despues de eliminar
		System.out.println("\nValores en el array despues de eliminar: ");
		int index2 = 0;
		while (index2 < nombres.length) {
			System.out.println("pos"+ index2 +": " +nombres[index2]);
			index2++;
		}
		scanner.close();
		
		
	}

}
