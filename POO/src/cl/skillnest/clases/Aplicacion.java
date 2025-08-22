package cl.skillnest.clases;

public class Aplicacion {

	public static void main(String[] args) {
		// instancias de clase
		Alumno alumno = new Alumno();
		
		
		System.out.println(alumno.nombre);
		System.out.println();
		alumno.saludar();
		
		Reloj reloj = new Reloj(20,42,0);
		reloj.tickSegundo();
		reloj.mostrarHora();

		//crear el reloj
		//establecer alarma
		//ciclo(while) llamar tickSegundo
		//mostrar hora
		
	}

}
