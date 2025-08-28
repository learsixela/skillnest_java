package cl.skillnest.oop;

public class Libro  extends LibroAbstracto {
	private double tamanio;

	//constructor
	public Libro(String titulo, String autor, int numPaginas, double tamanio) {
		super(titulo, autor, numPaginas);
		this.tamanio = tamanio;
	}

	//metodo abstracto heredado
	@Override // sobre escritura
	public void mostrarInformacion() {
		System.out.println("Titulo: " + this.titulo + ", Autor: "+ this.autor);
		System.out.println("Numero paginas: " + this.numPaginas + ", Tamaño: "+ this.tamanio);
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	} 

	
}
