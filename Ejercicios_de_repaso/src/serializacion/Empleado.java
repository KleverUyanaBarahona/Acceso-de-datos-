package serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable {
	
		
		public Empleado(String n, double s) {
			nombre=n;
			sueldo=s;

		}
		
		public String getNombre() {
			return nombre;
		}
		public double getSueldo() {
			return sueldo;
		}
		
		
		private String nombre;
		private double sueldo;

	
}
