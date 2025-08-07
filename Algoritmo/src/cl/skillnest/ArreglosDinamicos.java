package cl.skillnest;

import java.util.ArrayList;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		/**
		 * Tamaño dinamico
		 * Metodos utiles, operar(agregar, eliminar, buscar elementos)
		 * Solo admite objetos
		 * */
		
		// Crear un ArrayList vacío
	       ArrayList<Integer> numeros = new ArrayList<Integer>();
	       var listaNumeros = new ArrayList<Integer>();
	       
	       
	       System.out.println(listaNumeros.size());
	       // Agregar elementos al ArrayList
	       numeros.add(10);
	       numeros.add(20);
	       numeros.add(30);
	       System.out.println(numeros);

	       //add(indice,elemento)
	       numeros.add(1,40);
	       System.out.println(numeros);
	       
	       numeros.add(50);
	       numeros.add(40);//numero repetido
	       
	       System.out.println(numeros);
	       // Imprimir el tamaño del ArrayList
	       System.out.println("Tamaño del ArrayList: " + numeros.size()); // Output: Tamaño del ArrayList: 3
	       
	       numeros.remove(Integer.valueOf(40));
	       //eliminar un elemento por objeto, se elimina el primero que encuentre
	       numeros.remove(Integer.valueOf(40));
	       
	       //eliminar por indice
	       numeros.remove(3);
	       System.out.println(numeros);
	       
	       //obtener un elemento por indice
	       System.out.println(numeros.get(1));
	       
	       //reemplazar por indice
	       numeros.set(1, 60);//20 es reemplazado por 60
	       
	       // Verificar si un elemento existe (true o false)
	       System.out.println(numeros.contains(20));// ya no existe en el arreglo
	       
	       System.out.println(numeros);
	       
	       //IndexOf, retorna el indice del primer elemento encontrado
	       System.out.println(numeros.indexOf(60));
	       //si no lo encuetra retorna -1
	       System.out.println(numeros.indexOf(70));
	       
	       //isEmpty; True si esta vacio
	       System.out.println("Esta vacio? "+numeros.isEmpty());
	       numeros.reversed();
	       System.out.println(numeros);//[10,60,30]
	       System.out.println(numeros.reversed());//[30,60,10]
	       
	       //TODO recorrer ArrayList
	       
	       
	       //clear;Elimina todos los elementos
	       numeros.clear();
	       System.out.println("Esta vacio? "+numeros.isEmpty());//true, ArrayList vacio
	       

	}

}
