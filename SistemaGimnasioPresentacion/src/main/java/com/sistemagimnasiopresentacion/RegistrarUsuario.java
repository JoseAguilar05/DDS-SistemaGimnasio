/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sistemagimnasiopresentacion;

/**
 *
 * @author 52644
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtiquetaSuperior = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        campoNombres3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        campoNumeroTelefono = new javax.swing.JTextField();
        campoNombres5 = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        EtiquetaSuperior.setText("jLabel1");

        campoNombres3.setText("Nombre(s)");
        campoNombres3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombres3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoNumeroTelefono.setText("Número de Teléfono");
        campoNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroTelefonoActionPerformed(evt);
            }
        });

        campoNombres5.setText("Nombre(s)");
        campoNombres5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombres5ActionPerformed(evt);
            }
        });

        campoApellidos.setText("Apellido(s)");
        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });

        campoEmail.setText("Email");
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombres5)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNumeroTelefono)
                    .addComponent(campoEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(campoNombres5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombres3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombres3ActionPerformed

    private void campoNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroTelefonoActionPerformed

    private void campoNombres5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombres5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombres5ActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaSuperior;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres3;
    private javax.swing.JTextField campoNombres5;
    private javax.swing.JTextField campoNumeroTelefono;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
