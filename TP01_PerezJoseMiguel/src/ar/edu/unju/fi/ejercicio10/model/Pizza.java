package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int ESPECIAL20 = 500;
    private final int ESPECIAL30 = 750;
    private final int ESPECIAL40 = 1000;
    
    public Pizza() {
    	
    }

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public void calcularPrecio() {
		if(diametro == 20) {
			precio = ingredientesEspeciales ? 4500 + ESPECIAL20 : 4500;
		}else if(diametro == 30) {
			precio = ingredientesEspeciales ? 4800 + ESPECIAL30 : 4800;
		}else if(diametro == 40) {
			precio = ingredientesEspeciales ? 5500 + ESPECIAL40 : 5500;
		}
	}
	
	public void calcularArea() {
		area = Math.PI * Math.pow(diametro/2, 2);
	}
	
	public String toString() {
		return "\n** pizza **" +
				"\nDiametro = "+ diametro +
				"\nIngredientes = "+ ingredientesEspeciales +
				"\nPrecio Pizza = "+ precio +
				"\nArea de la pizza = " + area;
	}


    
    

}
