package cl.skillnest.clases;

public class Reloj {
	   // Atributos privados para encapsular el estado del reloj
	   private int hora;
	   private int minuto;
	   private int segundo;
	   private boolean alarmaActiva;
	   private int horaAlarma;
	   private int minutoAlarma;

	   // Constructor para inicializar el reloj con la hora actual
	   public Reloj(int hora, int minuto, int segundo) {
	       this.hora = hora;
	       this.minuto = minuto;
	       this.segundo = segundo;
	       this.alarmaActiva = false; // La alarma está desactivada por defecto
	   }

	   // Método de instancia para establecer la alarma, no existe la palabra STATIC
	   public void establecerAlarma(int horaAlarma, int minutoAlarma) {
	       this.horaAlarma = horaAlarma;
	       this.minutoAlarma = minutoAlarma;
	       this.alarmaActiva = true;
	       System.out.println("Alarma establecida para las " + this.horaAlarma + ":" + this.alarmaActiva);
	   }

	   // Método de instancia para desactivar la alarma
	   public void desactivarAlarma() {
	       this.alarmaActiva = false;
	       System.out.println("Alarma desactivada");
	   }

	   // Método de instancia para mostrar la hora actual
	   public void mostrarHora() {
	       System.out.println("Hora actual: " + this.hora + ":" + this.minuto + ":" + this.segundo);
	   }

	   // Método de instancia para avanzar un segundo
	   public void tickSegundo() {
	       this.segundo++;
	       if (this.segundo >= 60) {
	           this.segundo = 0;
	           this.minuto++;
	           if (this.minuto >= 60) {
	               this.minuto = 0;
	               this.hora++;
	               if (this.hora >= 24) {
	                   this.hora = 0;
	               }
	           }
	       }
	       // Comprobar si la alarma debe sonar
	       comprobarAlarma();
	   }

	   // Método privado para comprobar la alarma
	   private void comprobarAlarma() {
		   System.out.println(this.alarmaActiva);
	       if (this.alarmaActiva && this.hora == this.horaAlarma && this.minuto == this.minutoAlarma && this.segundo == 0) {
	           System.out.println("¡Ring! ¡Ring! La alarma suena a las " + this.hora + ":" + this.minuto);
	           this.alarmaActiva = false;
	       }
	   }
	}