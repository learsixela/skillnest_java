package cl.skillnest;

public class ClaseMath {

	public static void main(String[] args) {
		// Clase Math
		
		//valor absoluto: distancia en el numero y el cero en una recta (eje x)
		int a = -100;
		int b = 100;
		double c= 10.5;
		long d = 200L;
		
		System.out.println(Math.abs(a)); // 100
		System.out.println(Math.abs(b)); // 100
		System.out.println(Math.abs(c)); // 10.5
		
		//Máximo y mínimo entre dos valores

		System.out.println(Math.max(c,b));//100.0
		System.out.println(Math.max(5, 8)); // 8
		System.out.println(Math.max(c, d));//200.0
		
		System.out.println(Math.min(3.5, 2.9)); // 2.9
		System.out.println(Math.min(c,b));//10.5
		System.out.println(Math.min(5, 8)); //5
		System.out.println(Math.min(c, d));//10.5
		
		//Redondeo
		System.out.println(Math.round(4.5)); // 5-> 4.5;4.6;4.7;4.8;4.9, al entero mas cercano
		System.out.println(Math.ceil(4.1));  // 5.0 (redondeo hacia arriba)
		System.out.println(Math.floor(4.9)); // 4.0 (redondeo hacia abajo)
		
		//Potencias y raíces

		System.out.println(Math.pow(2, 3)); // 8.0 (2^3-> 2x2x2), siempre retorna un double
		System.out.println(Math.pow(-3, 3));//      (-3^3-> -3 x-3 x -3)
		
		System.out.println(Math.sqrt(16));  // 4.0
		System.out.println(Math.sqrt(0));	// 0.0
		System.out.println(Math.sqrt(-16));	//	-4 x 4 NaN 
		
		System.out.println(Math.cbrt(-27)); //-3.0
		
		//Números aleatorios
		double aleatorio = Math.random(); // Valor entre 0.0 y 1.0
		System.out.println("random "+ aleatorio);
		
		int entre1y10 = (int)(aleatorio * 100) + 1;
		System.out.println(entre1y10); // Número aleatorio entre 1 y 10
		
		//Trigonometría

		double anguloGrados = 45;
		double anguloRadianes = Math.toRadians(anguloGrados);
		System.out.println("anguloRadianes "+anguloRadianes);
		System.out.println("seno "+Math.sin(anguloRadianes));
		System.out.println("coseno "+Math.cos(anguloRadianes));
		System.out.println("tangente "+Math.tan(anguloRadianes));
		
		//Logaritmos y Exponencial
 
		System.out.println(Math.log(1));    // 0.0 (logaritmo natural)
		System.out.println(Math.log10(1000)); // 3.0
		System.out.println(Math.exp(1)); // 2.718281828459045 e^1
		
		//Constantes
		System.out.println("PI "+Math.PI);
		System.out.println("E "+ Math.E);
		System.out.println("TAU "+ Math.TAU);
		
		System.out.println(Math.PI * Math.pow(3, 2)); // Área de un círculo con radio 3
		
		//hipotenusa
		System.out.println("Hipotenusa " + Math.hypot(3.0, 4.0));
	}

}
