package triangulo;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {

	
	@Test
	public void validadorTest(){
		// Caso de prueba 1		
		Triangulo t1 = new Triangulo (3,5,9);
		Assert.assertEquals("Escaleno",t1.validar());
		
		// Caso de prueba 2		
		Triangulo t2 = new Triangulo (1,2,2);
		Assert.assertEquals("Isoceles",t2.validar());
		
		// Caso de prueba 3		
		Triangulo t3 = new Triangulo (1,1,1);
		Assert.assertEquals("Equilatero",t3.validar());
		
		// Caso de prueba 4		
		Triangulo t4 = new Triangulo (2,2,1);
		Assert.assertEquals("Isoceles",t4.validar());
		
		// Caso de prueba 5		
		Triangulo t5 = new Triangulo (1,0,1);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t5.validar());
		
		// Caso de prueba 6		
		Triangulo t6 = new Triangulo (1,-1,1);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t6.validar());
		
		// Caso de prueba 7		
		Triangulo t7 = new Triangulo (1,1,2);
		Assert.assertEquals("La suma de dos lados del triangulo es igual al lado restante",t7.validar());
		
		// Caso de prueba 8		
		Triangulo t8 = new Triangulo (1,1,2);
		//Assert.assertEquals("La suma de dos lados del triangulo es mayor al lado restante",t8.validar());
		
		// Caso de prueba 9
		Triangulo t9 = new Triangulo (1,2,5);
		//Assert.assertEquals("La suma de los primeros dos lados es menor al tercero",t9.validar());
		
		// Caso de prueba 10
		Triangulo t10 = new Triangulo (2,1,5);
		//Assert.assertEquals("La suma de los primeros dos lados es menor al tercero",t10.validar());
		
		// Caso de prueba 11
		Triangulo t11 = new Triangulo (0,0,0);
		Assert.assertEquals("Los lados del triangulo debe ser mayor a 0",t11.validar());
		
		// Caso de prueba 12
		Triangulo t12 = new Triangulo (1.5,2,1.2);
		Assert.assertEquals("Los lados deben tener un valor entero",t12.validar());
		
		// Caso de prueba 13
		Triangulo t13 = new Triangulo (1,2);
		Assert.assertEquals("Debe ingresar 3 parámetros",t13.validar());
	}
	
}
