/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dell Laptop
 */
public class NodoEscritorio {
    Escritorio escritorio;
    NodoEscritorio siguiente;
    
    
    public NodoEscritorio(Escritorio escritorio){
    this.escritorio=escritorio;
    this.siguiente=null;
}
}
