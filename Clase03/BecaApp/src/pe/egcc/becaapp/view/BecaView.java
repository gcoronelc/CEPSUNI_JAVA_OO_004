package pe.egcc.becaapp.view;

import javax.swing.JOptionPane;
import pe.egcc.becaapp.dto.BecaDto;
import pe.egcc.becaapp.service.BecaService;
import pe.egcc.becaapp.util.BecaUtil;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class BecaView extends javax.swing.JFrame {
  
  private BecaService service;

  public BecaView() {
    initComponents();
    service = new BecaService();
    llenarCombos();
  }
  
  private void llenarCombos(){
    BecaUtil.llenarCombo(cboCate, service.getCategorias());
    BecaUtil.llenarCombo(cboProd, service.getProductos());
    BecaUtil.llenarCombo(cboMeses, service.getMeses());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cboCate = new javax.swing.JComboBox();
    cboProd = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    cboMeses = new javax.swing.JComboBox();
    lblImporte = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    btnProcesar = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("BECA PARA TODOS");

    jLabel1.setText("Categoría:");

    cboCate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboCate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboCateActionPerformed(evt);
      }
    });

    cboProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboProd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboProdActionPerformed(evt);
      }
    });

    jLabel2.setText("Producto:");

    jLabel3.setText("Importe:");

    jLabel4.setText("Meses:");

    cboMeses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    lblImporte.setBackground(new java.awt.Color(0, 102, 102));
    lblImporte.setForeground(new java.awt.Color(255, 255, 255));
    lblImporte.setText("jLabel5");
    lblImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    lblImporte.setOpaque(true);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 204, 204))); // NOI18N

    btnProcesar.setText("Procesar");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(22, 22, 22)
        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(80, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(cboCate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(cboProd, 0, 201, Short.MAX_VALUE)
              .addComponent(cboMeses, 0, 201, Short.MAX_VALUE)
              .addComponent(lblImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(cboCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(cboProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(lblImporte))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  private void cboCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCateActionPerformed
    doImporte();
  }//GEN-LAST:event_cboCateActionPerformed

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    // Datos
    BecaDto dto = new BecaDto();
    dto.setCategoria(cboCate.getSelectedItem().toString());
    dto.setProducto(cboProd.getSelectedItem().toString());
    dto.setMeses(cboMeses.getSelectedItem().toString());
    // Proceso
    service.doProcesar(dto);
    // Reporte
    String texto = "";
    texto += "Importe: " + dto.getImporte() + "\n";
    texto += "Interes: " + dto.getPorcInteres()+ "\n";
    texto += "Valor cuota: " + dto.getValorCuota()+ "\n";
    JOptionPane.showMessageDialog(rootPane, texto);
  }//GEN-LAST:event_btnProcesarActionPerformed

  private void cboProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdActionPerformed
    doImporte();
  }//GEN-LAST:event_cboProdActionPerformed

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
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BecaView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcesar;
  private javax.swing.JButton btnSalir;
  private javax.swing.JComboBox cboCate;
  private javax.swing.JComboBox cboMeses;
  private javax.swing.JComboBox cboProd;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblImporte;
  // End of variables declaration//GEN-END:variables

  private void doImporte(){
    // Verificar combos
    if(cboCate.getSelectedIndex() == -1 || cboProd.getSelectedIndex() == -1){
      return;
    }
    // Obtener categoria y producto
    String cate = cboCate.getSelectedItem().toString();
    String prod = cboProd.getSelectedItem().toString();
    // Obtener importe
    double importe = service.getImporte(cate, prod);
    lblImporte.setText(String.valueOf(importe));
    
  }

}
