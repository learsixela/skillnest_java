package cl.skillnest;

import java.util.ArrayList;

public class TiposDatos2 {

	public static void main(String[] args) {
		// Autoboxing: convertir un primitivo a objeto
		int numero = 38;
		Integer numeroObjeto = numero;
		
		//Unboxing: un objeto a primitivo
		int numero2 = numeroObjeto;
		
		System.out.println("el numero primitivo: " + numero);
		System.out.println("El numero objeto: " + numeroObjeto);
		System.out.println("El numero unboxing: " + numero2 );

		
		/**
		 * Wrapper
		 * **/
		
		String texto = "1234";
		int numero3 = Integer.parseInt(texto);
		String texto2 =  Integer.toString(numero3);//String.valueOf(numero3);//numero3+"";
		Integer numero4 = Integer.parseInt(texto);
		String texto3 = numero4.toString();
		
		System.out.println("Texto: "+ texto);
		System.out.println("Texto2: "+ texto2);
		System.out.println("Texto3: "+ texto3);
		
		//--------------------------------------------
		double decimal = Double.parseDouble("8.8");
		System.out.println("El decimal: "+ decimal);
		
		boolean existe = Boolean.parseBoolean("tRUe");//si agrego otro valor, siempre arroja false
		
		System.out.println("Existe? "+ existe);
		
		//----------------- ArrayList--------------------------
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		//var listaNumeros = new ArrayList<>();
		
		System.out.println(listaNumeros);
		System.out.println(listaNumeros.size());
		
		listaNumeros.add(40);
		listaNumeros.add(10);//agregar elementos al final del arreglo, 
		listaNumeros.add(20);
		System.out.println(listaNumeros);
		
		//recorrer arreglo
		for (Integer elemento : listaNumeros) {
			System.out.println("El elemento " + elemento);
		}
		
		/*************** comparaciones************************/
		
		int numeroA = 100;
		int numeroB = 100;
		
		System.out.println(numeroA == numeroB);//true; compara valores
		
		Integer numeroC = 200;
		Integer numeroD = 200;
		
		System.out.println(numeroC == numeroD);//false; compara objeto
		System.out.println(numeroC.equals(numeroD));//true; compara los valores
		
		String nombre = "Israel";
		String name= "Israel";
		
		System.out.println("== ." + (nombre == name));//
		System.out.println("equals "+ name.equals(nombre));//
		
		
		/***************valores por default********************/
		
		int edad = 0;
		System.out.println("la edad es: "+ edad);
		
		char letra = 0;// 'u0000' (el carácter nulo Unicode)
		System.out.println("La letra es: "+ letra);
		
		boolean valor = false;
		System.out.println("El de verdad es: "+ valor);
		
		
		String blancoYNegro , rojo;
	}

}
