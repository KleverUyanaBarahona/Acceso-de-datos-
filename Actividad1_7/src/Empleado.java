/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.Serializable;


public class Empleado implements Serializable {
    private String nombre,fecha;
    private double sueldo;
    private boolean esJefe;
    private int id;
    // Constructor vacio para que no de me error al extender la clase en Jefe
    protected Empleado(){
        
    }
    // Constructor
    protected Empleado(String nombre, String fecha, double sueldo, boolean esJefe,int id) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.sueldo = sueldo;
        this.esJefe = esJefe;
        this.id = id;
    }
    // Getter y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEsJefe() {
        return esJefe;
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() { //Sobreescribo el metodo toString para mostrar los datos que nos interesan
        return "Id Emp: "+id+" " + "nombre:" + nombre + ", fecha de alta:" + fecha + ", sueldo:" + sueldo + " ";
    }
    
    
}
