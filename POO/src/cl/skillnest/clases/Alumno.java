package cl.skillnest.clases;

public class Alumno {
	//atributos
	String nombre;
	int edad;
	String curso;//atributo objeto
	int numeroLista;
	String email;
	
	//constructor
	// Alumno alumno1 = new Alumno();
	public Alumno() {
		this.nombre = "no definido";
		this.edad = 0;
	}
	//sobre carga de metodo constructor
	// Alumno alumno2 = new Alumno("Patricio");
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	// Alumno alumno3 = new Alumno(30);
	public Alumno(int edad) {
		this.nombre = "no definido";
		this.edad = edad;
	}
	// Alumno alumno4 = new Alumno("Juan",30);
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// Alumno alumno5 = new Alumno(35,"Pedro");
	public Alumno(int edad,String nombre) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// Alumno alumno6 = new Alumno("Lucas", 25,"Java 0078",8,"lucas@lucas.cl);
	public Alumno(String nombre, int edad, String curso, int numeroLista, String email) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
		this.numeroLista = numeroLista;
		this.email = email;
	}
	
	//metodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + 
				", edad=" + edad + 
				", curso=" + curso + 
				", numeroLista=" + numeroLista +
				", email=" + email + "]";
	}
	
	
	
}
