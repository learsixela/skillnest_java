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
		
		
		boolean estaPresente = true;//logico, verdado o falso
		char vocal_a = 'a';// carácter (comillas simples)
		//byte -128 al 127
		//short -32...
		int edad = 10; //entero
		//float,
		float precio = 12345.4f;
		double altura = 1.79;//decimal
		long numero_grande = 12345678912345678L;
		
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
