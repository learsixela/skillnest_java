package cl.skillnest.interfaz;

import cl.skillnest.interfaz.clases.Coche;
import cl.skillnest.interfaz.clases.CocheElectrico;
import cl.skillnest.interfaz.clases.Moto;
import cl.skillnest.interfaz.clases.Vehiculo;
import cl.skillnest.interfaz.clases.VehiculoElectrico;

public class Aplicacion {

	public static void main(String[] args) {
		//instancia de la clase, crear objeto 
		Vehiculo coche = new Coche();//polimorfismo
		Vehiculo moto = new Moto();//polimorfismo
		
		//implementacion Multiple
		Vehiculo cocheElectrico = new CocheElectrico();
		VehiculoElectrico cocheElectrico2 = new CocheElectrico();

		cocheElectrico2.recargar();
		/* ... */
		
		
	}

}
