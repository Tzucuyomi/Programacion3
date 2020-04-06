/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;
/**
 *
 * @author Dell Laptop
 */
public class MiObjectOutputStream extends ObjectOutputStream{
        //sobreescribir el metodo que crea la cabecera
    protected void writeStreamHeader() throws IOException{
        //no vuelve a crear la cabecera en el fichero
    }
    //constructores
    public MiObjectOutputStream() throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
}
