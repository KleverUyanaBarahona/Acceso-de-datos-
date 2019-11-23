
import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class LecturaficheroEmpleXml {
 public static void main(String argv[]) {
  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
  try {
	 
	  DocumentBuilder builder = factory.newDocumentBuilder();
	  Document document = builder.parse(new File("ficheroEmple.xml"));
	  document.getDocumentElement().normalize();

	  System.out.println("Elemento raíz: " + document.getDocumentElement().getNodeName());
	  NodeList empleados = document.getElementsByTagName("empleado");

	  for (int i = 0; i < empleados.getLength(); i ++) {

	    Node emple = empleados.item(i);

	    if (emple.getNodeType() == Node.ELEMENT_NODE) {

            Element elemento = (Element) emple;

            System.out.println("ID: " + getNodo("id", elemento));
            System.out.println("Apellido: " + getNodo("apellido", elemento));
            System.out.println("Fecha: " + getNodo("fecha", elemento));
			System.out.println("Sueldo: " + getNodo("sueldo", elemento));

	    }
    }
  } catch (Exception e) { e.printStackTrace();}
 }
 

 private static String getNodo(String etiqueta, Element elem)
 {
	  NodeList nodo= elem.getElementsByTagName(etiqueta).item(0).getChildNodes();
	  Node valornodo = (Node) nodo.item(0);
	  return valornodo.getNodeValue();
 }
}
