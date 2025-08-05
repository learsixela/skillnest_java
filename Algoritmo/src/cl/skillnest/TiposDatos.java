package cl.skillnest;

public class TiposDatos {

	public static void main(String[] args) {
		/*En Java, una variable es una referencia a un espacio de memoria 
		que contiene un valor. 
		Debe declararse con un tipo de dato
		*/
		/**
		 * Tipos de datos primitivos
		 * */
		
		
		/**
		 * boolean
		 * **/
		boolean estaPresente = true;//logico, verdado o falso
		
		char vocal_a = 'a';// carácter (comillas simples), carácter Unicode de 16 bits
		
		//byte -128 al 127
		//short  -32,768 a 32,767.
		int edad = 10; //entero -2^31 a (2^31)-1.

		float precio = 12345.4f;//float,precisión simple de 32 bits
		double altura = 1.79;//decimal,precisión simple de 64 bits
		long numero_grande = 12345678912345678L;// 64 bits, con un rango de -2^63 a (2^63)-1
		
		/**
		 * Tipo String
		 * **/
		String nombre = "Mijail";
		
		Integer numero1 = 12346;
		
		System.out.println("int edad = " + edad);
		System.out.println("double altura = " + altura);
		System.out.println("boolean estaPresente = "+ estaPresente);
		System.out.println("char vocal_a = " + vocal_a);
		System.out.println("float precio = "+ precio);
		System.out.println("long numero_grande = " + numero_grande);
		System.out.println("String nombre = " + nombre);
		System.out.println("Integer numero1 = " + numero1);
		
		
	}

}
