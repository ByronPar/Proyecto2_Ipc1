/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byronpar.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.byronpar.TDA.ListaSimpleServicio;
import org.byronpar.TDA.PilaRepuesto;

/**
 *
 * @author HP ENVY
 */
public class CargaMasiva_Servicio extends JFrame {
    
    
    ListaSimpleServicio l = ListaSimpleServicio.getInstancia();

    private JFrame f; //Principal frame
    public JTextArea area; // Text area
    private JScrollPane barra; // Scroll para el area de texto
    private JButton salir; // Salir del Programa
    private JButton regresar; // Salir del Programa
    public static String datos;

    public CargaMasiva_Servicio() { //Constructor
        // Crear el  Frame
        f = new JFrame("Carga Masiva de Repuestos");
        f.getContentPane().setLayout(new FlowLayout());

//           f.setLayout(null);
        f.setLocationRelativeTo(null);
        this.setResizable(false);
        f.setResizable(false);

        // Crear el scroll en el text area con swing
        area = new JTextArea(10, 100);
        area.setLineWrap(true);
        barra = new JScrollPane(area);
        barra.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Crear Salir Boton
        salir = new JButton("Cargar ");
        regresar = new JButton("Regresar");

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Servicioui entrar = new Servicioui();
                datos = area.getText();
                l.Push_Masivo(datos);
                
                
                f.setVisible(false);
                entrar.setVisible(true);
//               System.exit(0);

            }
        });

        //crear boton regresar
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Servicioui entrar = new Servicioui();
                entrar.setVisible(true);
                f.setVisible(false);

            }
        });

    }

    public void launchFrame() { // Create Layout
        //  Agregar el area boton y el frame
        f.getContentPane().add(barra);
        f.getContentPane().add(salir);
        f.getContentPane().add(regresar);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display  del Frame
        f.pack(); //  Ajustes del frame para el tamaño de los componentes
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
    
}
