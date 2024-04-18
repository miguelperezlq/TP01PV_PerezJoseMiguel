package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodo para calcular la edad de la persona
	public int calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		
		if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
			edad--;
		}
		return edad;
	}
	
	//Metodo para determinar el signo del zodiaco
	public String determinarSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Se suma 1 porque Calendar.MONTH comienza en 0
        String signo = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }
        return signo;
    }


	
	//Metodo para determinar el año
	
	public String determinarEstacion() {
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1; //se suma 1 porque calendar.MONTH comienza en 0
		String estacion = "";
		
		if (mes >= 3 && mes <= 5) {
			estacion = "Verano";
		}else if (mes >= 6 && mes <= 8) {
			estacion = "Otoño";
		}else if (mes >= 9 && mes <= 11) {
			estacion = "Invierno";
		}else {
			estacion = "Primavera";
		}
		return estacion;
	}
	
	
	
	
	//metodos get y set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
