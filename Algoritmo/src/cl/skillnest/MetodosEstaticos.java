package cl.skillnest;

public class MetodosEstaticos {

	//accesador; invocacion; tipo de retorno; nombre_metodo(tipo_dato nombre_parametro) 
	public static void main(String[] args) {
		// llamado al metodo
		int retorno = sumaDosNumeros(10, 20);
		System.out.println("El resultado es: " + retorno);

		restaDosNumeros(50,10);
		restaDosNumeros();
		restaDosNumeros(8.8,4);
		restaDosNumeros(4,8.8);
	}
	
	//metodo estatico
	public static int sumaDosNumeros(int num1, int num2){
		int resultado = num1 + num2;
		return resultado;
	}
	
	//void indica que el metodo no retorna nada
	public static void restaDosNumeros(int num1, int num2) {
		System.out.println("La resta es: " + (num1-num2));
	}
	
	/***
	 * Sobrecarga de metodos
	 */
	public static void restaDosNumeros() {
		System.out.println("Sin parametros: "+(100-50));
		
	}
	public static void restaDosNumeros(double num3, int num4) {
		System.out.println("double e int ,"+(num3-num4));
		
	}
	public static void restaDosNumeros(int num3, double num4) {
		System.out.println("int y double ,"+(num3-num4));
	}
	

}
