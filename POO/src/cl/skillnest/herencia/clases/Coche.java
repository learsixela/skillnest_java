package cl.skillnest.herencia.clases;
/**
 * clase hija
 * */
public class Coche extends Vehiculo{
	private int numeroDePuertas;
	

	public Coche(String marca, int año, int numeroDePuertas) {
		super(marca, año);
		this.numeroDePuertas = numeroDePuertas;
		
	}

	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}




	
	
}
