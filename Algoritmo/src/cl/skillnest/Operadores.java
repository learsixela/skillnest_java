package cl.skillnest;

public class Operadores {

	public static void main(String[] args) {
		// Operadores Aritmeticos
		// + - * / %

		int numero1 = 14 , numero2 = 3;
		
		int suma = numero1 + numero2;//17
		int resta = numero1 - numero2;//11
		int producto = numero1 * numero2;//42
		double division = (float) numero1 / numero2;//4.666666666666667 ; 4.666666507720947
		
		System.out.println("La suma es: " +suma);
		System.out.println("La resta es: " +resta);
		System.out.println("La multiplicación es: " + producto);
		System.out.println("La división es: " + division);
		
		int modulo = numero1 % numero2;// 14/3=4 sobran 2 -> 2 es el resto
		System.out.println("El modulo o resto de dividir es: " + modulo);
		
		/*determinar si un numero es par o impar
		 * 4/2=2
		 * 0 si es cero es par
		 * 
		 * 5/2=2
		 * 1
		 * 
		 * -7/2=3
		 * -1
		 * 
		 * 7/2=3
		 * 1
		
		
		
		
		
		*/
	}

}
