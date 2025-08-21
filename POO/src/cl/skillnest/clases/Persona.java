package cl.skillnest.clases;

/***
 * Clase Persona
 */
public class Persona {
	//atributos (caracteristicas/propiedad)
	String nombre;
	String apellido;
	int edad;
	float estatura;
	double peso;
	String rut;

	//constructor
	public Persona(String nombre, String apellido, int edad, float estatura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
	}

	public Persona() {
	
	}

	public Persona(String nombre, String apellido, int edad, float estatura, double peso, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.rut = rut;
	}

	//Metodos (comportamientos)
	public void caminar() {
		System.out.println("Hola, soy "+ nombre +" yo camino 5 km diarios");
	}


}

/*
public class Perro{
	String color;
	double peso;
	String raza;
	int edad;
	String genero;
	String sonido;
	String especie;
	
}
public class Gato{
	String color;
	double peso;
	String raza;
	int edad;
	String genero;
	String sonido;
	String especie;
	
}*/

