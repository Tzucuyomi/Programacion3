/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author Dell Laptop
 */
public class Usuario implements Serializable {
    
    String user;
    String password;
    String tipoUsuario;
    
    
    public Usuario(String user, String password, String tipoUsuario){
        this.user=user;
        this.password=password;
        this.tipoUsuario=tipoUsuario;
    }
    
    public void setUser(String user) {
        this.user = user;
    }       
    public String getUser() {
        return user;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    
    
}
