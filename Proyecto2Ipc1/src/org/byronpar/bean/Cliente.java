/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.bean;

import org.byronpar.TDA.ListaSimpleCircularAutomovil;

/**
 *
 * @author HP ENVY
 */
public class Cliente {
    private float idCliente;
    private String nombreCliente;
    private String userCliente;
    private String contraCliente;
    private String tipo;
    private ListaSimpleCircularAutomovil automovil;

    public Cliente(float idCliente, String nombreCliente, String userCliente, String contraCliente, String tipo, ListaSimpleCircularAutomovil automovil) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.userCliente = userCliente;
        this.contraCliente = contraCliente;
        this.tipo = tipo;
        this.automovil = automovil;
    }

    
    
    public float getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(float idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getUserCliente() {
        return userCliente;
    }

    public void setUserCliente(String userCliente) {
        this.userCliente = userCliente;
    }

    public String getContraCliente() {
        return contraCliente;
    }

    public void setContraCliente(String contraCliente) {
        this.contraCliente = contraCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ListaSimpleCircularAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(ListaSimpleCircularAutomovil automovil) {
        this.automovil = automovil;
    }
    
    
    
    
}
