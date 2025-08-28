package cl.skillnest.oop;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		   List<Libro> biblioteca = new ArrayList<>();
		   
		   Libro libro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1000,30.0);
		   LibroFiccion libroFiccion = new LibroFiccion("1984", "George Orwell", 328,40.0);
		   
		   Libro libroPolimorfico = new LibroFiccion("1984", "George Orwell", 382,50.0);
		   
		   
		   biblioteca.add(libro);
		   biblioteca.add(libroPolimorfico);
		   biblioteca.add(libroFiccion);
		   
		   for (Libro libro2 : biblioteca) {
			   libro2.mostrarInformacion();
			   System.out.println();
			
		}
		   
		}

}
