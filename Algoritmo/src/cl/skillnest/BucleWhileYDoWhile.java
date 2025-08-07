package cl.skillnest;

public class BucleWhileYDoWhile {

	public static void main(String[] args) {
		/**
		 * while
		 */
		int contador = 2;
		System.out.println("Inicio de while");
		while (contador > 0) {
			System.out.println("Dentro de while");
			contador--;
		}
		System.out.println("Fuera de while");

		
		/**
		 * Do-While;  Ejecuta al menos una vez.
		 * **/
		System.out.println("Inicio de do-while");
		do {
			System.out.println("Dentro de do-while");
		} while (contador > 0);
		System.out.println("Fuera de do-while");
		
		//TODO realizar un menu donde el usuario elija sus opciones
		//calculadora: operar con 2 numeros (suma, resta, multiplicacion, division) 
	}

}
