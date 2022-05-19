/*
 * FrmRegistrarCasting.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.AgenteBO;
import BO.CastingBO;
import BO.ClienteBO;
import BO.FaseBO;
import Interfaces.IAgenteBO;
import Interfaces.ICastingBO;
import Interfaces.IClienteBO;
import Interfaces.IFaseBO;
import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Fase;
import entidades.Persona;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarCasting extends javax.swing.JFrame {
    int numeroFase=0;
    private Agente agente = new Agente();
    private Cliente cliente = new Cliente();
    IAgenteBO agenteBO = new AgenteBO();
    ICastingBO castingBO = new CastingBO();
    IClienteBO clienteBO = new ClienteBO();
    IFaseBO faseBO = new FaseBO();  
    List<Fase> fases = new LinkedList<>();
    

    /**
     * Creates new form FrmRegistrarCasting
     */
    public FrmRegistrarCasting() {
        initComponents();
        llenarTablaFases();
        llenarTablaCliente();
        llenarTablaAgentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblIDCasting = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtIDCasting = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCoste = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        scrollPane1 = new javax.swing.JScrollPane();
        tblListaFases = new javax.swing.JTable();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarFase = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBorrarFase = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAgente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inauguracion = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Casting - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Floppy.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        lblNombre.setForeground(new java.awt.Color(204, 255, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 75, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 71, 194, -1));

        lblIDCasting.setText("ID");
        lblIDCasting.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 22, -1, -1));

        lblFecha.setForeground(new java.awt.Color(204, 255, 255));
        lblFecha.setText("Fecha");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));

        txtIDCasting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDCastingKeyTyped(evt);
            }
        });
        getContentPane().add(txtIDCasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 18, 86, -1));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Coste");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 227, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 282, -1, -1));

        txtCoste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCosteKeyTyped(evt);
            }
        });
        getContentPane().add(txtCoste, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 223, 194, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "On-line", "Presencial" }));
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 178, -1, -1));

        tblListaFases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Fecha Inicio"
            }
        ));
        scrollPane1.setViewportView(tblListaFases);

        getContentPane().add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 630, 130));
        getContentPane().add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        jLabel4.setText("Fases");
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        btnRegistrarFase.setText("Registrar Fase");
        btnRegistrarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, -1));

        jLabel7.setText("Agente");
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        btnBorrarFase.setText("Borrar Fase");
        btnBorrarFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Teléfono", "Persona de Contacto", "Tipo de Publicidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 30, 630, 130));

        tablaAgente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Teléfono", "Curp", "RFC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAgenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAgente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 630, 140));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel8.setText("Cliente");
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Fecha fase:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
        getContentPane().add(inauguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1070, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validarCamposDatos()) {
            Casting casting = new Casting();
            casting.setNumCasting(Long.parseLong(txtIDCasting.getText()));
            Date fecha = new Date();
            String año = inauguracion.getDateStringOrEmptyString().substring(0,inauguracion.getDateStringOrEmptyString().indexOf("-"));
            String mes = inauguracion.getDateStringOrEmptyString().substring(5,inauguracion.getDateStringOrEmptyString().lastIndexOf("-"));
            String dia = inauguracion.getDateStringOrEmptyString().substring(8);
            fecha.setYear(Integer.parseInt(año)-1900);
            fecha.setMonth(Integer.parseInt(mes)-1);
            fecha.setDate(Integer.parseInt(dia));
            fecha.setHours(0);
            fecha.setMinutes(0);
            fecha.setSeconds(0);
            Date fechaHoy = new Date();
            if(fechaHoy.after(fecha)){
                JOptionPane.showMessageDialog(this, "Fecha invalida", "Fase", JOptionPane.ERROR_MESSAGE);
            }
            else{
                casting.setFechaContratacion(fecha);
                casting.setTipo(cmbTipo.getSelectedItem().toString());
                casting.setDescripcion(txtDescripcion.getText());

                casting.setCosto(Float.parseFloat(txtCoste.getText()));
                casting.setNombre(txtNombre.getText());
                if(validarCampoCliente()){
                    casting.setCliente(cliente);
                    if(validarCampoAgente()){
                        casting.setAgente(agente);
                        if(validarFases()){
                            for(int i=0;fases.size()>i; i++){
                                fases.get(i).setCasting(casting);
                                faseBO.regsistrar(fases.get(i));
                            }
                            castingBO.regsistrar(casting);
                            limpiarCampos();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Debes agregar minimo 2 fases", "Fase", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Seleccione un agente", "Agente", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Seleccione un cliente", "Cliente", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
           this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFaseActionPerformed
        if (validarCampoFase()) {
            if(inauguracion.getDateStringOrEmptyString().toString()!=""){
                Date fechaIn = new Date();
                String añoI = inauguracion.getDateStringOrEmptyString().substring(0,inauguracion.getDateStringOrEmptyString().indexOf("-"));
                String mesI = inauguracion.getDateStringOrEmptyString().substring(5,inauguracion.getDateStringOrEmptyString().lastIndexOf("-"));
                String diaI = inauguracion.getDateStringOrEmptyString().substring(8);
                fechaIn.setYear(Integer.parseInt(añoI)-1900);
                fechaIn.setMonth(Integer.parseInt(mesI)-1);
                fechaIn.setDate(Integer.parseInt(diaI));
                Date fechaHoy = new Date();
                if(fechaHoy.after(fechaIn)){
                    JOptionPane.showMessageDialog(this, "Fecha invalida para inicio de Casting", "Fase", JOptionPane.ERROR_MESSAGE);
                }else{
                    Date fecha = new Date();
                    String año = datePicker1.getDateStringOrEmptyString().substring(0,datePicker1.getDateStringOrEmptyString().indexOf("-"));
                    String mes = datePicker1.getDateStringOrEmptyString().substring(5,datePicker1.getDateStringOrEmptyString().lastIndexOf("-"));
                    String dia = datePicker1.getDateStringOrEmptyString().substring(8);
                    fecha.setYear(Integer.parseInt(año)-1900);
                    fecha.setMonth(Integer.parseInt(mes)-1);
                    fecha.setDate(Integer.parseInt(dia));
                    fecha.setHours(0);
                    fecha.setMinutes(0);
                    fecha.setSeconds(0);
                    if(fechaHoy.after(fecha)){
                        JOptionPane.showMessageDialog(this, "Fecha invalida", "Fase", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        if(!(fechaIn.after(fecha))){
                            numeroFase=numeroFase+1;
                            Fase fase = new Fase(numeroFase, fecha);
                            fases.add(fase);
                            llenarTablaFases();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Fecha invalida, fases después de fecha inicial de casting", "Fase", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Seleccione una fecha inicial para casting", "Fase", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnRegistrarFaseActionPerformed

    private void tablaAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAgenteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablaAgente.getModel();
        String id = model.getValueAt(tablaAgente.getSelectedRow(), 0).toString();
        String nombre = model.getValueAt(tablaAgente.getSelectedRow(), 1).toString();
        String telefono = model.getValueAt(tablaAgente.getSelectedRow(), 2).toString();
        String curp = model.getValueAt(tablaAgente.getSelectedRow(), 3).toString();
        String rfc = model.getValueAt(tablaAgente.getSelectedRow(), 4).toString();
        
        agente.setNumEmpleado(Long.parseLong(id));
        agente.setNombre(nombre);
        agente.setTelefono(telefono);
        agente.setCurp(curp);
        agente.setRFC(rfc);
        System.out.println(agente);
    }//GEN-LAST:event_tablaAgenteMouseClicked

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
        String id = model.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
        String nombre = model.getValueAt(tablaClientes.getSelectedRow(), 1).toString();
        String direccion = model.getValueAt(tablaClientes.getSelectedRow(), 2).toString();
        String telefono = model.getValueAt(tablaClientes.getSelectedRow(), 3).toString();
        String contacto = model.getValueAt(tablaClientes.getSelectedRow(), 4).toString();
        String tipo = model.getValueAt(tablaClientes.getSelectedRow(), 5).toString();
        String colonia = direccion.substring(direccion.indexOf("Colonia "));
        String numero = direccion.substring(direccion.indexOf(", "), direccion.indexOf(", Colonia "));
        Persona persona = new Persona();
        persona.setNombre(contacto);
        cliente.setTelefono(telefono);
        cliente.setPersonaContacto(persona);
        cliente.setNumCliente(Long.parseLong(id));
        cliente.setNombre(nombre);
        Direccion direccion2 = new Direccion();
        direccion2.setCalle(direccion.substring(0, direccion.indexOf(",")));
        direccion2.setColonia(colonia.substring(8));
        direccion2.setNumero(numero.substring(2));
        cliente.setDireccion(direccion2);
        cliente.setActividad(tipo);
        System.out.println(cliente);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void txtCosteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCosteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (txtCoste.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCosteKeyTyped

    private void txtIDCastingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDCastingKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (txtIDCasting.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDCastingKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

         if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
        if (txtNombre.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnBorrarFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFaseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblListaFases.getModel();
        String id = model.getValueAt(tblListaFases.getSelectedRow(), 0).toString();
        for(int i=0; fases.size()>i; i++){
            if(fases.get(i).getNumero() == Integer.parseInt(id)){
                fases.remove(fases.get(i));
                numeroFase = numeroFase - 1;
            }
        }
        llenarTablaFases();
    }//GEN-LAST:event_btnBorrarFaseActionPerformed

/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtNombre.setText("");
        txtIDCasting.setText("");
        txtCoste.setText("");
        txtDescripcion.setText("");
        cmbTipo.setSelectedIndex(0);
        cliente=null;
        agente=null;
        inauguracion.setText("");
        
    }

/**
 *
 * Metodo para validar los campos estén llenos
 */
    public boolean validarCamposDatos(){
        if (txtNombre.getText().length() == 0 || txtIDCasting.getText().length() == 0 || txtDescripcion.getText().length() == 0 
            || txtCoste.getText().length() == 0 || cmbTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Campos sin llenar", "Casting", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
            return true;
    }
    
    public boolean validarCampoFase(){
        if (datePicker1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Te falto introducir la fecha", "Fase", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
            return true;
    }
    
    public boolean validarCampoCliente(){
        if (cliente.getNombre() == null) {
            
            return false;
        }
        else 
            return true;
    }
    
    public boolean validarCampoAgente(){
       
        if (agente.getNombre() == null) {
            return false;
        }
        else 
            return true;
    }
    
    public boolean validarFases(){
        if(fases.isEmpty()){
            return false;
        }
        else{
            if(fases.size()<2){
                
                return false;
            }
            else{
                return true;
            }
        }
    }
/**
 *
 * Metodo para llenar la tabla de fases
 */
    public void llenarTablaFases() {
        List<Fase> productos = fases;
        DefaultTableModel modelo = (DefaultTableModel) tblListaFases.getModel();
        modelo.setRowCount(0);
        for (Fase prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNumero();
            fila[1] = prov.getFechaInicio();
            
            modelo.addRow(fila);
        }
        

    }
    
/**
 *
 * Metodo para llenar la tabla de clientes
 */
    public void llenarTablaCliente() {
        List<Cliente> productos = clienteBO.getCliente();
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        modelo.setRowCount(0);
        for (Cliente prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNumCliente();
            fila[1] = prov.getNombre();
            fila[2] = prov.getDireccion().toString();
            fila[3] = prov.getTelefono();
            fila[4] = prov.getPersonaContacto().getNombre();
            fila[5] = prov.getActividad();
            modelo.addRow(fila);
        }

    }
    
/**
 *
 * Metodo para llenar la tabla de agentes
 */
    public void llenarTablaAgentes() {
        List<Agente> productos = agenteBO.getAgente();
        DefaultTableModel modelo = (DefaultTableModel) tablaAgente.getModel();
        modelo.setRowCount(0);
        for (Agente prov : productos) {
            Object[] fila = new Object[6];
            fila[0] = prov.getNumEmpleado();
            fila[1] = prov.getNombre();
            fila[2] = prov.getTelefono();
            fila[3] = prov.getCurp();
            fila[4] = prov.getRFC();
            modelo.addRow(fila);
        }

    }
    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarFase;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarFase;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker inauguracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIDCasting;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tablaAgente;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tblListaFases;
    private javax.swing.JTextField txtCoste;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIDCasting;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
