/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.nodo;

import org.byronpar.bean.Repuesto;

/**
 *
 * @author HP ENVY
 */
public class NodoRepuesto {
    NodoRepuesto siguiente;
    Repuesto repuesto;
    
    public NodoRepuesto(Repuesto repuesto){
    this.repuesto=repuesto;// Objeto a Almacenar
    this.siguiente= null;  //  porque el nodo siempre apunta a null
    }

    public NodoRepuesto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRepuesto siguiente) {
        this.siguiente = siguiente;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }
    
    
}
