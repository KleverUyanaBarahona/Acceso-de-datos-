


/**
 * RedefiniciÛn de la clase ObjectOuputStream para que no escriba una cabecera
 * al inicio del Stream.
 * Para no tener problemas con las cabeceras de los objetos y evitar el error  
 * StreamCorruptedException, creamos una clase con nuestro propio 
 * ObjectOutputStream, heredando del original y redefiniendo el metodo 
 * writeStreamHeader() vacio, para que no haga nada.
 */

import java.io.*;
public class MiObjectOutputStream extends ObjectOutputStream
{
    /** Constructor que recibe OutputStream */
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sin par·metros */
    protected MiObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }

    /** RedefiniciÛn del mÈtodo de escribir la cabecera para que no haga nada. */
    protected void writeStreamHeader() throws IOException
    {
    }

}
