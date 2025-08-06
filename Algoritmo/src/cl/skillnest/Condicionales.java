package cl.skillnest;

public class Condicionales {

	public static void main(String[] args) {
		// Condicionales
		
		int numero1 = 9;
		// 0/2=0
		// 0-> resto
		
		/*if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		}*/
		
		if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		System.out.println("**************************");
		
		int numero = 0;//cero es un numero neutro
		/*if (numero >= 0) {
		   System.out.println("El número es positivo.");
		} else {
		   System.out.println("El número es negativo.");
		}*/
		/*if (numero < 0) {
			   System.out.println("El número es negativo.");
		} else {
			   System.out.println("El número es positivo.");
		}*/
		
		if (numero < 0) {
			System.out.println("El número es negativo.");
		}else if (numero > 0) {
			System.out.println("El número es positivo.");
		}else {
			System.out.println("El número es igual a cero");   
		}
		
		
		System.out.println("**************************");
		int x = 5;
		int y = 5;
		boolean resultado = (x == y); // Devuelve true
		System.out.println("El resultado 1 es: " + resultado);
		
		int a = 10;
		int b = 20;
		resultado = (a != b); // Devuelve true
		System.out.println("El resultado 2 es: " + resultado);
		
		/**
		 * Operador “not” (!): Invierte el valor de la expresión boleana. 
		 * Devuelve true si la expresión es false, y viceversa.
		 * */
		System.out.println(!true);//false ! -> distinto o contrario o not
		System.out.println(!false);//true
		
		
		//booleana

		
		//V i V = V //and (&&)
		
		//Operador “and” (&&): Devuelve true si ambas expresiones boleanas son verdaderas; de lo contrario, devuelve false.
		boolean expresion1 = true;
		boolean expresion2 = false;
		resultado = expresion1 && expresion2;
		System.out.println("El resultado 3 es: " + resultado);//false
		
		if (expresion1 && expresion2) {
			System.out.println("Operador and(&&)");
		}
		
		
		/***
		 * Operador “or” (||): Devuelve true si al menos una de las expresiones booleanas es verdadera; devuelve false solo si ambas expresiones son falsas.
		 */
		// 0>0 = Falso o 0=0 = verdadero
		//basta una valor verdadero y todo es verdad
		//F v F = F //or (||)
		boolean expresion3 = true;
		boolean expresion4 = false;
		resultado = expresion4 || expresion3;
		System.out.println("El resultado 4 es: " + resultado);
		
		System.out.println("El resultado !4 es: " + !resultado);
		System.out.println("El resultado !4 es: " + !(expresion4 || expresion3));
		
		/**
		 * Operador Ternario
		 * */
		
		int edad = 2;
		String mayorDeEdad = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
		System.out.println(mayorDeEdad);
		System.out.println((edad >= 18) ? "Mayor de edad" : "Menor de edad");
		
		
		
		/**
		 * Switch
		 * **/
		
		int opcion = 10;
		String diaSemana = "";
		switch (opcion) {
		//en el case se evalua el contenido de la variable
		case 1:
			System.out.println("Es el Lunes");
			diaSemana = "Lunes";
			break;
		case 2:
			System.out.println("Es el Martes");
			diaSemana = "Martes";
			break;
		case 3:
			diaSemana = "Miercoles";
			System.out.println("Es el Miercoles");
			break;
		case 4:
			diaSemana = "Jueves";
			System.out.println("Es el Jueves");
			break;
		case 5:
			diaSemana = "Viernes";
			System.out.println("Es el Viernes");
			break;
		case 6:
			diaSemana = "Sabado";
			System.out.println("Es el Sabado");
			break;
		case 7:
			diaSemana = "Domingo";
			System.out.println("Es el Domingo");
			break;
		default:
			System.out.println("switch: Indeterminado o no es un dia de la semana");
			break;
		}
		System.out.println("Fuera del switch "+ diaSemana);

	}

}
