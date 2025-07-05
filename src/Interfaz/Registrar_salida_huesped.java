package Interfaz;

import Entidades.*;
import controlador.*;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Registrar_salida_huesped extends javax.swing.JFrame {

    private Hotel hotel = SistemaHotel.getInstancia().getHotel();
    private ComprobantePago comprobanteGenerado;

    public Registrar_salida_huesped() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFNameyApellidos1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFDNIHuesped = new javax.swing.JTextField();
        jButtonBinocular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFNameyApellidos1 = new javax.swing.JTextField();
        jButtonSalida = new javax.swing.JButton();
        jButtonVoucher = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALIDA DE HUÉSPED");

        jLabel1.setText("Nro DNI:");

        jButtonBinocular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.gif"))); // NOI18N
        jButtonBinocular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinocularActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre y apellidos:");

        jButtonSalida.setBackground(new java.awt.Color(51, 51, 255));
        jButtonSalida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalida.setText("Registrar salida");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        jButtonVoucher.setBackground(new java.awt.Color(51, 51, 255));
        jButtonVoucher.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoucher.setText("Imprimir Voucher");
        jButtonVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoucherActionPerformed(evt);
            }
        });

        jButtonRegresar.setBackground(new java.awt.Color(51, 51, 255));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonBinocular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFNameyApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoucher)
                        .addGap(19, 19, 19)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBinocular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFNameyApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoucher)
                    .addComponent(jButtonSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonRegresar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        String dniStr = jTextFDNIHuesped.getText().trim();
        if (dniStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI del huésped.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int dni;
        try {
            dni = Integer.parseInt(dniStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        FichaHospedaje ficha = hotel.buscarFichaPorHuespedDni(dni);
        if (ficha == null) {
            JOptionPane.showMessageDialog(this, "No se encontró ficha activa para este huésped.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Registrar fecha de salida
        ficha.setFechaSalida(LocalDateTime.now());
        ficha.setEstado('F');  // Marcar la ficha como finalizada
        double importe = ficha.calcularImporteTotal(); // Calcular el importe con la diferencia real de minutos

        // LIBERAR HABITACIÓN (esto es lo que te falta)
        Habitacion habitacion = ficha.getHabitacion();
        if (habitacion != null) {
            habitacion.setEstado('L');  // Liberar habitación
        }

        JOptionPane.showMessageDialog(this, "Salida registrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        comprobanteGenerado = new ComprobantePago(
                "CP" + System.currentTimeMillis(),//es para generar un identificador único
                ficha,
                ficha.calcularImporteTotal(),
                LocalDateTime.now()
        );

    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jButtonVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoucherActionPerformed
        if (comprobanteGenerado == null) {
            JOptionPane.showMessageDialog(this, "Debe registrar una salida antes de imprimir el comprobante.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Mostrar el toString en otro JFrame o en un JTextArea
        JOptionPane.showMessageDialog(this, comprobanteGenerado.toString(), "Comprobante", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonVoucherActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // Salir
        new Menu_hotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonBinocularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinocularActionPerformed
        String dniStr3 = jTextFDNIHuesped.getText().trim();
        if (dniStr3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI del huésped.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dni = Integer.parseInt(dniStr3);
        Huesped huesped = hotel.buscarHuespedPorDni(dni);
        if (huesped == null) {
            JOptionPane.showMessageDialog(this, "Huésped no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jTextFNameyApellidos1.setText(huesped.getNombre() + " " + huesped.getApellido());
        }
    }//GEN-LAST:event_jButtonBinocularActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_salida_huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_salida_huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_salida_huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_salida_huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_salida_huesped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBinocular;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JButton jButtonVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFDNIHuesped;
    private javax.swing.JTextField jTextFNameyApellidos1;
    // End of variables declaration//GEN-END:variables
}
