
 

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacion {
    static int id = 0; // Id del empleado
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>(); // Creamos el arrayList que almacena los empleados tipo y empleado y tipo Jefe
   
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
         
       
         //Aplicacion aplicacion = new Aplicacion();
        Scanner teclado = new Scanner(System.in);
         int opc=0;
        while(opc !=4){ // Mientras no se pulsa 5 no sale del bucle
            
            pintarMenu();
            switch(opc){
                
                case 1:
                       
                    try  {
                        Aplicacion.crearEmpleado();
                        
                    }catch (Exception e){}
                        pintarMenu();
                    break;
                case 2:
                        try  {
                        Aplicacion.eliminarEmpleado();
                        }catch(InputMismatchException e){
                            System.out.println("Solo numeros sino peta el programa."+ e);
                        }
                        pintarMenu();
                    break;
                case 3:
                        leerEmple();
                        pintarMenu();
                    break;
               case 4:
                      
                   break;
                 
                default: 
                    if(opc != 0) // si no es 0 le indico que elija una opci√≥n valida ya que he inicializado en 0 la variable
                    System.out.println("Opcionn no valida elija un numero del 1 al 4");break;
                    
            }
            try {
                System.out.println("Elija una opcionn:");
                opc = teclado.nextInt();
            }catch(Exception e){
                System.out.println("Error en la aplicacion");
                System.out.println(e);
                       pintarMenu();         
                   teclado = new Scanner(System.in);
                            opc = teclado.nextInt();
            }
        }
        
    }
    
      public static void pintarMenu(){ // Pinta menu
                
        System.out.println("=============================");
        System.out.println("=    Gestion de empleados   =");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("1∫ Anadir Empleado");
        System.out.println("2∫ Eliminar Empleado");
        System.out.println("3∫ Mostrar datos del Empleado");
        System.out.println("4∫ Salir");
        
    }
      public static void crearEmpleado() throws IOException{
        id++; // Aumenta el id del empleado, asi el primero es el numero 1 y no el 0 que es como lo habia inicalizado.
        String nombre,fecha,esJefe;
        double sueldo,incentivo;
        System.out.println(" ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca nombre del empleado:");
        nombre = teclado.nextLine();
        System.out.println("Introduzca fecha de alta del empleado:");
        fecha = teclado.nextLine();
        System.out.println("Introduzca sueldo del empleado:");
        sueldo = teclado.nextDouble();
        System.out.println("Es jefe SI/NO");
        esJefe = teclado.next();
        if(esJefe.equals("SI") || esJefe.equals("si") || esJefe.equals("Si")){ // Si le indicamos que es jefe crea un Objeto de tipo Jefe y lo a√±ade al arrayList
            System.out.println("Introduzca incentivo del empleado Jefe:");
            incentivo = teclado.nextDouble(); // Le pedimos el incentivo al ser un Jefe
            Jefe jefe = new Jefe(nombre,fecha,sueldo,true,incentivo,id);
            //((Jefe)jefe).getIncentivo();
            
            addEmple(jefe);// Metodo que a√±ade empleados en un arrayList
    
        }else{  // Si es empleado normal se le a√±aden solo los datos del empleado normal
            Empleado empleado = new Empleado(nombre,fecha,sueldo,false,id);
            addEmple(empleado);
            
        //}
            System.out.println("Empleado dado de alta!!!");
         
        
      }
      }
      
      public  static void mostrarEmpleados(){ // Metodo que saca por pantalla los empleados
          
           if(empleados.isEmpty())System.out.println("No existen empleados, elija otra opcionn");// Si la lista esta vacia se lo indicamos
           else{
          for(int i=0;i<empleados.size();i++){ // bucle que recorre el ArrayList
               System.out.println("Registro num:"+(i+1)+" --> "+empleados.get(i).toString()); // Saco por pantalla los datos de los empleados con el metodo toString
             
      }}
      }
      public static void eliminarEmpleado(){
          if(empleados.isEmpty())System.out.println("No existen empleados a eliminar, elija otra opcion");// Si la lista esta vacia no le permitimos borrar nada.
          else{
              
          Scanner teclado = new Scanner(System.in);
          int id;
          System.out.println(" ");
          System.out.println("Eliminando empleados!!!");
          System.out.println("=======================");
          System.out.println(" ");
          mostrarEmpleados();
          System.out.println(" ");
          System.out.println("Indique el numero de registro que dese√© eliminar:");
          id = teclado.nextInt();
                        System.out.println(empleados.size());

          if(id > empleados.size() || id <= 0) System.out.println("No se puede borrar ese registro, no existe");
          else{
             
           empleados.remove(id-1);
           
          System.out.println("Empleado Eliminado!!!");
          }
      }}
   
      public static void addEmple(Empleado obj) throws FileNotFoundException, IOException{
          String nombre="";
          if(obj.getClass() == Empleado.class){
          nombre ="ficheroEmple.dat";    
          }else nombre ="ficheroJefe.dat";
          
          File fichero = new File(nombre);//declara el fichero
          
          ObjectOutputStream dataOS;
   if (!fichero.exists()){
       dataOS = new ObjectOutputStream(new FileOutputStream(fichero));
   } else {
       dataOS = new MiObjectOutputStream(new FileOutputStream(fichero,true));
   }
   	  dataOS.writeObject(obj);  
          dataOS.close();
  }     
     
       public static void leerEmple() throws FileNotFoundException, IOException, ClassNotFoundException{
        
	 
		Empleado perso = new Empleado(); // defino la variable persona
                Jefe jefe =   new Jefe();
		File fichero2 = new File("ficheroJefe.dat");
                File fichero = new File("ficheroEmple.dat");
		
		ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));
                ObjectInputStream dataIS2 = new ObjectInputStream(new FileInputStream(fichero2));

		int i = 1;
		 try{
			while (true) { // lectura del fichero
			
                               
                                perso = (Empleado)dataIS.readObject();
				System.out.print(i + "=>");
				i++;
				System.out.println(perso.toString());
                                
                               
                         
		 
                        }
                              
                 }catch(Exception e){}
                 
                 try{     
                        while(true){
                            
                                jefe = (Jefe)dataIS2.readObject();
				System.out.print(i + "=>");
                                System.out.println(jefe.toString());
				i++;
		
                        }
                        
                 }catch(Exception e){    
      
                      
       }
       }
  }
  
      

