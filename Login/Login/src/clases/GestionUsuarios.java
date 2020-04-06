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
public class GestionUsuarios {
    public static Usuario usuario , usuarioLeido;
    
    
        public void RecibirUsuario(Usuario usuario) throws IOException{
        try{
            File fichero = new File("Usuario.txt");
                ObjectOutputStream oos;
                if(fichero.length() == 0){
                    fichero.createNewFile();
                    oos = new ObjectOutputStream(new FileOutputStream(fichero));
                }else{
                    oos= new MiObjectOutputStream(new FileOutputStream(fichero,true));
                }
                oos.writeObject(usuario);
                oos.close();
        }
            catch(IOException e){
                System.out.println("Error");
            }
    }
        public static void setEscritura() throws FileNotFoundException, IOException{
      
        }
        
        
        
        
        
        
    public Usuario BuscarUser(Usuario usuario) throws IOException, FileNotFoundException, ClassNotFoundException{
        try{
            File fichero = new File("Usuario.txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));

            while (true){
                Usuario usuarioFichero= (Usuario) ois.readObject();
                if(usuarioFichero.getUser().equals(usuario.getUser()) && usuarioFichero.getPassword().equals(usuario.getPassword())){
                    return usuarioFichero;
                }
            } 
            
        }catch(IOException e){
            Interfaces.Error accesoError = new Interfaces.Error();
            accesoError.setVisible(true);
        } 
        return null;
    }
}
