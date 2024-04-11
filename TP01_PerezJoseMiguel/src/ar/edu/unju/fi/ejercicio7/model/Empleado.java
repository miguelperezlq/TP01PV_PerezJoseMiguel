package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	private static final double SalarioMinimo = 210000.00;
	private static final double AumentoMerito = 20000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if(salario >= SalarioMinimo) {
			this.salario = salario;	
		}else {
			this.salario = SalarioMinimo;
		}	
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre de empleado: " + nombre);
		System.out.println("Legajo: "+ legajo);
		System.out.println("Salario $: "+ String.format("%.2f", salario));
	}
	
	public void darAumento() {
		salario += AumentoMerito;
	}
	

}
