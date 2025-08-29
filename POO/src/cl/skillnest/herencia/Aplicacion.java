package cl.skillnest.herencia;

import cl.skillnest.herencia.clases.Coche;
import cl.skillnest.herencia.clases.CocheElectrico;
import cl.skillnest.herencia.clases.Vehiculo;

public class Aplicacion {

	public static void main(String[] args) {
		//instancia de clase
		Vehiculo vehiculo = new Vehiculo();
		System.out.println(vehiculo);
		
		vehiculo.setAño(2025);
		vehiculo.setMarca("Nissan");
		System.out.println(vehiculo);
		
		Vehiculo vehiculo2 = new Vehiculo("Toyota",2026);
		System.out.println(vehiculo2);
		
		
		Coche coche = new Coche("Great Wall",2023, 4);
		System.out.println(coche);
		coche.mostrarDetalles();
		
		//objeto clase coche electrico
		CocheElectrico cocheElectrico = new CocheElectrico("Tesla", 2026, 5);
		//agregar informacion a bateria
		cocheElectrico.setBateria(1000);
		
		cocheElectrico.mostrarDetalles();
		
	}

}
