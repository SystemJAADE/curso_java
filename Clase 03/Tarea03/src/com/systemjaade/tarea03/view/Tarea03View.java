package com.systemjaade.tarea03.view;

import com.systemjaade.tarea03.model.Postulante;
import com.systemjaade.tarea03.service.PostulanteService;
import com.systemjaade.tarea03.util.MetodoGenericos;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elitg
 */
public class Tarea03View extends javax.swing.JFrame {

  PostulanteService postulanteService = new PostulanteService();

  public Tarea03View() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btgSexo = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jPanel8 = new javax.swing.JPanel();
    txtNombre = new javax.swing.JTextField();
    txtApellidoPaterno = new javax.swing.JTextField();
    txtApellidoMaterno = new javax.swing.JTextField();
    txtNumeroDni = new javax.swing.JTextField();
    txtFechaNacimiento = new javax.swing.JTextField();
    jPanel9 = new javax.swing.JPanel();
    txtTelefonoFijo = new javax.swing.JTextField();
    txtTelefonoCelular = new javax.swing.JTextField();
    txtCorreoElectronico = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    rbtMasculino = new javax.swing.JRadioButton();
    rbtFemenino = new javax.swing.JRadioButton();
    jPanel10 = new javax.swing.JPanel();
    txtDireccion = new javax.swing.JTextField();
    cbxDepartamento = new javax.swing.JComboBox<>();
    cbxProvincia = new javax.swing.JComboBox<>();
    cbxDistrito = new javax.swing.JComboBox<>();
    jPanel5 = new javax.swing.JPanel();
    btnAgregar = new javax.swing.JButton();
    btnModificar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    btnListar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Postulantes");

    jPanel1.setLayout(new java.awt.GridLayout(4, 1));

    jPanel8.setLayout(new java.awt.GridLayout(1, 0));

    txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel8.add(txtNombre);

    txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Paterno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel8.add(txtApellidoPaterno);

    txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Materno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel8.add(txtApellidoMaterno);

    txtNumeroDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel8.add(txtNumeroDni);

    txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento(DD/MM/YYYY)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel8.add(txtFechaNacimiento);

    jPanel1.add(jPanel8);

    jPanel9.setLayout(new java.awt.GridLayout(1, 0));

    txtTelefonoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono Fijo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel9.add(txtTelefonoFijo);

    txtTelefonoCelular.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel9.add(txtTelefonoCelular);

    txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo electrónico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel9.add(txtCorreoElectronico);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 136, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 52, Short.MAX_VALUE)
    );

    jPanel9.add(jPanel4);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
    jPanel3.setLayout(new java.awt.GridLayout(1, 0));

    btgSexo.add(rbtMasculino);
    rbtMasculino.setSelected(true);
    rbtMasculino.setText("M");
    rbtMasculino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jPanel3.add(rbtMasculino);

    btgSexo.add(rbtFemenino);
    rbtFemenino.setText("F");
    rbtFemenino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jPanel3.add(rbtFemenino);

    jPanel9.add(jPanel3);

    jPanel1.add(jPanel9);

    jPanel10.setLayout(new java.awt.GridLayout(1, 0));

    txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
    jPanel10.add(txtDireccion);

    cbxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento" }));
    jPanel10.add(cbxDepartamento);

    cbxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincia" }));
    jPanel10.add(cbxProvincia);

    cbxDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distrito" }));
    jPanel10.add(cbxDistrito);

    jPanel1.add(jPanel10);

    jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15));

    btnAgregar.setText("Agregar");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });
    jPanel5.add(btnAgregar);

    btnModificar.setText("Modificar");
    jPanel5.add(btnModificar);

    btnEliminar.setText("Eliminar");
    jPanel5.add(btnEliminar);

    btnListar.setText("Listar");
    jPanel5.add(btnListar);

    jPanel1.add(jPanel5);

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    jPanel2.setLayout(new java.awt.BorderLayout());

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jTable1);

    jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try {
      agregar();
    } catch (ParseException ex) {
      Logger.getLogger(Tarea03View.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnAgregarActionPerformed

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
      java.util.logging.Logger.getLogger(Tarea03View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Tarea03View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Tarea03View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Tarea03View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Tarea03View().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btgSexo;
  private javax.swing.JButton btnAgregar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnListar;
  private javax.swing.JButton btnModificar;
  private javax.swing.JComboBox<String> cbxDepartamento;
  private javax.swing.JComboBox<String> cbxDistrito;
  private javax.swing.JComboBox<String> cbxProvincia;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel10;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JPanel jPanel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JRadioButton rbtFemenino;
  private javax.swing.JRadioButton rbtMasculino;
  private javax.swing.JTextField txtApellidoMaterno;
  private javax.swing.JTextField txtApellidoPaterno;
  private javax.swing.JTextField txtCorreoElectronico;
  private javax.swing.JTextField txtDireccion;
  private javax.swing.JTextField txtFechaNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNumeroDni;
  private javax.swing.JTextField txtTelefonoCelular;
  private javax.swing.JTextField txtTelefonoFijo;
  // End of variables declaration//GEN-END:variables

  private void agregar() throws ParseException {
    Postulante postulante = new Postulante();
    postulante.setNombres(txtNombre.getText());
    postulante.setApellidoPaterno(txtApellidoPaterno.getText());
    postulante.setApellidoMaterno(txtApellidoMaterno.getText());
    postulante.setNumeroDni(txtNumeroDni.getText());
//    fecha  - dd/mm/yyyyy
    postulante.setFechaNacimiento(MetodoGenericos.stringToDate(txtFechaNacimiento.getText()));
    postulante.setTelefonoFijo(txtTelefonoFijo.getText());
    postulante.setTelefonoCelular(txtTelefonoCelular.getText());
    postulante.setCorreoElectronico(txtCorreoElectronico.getText());
    //    logica sexo
    postulante.setSexo(false);
    if (rbtMasculino.isSelected()) {
      postulante.setSexo(true);
    }
    postulante.setDireccion(txtDireccion.getText());
    postulante.setUbigeoId(1);
    postulanteService.registrar(postulante);
  }
}
