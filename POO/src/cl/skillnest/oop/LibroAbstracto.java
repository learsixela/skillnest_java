package cl.skillnest.oop;

//clase abstracta
abstract class LibroAbstracto {
	protected String titulo;
	protected String autor;
	protected int numPaginas;

	// Constructor
	public LibroAbstracto(String titulo, String autor, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	//metodos abstractos (es solo la definicion del metodo)
	public abstract void mostrarInformacion();
	
	//metodo concreto
	public String obtenerInformacion() {
		return "Titulo: " + this.titulo + ", Autor: "+ this.autor;
	}
}
