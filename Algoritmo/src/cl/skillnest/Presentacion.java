package cl.skillnest;

import java.util.Scanner;

public class Presentacion {

	public static void main(String[] args) {
		// Solicitar y mostrar sus datos personales
		// nombre, apellido, edad, direccion, correo
		// Mostrar mensaje con toda la información

		Scanner	scanner = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingreda edad");
		int edad = scanner.nextInt();//45 
		scanner.nextLine();
		
		System.out.println("Ingresa tu direccion");
		String direccion = scanner.nextLine();
		
		//String.format()
		//%s - String; %d int; %2.f decimal
		
		//Proceso
		String saludo= String.format("Hola %s. tienes %d años, tu direccion es %s ",nombre,edad,direccion);
		
		//salida
		System.out.println(saludo);
		
		scanner.close();
	}

}
