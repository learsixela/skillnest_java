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
	}

}
