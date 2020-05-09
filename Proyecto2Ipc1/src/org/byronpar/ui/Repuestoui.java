/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.byronpar.TDA.PilaRepuesto;
import org.byronpar.bean.Repuesto;
import org.byronpar.nodo.NodoRepuesto;

/**
 *
 * @author HP ENVY
 */
public class Repuestoui extends javax.swing.JFrame {

    /**
     * Creates new form Repuestoui
     */
    PilaRepuesto l = PilaRepuesto.getInstancia();

    JFileChooser selec = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    CargaMasiva_Repuesto datosRepuestos = new CargaMasiva_Repuesto();

    public Repuestoui() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        l.LimpiarTabla(jTable1);
        l.pintarTabla(jTable1);

//            jTable1=pilaRepuesto.pintarTabla(jTable1);
    }

    public String Abrirxd(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);

            int algo;
            while ((algo = entrada.read()) != -1) {

                char caracter = (char) algo;
                documento += caracter;

            }
        } catch (Exception e) {

        }
        return documento;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtExistencia = new javax.swing.JTextField();
        TxtModelo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repuestos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Existencias:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 80, 30));
        getContentPane().add(TxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre Repuesto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 140, 30));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 60, 30));

        TxtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtExistenciaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 140, 30));
        getContentPane().add(TxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 140, 30));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 138, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 138, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 138, -1));

        jButton4.setText("Carga Archivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 138, -1));

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 138, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><center>Id Repuesto</center></html>", "Nombre Repuesto", "Marca", "Modelo", "Existencias", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 870, 270));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton6.setText("Eliminar Especifico");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 138, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/byronpar/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Admin entrar = new Admin();
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(TxtNombre.getText()) && !"".equals(TxtMarca.getText()) && !"".equals(TxtModelo.getText()) && !"".equals(TxtExistencia.getText())
                && !"".equals(TxtPrecio.getText())){
        try {

            // TOMo LA INFORMACION
            String nombre = TxtNombre.getText();
            String marca = TxtMarca.getText();
            String modelo = TxtModelo.getText();
            long existencia = Long.parseLong(TxtExistencia.getText());
            float precio = Float.parseFloat(TxtPrecio.getText());

            // me voy a mi metodo agregar(push) y creo el objeto si y solo si el nombre no se repite
            if (l.Push(nombre, marca, modelo, existencia, precio)) {
                JOptionPane.showMessageDialog(null, "Repuesto Agregado Correctamente");
                TxtNombre.setText("");
            TxtMarca.setText("");
            TxtModelo.setText("");
            TxtExistencia.setText("");
            TxtPrecio.setText("");
            } else {
                //es porque tengo error y debo haberlo atrapado con el catch
            }

            l.LimpiarTabla(jTable1);
            l.pintarTabla(jTable1);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LOS DATOS ");
        }
    }else{
JOptionPane.showMessageDialog(null, "ERROR NO PUEDE DEJAR CAMPOS VACIOS ");
}
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_TxtPrecioKeyTyped

    private void TxtExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtExistenciaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtExistenciaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {

            Repuesto p = l.Pop();
            if (p != null) {
                JOptionPane.showMessageDialog(null, "Repuesto en la cima de la Pila Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "NO HAY REPUESTOS REGISTRADOS EN EL TALLER");
            }
            l.LimpiarTabla(jTable1);
            l.pintarTabla(jTable1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        int FilaSeleccionada = tabla.getSelectedRow();
//                if (FilaSeleccionada != -1) { 
        int FilaSeleccionada = jTable1.getSelectedRow();
        if (FilaSeleccionada != -1) {
            try {
                String id = "" + jTable1.getValueAt(FilaSeleccionada, 0);
                String nombre = "" + jTable1.getValueAt(FilaSeleccionada, 1);
                String marca = "" + jTable1.getValueAt(FilaSeleccionada, 2);
                String modelo = "" + jTable1.getValueAt(FilaSeleccionada, 3);
                String existencia = "" + jTable1.getValueAt(FilaSeleccionada, 4);
                String precio = "" + jTable1.getValueAt(FilaSeleccionada, 5);

                long id2 = Long.parseLong(id);
                long existencia2 = Long.parseLong(existencia);
                float precio2 = Float.parseFloat(precio);

                String nombreenviar = TxtNombre.getText();
                String marcaenviar = TxtMarca.getText();
                String modeloenviar = TxtModelo.getText();
                long existenciaenviar = Long.parseLong(TxtExistencia.getText());
                float precioenviar = Float.parseFloat(TxtPrecio.getText());

                if (l.ModificarRepuesto(id2, nombre, marca, modelo, existencia2, precio2, nombreenviar, marcaenviar, modeloenviar,
                        existenciaenviar, precioenviar)) {

                    JOptionPane.showMessageDialog(null, "Repuesto Modificado Correctamente");
                    l.LimpiarTabla(jTable1);
                    l.pintarTabla(jTable1);
                    TxtNombre.setText("");
            TxtMarca.setText("");
            TxtModelo.setText("");
            TxtExistencia.setText("");
            TxtPrecio.setText("");
                    
                } else {
                    //es porque tengo error y debo haberlo atrapado con el catch

//                   JOptionPane.showMessageDialog(null, "ERROR en el metodo modificar");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR ALGO ANDA MAL");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Una Fila Para Poder Modificarla");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int FilaSeleccionada = jTable1.getSelectedRow();
        if (FilaSeleccionada != -1) {
            try {
                String id = "" + jTable1.getValueAt(FilaSeleccionada, 0);
                long id2 = Long.parseLong(id);
                if (l.EliminarRepuesto(id2)) {

                    JOptionPane.showMessageDialog(null, "Repuesto Eliminado Correctamente");
                    l.LimpiarTabla(jTable1);
                    l.pintarTabla(jTable1);
                } else {
                    //es porque tengo error y debo haberlo atrapado con el catch

//                   JOptionPane.showMessageDialog(null, "ERROR en el metodo modificar");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR NO PUEDE DEJAR CAMPOS VACIOS");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Una Fila Para Poder Modificarla");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("tmr", "tmr");
        selec.setFileFilter(filtro);

        if (selec.showDialog(null, "abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = selec.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("tmr")) {
                    String documento = Abrirxd(archivo);
                    datosRepuestos.area.setText(documento);
                    datosRepuestos.launchFrame();
                    this.setVisible(false);
                    l.LimpiarTabla(jTable1);
                    l.pintarTabla(jTable1);
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo No Compatible");
                }

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Repuestoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repuestoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repuestoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repuestoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repuestoui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtExistencia;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtModelo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
