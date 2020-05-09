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
public class Empleado {
    private long idEmpleado;
    private String nombreEmpleado;
    private String rol;
    private String user;
    private String contra;
    private static long numEmpleado=1;

    public Empleado( String nombreEmpleado, String rol, String user, String contra) {
        this.idEmpleado = Empleado.getNumEmpleado();
        this.nombreEmpleado = nombreEmpleado;
        this.rol = rol;
        this.user = user;
        this.contra = contra;
        numEmpleado++;
    }

   

    
    
    
    public static long getNumEmpleado() {
        return numEmpleado;
    }

    public static void setNumEmpleado(long numEmpleado) {
        Empleado.numEmpleado = numEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    
    

    
    
    
    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

  

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    
}
