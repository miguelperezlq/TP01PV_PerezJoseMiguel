package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public int calcularEdad() {
		LocalDate now = LocalDate.now();
		return now.getYear() - fechaNacimiento.getYear();
	}
	
	public boolean esMayorEdad() {
		return this.calcularEdad() >= 18;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: "+ dni);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha de Nacimiento: "+ fechaNacimiento);
		System.out.println("Provincia: "+ provincia);
		System.out.println("Edad: "+ this.calcularEdad());
		if(this.esMayorEdad()) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona NO es mayor de edad");
		}
	}
	
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
