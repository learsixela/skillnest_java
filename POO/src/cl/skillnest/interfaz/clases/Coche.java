package cl.skillnest.interfaz.clases;

public class Coche implements Vehiculo{
	//atributos
	private int velocidad;
	
	//constructor
	public Coche() {
		super();
	}
	
	//metodos
	@Override
	public void acelerar() {
		
	}

	@Override
	public void frenar() {
		
	}

	@Override
	public int obtenerRendimiento() {
		
		return 0;
	}
	
	//getters & setters

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}
	

}
