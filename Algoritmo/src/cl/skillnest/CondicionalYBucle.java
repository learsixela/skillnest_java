package cl.skillnest;

public class CondicionalYBucle {

	public static void main(String[] args) {
		// Condicionales
		
		int numero1= 5;
		
		/*if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		}*/
		
		if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}

		/**
		 * Switch
		 * **/
		switch (numero1) {
		//en el case se evalua el contenido de la variable
		case 1:
			System.out.println("Es el Lunes");
			break;
		case 2:
			System.out.println("Es el Martes");
			break;
		case 3:
			System.out.println("Es el Miercoles");
			break;
		case 4:
			System.out.println("Es el Jueves");
			break;
		case 5:
			System.out.println("Es el Viernes");
			break;
		case 6:
			System.out.println("Es el Sabado");
			break;
		case 7:
			System.out.println("Es el Domingo");
			break;
		default:
			System.out.println("Indeterminado o no es un dia de la semana");
			break;
		}
		
		/**
		 * Bucle For
		 * ***/
		
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("i = " + i);
		}
		
		
		
		

		
		
		
		
		
	}

}
