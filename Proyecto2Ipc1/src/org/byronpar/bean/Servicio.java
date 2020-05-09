/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.bean;
import org.byronpar.TDA.PilaRepuestoServicio;

/**
 *
 * @author HP ENVY
 */
public class Servicio {
    private long idServicio;
    private String nombreServicio;
    private String marca;
    private String modelo;
    private PilaRepuestoServicio listaRepuesto;
    private float precioManodeObra;
    private float precioTotal;
    private static long numServicio=1;

    public Servicio(String nombreServicio, String marca, String modelo, PilaRepuestoServicio listaRepuesto, float precioManodeObra, float precioTotal) {
        this.idServicio = Servicio.getNumServicio();
        this.nombreServicio = nombreServicio;
        this.marca = marca;
        this.modelo = modelo;
        this.listaRepuesto = listaRepuesto;
        this.precioManodeObra = precioManodeObra;
        this.precioTotal = precioTotal;
        numServicio++;
    }
    
    public Servicio(String nombreServicio, float precioManodeObra) {
        this.idServicio = Servicio.getNumServicio();
        this.nombreServicio = nombreServicio;
        this.precioManodeObra = precioManodeObra;
        this.precioTotal=precioManodeObra;
        numServicio++;
    }
    
    public Servicio(int id,String nombreServicio, String marca, String modelo, PilaRepuestoServicio listaRepuesto, float precioManodeObra, float precioTotal) {
        this.idServicio = id;
        this.nombreServicio = nombreServicio;
        this.marca = marca;
        this.modelo = modelo;
        this.listaRepuesto = listaRepuesto;
        this.precioManodeObra = precioManodeObra;
        this.precioTotal = precioTotal;
        
    }
    
    public Servicio(int id,String nombreServicio, float precioManodeObra) {
        this.idServicio = id;
        this.nombreServicio = nombreServicio;
        this.precioManodeObra = precioManodeObra;
        this.precioTotal=precioManodeObra;
        
    }

    public static long getNumServicio() {
        return numServicio;
    }

    public static void setNumServicio(long numServicio) {
        Servicio.numServicio = numServicio;
    }

    
    
    
    public long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
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

    public PilaRepuestoServicio getListaRepuesto() {
        return listaRepuesto;
    }

    public void setListaRepuesto(PilaRepuestoServicio listaRepuesto) {
        this.listaRepuesto = listaRepuesto;
    }

    

    public float getPrecioManodeObra() {
        return precioManodeObra;
    }

    public void setPrecioManodeObra(float precioManodeObra) {
        this.precioManodeObra = precioManodeObra;
    }

    

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
}
