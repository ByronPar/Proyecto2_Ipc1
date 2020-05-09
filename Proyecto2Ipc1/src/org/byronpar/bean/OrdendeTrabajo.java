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
public class OrdendeTrabajo {
    private long idOrdenDeTrabajo;
    private Automovil auto;
    private Cliente cliente;
    private Servicio servicio;
    private String fecha;
    private Empleado mecanicoEmpleado;
    private String Estado;

    public OrdendeTrabajo(long idOrdenDeTrabajo, Automovil auto, Cliente cliente, Servicio servicio, String fecha, Empleado mecanicoEmpleado, String Estado) {
        this.idOrdenDeTrabajo = idOrdenDeTrabajo;
        this.auto = auto;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.mecanicoEmpleado = mecanicoEmpleado;
        this.Estado = Estado;
        
    }

    
    
    
    
    public long getIdOrdenDeTrabajo() {
        return idOrdenDeTrabajo;
    }

    public void setIdOrdenDeTrabajo(long idOrdenDeTrabajo) {
        this.idOrdenDeTrabajo = idOrdenDeTrabajo;
    }

    public Automovil getAuto() {
        return auto;
    }

    public void setAuto(Automovil auto) {
        this.auto = auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getMecanicoEmpleado() {
        return mecanicoEmpleado;
    }

    public void setMecanicoEmpleado(Empleado mecanicoEmpleado) {
        this.mecanicoEmpleado = mecanicoEmpleado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
