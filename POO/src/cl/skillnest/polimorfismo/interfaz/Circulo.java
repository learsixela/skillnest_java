package cl.skillnest.polimorfismo.interfaz;

public class Circulo implements Figura {
	    double radio;

	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    public double calcularArea() {
	        return Math.PI * radio * radio;
	    }
}
