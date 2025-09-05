package cl.skillnest.herencia.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	@Test
	void testMostrarDetalles() {
		//fail("Not yet implemented");
		Vehiculo vehiculo = new Vehiculo();
		assertNotEquals("Vehiculo [marca=null, año=1]",vehiculo.toString());
	}
	
	@Test
	void testMostrarDetalles2() {
		Vehiculo vehiculo = new Vehiculo("Nissan",2024);
		assertEquals("Vehiculo [marca=Nissan, año=2024]",vehiculo.toString());
	}

	@Test
	void testMostrarDetalles3() {
		Vehiculo vehiculo = new Vehiculo("Nissan",2024);
		assertEquals(2024,vehiculo.getAño());
	}
}
