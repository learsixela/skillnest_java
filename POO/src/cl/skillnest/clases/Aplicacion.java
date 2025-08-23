package cl.skillnest.clases;

public class Aplicacion {

	public static void main(String[] args) {
		// instancias de clase
		Alumno alumno = new Alumno();
		
		
		System.out.println(alumno.nombre);
		System.out.println();
		alumno.saludar();
		

		//crear el objeto reloj
		Reloj reloj = new Reloj(20,39,59);
		//establecer alarma
		reloj.establecerAlarma(20, 40);
		//ciclo(while) llamar tickSegundo

		reloj.tickSegundo();
		//mostrar hora
		reloj.mostrarHora();
		
		//saber solo la hora
		System.out.println("la hora es: "+reloj.getHora());
		
		reloj.setHora(19);
		reloj.mostrarHora();
		
		reloj.setHora(-1);
		reloj.mostrarHora();
	}

}
