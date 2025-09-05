package cl.skillnest.herencia.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehiculoTest2 {
	private Vehiculo vehiculo;
	
	@BeforeEach
	public void inicial() {
		vehiculo = new Vehiculo("Nissan",2024);
	}
	
	@Test
	void testMostrarDetalles2() {
		assertEquals("Vehiculo [marca=Nissan, año=2024]",vehiculo.toString());
	}

}
