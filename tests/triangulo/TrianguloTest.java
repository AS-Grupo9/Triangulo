package triangulo;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {

	//Caso de prueba 1: Es un triángulo escaleno válido.
	@Test
	public void Caso1(){
		Triangulo t1 = new Triangulo (3,5,9);
		Assert.assertEquals("Escaleno",t1.validar(1));
	}

	//Caso de prueba 2: Es un triángulo isósceles válido.
	@Test
	public void Caso2(){		
		Triangulo t2 = new Triangulo (1,2,2);
		Assert.assertEquals("Isosceles",t2.validar(2));
	}

	//Caso de prueba 3: Es un triángulo equilátero válido.
	@Test
	public void Caso3(){
		Triangulo t3 = new Triangulo (1,1,1);
		Assert.assertEquals("Equilatero",t3.validar(3));
	}

	//Caso de prueba 4: Es un triángulo isosceles válido.
	@Test
	public void Caso4(){		
		Triangulo t4 = new Triangulo (2,2,1);
		Assert.assertEquals("Isosceles",t4.validar(4));
	}

	//Caso de prueba 5: Por lo menos un lado es igual a 0.
	@Test
	public void Caso5(){		
		Triangulo t5 = new Triangulo (1,0,1);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t5.validar(5));
	}

	//Caso de prueba 6: Por lo menos un lado es negativo.
	@Test
	public void Caso6(){		
		Triangulo t6 = new Triangulo (1,-1,1);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t6.validar(6));
	}

	//Caso de prueba 7: La suma de dos lados es igual al otro.
	@Test
	public void Caso7(){		
		Triangulo t7 = new Triangulo (1,1,2);
		Assert.assertEquals("La suma de los dos primeros lados del triangulo es igual al tercer lado",t7.validar(7));
	}

	//Caso de prueba 8: La suma de dos lados es igual al otro y haciendo permutación.
	@Test
	public void Caso8(){		
		Triangulo t8 = new Triangulo (1,2,1);
		Assert.assertEquals("La suma de dos lados del triangulo es igual al lado restante",t8.validar(8));
	}

	//Caso de prueba 9: La suma de los dos primeros lados es menor al tercero.
	@Test
	public void Caso9(){
		Triangulo t9 = new Triangulo (1,2,5);
		Assert.assertEquals("La suma de los primeros dos lados es menor al tercero",t9.validar(9));
	}

	//Caso de prueba 10: La suma de los dos primeros lados es menor al tercero y haciendo permutación.
	@Test
	public void Caso10(){
		Triangulo t10 = new Triangulo (5,1,2);
		Assert.assertEquals("La suma de dos lados es menor al restante",t10.validar(10));
	}

	//Caso de prueba 11: Tres lados son igual a 0.
	@Test
	public void Caso11(){
		Triangulo t11 = new Triangulo (0,0,0);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t11.validar(11));
	}

	//Caso de prueba 12: Por lo menos un lado no es entero.
	@Test
	public void Caso12(){
		Triangulo t12 = new Triangulo (1.5,2,1.2);
		Assert.assertEquals("Los lados deben ser números enteros",t12.validar(12));
	}

	//Caso de prueba 13: No se ingresaron los tres parámetros.
	@Test
	public void Caso13(){
		Triangulo t13 = new Triangulo (1,2);
		Assert.assertEquals("Debe ingresar 3 parámetros",t13.validar(13));
	}
}
