package xml_tutorial;

import java.io.*;

public class Persona implements Externalizable{

     // Propiedades
     private String nombre;
     private int edad;
    
     // Constructor
     public Persona(){}
    
     // Métodos
     public void setNombre(String nombre){
          this.nombre = nombre;
     }
    
     public void setEdad(int edad){
          this.edad = edad;
     }
    
     public String getNombre(){
          return nombre;
     }
    
     public int getEdad(){
          return edad;
     }
    
     public void writeExternal(ObjectOutput out) throws IOException{
          out.writeObject(nombre);
          out.writeObject(edad);
     }
    
     public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
          nombre = (String)in.readObject();
          edad = (int)in.readObject();
     }
}