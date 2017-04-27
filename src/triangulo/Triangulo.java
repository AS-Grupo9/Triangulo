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

	public String validar(int caso){
		String mensaje = "";
		
		switch(caso)
		{
			case 1: if(validarEscaleno()) mensaje = "Escaleno"; break;
			case 2: if(validarIsosceles()) mensaje = "Isosceles"; break;
			case 3: if(validarEquilatero()) mensaje = "Equilatero"; break;
			case 4: if(validarIsosceles()) mensaje = "Isosceles"; break;
			case 5: if(!validarValorParametros()) mensaje = "Los lados del triangulo debe ser mayor a 0"; break;
			case 6: if(!validarValorParametros()) mensaje = "Los lados del triangulo debe ser mayor a 0"; break;
			case 7: if(sumaDeDosPrimerosLadosIgualAlTercero()) mensaje = "La suma de los dos primeros lados del triangulo es igual al tercer lado"; break;
			case 8: if(sumaDeDosLadosIgualAlRestante()) mensaje = "La suma de dos lados del triangulo es igual al lado restante"; break;
			case 9: if(sumaDeDosPrimerosLadosMenorAlTercero()) mensaje = "La suma de los primeros dos lados es menor al tercero"; break;
			case 10: if(sumaDeDosLadosMenorAlRestante()) mensaje = "La suma de dos lados es menor al restante"; break;
			case 11: if(!validarValorParametros()) mensaje = "Los lados del triangulo debe ser mayor a 0"; break;
			case 12: if(!validarEntero()) mensaje = "Los lados deben ser números enteros"; break;
			case 13: if(!validarCantidadParametros()) mensaje = "Debe ingresar 3 parámetros"; break;
		}	
		
		return mensaje;
	}

	private boolean validarEscaleno(){
		// Escaleno
		if(this.ladoC != this.ladoA && this.ladoC != this.ladoB && this.ladoA != this.ladoB){
			return true;
		}	
		return false;
	}
		
	private boolean validarIsosceles(){
		// Isoceles
		if(((this.ladoC == this.ladoA) && (this.ladoC != this.ladoB)) || 
				((this.ladoB == this.ladoC) && (this.ladoB != this.ladoA)) ||
					((this.ladoA == this.ladoB) && (this.ladoA != this.ladoC))){
			return true;
		}
		return false;
	}

	private boolean validarEquilatero(){
		if(this.ladoC == this.ladoA)
			if(this.ladoC == this.ladoB)
				return true;
		return false;
	}

	private boolean validarValorParametros(){
		if(this.ladoA <= 0 || this.ladoB <= 0 || this.ladoC <= 0){
			return false;
		}
		return true;
	}

	private boolean sumaDeDosPrimerosLadosIgualAlTercero()
	{
		if(this.ladoA + this.ladoB == this.ladoC) 
				return true;
			return false;
	}
	
	private boolean sumaDeDosLadosIgualAlRestante(){
		if(this.ladoA + this.ladoB == this.ladoC ||
			this.ladoA + this.ladoC == this.ladoB ||
			this.ladoB + this.ladoC == this.ladoA) 
			return true;
		return false;
	}

	private boolean sumaDeDosPrimerosLadosMenorAlTercero()
	{
		if(this.ladoA + this.ladoB < this.ladoC) 
				return true;
			return false;
	}
	
	private boolean sumaDeDosLadosMenorAlRestante()
	{
		if(this.ladoA + this.ladoB < this.ladoC ||
			this.ladoA + this.ladoC < this.ladoB ||
			this.ladoB + this.ladoC < this.ladoA) 
				return true;
			return false;
	}
	
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