package cl.skillnest.interfaz.clases;

public interface Vehiculo {
	//metodos(abstractos) para ser implementados
	void acelerar();
	void frenar();
    int obtenerVelocidad();
    
    //metodo default
    default void pasarCambios() {
    	System.out.println("cuidado estoy cambiando marcha");
    }
    
    //metodo static (Java 8+)
    static void senializarGiro() {
    	System.out.println("Cuidado que voy a girar");
    }
    
    

}
