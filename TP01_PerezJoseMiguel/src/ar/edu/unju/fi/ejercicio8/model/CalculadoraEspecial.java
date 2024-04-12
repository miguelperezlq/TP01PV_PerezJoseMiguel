package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public long calcularSumatoria() {
		long ans = 0;
		
		for (int k = 1; k<= this.n; k++) {
			ans += Math.pow((k * (k+1))/2, 2);
		}
		
		return ans;
	}
	
	public long calcularProductoria() {
		long ans = 1;
		
		for (int k=1; k<= this.n; k++) {
			ans *= k *(k+4);
		}
		
		return ans;
		
	}

}
