package cl.skillnest.herencia.clases;
/**
 * clase Padre
 * */
public class Vehiculo {
		//atributos
	   private String marca;
	   private int año;
	   
	   //constructores
	   public Vehiculo() {}
	   
	   public Vehiculo(String marca, int año) {
		super();// constructor de la clase object
		this.marca = marca;
		this.año = año;
	   }
	   
	   // getters y setters
	   public String getMarca() {
		   return marca;
	   }

	   public void setMarca(String marca) {
		   this.marca = marca;
	   }

	   public int getAño() {
		   return año;
	   }

	   public void setAño(int año) {
		   this.año = año;
	   }
	   
	   
	   public void mostrarDetalles() {
	       System.out.println("Marca: " + marca + ", Año: " + año);
	   }

	   @Override
	   public String toString() {
		return "Vehiculo [marca=" + marca + ", año=" + año + "]";
	   }


	   
	   
	   
}
