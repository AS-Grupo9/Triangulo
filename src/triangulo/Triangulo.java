package triangulo;

public class Triangulo {
	private double ladoC, ladoA, ladoB;
	private String tipo;

	
	public Triangulo(double a, double b, double c){
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
		this.tipo = "No especificado";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void validar(){
		
		// Validar cantidad de parametros
		if(!validarCantidadParametros()){
			System.out.println("Debe ingresar 3 parámetros");
		}			
		else {
			// Validar enteros
			if(!validarEntero()){
				System.out.println("Los lados deben tener un valor entero");
			} else {
				// Validar suma de lados
				
				
				validarTipo();
								
			}
					
		}	
	}
	
	
	
	public void validarTipo(){
		if(validarEquilatero()){
			System.out.println("Equilatero");
		} else if(validarEscaleno()){
			System.out.println("Escaleno");
		} else if(validarIsoceles()){
			System.out.println("Isoceles");
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
		
	
	public boolean validarValorParametros(){
		if(this.ladoA <= 0 || this.ladoB <= 0 || this.ladoC <= 0){
			return false;
		}
		return true;
	}
	
	// TESTEAR ESTO
	public boolean validarCantidadParametros(){
		
		if(Double.toString(this.ladoA).equals(null)){
			return false;
		} else if (Double.toString(this.ladoB).equals(null)){
			return false;
		} else if (Double.toString(this.ladoC).equals(null)){
			return false;
		}
		return true;
	}
	
	public boolean validarEntero(){
		
		if (this.ladoA == (int) this.ladoA && this.ladoB == (int) this.ladoB
				&& this.ladoC == (int) this.ladoC)
			return true;
		return false;
	}
	
}