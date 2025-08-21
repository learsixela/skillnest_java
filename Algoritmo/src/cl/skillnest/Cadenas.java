package cl.skillnest;

public class Cadenas {

	public static void main(String[] args) {
		String str1 = "Hola";
		String str2 = "Mundo";
		String resultado = str1.concat(str2); // Concatena "Hola" y "Mundo"
		System.out.println(resultado); // Salida: "HolaMundo"
		
		String cadena1 = str1+" "+str2;
		System.out.println(cadena1);// Salida: "Hola Mundo"
		
		
		int posicion = cadena1.indexOf("Mundo"); // Encuentra la posición de "Mundo" en la cadena
		System.out.println(posicion); // Salida: 5
		System.out.println(cadena1.indexOf("H"));//0
		System.out.println(cadena1.indexOf("o"));//la primera coincidencia
		System.out.println(cadena1.indexOf("O"));//-1
		
		
		String str = "   Hola Mundo   ";
		System.out.println(str.length());
		String sinEspacios = str.trim(); // Elimina los espacios en blanco iniciales y finales
		System.out.println(sinEspacios); 
		System.out.println(sinEspacios.length()); 
		
		String sinEspaciosStrip = str.strip();
		System.out.println(sinEspaciosStrip);
		System.out.println(sinEspaciosStrip.length());
		
		String str3 = "Hola";
		String str4 = "Hola";
		boolean sonIguales = str3.equals(str4); // Compara si las cadenas son iguales
		System.out.println(sonIguales); // Salida: true
	}

}
