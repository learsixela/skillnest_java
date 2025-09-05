package cl.skillnest.polimorfismo.interfaz;

public class Cuadrado implements Figura {
    double lado;

    public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
    public double calcularArea() {
        return lado * lado;
    }
    
    



}
