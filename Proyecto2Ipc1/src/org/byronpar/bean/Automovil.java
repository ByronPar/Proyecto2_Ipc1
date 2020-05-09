/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.bean;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author HP ENVY
 */
public class Automovil extends JLabel {
    private String placa;
    private String marca;
    private String modelo;
    private String ruta;

    public Automovil(String placa, String marca, String modelo, String ruta) {
        super();
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ruta = ruta;
        setIcon(new ImageIcon(ruta));
        setSize(50, 50);
    }

    
    
    
    public void setImagen(String ruta) {
        setIcon(new ImageIcon(ruta));
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
}
