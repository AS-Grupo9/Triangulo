package triangulo;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {

	
	@Test
	public void validadorTest(){
		Triangulo t1 = new Triangulo (1,1,1);
		t1.validarTipo();
		Assert.assertEquals("Equilatero",t1.getTipo());
		
		Triangulo t2 = new Triangulo (2,2,1);
		t2.validarTipo();
		Assert.assertEquals("Isoceles",t2.getTipo());
		
		Triangulo t3 = new Triangulo (1,2,3);
		t3.validarTipo();
		Assert.assertEquals("Escaleno",t3.getTipo() );
	}
	
}
