/*
 * FrmBuscarCasting.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.CastingBO;
import Interfaces.ICastingBO;
import entidades.Agente;
import entidades.Casting;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmBuscarCasting extends javax.swing.JFrame {

    ICastingBO castingBO = new CastingBO();
    /**
     * Creates new form FrmBuscarCasting
     */
    public FrmBuscarCasting() {
        initComponents();
        llenarTablaCastings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCastings = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbSeleccion = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de Casting - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCastings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "fecha", "Costo", "Tipo", "Descripcion", "Cliente", "Agente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCastings);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 880, 226));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Buscar por:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        cmbSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "ID", "Nombre", "Fecha" }));
        getContentPane().add(cmbSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));
        getContentPane().add(txtCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1030, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (validarCampos()) {
            if(cmbSeleccion.getSelectedItem().equals("ID")){
                if(txtCampo.getText().matches("\\d*")){
                List<Casting> productos = castingBO.getCastingID(Long.parseLong(txtCampo.getText()));
                DefaultTableModel modelo = (DefaultTableModel) tblCastings.getModel();
                modelo.setRowCount(0);
                    if(productos!=null){
                        for (Casting prov : productos) {
                            Object[] fila = new Object[9];
                            fila[0] = prov.getNumCasting();
                            fila[1] = prov.getNombre();
                            String fechaI = "";
                            if((prov.getFechaContratacion().getDate())<10){
                                fechaI = "0"+prov.getFechaContratacion().getDate()+"/";
                            }
                            else{
                                fechaI = prov.getFechaContratacion().getDate()+"/";
                            }
                            if((prov.getFechaContratacion().getMonth()+1)<10){
                                fechaI = fechaI+"0"+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            else{
                                fechaI = fechaI+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            fechaI = fechaI + (prov.getFechaContratacion().getYear()+1900)+ "";
                            fila[2] = fechaI;
                            fila[3] = prov.getCosto();
                            fila[4] = prov.getTipo();
                            fila[5] = prov.getDescripcion();
                            fila[6] = prov.getCliente().getNombre();
                            fila[7] = prov.getAgente().getNombre();
                            modelo.addRow(fila);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Introduzca solo números", "Buscar", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(cmbSeleccion.getSelectedItem().equals("Nombre")){
                if(!(txtCampo.getText().matches("\\d*"))){
                    List<Casting> productos = castingBO.getCastingNombre(txtCampo.getText());
                    DefaultTableModel modelo = (DefaultTableModel) tblCastings.getModel();
                    modelo.setRowCount(0);
                    if(productos!=null){
                        for (Casting prov : productos) {
                            Object[] fila = new Object[9];
                            fila[0] = prov.getNumCasting();
                            fila[1] = prov.getNombre();
                            String fechaI = "";
                            if((prov.getFechaContratacion().getDate())<10){
                                fechaI = "0"+prov.getFechaContratacion().getDate()+"/";
                            }
                            else{
                                fechaI = prov.getFechaContratacion().getDate()+"/";
                            }
                            if((prov.getFechaContratacion().getMonth()+1)<10){
                                fechaI = fechaI+"0"+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            else{
                                fechaI = fechaI+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            if(prov.getFechaContratacion().getMonth()<10){
                                fechaI = fechaI+"0"+ prov.getFechaContratacion().getMonth()+"/";
                            }
                            else{
                                fechaI = fechaI+ prov.getFechaContratacion().getMonth()+"/";
                            }
                            fechaI = fechaI + (prov.getFechaContratacion().getYear()+1900)+ "";
                            fila[2] = fechaI;
                            fila[3] = prov.getCosto();
                            fila[4] = prov.getTipo();
                            fila[5] = prov.getDescripcion();
                            fila[6] = prov.getCliente().getNombre();
                            fila[7] = prov.getAgente().getNombre();
                            modelo.addRow(fila);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Introduzca solo letras", "Buscar", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(cmbSeleccion.getSelectedItem().equals("Fecha")){
                if(txtCampo.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")){
                    List<Casting> productos = castingBO.getCasting();
                    DefaultTableModel modelo = (DefaultTableModel) tblCastings.getModel();
                    modelo.setRowCount(0);
                    if(productos!=null){
                        for (Casting prov : productos) {
                            Object[] fila = new Object[9];
                            fila[0] = prov.getNumCasting();
                            fila[1] = prov.getNombre();
                            String fechaI = "";
                            if((prov.getFechaContratacion().getDate())<10){
                                fechaI = "0"+prov.getFechaContratacion().getDate()+"/";
                            }
                            else{
                                fechaI = prov.getFechaContratacion().getDate()+"/";
                            }
                            if((prov.getFechaContratacion().getMonth()+1)<10){
                                fechaI = fechaI+"0"+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            else{
                                fechaI = fechaI+ (prov.getFechaContratacion().getMonth()+1)+"/";
                            }
                            fechaI = fechaI + (prov.getFechaContratacion().getYear()+1900)+ "";
                            fila[2] = fechaI;
                            fila[3] = prov.getCosto();
                            fila[4] = prov.getTipo();
                            fila[5] = prov.getDescripcion();
                            fila[6] = prov.getCliente().getNombre();
                            fila[7] = prov.getAgente().getNombre();
                            if(fechaI.equals(txtCampo.getText())){
                                modelo.addRow(fila);
                            }

                        }
                        if(modelo.getRowCount()==0){
                            JOptionPane.showMessageDialog(null, "No hay coincidencias", "Casting", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "necesario formato dd/mm/YYYY", "Casting", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        limpiarCampos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        llenarTablaCastings();
    }//GEN-LAST:event_btnLimpiarActionPerformed

/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtCampo.setText("");
        cmbSeleccion.setSelectedIndex(0);
    }
    
/**
 *
 * Metodo para llenar la tabla de castings
 */
    public void llenarTablaCastings() {
        List<Casting> productos = castingBO.getCasting();
        DefaultTableModel modelo = (DefaultTableModel) tblCastings.getModel();
        modelo.setRowCount(0);
        for (Casting prov : productos) {
            Object[] fila = new Object[9];
            fila[0] = prov.getNumCasting();
            fila[1] = prov.getNombre();
            String fechaI = "";
            if((prov.getFechaContratacion().getDate())<10){
                fechaI = "0"+prov.getFechaContratacion().getDate()+"/";
            }
            else{
                fechaI = prov.getFechaContratacion().getDate()+"/";
            }
            if((prov.getFechaContratacion().getMonth()+1)<10){
                fechaI = fechaI+"0"+ (prov.getFechaContratacion().getMonth()+1)+"/";
            }
            else{
                fechaI = fechaI+ (prov.getFechaContratacion().getMonth()+1)+"/";
            }
            fechaI = fechaI + (prov.getFechaContratacion().getYear()+1900)+ "";
            fila[2] = fechaI;
            fila[3] = prov.getCosto();
            fila[4] = prov.getTipo();
            fila[5] = prov.getDescripcion();
            fila[6] = prov.getCliente().getNombre();
            fila[7] = prov.getAgente().getNombre();
            modelo.addRow(fila);
            
        }

    }
  
    public boolean validarCampos(){
        if ((txtCampo.getText().length() == 0)||(cmbSeleccion.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(this, "Campo sin llenar", "Buscar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
            return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbSeleccion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCastings;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
}
