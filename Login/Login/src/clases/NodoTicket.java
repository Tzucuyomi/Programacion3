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
public class NodoTicket {
    Ticket ticket;
    NodoTicket siguiente;
    
    
    public NodoTicket(Ticket ticket){
    this.ticket=ticket;
    this.siguiente=null;
}
}
