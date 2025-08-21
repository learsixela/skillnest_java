package cl.skillnest;

import java.util.ArrayList;
import java.util.Scanner;

import cl.skillnest.clases.Alumno;
import cl.skillnest.clases.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// crear objeto desde la clase Persona
		// instancia de la clase
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Mijail","Palma",3,0.8f,27.0);
		
		//llamar al metodo
		persona1.caminar();
		persona2.caminar();
		
		System.out.println("Ingresa el nombre del alumno:");
		String nombre = sc.nextLine();
		System.out.println("Ingresa la edad del alumno:");
		int edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa el nombre del curso del alumno:");
		String curso = sc.nextLine();
		System.out.println("Ingresa el numero de lista del alumno:");
		int numeroLista = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa el email del alumno:");
		String email = sc.nextLine();
		
		//creacion del objeto alumno1
		Alumno alumno1 = new Alumno(nombre,edad,curso,numeroLista,email);
		
		Alumno alumno2 = new Alumno();
		
		//arreglo de tipo alumno
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		//System.out.println(alumno2);
		//System.out.println(alumno1);
		
		//recorrer alumnos
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		sc.close();
	}

}
