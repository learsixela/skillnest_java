package cl.skillnest.herencia.clases;

public class CocheElectrico extends Coche{


	private int bateria;
	
	public CocheElectrico(String marca, int año, int numeroDePuertas) {
		super(marca, año, numeroDePuertas);
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public void mostrarDetalles() {
		//super.mostrarDetalles();
		System.out.println();
		System.out.println("Metodo sobre escrito en coche electrico");
		//como mostrar los atributos(contenido) de las clases padres?
		System.out.println(getMarca()+" " + 
		getAño()+" "+
		getNumeroDePuertas()+" "
		+getBateria());
	}




	
}
