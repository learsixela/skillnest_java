package cl.skillnest;

import java.util.ArrayList;
import java.util.List;

public class BucleFor {

	public static void main(String[] args) {

		
		/**
		 * Bucle For
		 * ***/
		
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("i = " + i);
		}
		//System.out.println(i);// no se puede acceder al valor de i
		

		/**
		 * ForEach
		 * */
		
		//lista inmutable
		List<String> colores = List.of("rojo", "blanco","azul");
		//colores.add("verde");//java.lang.UnsupportedOperationException
		//System.out.println(colores);
		
		//mutable
		ArrayList<String> listaColores = new ArrayList<>(List.of("rojo", "blanco","azul"));
		System.out.println(listaColores);
		listaColores.add("negro");
		System.out.println(listaColores);
		
		for (String color : listaColores) {
			System.out.println("el color es: "+ color);
		}
		
		
		
	}

}
