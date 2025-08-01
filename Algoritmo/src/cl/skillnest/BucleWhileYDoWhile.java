package cl.skillnest;

public class BucleWhileYDoWhile {

	public static void main(String[] args) {
		/**
		 * while
		 */
		int contador = 0;
		System.out.println("Inicio de while");
		while (contador > 0) {
			System.out.println("Dentro de while");
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
		
		
	}

}
