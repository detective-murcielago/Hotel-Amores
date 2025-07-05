package Interfaz;

import Entidades.Huesped;
import controlador.*;
import javax.swing.*;

public class Registro_Huespedes extends javax.swing.JFrame {

    private Hotel hotel = SistemaHotel.getInstancia().getHotel();

    public Registro_Huespedes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFTelefono = new javax.swing.JTextField();
        jBReMenu1 = new javax.swing.JButton();
        jBGuardar1 = new javax.swing.JButton();
        jButtonAsignarHabitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE HUÉSPED");

        jLabel1.setText("REGISTRO DE HUÉSPED");

        jLabel2.setText("Nombres: ");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Nro DNI:");

        jLabel5.setText("Nro Teléfono:");

        jTextFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFTelefonoActionPerformed(evt);
            }
        });

        jBReMenu1.setBackground(new java.awt.Color(51, 51, 255));
        jBReMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jBReMenu1.setText("Regresar al menú");
        jBReMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReMenu1ActionPerformed(evt);
            }
        });

        jBGuardar1.setBackground(new java.awt.Color(51, 51, 255));
        jBGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Guardar.gif"))); // NOI18N
        jBGuardar1.setText("Guardar");
        jBGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardar1ActionPerformed(evt);
            }
        });

        jButtonAsignarHabitacion.setBackground(new java.awt.Color(51, 51, 255));
        jButtonAsignarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignarHabitacion.setText("Asignar habitación");
        jButtonAsignarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAsignarHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBReMenu1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFTelefono))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar1)
                    .addComponent(jButtonAsignarHabitacion)
                    .addComponent(jBReMenu1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFTelefonoActionPerformed

    private void jBReMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReMenu1ActionPerformed
        // Regresar al menu principal
        new Menu_principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBReMenu1ActionPerformed

    private void jBGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardar1ActionPerformed
        try {
            String nombre = jTextFName.getText().trim();
            String apellido = jTextFApellidos.getText().trim();
            String dniStr = jTextFDNI.getText().trim();
            String telefonoStr = jTextFTelefono.getText().trim();

            // Validar campos vacíos
            if (nombre.isEmpty() || apellido.isEmpty() || dniStr.isEmpty() || telefonoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar que nombre y apellido solo contengan letras
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+") || !apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                JOptionPane.showMessageDialog(this, "Nombre y Apellido solo deben contener letras.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar que DNI y teléfono sean numéricos
            int dni = Integer.parseInt(dniStr);
            int telefono = Integer.parseInt(telefonoStr);

            // Crear huésped
            Huesped nuevoHuesped = new Huesped(nombre, apellido, dni, telefono);

            // Intentar registrar
            boolean registrado = hotel.registrarHuesped(nuevoHuesped);

            if (registrado) {
                JOptionPane.showMessageDialog(this, "Huésped registrado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

                // Limpiar campos
                jTextFName.setText("");
                jTextFApellidos.setText("");
                jTextFDNI.setText("");
                jTextFTelefono.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un huésped con el mismo DNI, teléfono o ID.", "Registro duplicado", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI y Teléfono deben ser números válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar al huésped: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardar1ActionPerformed

    private void jButtonAsignarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarHabitacionActionPerformed
        // ir a menu de asignar habitación 
        new Asignar_Habitacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAsignarHabitacionActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Huespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Huespedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar1;
    private javax.swing.JButton jBReMenu1;
    private javax.swing.JButton jButtonAsignarHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFApellidos;
    private javax.swing.JTextField jTextFDNI;
    private javax.swing.JTextField jTextFName;
    private javax.swing.JTextField jTextFTelefono;
    // End of variables declaration//GEN-END:variables
}
