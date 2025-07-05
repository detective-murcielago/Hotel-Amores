package Interfaz;

public class Menu_principal extends javax.swing.JFrame {

    public Menu_principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jmenutelo = new javax.swing.JLabel();
        JBingresarHT = new javax.swing.JButton();
        JBIngresarHuesped = new javax.swing.JButton();
        jBIngreEmpleado = new javax.swing.JButton();
        jBregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdministarHabi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");

        Jmenutelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hotel.jpg"))); // NOI18N
        Jmenutelo.setText("jLabel1");

        JBingresarHT.setBackground(new java.awt.Color(51, 51, 255));
        JBingresarHT.setForeground(new java.awt.Color(255, 255, 255));
        JBingresarHT.setText("Ver Menú del hotel");
        JBingresarHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBingresarHTActionPerformed(evt);
            }
        });

        JBIngresarHuesped.setBackground(new java.awt.Color(51, 51, 255));
        JBIngresarHuesped.setForeground(new java.awt.Color(255, 255, 255));
        JBIngresarHuesped.setText("Gestionar Huéspedes");
        JBIngresarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresarHuespedActionPerformed(evt);
            }
        });

        jBIngreEmpleado.setBackground(new java.awt.Color(51, 51, 255));
        jBIngreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jBIngreEmpleado.setText("Administrar Empleados");
        jBIngreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngreEmpleadoActionPerformed(evt);
            }
        });

        jBregresar.setText("<---  Regresar");
        jBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Menú Principal");
        jLabel1.setMaximumSize(new java.awt.Dimension(98, 16));

        jButtonAdministarHabi.setBackground(new java.awt.Color(51, 51, 255));
        jButtonAdministarHabi.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdministarHabi.setText("Administrar Habitación");
        jButtonAdministarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministarHabiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBregresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jmenutelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(JBingresarHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBIngreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBIngresarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdministarHabi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Jmenutelo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdministarHabi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBIngresarHuesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBIngreEmpleado)
                .addGap(7, 7, 7)
                .addComponent(JBingresarHT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBregresar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngreEmpleadoActionPerformed
        // Ir al registro de empleado:
        new Empleados().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBIngreEmpleadoActionPerformed

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
        // regresar a login:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBregresarActionPerformed

    private void JBIngresarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresarHuespedActionPerformed
        // Ir a registro de huesped
        new Registro_Huespedes().setVisible(true);
        dispose();
    }//GEN-LAST:event_JBIngresarHuespedActionPerformed

    private void JBingresarHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBingresarHTActionPerformed
        // Ir al menú de hotel
        new Menu_hotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_JBingresarHTActionPerformed

    private void jButtonAdministarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministarHabiActionPerformed
        // Ir a menu de habitación 
        new Habitaciones().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAdministarHabiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngresarHuesped;
    private javax.swing.JButton JBingresarHT;
    private javax.swing.JLabel Jmenutelo;
    private javax.swing.JButton jBIngreEmpleado;
    private javax.swing.JButton jBregresar;
    private javax.swing.JButton jButtonAdministarHabi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
