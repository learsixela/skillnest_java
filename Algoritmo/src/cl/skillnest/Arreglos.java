package cl.skillnest;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglo unidimensional
		/* (también llamado array de una dimensión) 
		 * es una estructura que permite almacenar múltiples elementos del mismo tipo 
		 * en una única variable indexada.
		 * */
		int[] numeros = {2,4,6,8,10}; 
		//foreach
		for (int numero : numeros) {//numero = 10
			System.out.println(numero);
		}
		//System.out.println(numero);// no existe esa variable en este lugar


		String[] vocales = {"a","e","i","o","u"};
		
		for (String vocal : vocales) {
			System.out.println(vocal);
		}
		
		/**
		 * Arreglo Bidimensional
		 * **/
		//el primer elemento esta en la posicion 0 (cero)
		
		int[][] matriz = {
				{1,2,3},//fila 0
				{4,5,6,7},//fila 1
				{8,9,0}
		};
		System.out.println(matriz[0][0]);
		System.out.println(matriz[1][0]);
		
		System.out.println("Imprimir los elementos de la matriz");
		
		/*for (int fila = 0; fila < 2 ; fila++) {
			System.out.println(matriz[fila][0]);
		}*/
		for (int fila = 0; fila < matriz.length ; fila++) {
			for (int columna = 0; columna < matriz[fila].length ; columna++) {
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		
	}

}
