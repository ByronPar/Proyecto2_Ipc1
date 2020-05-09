/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.bean;

/**
 *
 * @author HP ENVY
 */
public class Repuesto {
    private long idRepuesto;
    private String nombreRepuesto;
    private String marca;
    private String modelo;
    private long existencia;
    private float precio;
    private static long numRepuesto=1;

    public Repuesto(String nombreRepuesto, String marca, String modelo, long existencia, float precio) {
        this.idRepuesto = Repuesto.getNumRepuesto();
        this.nombreRepuesto = nombreRepuesto;
        this.marca = marca;
        this.modelo = modelo;
        this.existencia = existencia;
        this.precio = precio;
        numRepuesto++;
    }
    
    
    
    public Repuesto(long id,String nombreRepuesto, String marca, String modelo, long existencia, float precio) {
        this.idRepuesto = id;
        this.nombreRepuesto = nombreRepuesto;
        this.marca = marca;
        this.modelo = modelo;
        this.existencia = existencia;
        this.precio = precio;
        
    }
    
    
    
   

    
    
    
    
    
    
    
    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }


    
    
    
    
    public long getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(long idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getExistencia() {
        return existencia;
    }

    public void setExistencia(long existencia) {
        this.existencia = existencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    

    public static long getNumRepuesto() {
        return numRepuesto;
    }

    public static void setNumRepuesto(long numRepuesto) {
        Repuesto.numRepuesto = numRepuesto;
    }
    
    
    
    
    
}
