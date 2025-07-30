package cl.skillnest;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
	/*
	   	Inicio
		   Leer A, B
		   Resultado = A + B
		   Imprimir Resultado
		Fin
	 */
		//definir la variable scanner, encargada de capturar datos ingresados por consola
		Scanner	scanner = new Scanner(System.in);
		
		//1.- Entrada de datos
		System.out.println("Ingrese el primer número:");
		//creamos variable numerica; capturamos el dato numerico(int)
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingrese el segundo número:");
		int numero2 = scanner.nextInt();
		
		//2.- Proceso
		int resultado = numero1 + numero2;
		
		//3.- Salida (Imprimir resultado)
		System.out.println("La suma es: " + resultado);
		//System.out.println("La suma es: " + (numero1 + numero2));
		scanner.close();
		
	}
}
