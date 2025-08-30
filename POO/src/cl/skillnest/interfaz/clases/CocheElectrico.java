package cl.skillnest.interfaz.clases;

//implementación multiple
public class CocheElectrico implements Vehiculo, VehiculoElectrico{
	//atributos
	private int velocidad;
	private int bateria = 50;
	
	@Override
	public void recargar() {
		bateria = 100;
	}

	@Override
	public void acelerar() {
		
		velocidad = 25;
		//bateria = bateria - 5;
		bateria -= 5;
	}

	@Override
	public void frenar() {
		velocidad = 0;
		
	}

	@Override
	public int obtenerVelocidad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
