package cl.skillnest.polimorfismo;

import cl.skillnest.polimorfismo.clases.Animal;
import cl.skillnest.polimorfismo.clases.Gato;
import cl.skillnest.polimorfismo.clases.Perro;
import cl.skillnest.polimorfismo.interfaz.Circulo;
import cl.skillnest.polimorfismo.interfaz.Cuadrado;
import cl.skillnest.polimorfismo.interfaz.Figura;

public class Aplicacion {

	public static void main(String[] args) {
		Perro perro = new Perro();
		Gato gato = new Gato();
		perro.hacerSonido();//metodo sobre escrito
		gato.hacerSonido(); //metodo del padre

        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        //su comportamiento cambia en tiempo de ejecución gracias al polimorfismo.
        //polimorfismo 
        animal1.hacerSonido();
        animal2.hacerSonido();
        
        /**
         * Implementando polimorfismo mediante interfaces
         */
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Circulo(3.0);

        System.out.println(f1.calcularArea()); // 16.0
        System.out.println(f2.calcularArea());
	}

}
