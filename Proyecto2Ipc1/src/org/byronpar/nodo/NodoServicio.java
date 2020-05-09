/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.nodo;

import org.byronpar.bean.Servicio;

/**
 *
 * @author HP ENVY
 */
public class NodoServicio {
    NodoServicio siguiente;
    Servicio servicio;

    public NodoServicio(Servicio servicio) {
        this.siguiente = null;   //porque el nodo siempre apunta a null
        this.servicio = servicio; //Objeto a almacenas
    } 

    public NodoServicio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoServicio siguiente) {
        this.siguiente = siguiente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
    
    
}
