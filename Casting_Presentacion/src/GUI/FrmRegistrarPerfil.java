/*
 * FrmRegistrarPerfil.java
 * 
 * Creada el 6 de Mayo del 2022 2:20PM
 */
package GUI;

import BO.CastingBO;
import BO.PefilBO;
import Interfaces.ICastingBO;
import Interfaces.IPerfilBO;
import entidades.Casting;
import entidades.Perfil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Proyecto Final - Casting
 * @author Isaac Castelo Valenzuela
 * @author Alexandra Iveth Rodriguez Castellanos
 * @author Saul Armando Reyna Lopez
 */
public class FrmRegistrarPerfil extends javax.swing.JFrame {
    ICastingBO castingBO = new CastingBO();
    IPerfilBO perfilBO = new PefilBO();
    Casting casting = new Casting();

    /**
     * Creates new form FrmRegistrarPerfil
     */
    public FrmRegistrarPerfil() {
        initComponents();
        llenarTabla();
        llenarTablaCasting();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCasting = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOjos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCabello = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        cmbExp = new javax.swing.JComboBox<>();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbEdad = new javax.swing.JComboBox<>();
        cmbAltura = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPerfil = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Perfil - Casting");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCasting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Agente", "Cliente", "Costo", "Decripción"
            }
        ));
        tblCasting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCastingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCasting);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 565, 160));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32_1.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Floppy.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel1.setText("Estado");
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setText("Sexo");
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel3.setText("Rango de altura");
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setText("Rango edad");
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 203, -1, -1));

        jLabel5.setText("Color de cabello");
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        getContentPane().add(txtOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 157, -1));

        jLabel6.setText("Color de ojos");
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Experiencia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Especialidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        getContentPane().add(txtCabello, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 157, -1));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 109, -1));

        cmbExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "Si", "No" }));
        getContentPane().add(cmbExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Modelo", "Actor" }));
        getContentPane().add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, -1));

        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        cmbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "0-15", "5-18", "18-25", "25-35", "35-45", "45-60", "60" }));
        getContentPane().add(cmbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        cmbAltura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------", "0-1.50", "1.50-1.70", "1.70-1.90", "1.90" }));
        getContentPane().add(cmbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Perfiles");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Castings");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Femenino", "Masculino" }));
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        tblPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Estado", "Sexo", "altura", "edad", "Experiencia", "Especialidad", "Cabello", "Ojos", "ID Casting"
            }
        ));
        tblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerfilMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPerfil);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 640, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 1100, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validarCampos()) {
            Perfil perfil = new Perfil();
            perfil.setNumPerfil(Long.parseLong(txtID.getText()));
            perfil.setEstado(cmbEstado.getSelectedItem().toString());
            perfil.setRangoEdad(cmbEdad.getSelectedItem().toString());
            perfil.setColorPelo(txtCabello.getText());
            perfil.setColorOjos(txtOjos.getText());
            perfil.setSexo(cmbSexo.getSelectedItem().toString());
            perfil.setRangoAltura(cmbAltura.getSelectedItem().toString());
            perfil.setEspecialidad(cmbEspecialidad.getSelectedItem().toString());
            if(cmbExp.getSelectedItem().toString().equals("Si")){
                perfil.setExperiencia(true);
            }
            else{
                perfil.setExperiencia(false);
            }
            if(validarCampoCasting()){
                perfil.setCasting(casting);
                perfilBO.regsistrar(perfil);
                llenarTabla();
                limpiarCampos();
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione un casting", "Perfil", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Perfil", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtCabello.getText().length()>0){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el cliente seleccionado?", "Cliente", JOptionPane.YES_NO_OPTION); 
            if(respuesta == 0){
                Perfil perfil = new Perfil();
                perfil.setEstado(cmbEstado.getSelectedItem().toString());
                perfil.setRangoEdad(cmbEdad.getSelectedItem().toString());
                perfil.setColorPelo(txtCabello.getText());
                perfil.setColorOjos(txtOjos.getText());
                perfil.setSexo(cmbSexo.getSelectedItem().toString());
                perfil.setRangoAltura(cmbAltura.getSelectedItem().toString());
                perfil.setEspecialidad(cmbEspecialidad.getSelectedItem().toString());
                if(cmbExp.getSelectedItem().toString().equals("Si")){
                    perfil.setExperiencia(true);
                }
                else{
                    perfil.setExperiencia(false);
                }
                perfilBO.eliminar(perfil);
                llenarTabla();
                limpiarCampos();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione un perfil", "Perfil", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerfilMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPerfil.getModel();
        String id = model.getValueAt(tblPerfil.getSelectedRow(), 0).toString();
        String estado = model.getValueAt(tblPerfil.getSelectedRow(), 1).toString();
        String sexo = model.getValueAt(tblPerfil.getSelectedRow(), 2).toString();
        String altura = model.getValueAt(tblPerfil.getSelectedRow(), 3).toString();
        String edad = model.getValueAt(tblPerfil.getSelectedRow(), 4).toString();
        String exp = model.getValueAt(tblPerfil.getSelectedRow(), 5).toString();
        String esp = model.getValueAt(tblPerfil.getSelectedRow(), 6).toString();
        String pelo = model.getValueAt(tblPerfil.getSelectedRow(), 7).toString();
        String ojos = model.getValueAt(tblPerfil.getSelectedRow(), 8).toString();
        txtID.setText(id);
        txtCabello.setText(pelo);
        txtOjos.setText(ojos);
        cmbAltura.setSelectedItem(altura);
        cmbEstado.setSelectedItem(estado);
        cmbExp.setSelectedItem(exp);
        cmbEspecialidad.setSelectedItem(esp);
        cmbEdad.setSelectedItem(edad);
        cmbSexo.setSelectedItem(sexo);
        
    }//GEN-LAST:event_tblPerfilMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }

        if (txtID.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void tblCastingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCastingMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCasting.getModel();
        String id = model.getValueAt(tblCasting.getSelectedRow(), 0).toString();
        String nombre = model.getValueAt(tblCasting.getSelectedRow(), 1).toString();
        String cliente = model.getValueAt(tblCasting.getSelectedRow(), 3).toString();
        String costo = model.getValueAt(tblCasting.getSelectedRow(), 4).toString();
        String descripcion = model.getValueAt(tblCasting.getSelectedRow(), 5).toString();
        casting.setNumCasting(Long.parseLong(id));
        casting.setCosto(Float.parseFloat(costo));
        casting.setNombre(nombre);
        casting.setDescripcion(descripcion);
        System.out.println(casting);
    }//GEN-LAST:event_tblCastingMouseClicked
    
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarCampos(){
        txtID.setText("");
        cmbEstado.setSelectedIndex(0);
        txtCabello.setText("");
        txtOjos.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbAltura.setSelectedIndex(0);
        cmbEdad.setSelectedIndex(0);
        cmbExp.setSelectedIndex(0);
        cmbEspecialidad.setSelectedIndex(0);
        
    }
    
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public boolean validarCampos(){
        if((cmbSexo.getSelectedIndex() == 0)||(txtCabello.getText().length() == 0)||(txtOjos.getText().length() == 0)||
                (cmbSexo.getSelectedIndex() == 0)||(cmbAltura.getSelectedIndex() == 0)||(cmbEdad.getSelectedIndex() == 0)||
                (cmbExp.getSelectedIndex() == 0)||(cmbEspecialidad.getSelectedIndex() == 0)){
            
            return false;
        }
        else{
            
            return true;
        }
    }
    
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public boolean validarSeleccionCasting(){
        DefaultTableModel model = (DefaultTableModel) tblCasting.getModel();
        String id = model.getValueAt(tblCasting.getSelectedRow(), 0).toString();
        if((cmbSexo.getSelectedIndex() == 0)||(txtCabello.getText().length() == 0)||(txtOjos.getText().length() == 0)||
                (cmbSexo.getSelectedIndex() == 0)||(cmbAltura.getSelectedIndex() == 0)||(cmbEdad.getSelectedIndex() == 0)||
                (cmbExp.getSelectedIndex() == 0)||(cmbEspecialidad.getSelectedIndex() == 0)){
            
            return false;
        }
        else{
            
            return true;
        }
    }
    
/**
 *
 * Metodo para llenar la tabla de perfiles
 */
    public void llenarTabla() {
        List<Perfil> productos = perfilBO.getPerfil();
        DefaultTableModel modelo = (DefaultTableModel) tblPerfil.getModel();
        modelo.setRowCount(0);
        for (Perfil prov : productos) {
            Object[] fila = new Object[10];
            fila[0] = prov.getNumPerfil();
            fila[1] = prov.getEstado();
            fila[2] = prov.getSexo();
            fila[3] = prov.getRangoAltura();
            fila[4] = prov.getRangoEdad();
            fila[6] = prov.getEspecialidad();
            if(prov.isExperiencia()){
                fila[5] = "Si";
            }
            else{
                fila[5] = "No";
            }
            fila[7] = prov.getColorPelo();
            fila[8] = prov.getColorOjos();
            fila[9] = prov.getCasting().getNumCasting();
            modelo.addRow(fila);
        }

    }
    
    public boolean validarCampoCasting(){
        if (casting.getNombre() == null) {
            
            return false;
        }
        else 
            return true;
    }
/**
 *
 * Metodo para llenar la tabla de castings
 */
    public void llenarTablaCasting() {
        List<Casting> productos = castingBO.getCasting();
        if(!(productos.isEmpty())){
            DefaultTableModel modelo = (DefaultTableModel) tblCasting.getModel();
            modelo.setRowCount(0);
            for (Casting prov : productos) {
                Object[] fila = new Object[6];
                fila[0] = prov.getNumCasting();
                fila[1] = prov.getNombre();
                fila[2] = prov.getAgente().getNombre();
                fila[3] = prov.getCliente().getNombre();
                fila[4] = prov.getCosto();
                fila[5] = prov.getDescripcion();
                String fechaI = prov.getFechaContratacion().getDate()+"/";
                if(prov.getFechaContratacion().getMonth()<10){
                    fechaI = fechaI+"0"+ prov.getFechaContratacion().getMonth()+"/";
                }
                else{
                    fechaI = fechaI+ prov.getFechaContratacion().getMonth()+"/";
                }
                fechaI = fechaI + (prov.getFechaContratacion().getYear()+1900)+ "";
                Date fechaHoy = new Date();
                if(fechaHoy.after(prov.getFechaContratacion())){

                }
                else{
                    modelo.addRow(fila);
                }
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay castings", "Casting", JOptionPane.ERROR_MESSAGE);
            this.dispose();

        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAltura;
    private javax.swing.JComboBox<String> cmbEdad;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbExp;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCasting;
    private javax.swing.JTable tblPerfil;
    private javax.swing.JTextField txtCabello;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOjos;
    // End of variables declaration//GEN-END:variables
}
