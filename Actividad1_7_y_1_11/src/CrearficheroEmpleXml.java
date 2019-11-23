
import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class CrearficheroEmpleXml {
 public static void main(String argv[]) throws IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, ClassNotFoundException{
   File fichero = new File("ficheroEmple.dat");   
   ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));
  
   
   boolean esJefe;
 //Para situarnos al principio del fichero.dat 
   int  id, posicion=0;       
   double sueldo;
   String nombre;
   String fecha;
  
   	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     DocumentBuilder builder = factory.newDocumentBuilder();
     DOMImplementation implementation = builder.getDOMImplementation();
     Document document = implementation.createDocument(null, "Empleados", null);
   //Version XML
     document.setXmlVersion("1.0"); 
     int i=1;
			
		try {
			while (true) { // Lectura 
             Empleado   perso = (Empleado)dataIS.readObject();
             			id = perso.getId();
                        nombre = perso.getNombre();
                        fecha = perso.getFecha();
                        sueldo = perso.getSueldo();
                     
                        Element raiz = document.createElement("empleado");
                        document.getDocumentElement().appendChild(raiz);   
                        CrearElemento("id",String.valueOf(id),raiz,document);
                        CrearElemento("apellido",nombre,raiz,document);
                        CrearElemento("fecha",fecha,raiz,document);
                        CrearElemento("sueldo",String.valueOf(sueldo),raiz,document);
			}	  
     } catch (EOFException eo) {
			 
		} catch (StreamCorruptedException x) {
		
                
                dataIS.close();
		}
		
     Source source = new DOMSource(document);
     Result result = new StreamResult(new java.io.File("ficheroEmple.xml"));        
     Transformer transformer = TransformerFactory.newInstance().newTransformer();
     transformer.transform(source, result);
	 Result console= new StreamResult(System.out);
     transformer.transform(source, console);
	  	
 }
 
 //Insertamos los datos del empleado
 static void  CrearElemento(String datoEmple, String valor,Element raiz, Document document){
       Element elem = document.createElement(datoEmple); //Creamos hijo
	   Text text = document.createTextNode(valor); //Damos valor
	   raiz.appendChild(elem); //Pegamos el elemento hijo a la raiz
	   elem.appendChild(text); //Pegamos el valor		 	
 }
}