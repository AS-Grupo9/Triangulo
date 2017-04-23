package triangulo;

public class Triangulo {
	private double ladoC, ladoA, ladoB;
	
	public Triangulo(double a, double b){
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = Double.NaN;
	}
	
	public Triangulo(double a, double b, double c){
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
		
	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public String validar(){
		
		// Validar cantidad de parametros
		if(!validarCantidadParametros()){
			return "Debe ingresar 3 parámetros";
		}			
		else {
			// Validar enteros
			if(!validarEntero()){
				return "Los lados deben tener un valor entero";
			} else {
				// Validar valor de parametros
				if(!validarValorParametros()){
					return "Los lados del triangulo debe ser mayor a 0";
				}
				else {
					// Validar suma de lados
					if(!validarSumaDeLados()){
						return "La suma de dos lados del triangulo es igual al lado restante";
					}
					else {
//						if(!validarSumaDeLadosMayores()){
//							return "La suma de dos lados del triangulo es mayor al lado restante";
//						}
					}
				}
				
				
				
				// Validar tipo de triangulo
				
								
			}
			return validarTipo();		
		}
	}
	
	
	private boolean validarSumaDeLados(){
		if(this.ladoA + this.ladoB == this.ladoC ) 
			return false;
		return true;
	}
	
	private boolean validarSumaDeLadosMayores(){
		if(this.ladoA + this.ladoB > this.ladoC ||
				this.ladoB + this.ladoC > this.ladoA || 
					this.ladoA + this.ladoC > this.ladoB) 
			return false;
		return true;
	}
	
	private String validarTipo(){
		if(validarEquilatero()){
			return "Equilatero";
		} else if(validarEscaleno()){
			return "Escaleno";
		} else if(validarIsoceles()){
			return "Isoceles";
		} else {
			return "Nada";
		}
	}
	
	private boolean validarEquilatero(){
		if(this.ladoC == this.ladoA)
			if(this.ladoC == this.ladoB)
				return true;
		return false;
	}
	
	private boolean validarEscaleno(){
		// Escaleno
		if(this.ladoC != this.ladoA && this.ladoC != this.ladoB && this.ladoA != this.ladoB){
			return true;
		}	
		return false;
	}
		
	private boolean validarIsoceles(){
		// Isoceles
		if(((this.ladoC == this.ladoA) && (this.ladoC != this.ladoB)) || 
				((this.ladoB == this.ladoC) && (this.ladoB != this.ladoA)) ||
					((this.ladoA == this.ladoB) && (this.ladoA != this.ladoC))){
			return true;
		}
		return false;
	}
		
	private boolean validarValorParametros(){
		if(this.ladoA <= 0 || this.ladoB <= 0 || this.ladoC <= 0){
			return false;
		}
		return true;
	}
	
	// TESTEAR ESTO
	private boolean validarCantidadParametros(){
		
		if(Double.isNaN(ladoA)){
			return false;
		} else if (Double.isNaN(ladoB)){
			return false;
		} else if (Double.isNaN(ladoC)){
			return false;
		}
		return true;
	}
	
	private boolean validarEntero(){
		
		if (this.ladoA == (int) this.ladoA && this.ladoB == (int) this.ladoB
				&& this.ladoC == (int) this.ladoC)
			return true;
		return false;
	}
	
}