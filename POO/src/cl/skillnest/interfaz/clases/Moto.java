package cl.skillnest.interfaz.clases;

public class Moto implements Vehiculo{
	//atributos
	private int velocidad;
	
	public Moto() {
		super();
	}
	

	@Override
	public void acelerar() {
		this.velocidad = 15;
		
	}

	@Override
	public void frenar() {
		this.velocidad = 0;
	}

	@Override
	public int obtenerVelocidad() {
		return velocidad;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
