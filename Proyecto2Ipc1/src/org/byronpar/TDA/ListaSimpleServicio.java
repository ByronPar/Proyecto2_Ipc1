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
import org.byronpar.bean.Servicio;
import org.byronpar.nodo.NodoRepuesto;
import org.byronpar.nodo.NodoServicio;

/**
 *
 * @author HP ENVY
 */
public class ListaSimpleServicio {

    private static ListaSimpleServicio instanciaUnica; //PARA USAR SINGLETON Y SOLO TENER UNA LISTA DE SERVICIO UNICA
    NodoServicio primero; // PRIMER NODO DE LA LISTA
    int size; // TAMANIO DE LA LISTA

    public ListaSimpleServicio() {
        this.primero = null; // APUNTANDO LA LISTA A NULO, PORQUE NO HAY ELEMENTOS
        this.size = 0; // EL TAMANIO DE LA LISTA ES 0
    }

    private synchronized static void crearInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new ListaSimpleServicio();

        }
    }

    public static ListaSimpleServicio getInstancia() {

        crearInstanciaUnica();
        return instanciaUnica;
    }

    public Boolean estaVacio() {
        if (this.size == 0) // ES EL TAMANIO 0? 
        {
            return true; // SI.. ENTONCES RETORNA VERDADERO
        }
        return false; // SINO... RETORNA FALSO
    }

    public Boolean agregarEnIndice(int indice, String nombre, String marca, String modelo, float manoDeObra, String[] listaRep) {
       
        if (nombre.equalsIgnoreCase("Diagnostico")) {// verifico si es un servicio de diagnostico ya que es especial
           NodoServicio compro1 = this.primero;
        while (compro1 != null) {
            if (compro1.getServicio().getNombreServicio().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "ERROR EL SERVICIO YA EXISTE");
                return false;
            }
            compro1 = compro1.getSiguiente();

        } 
        
        Servicio p =new Servicio(nombre,manoDeObra);
        
        if ((indice >= 0) && (indice <= this.size)) {
            // INDICE VALIDO
            NodoServicio nuevo = new NodoServicio(p);
            if (indice == 0) // SI EL INDICE ES 0...
            {
                nuevo.setSiguiente(this.primero); // ENTONCES EL NUEVO VA A APUNTAR AL PRIMERO
                this.primero = nuevo; // Y EL PRIMERO APUNTARA AL NUEVO ASI EL NUEVO SE VUELVE EL PRIMERO DE LA LISTA
                this.size++;
            } else // SI ES ALGO DIFERENTE DE 0...
            {
                int posicionActual = 1; // POSICION ACTUAL EN DONDE PUEDE INICIAR A INSERTAR
                NodoServicio auxiliar = this.primero; // APUNTADOR INICIAL QUE APUNTA AL PRIMERO
                while (auxiliar.getSiguiente() != null) // SI EL SIGUIENTE ES DIFERENTE DE NULL...
                {
                    if (posicionActual == indice) // SI LA POSICION ACTUAL ES IGUAL A LA DEL INDICE?
                    {
                        break; // ROMPO EL CICLO WHILE Y TERMINE Y ENCONTRE MI POSICION
                    }
                    auxiliar = auxiliar.getSiguiente(); // SI EN CASO NO ES LA POSICION QUE QUIERO AL AUXILIAR PASA A SER EL SIGUIENTE
                    posicionActual++; // LA POSICION ACTUAL AUMENTA
                }
                nuevo.setSiguiente(auxiliar.getSiguiente()); // EL NUEVO APUNTA AL SIGUIENTE DEL AUXILIAR
                auxiliar.setSiguiente(nuevo); // EL SIGUIENTE DEL AUXILIAR APUNTA AL NUEVO
                this.size++; // EL TAMANIO AUMENTA
            }
            return true;
        } else {
            // ERROR
            return false;
        }
        
        
        
//            return true;
        }
        else{
            
          //Verificacion de si ya existe algun servicio igual 
            
           NodoServicio compro1 = this.primero;
        while (compro1 != null ) {
            String asd= compro1.getServicio().getNombreServicio();
            if (asd.equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "ERROR EL SERVICIO YA EXISTE");
                return false;
            }
            compro1 = compro1.getSiguiente();

        }
        
      
            
            
            
        boolean verificacion1=false;
        float precioTotal = 0;
        Repuesto repuestoDeServicio[] = new Repuesto[listaRep.length]; //metere los id en este vector de repuestos
                                                           //COMPRUEBO QUE LOS ID ESTEN EN MI PILA ORIGINAL Y LUEGO OBTENGO L REPUESTO DE 
                                                           //ESE ID Y LO COLOCO EN MI VECTOR DE REPUESTOS
        int id = 0;
        PilaRepuesto pilaRepuesto = PilaRepuesto.getInstancia();

        for (int i = 0; i < listaRep.length; i++) {
            NodoRepuesto auxiliar1 = pilaRepuesto.primero;
            try {
                id = Integer.parseInt(listaRep[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR EN ID");//si el id no es numero
                return false;
            }

            while (auxiliar1 != null) {
                if (auxiliar1.getRepuesto().getIdRepuesto() == id) {
                    
                        repuestoDeServicio[i] = auxiliar1.getRepuesto();
                        verificacion1=true;
                    

                }
                auxiliar1 = auxiliar1.getSiguiente();

            }
            if (verificacion1) {
                
            }else{
            JOptionPane.showMessageDialog(null, "ERROR EN ID , no EXISTE ID");//si alguna posicion no tiene repuesto no lo agrego y retorno
            return false;
            }
        }

        
        
        
//        int pok=0; //COMPROBACION DE QUE NO SE INGRESEN 2 REPUESTOS IGUALES
        Repuesto[] prueb;
        prueb=repuestoDeServicio;
            for (int i = 0; i < repuestoDeServicio.length; i++) {
                int pok=0;
                for (int j = 0; j < prueb.length; j++) {
                    if (prueb[j].getIdRepuesto()==repuestoDeServicio[i].getIdRepuesto()) {
                       pok++; 
                    }
                    if (pok>=2) {
                        JOptionPane.showMessageDialog(null, "ERROR NO PUEDE INGRESAR 2 REPUESTOS IGUALES");
                        return false;
                    }
                }
            }
            
            PilaRepuestoServicio repuestoSer = new PilaRepuestoServicio(this.size);
        for (int i = 0; i < listaRep.length; i++) {
            repuestoSer.Push(repuestoDeServicio[i]);
            precioTotal += repuestoDeServicio[i].getPrecio();
        }
        
            
           
             NodoRepuesto auxiliar100 = repuestoSer.primero;
            while (auxiliar100!=null){
                if ((auxiliar100.getRepuesto().getMarca().equalsIgnoreCase(marca)
                        && auxiliar100.getRepuesto().getModelo().equalsIgnoreCase(modelo))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase("cualquiera") && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase(modelo))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase(marca) && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase("cualquiera"))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase("cualquiera") && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase("cualquiera"))) {
                    
                }else{
                    JOptionPane.showMessageDialog(null, "  ERROR    LA MARCA Y MODELO DEL REPUESTO      "+auxiliar100.getRepuesto().getIdRepuesto()
                    +   "  NO COINCIDEN CON LA MARCA Y EL MODELO DEL SERVICIO");
                return false;
                }
                
            auxiliar100=auxiliar100.getSiguiente();
            }
            
            
           precioTotal+=manoDeObra;       
        Servicio p = new Servicio(nombre, marca, modelo, repuestoSer, manoDeObra, precioTotal);
        
        if ((indice >= 0) && (indice <= this.size)) {
            // INDICE VALIDO
            NodoServicio nuevo = new NodoServicio(p);
            if (indice == 0) // SI EL INDICE ES 0...
            {
                nuevo.setSiguiente(this.primero); // ENTONCES EL NUEVO VA A APUNTAR AL PRIMERO
                this.primero = nuevo; // Y EL PRIMERO APUNTARA AL NUEVO ASI EL NUEVO SE VUELVE EL PRIMERO DE LA LISTA
                this.size++;
            } else // SI ES ALGO DIFERENTE DE 0...
            {
                int posicionActual = 1; // POSICION ACTUAL EN DONDE PUEDE INICIAR A INSERTAR
                NodoServicio auxiliar = this.primero; // APUNTADOR INICIAL QUE APUNTA AL PRIMERO
                while (auxiliar.getSiguiente() != null) // SI EL SIGUIENTE ES DIFERENTE DE NULL...
                {
                    if (posicionActual == indice) // SI LA POSICION ACTUAL ES IGUAL A LA DEL INDICE?
                    {
                        break; // ROMPO EL CICLO WHILE Y TERMINE Y ENCONTRE MI POSICION
                    }
                    auxiliar = auxiliar.getSiguiente(); // SI EN CASO NO ES LA POSICION QUE QUIERO AL AUXILIAR PASA A SER EL SIGUIENTE
                    posicionActual++; // LA POSICION ACTUAL AUMENTA
                }
                nuevo.setSiguiente(auxiliar.getSiguiente()); // EL NUEVO APUNTA AL SIGUIENTE DEL AUXILIAR
                auxiliar.setSiguiente(nuevo); // EL SIGUIENTE DEL AUXILIAR APUNTA AL NUEVO
                this.size++; // EL TAMANIO AUMENTA
            }
            return true;
        } else {
            // ERROR
            return false;
        }
          
        
        
        
    }
//        return null;
        
        
    }

    public Boolean eliminarEnIndice(int indice) {
        if (estaVacio()) {
            JOptionPane.showMessageDialog(null, "No puede Eliminar porque la Lista de Servicios esta Vacia");
            return false;
        } /// SI LA LISTA ESTA VACIA ENTONCES NO ELIMINO NADA!
        else if ((indice >= 0) && (indice <= this.size)) // EN CASO DE QUE EL INDICE SEA VALIDO...
        {
            if (indice == 0) // SI EL INDICE ES 0...
            {
                this.primero = this.primero.getSiguiente(); // EL PRIMERO VA APUNTAR AL SIGUIENTE DE PRIMERO
                this.size--; // DECREMENTO EL TAMANIO
            } else // SI 
            {
                int posicionActual = 1; // POSICION ACTUAL EN DONDE PUEDE INICIAR A INSERTAR
                NodoServicio auxiliar = this.primero; // APUNTADOR INICIAL QUE APUNTA AL PRIMERO
                while (auxiliar.getSiguiente() != null) // SI EL SIGUIENTE ES DIFERENTE DE NULL...
                {
                    if (posicionActual == indice) // SI LA POSICION ACTUAL ES IGUAL A LA DEL INDICE?
                    {
                        break; // ROMPO EL CICLO WHILE Y TERMINE Y ENCONTRE MI POSICION
                    }
                    auxiliar = auxiliar.getSiguiente(); // SI EN CASO NO ES LA POSICION QUE QUIERO AL AUXILIAR PASA A SER EL SIGUIENTE
                    posicionActual++; // LA POSICION ACTUAL AUMENTA
                }
                auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                this.size--;

            }
            return true;
        } else {
            return false;
        }
    }

    public String printList() {
        String cad = "";
        NodoServicio auxiliar = this.primero;
        int index = 0;
        while (auxiliar != null) {
//            cad += "INDEX: "+index+" || "+auxiliar.getServicio().getInfo()+"\n";
            auxiliar = auxiliar.getSiguiente();
            index++;
        }
        return cad;
    }

    /**
     * retorna el tamanio de la lista
     *
     * @return
     */
    public int getSize() {
        return this.size;
    }

    public JTable pintarTabla(JTable tabla) //metodo para pintar mi tabla
    {
        int a=1;
        String CADENA ="";
        NodoServicio auxiliar = this.primero;

        while (auxiliar != null) {
            
            if (auxiliar.getServicio().getNombreServicio().equalsIgnoreCase("Diagnostico")) {
                
                
                AgregarFilasTabla(tabla,a, auxiliar.getServicio().getIdServicio(), auxiliar.getServicio().getNombreServicio(),
                    "", "", auxiliar.getServicio().getPrecioManodeObra(),
                    auxiliar.getServicio().getPrecioTotal(), "");
                a++;
            CADENA="";
            auxiliar = auxiliar.getSiguiente();
            
            
            }else{
            
            NodoRepuesto auxiliar2 = auxiliar.getServicio().getListaRepuesto().primero;

            while (auxiliar2 != null) {
               CADENA += auxiliar2.getRepuesto().getNombreRepuesto()+ "  -  ";
                auxiliar2 = auxiliar2.getSiguiente();
            }
        

            AgregarFilasTabla(tabla,a ,auxiliar.getServicio().getIdServicio(), auxiliar.getServicio().getNombreServicio(),
                    auxiliar.getServicio().getMarca(), auxiliar.getServicio().getModelo(), auxiliar.getServicio().getPrecioManodeObra(),
                    auxiliar.getServicio().getPrecioTotal(), CADENA);
            a++;
            CADENA="";
            auxiliar = auxiliar.getSiguiente();
            }
        }
        return tabla;
    }

    public void AgregarFilasTabla(JTable Tabla,int no, long id, String nombre, String marca, String modelo,
            float manodeObra, float precioTotal, String repuestos) {
        try {
            DefaultTableModel modelo1 = (DefaultTableModel) Tabla.getModel();
            Object[] fila = new Object[8];
            fila[0] = no;
            fila[1] = id;
            fila[2] = nombre;
            fila[3] = marca;
            fila[4] = modelo;
            fila[5] = manodeObra;
            fila[6] = precioTotal;
            fila[7] = repuestos;
            modelo1.addRow(fila);
            Tabla.setModel(modelo1);
        } catch (Exception EX) {
            System.out.println("" + EX.getMessage());
        }
    }

    public void LimpiarTabla(JTable Tabla) {
        String[][] DatosTabla = new String[0][0];
        String[] EncabezadoTabla = {"No","Id Servicio", "Nombre Servicio", "Marca", "Modelo", "Precio Mano de Obra","Precio Total", "Lista de Repuestos" };
        DefaultTableModel dtm = new DefaultTableModel(DatosTabla, EncabezadoTabla);
        Tabla.setModel(dtm);
    }

    public void Push_Masivo(String datos) {
        
        String[] cadenas = new String[500000];
        String[] cadenas2 = new String[5];
        
        

        cadenas = datos.split("\n");
         
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i] != null) {
                String separador = Pattern.quote("-");
                String separador2= Pattern.quote(";");
                cadenas2 = cadenas[i].split(separador);

                

//                    try{
                        
                    String nombre = cadenas2[0];
                    String marca = cadenas2[1];
                    String modelo= cadenas2[2];
                    String [] cadenas3= cadenas2[3].split(separador2);
                    String precioManodeObra = cadenas2[4].replaceAll("[\r]", "");
                    String prueba2=precioManodeObra.replaceAll("[\t]", "");
                    String prueba3=prueba2.replaceAll("[\f]", "");
                    String prueba4=prueba3.replaceAll("[\n]", "");
                    String prueba5=prueba4.replaceAll("[\b]", "");
                    float precioMano = Float.parseFloat(prueba5);
                        if (nombre!=null  &&  marca!=null  &&  modelo!=null  &&  existencia>=0  &&  precio>=0) {
                            Push(nombre,marca,modelo,existencia,precio);
                        }else{
                        JOptionPane.showMessageDialog(null, "Error en datos del Repuesto     " +cadenas2[0]  );
                        }
                    

//                    }catch(Exception e){
//                     JOptionPane.showMessageDialog(null, "Ingreso Incorrecto de Datos, Vuelva a intentarlo");
//                    return;
//                    }
               

            }
        }

        JOptionPane.showMessageDialog(null, "CARGA EXITOSA DE REPUESTOS");
        
    
    }
    
    public boolean ModificarServicio(int indice2,int id3,String nombre,String nombrenuevo, String modelonuevo,
            String[] a , String marcanuevo,float precioManoNuevo) {
    float precioTotal=0;
        NodoServicio auxiliar1 = this.primero;//
        while (auxiliar1 != null) {
            if (auxiliar1.getServicio().getNombreServicio().equalsIgnoreCase(nombrenuevo)) {
                JOptionPane.showMessageDialog(null, "ERROR EL SERVICIO YA EXISTE");
                return false;
            }
            auxiliar1 = auxiliar1.getSiguiente();

        }

       
    NodoServicio auxiliar2 = this.primero;
        while (this.primero != null) {
            if ( auxiliar2.getServicio().getIdServicio() == id3 &&  
                   auxiliar2.getServicio().getNombreServicio().equalsIgnoreCase(nombre)) 
            {
                
                
                
                if (nombrenuevo.equalsIgnoreCase("Diagnostico")) {// verifico si es un servicio de diagnostico ya que es especial
           
// public Servicio(int id,String nombreServicio, float precioManodeObra)
                Servicio r = new Servicio(id3, nombrenuevo, precioManoNuevo);
//
////                NodoRepuesto nuevo = new NodoRepuesto(r);
//                
                auxiliar2.setServicio(r);
                return true;
        }
        else{
                    
                    boolean verificacion1=false;
        Repuesto repuestoDeServicio[] = new Repuesto[a.length]; //metere los id en este vector de repuestos
                                                           //COMPRUEBO QUE LOS ID ESTEN EN MI PILA ORIGINAL Y LUEGO OBTENGO L REPUESTO DE 
                                                           //ESE ID Y LO COLOCO EN MI VECTOR DE REPUESTOS
        int id = 0;
        PilaRepuesto pilaRepuesto = PilaRepuesto.getInstancia();

        for (int i = 0; i < a.length; i++) {
            NodoRepuesto auxiliar20 = pilaRepuesto.primero;
            try {
                id = Integer.parseInt(a[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR EN ID, NO SE PUEDE MODIFICAR EL SERVICIO");//si el id no es numero
                return false;
            }

            while (auxiliar20 != null) {
                if (auxiliar20.getRepuesto().getIdRepuesto() == id) {
                    
                        repuestoDeServicio[i] = auxiliar20.getRepuesto();
                        verificacion1=true;
                    

                }
                auxiliar20 = auxiliar20.getSiguiente();

            }
            if (verificacion1) {
                
            }else{
            JOptionPane.showMessageDialog(null, "ERROR EN ID , no EXISTE ID");//si alguna posicion no tiene repuesto no lo agrego y retorno
            return false;
            }
        }

        
        
        
//        int pok=0; //COMPROBACION DE QUE NO SE INGRESEN 2 REPUESTOS IGUALES
        Repuesto[] prueb;
        prueb=repuestoDeServicio;
            for (int i = 0; i < repuestoDeServicio.length; i++) {
                int pok=0;
                for (int j = 0; j < prueb.length; j++) {
                    if (prueb[j].getIdRepuesto()==repuestoDeServicio[i].getIdRepuesto()) {
                       pok++; 
                    }
                    if (pok>=2) {
                        JOptionPane.showMessageDialog(null, "ERROR NO PUEDE INGRESAR 2 REPUESTOS IGUALES");
                        return false;
                    }
                }
            }
            
            PilaRepuestoServicio repuestoSer = new PilaRepuestoServicio(this.size);
        for (int i = 0; i < a.length; i++) {
            repuestoSer.Push(repuestoDeServicio[i]);
            precioTotal += repuestoDeServicio[i].getPrecio();
        }
        
            
           
             NodoRepuesto auxiliar100 = repuestoSer.primero;
            while (auxiliar100!=null){
                if ((auxiliar100.getRepuesto().getMarca().equalsIgnoreCase(marcanuevo)
                        && auxiliar100.getRepuesto().getModelo().equalsIgnoreCase(modelonuevo))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase("cualquiera") && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase(modelonuevo))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase(marcanuevo) && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase("cualquiera"))
                        ||(auxiliar100.getRepuesto().getMarca().equalsIgnoreCase("cualquiera") && 
                       auxiliar100.getRepuesto().getModelo().equalsIgnoreCase("cualquiera"))) {
                    
                }else{
                    JOptionPane.showMessageDialog(null, "  ERROR    LA MARCA Y MODELO DEL REPUESTO      "+auxiliar100.getRepuesto().getIdRepuesto()
                    +   "  NO COINCIDEN CON LA MARCA Y EL MODELO DEL SERVICIO");
                return false;
                }
                
            auxiliar100=auxiliar100.getSiguiente();
            }
            
            
           precioTotal+=precioManoNuevo;
                Servicio r = new Servicio(id3, nombrenuevo, marcanuevo, modelonuevo, repuestoSer, precioManoNuevo, precioTotal);

//                NodoRepuesto nuevo = new NodoRepuesto(r);
                
                auxiliar2.setServicio(r);
                return true;
        
    }
                
                
                
                
            }
           auxiliar2=auxiliar2.getSiguiente();

        }
        
        return false;

    }

}
