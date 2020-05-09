/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.TDA;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.byronpar.bean.Repuesto;
import org.byronpar.nodo.NodoRepuesto;

/**
 *
 * @author HP ENVY
 */
public class PilaRepuestoServicio {
    
    private int id;    //id de la pila que se almacenara en el  servicio, solo para cuestiones de un mejor uso
    NodoRepuesto primero; //puntero hacia el primer elemento de la lista

    public PilaRepuestoServicio(int id) {
        this.primero = null;
        this.id=id;
          
//inicia en null porque esta Vacio
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    

    public Boolean Push(Repuesto r) { //por interfaz no utilice void


        NodoRepuesto nuevo = new NodoRepuesto(r);
        if (this.primero == null) {  //si la pila esta vacia
            this.primero = nuevo;
        } else {  //en caso de que ya tengo elementos

            nuevo.setSiguiente(this.primero); //el nuevo apunta al primero, lo coloco antes del primero
            // y luego hago
            this.primero = nuevo; // Ahora el primero es el nuevo de la lista
        }
        return true;
    }
    
    

    public Repuesto Pop() {
        if (this.primero != null) { //en caso de que tenga elementos
            Repuesto repuesto = this.primero.getRepuesto();
            this.primero = this.primero.getSiguiente();// el primero se vuelve el siguiente de primero
            //ahora la pila iniciara en el siguiente elemento
            return repuesto;
        }
        //si no hay elementos
        return null;
    }

    public Repuesto Peek() {
        if (this.primero != null) { //en caso de que la pila tenga elementos
            Repuesto repuesto = this.primero.getRepuesto();
            return repuesto;
        }
        //si no hay elementos
        return null;
    }

    public boolean ModificarRepuesto(long id, String nombre, String marca, String modelo, long existencia, long precio,
            String nombrenuevo, String marcanuevo, String modelonuevo, long existencianuevo, long precionuevo) {

        NodoRepuesto auxiliar1 = this.primero;
        while (auxiliar1 != null) {
            if (auxiliar1.getRepuesto().getNombreRepuesto().equalsIgnoreCase(nombrenuevo)) {
                JOptionPane.showMessageDialog(null, "ERROR EL REPUESTO YA EXISTE");
                return false;
            }
            auxiliar1 = auxiliar1.getSiguiente();

        }

       
    NodoRepuesto auxiliar2 = this.primero;
        while (this.primero != null) {
            if ( auxiliar2.getRepuesto().getIdRepuesto() == id &&  
                   auxiliar2.getRepuesto().getNombreRepuesto().equalsIgnoreCase(nombre)) 
            {
                
                Repuesto r = new Repuesto(id, nombrenuevo, marcanuevo, modelonuevo, existencianuevo, precionuevo);

                NodoRepuesto nuevo = new NodoRepuesto(r);
                
                auxiliar2.setRepuesto(r);
                return true;
            }
           auxiliar2=auxiliar2.getSiguiente();

        }
        
        return false;

    }
    
    public boolean EliminarRepuesto(long id) {

        NodoRepuesto auxiliar1 = this.primero;
        NodoRepuesto auxiliar2ant = null;
        while (auxiliar1 != null) {
            
            if (this.primero.getRepuesto().getIdRepuesto()==id) {
                
                this.primero = this.primero.getSiguiente();
                return true;
            }else{
            
                
                 if (auxiliar1.getRepuesto().getIdRepuesto()==id) {
                auxiliar2ant.setSiguiente(auxiliar1.getSiguiente());
                
                return true;
            }
              }
            
            auxiliar2ant=auxiliar1;
            auxiliar1 = auxiliar1.getSiguiente();

        }
        
        return false;

    }

    public JTable pintarTabla(JTable tabla) //metodo para pintar mi tabla
    {

        NodoRepuesto auxiliar = this.primero;

        while (auxiliar != null) {
            AgregarFilasTabla(tabla, auxiliar.getRepuesto().getIdRepuesto(), auxiliar.getRepuesto().getNombreRepuesto(),
                    auxiliar.getRepuesto().getMarca(), auxiliar.getRepuesto().getModelo(), auxiliar.getRepuesto().getExistencia(),
                    auxiliar.getRepuesto().getPrecio());
            auxiliar = auxiliar.getSiguiente();

        }
        return tabla;
    }

    public void AgregarFilasTabla(JTable Tabla, long id, String nombre, String marca, String modelo,
            long existencia, float precio) {
        try {
            DefaultTableModel modelo1 = (DefaultTableModel) Tabla.getModel();
            Object[] fila = new Object[6];
            fila[0] = id;
            fila[1] = nombre;
            fila[2] = marca;
            fila[3] = modelo;
            fila[4] = existencia;
            fila[5] = precio;
            modelo1.addRow(fila);
            Tabla.setModel(modelo1);
        } catch (Exception EX) {
            System.out.println("" + EX.getMessage());
        }
    }

    public void LimpiarTabla(JTable Tabla) {
        String[][] DatosTabla = new String[0][0];
        String[] EncabezadoTabla = {"Id Repuesto", "Nombre Repuesto", "Marca", "Modelo", "Existencias", "Precio"};
        DefaultTableModel dtm = new DefaultTableModel(DatosTabla, EncabezadoTabla);
        Tabla.setModel(dtm);
    }

}
