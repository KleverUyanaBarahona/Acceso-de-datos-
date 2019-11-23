
 

import java.io.Serializable;


public class Jefe extends Empleado  implements Serializable{
    private double incentivo; // Atributo que solo tienen los jefes
    protected Jefe() {
    }
 
    protected Jefe(String nombre, String fecha, double sueldo, boolean esJefe,double incentivo,int id) {
        super(nombre, fecha, sueldo, esJefe,id);// Heredamos los atributos del Empleado
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
        
    }

    @Override
    public String toString() { // Sobreescribimos el metodo toString de la clase Jefe
        return super.toString()+ " "+ "incentivo=" + incentivo ;
    }
    
    
}
