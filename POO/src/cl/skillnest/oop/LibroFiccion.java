package cl.skillnest.oop;

public class LibroFiccion extends Libro {

	public LibroFiccion(String titulo, String autor, int numPaginas, double tamanio) {
		super(titulo, autor, numPaginas, tamanio);
	}

	@Override // sobre escritura
	public void mostrarInformacion() {

		System.out.println("Tamaño: "+ this.getTamanio());
	}

}
