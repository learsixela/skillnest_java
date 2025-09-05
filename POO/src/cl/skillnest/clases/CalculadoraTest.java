package cl.skillnest.clases;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calculadora;
	
	@BeforeEach
	public void inicial() {
		calculadora = new Calculadora();
	}
	
	@Test
	void testSuma() {
		int suma= calculadora.sumar(1,-3);
		assertEquals(-2, suma,"El resultado debe ser -2");
		
	}

	@Test
	void testDivision() {
		int division = calculadora.dividir(5,2);
		assertNotEquals(2, division);

	}
	
	@Test
	void testDivisionException() {
		assertThrows(IllegalArgumentException.class,()-> calculadora.dividir(5,0));
	}
}
