package Interfaz;

public class Menu_hotel extends javax.swing.JFrame {

    public Menu_hotel() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonRegistroSalida = new javax.swing.JButton();
        jButtonListarHuespedes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscarEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonReporteVentas = new javax.swing.JButton();
        jButtonListarHabitacion = new javax.swing.JButton();
        jButtonBorraHabitacion = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Hotel");

        jLabel1.setText("Operaciones con Huéspedes: ");

        jButtonRegistroSalida.setBackground(new java.awt.Color(51, 51, 255));
        jButtonRegistroSalida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistroSalida.setText("Registrar salida");
        jButtonRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroSalidaActionPerformed(evt);
            }
        });

        jButtonListarHuespedes.setBackground(new java.awt.Color(51, 51, 255));
        jButtonListarHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHuespedes.setText("Listar Huéspedes");
        jButtonListarHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarHuespedesActionPerformed(evt);
            }
        });

        jLabel2.setText("Operaciones con Empleados: ");

        jButtonBuscarEmpleado.setBackground(new java.awt.Color(51, 51, 255));
        jButtonBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarEmpleado.setText("Buscar Empleado");
        jButtonBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEmpleadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Operaciones de Hotel: ");

        jButtonReporteVentas.setBackground(new java.awt.Color(51, 51, 255));
        jButtonReporteVentas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReporteVentas.setText("Reporte de ventas por día");
        jButtonReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteVentasActionPerformed(evt);
            }
        });

        jButtonListarHabitacion.setBackground(new java.awt.Color(51, 51, 255));
        jButtonListarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarHabitacion.setText("Listar Habitaciones ");
        jButtonListarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarHabitacionActionPerformed(evt);
            }
        });

        jButtonBorraHabitacion.setBackground(new java.awt.Color(51, 51, 255));
        jButtonBorraHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorraHabitacion.setText("Borra Habitación");
        jButtonBorraHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorraHabitacionActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 51, 255));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Listar Empleados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 51, 255));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Huespedes por Habitación ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonRegresar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReporteVentas)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonListarHabitacion)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBorraHabitacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBuscarEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRegistroSalida)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonListarHuespedes))
                            .addComponent(jButton9))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistroSalida)
                    .addComponent(jButtonListarHuespedes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarEmpleado)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReporteVentas)
                    .addComponent(jButtonListarHabitacion)
                    .addComponent(jButtonBorraHabitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegresar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEmpleadoActionPerformed
        // 
        new Buscar_Empleado().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscarEmpleadoActionPerformed

    private void jButtonReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteVentasActionPerformed
        // TODO add your handling code here:
        new ReporteVentas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonReporteVentasActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new Listar_Empleado().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new HuespesHabitacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        new Menu_principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroSalidaActionPerformed
        // ir a registrar sallida huesped
        new Registrar_salida_huesped().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistroSalidaActionPerformed

    private void jButtonListarHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarHuespedesActionPerformed
        // TODO add your handling code here:
        new Listar_Huesped().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonListarHuespedesActionPerformed

    private void jButtonListarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarHabitacionActionPerformed
        // TODO add your handling code here:
        new Listar_habitaciones().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonListarHabitacionActionPerformed

    private void jButtonBorraHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorraHabitacionActionPerformed
        // TODO add your handling code here:
        new Borrar_habitacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBorraHabitacionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonBorraHabitacion;
    private javax.swing.JButton jButtonBuscarEmpleado;
    private javax.swing.JButton jButtonListarHabitacion;
    private javax.swing.JButton jButtonListarHuespedes;
    private javax.swing.JButton jButtonRegistroSalida;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonReporteVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
