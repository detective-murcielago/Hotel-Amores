package Interfaz;

import Entidades.Empleado;
import javax.swing.*;
import controlador.*;

public class Empleados extends javax.swing.JFrame {

    public Empleados() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFNombreEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFApellidosEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFDNIEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFONOEmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFIDEmp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFROLEmp = new javax.swing.JTextField();
        jButtonGuardar2 = new javax.swing.JButton();
        jButtonRegresar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE EMPLEADO");

        jLabel1.setText("Registro de Empleado");

        jLabel2.setText("Nombres:");

        jTextFNombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNombreEmpActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellidos: ");

        jTextFApellidosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFApellidosEmpActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro DNI: ");

        jTextFDNIEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFDNIEmpActionPerformed(evt);
            }
        });

        jLabel5.setText("Nro Teléfono:");

        jTextFONOEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFONOEmpActionPerformed(evt);
            }
        });

        jLabel6.setText("ID:");

        jTextFIDEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFIDEmpActionPerformed(evt);
            }
        });

        jLabel7.setText("Rol:");

        jTextFROLEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFROLEmpActionPerformed(evt);
            }
        });

        jButtonGuardar2.setBackground(new java.awt.Color(51, 51, 255));
        jButtonGuardar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Guardar.gif"))); // NOI18N
        jButtonGuardar2.setText("Guardar");
        jButtonGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardar2ActionPerformed(evt);
            }
        });

        jButtonRegresar2.setBackground(new java.awt.Color(51, 51, 255));
        jButtonRegresar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar2.setText("Regresar");
        jButtonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFNombreEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jTextFApellidosEmp)
                    .addComponent(jTextFDNIEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jTextFIDEmp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jTextFROLEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRegresar2)
                            .addComponent(jTextFONOEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButtonGuardar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFIDEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFApellidosEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFROLEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFDNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFONOEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar2)
                    .addComponent(jButtonRegresar2))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFNombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNombreEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNombreEmpActionPerformed

    private void jTextFApellidosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFApellidosEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFApellidosEmpActionPerformed

    private void jTextFDNIEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFDNIEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFDNIEmpActionPerformed

    private void jTextFONOEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFONOEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFONOEmpActionPerformed

    private void jTextFIDEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFIDEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFIDEmpActionPerformed

    private void jTextFROLEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFROLEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFROLEmpActionPerformed

    private void jButtonGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardar2ActionPerformed
        try {
            String nombre = jTextFNombreEmp.getText().trim();
            String apellido = jTextFApellidosEmp.getText().trim();
            String dniStr = jTextFDNIEmp.getText().trim();
            String telStr = jTextFONOEmp.getText().trim();
            String idStr = jTextFIDEmp.getText().trim();
            String rol = jTextFROLEmp.getText().trim();

            // Validar campos vacíos
            if (nombre.isEmpty() || apellido.isEmpty() || dniStr.isEmpty()
                    || telStr.isEmpty() || idStr.isEmpty() || rol.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar campos numéricos
            if (!dniStr.matches("\\d+") || !telStr.matches("\\d+") || !idStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "DNI, Teléfono e ID deben contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int dni = Integer.parseInt(dniStr);
            int telefono = Integer.parseInt(telStr);
            int id = Integer.parseInt(idStr);

            Hotel hotel = SistemaHotel.getInstancia().getHotel();

            // Verificar existencia por ID o DNI
            if (hotel.buscarEmpleadoPorId(id) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe un empleado con ese ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (hotel.buscarEmpleadoPorDni(dni) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe un empleado con ese DNI.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear y registrar
            Empleado nuevoEmpleado = new Empleado(id, rol, nombre, apellido, dni, telefono);
            hotel.registrarEmpleado(nuevoEmpleado);

            JOptionPane.showMessageDialog(this, "Empleado registrado exitosamente.");

            // Limpiar campos
            jTextFNombreEmp.setText("");
            jTextFApellidosEmp.setText("");
            jTextFDNIEmp.setText("");
            jTextFONOEmp.setText("");
            jTextFIDEmp.setText("");
            jTextFROLEmp.setText("");
            jTextFNombreEmp.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardar2ActionPerformed

    private void jButtonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar2ActionPerformed
        // Salir del registro de empleado
        new Menu_principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar2;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFApellidosEmp;
    private javax.swing.JTextField jTextFDNIEmp;
    private javax.swing.JTextField jTextFIDEmp;
    private javax.swing.JTextField jTextFNombreEmp;
    private javax.swing.JTextField jTextFONOEmp;
    private javax.swing.JTextField jTextFROLEmp;
    // End of variables declaration//GEN-END:variables
}
