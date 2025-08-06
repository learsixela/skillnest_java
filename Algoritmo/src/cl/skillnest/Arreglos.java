package cl.skillnest;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglo unidimensional
		
		/**
		 * tipoDato[] nombreArreglo = new tipoDato[tamaño];
		 * (también llamado array de una dimensión) 
		 * es una estructura que permite almacenar múltiples elementos del mismo tipo 
		 * en una única variable indexada.
		 * comienzan en la posicion/indice cero
		 * */
		int[] numerosImpares = new int[5];// del 0 - 4
		//agregar valores
		numerosImpares[3]=30;
		numerosImpares[0]=10;
		numerosImpares[1]=20;
		
		//imprimir el arreglo
		System.out.println("Elementos del arreglo: "+Arrays.toString(numerosImpares));
		//numerosImpares.length; // Devuelve la longitud del arreglo
		System.out.println("Longitud del arreglo: "+numerosImpares.length);//5
		
		//recorrer los elementos
		for (int i = 0; i < numerosImpares.length; i++) {//i <= numerosImpares.length-1
			System.out.println("posicion: "+ i + " elemento: "+numerosImpares[i]);
		}
		
		
		int[] numeros = {2,4,6,8,10}; //{0,0,0,0,0}
		//foreach
		for (int numero : numeros) {//numero = 10
			System.out.println(numero);
		}
		//System.out.println(numero);// no existe esa variable en este lugar

		int[] numerosPares = numeros;//NO ES UNA COPIA
		numeros[4]=12;
		
		System.out.println("Numeros Pares: "+ Arrays.toString(numerosPares));//[2, 4, 6, 8, 10]
		
		/**Como respaldar un arreglo? Tarea*/		
		
		
		
		

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
		System.out.println(matriz);//[[I@1218025c
		System.out.println("Matriz: " + Arrays.deepToString(matriz));
		
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
