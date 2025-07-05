package Interfaz;

import Entidades.*;
import controlador.Hotel;
import controlador.SistemaHotel;
import javax.swing.JOptionPane;

public class Buscar_Empleado extends javax.swing.JFrame {

    private Hotel hotel = SistemaHotel.getInstancia().getHotel();

    public Buscar_Empleado() {
        initComponents();
        jTextFNombre_Apellidos.setEditable(false);
        setLocationRelativeTo(null);
        jTextFEstado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFID_Empleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFNombre_Apellidos = new javax.swing.JTextField();
        jButtonLupita = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFNro_Habitación = new javax.swing.JTextField();
        jButtonBinocular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFEstado = new javax.swing.JTextField();
        jButtonAsignar_Mantenimiento = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPCIÓN DE EMPLEADO");

        jLabel1.setText("Empleados");

        jLabel2.setText("Nro ID:");

        jLabel3.setText("Nombres y apellidos:");

        jButtonLupita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar2.gif"))); // NOI18N
        jButtonLupita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLupitaActionPerformed(evt);
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

        jLabel4.setText("Mantenimiento de habitación");

        jLabel5.setText("Nro Habitación: ");

        jButtonBinocular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.gif"))); // NOI18N
        jButtonBinocular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinocularActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        jTextFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFEstadoActionPerformed(evt);
            }
        });

        jButtonAsignar_Mantenimiento.setBackground(new java.awt.Color(51, 51, 255));
        jButtonAsignar_Mantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignar_Mantenimiento.setText("Dar Mantenimiento");
        jButtonAsignar_Mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignar_MantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRegresar)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonAsignar_Mantenimiento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFNro_Habitación, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(jButtonBinocular))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFID_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonLupita))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFNombre_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLupita)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFID_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFNombre_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFNro_Habitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBinocular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonAsignar_Mantenimiento))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        new Menu_hotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonLupitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLupitaActionPerformed
        String id3 = jTextFID_Empleado.getText().trim();
        if (id3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI del huésped.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(id3);
        Empleado empleado = hotel.buscarEmpleadoPorId(id);
        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Empleadono encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jTextFNombre_Apellidos.setText(empleado.getNombre() + " " + empleado.getApellido());
        }
    }//GEN-LAST:event_jButtonLupitaActionPerformed

    private void jButtonBinocularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinocularActionPerformed
        // Obtener el número de habitación desde el campo de texto
        String numero = jTextFNro_Habitación.getText().trim();

        // Validar entrada vacía
        if (numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de habitación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar habitación en el sistema
        Habitacion habitacion = hotel.buscarHabitacionporNumero(numero);

        // Verificar si la habitación fue encontrada
        if (habitacion == null) {
            jTextFEstado.setText("No existe");
            JOptionPane.showMessageDialog(this, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Traducir el estado de char a String legible
            String estado;
            switch (habitacion.getEstado()) {
                case 'O':
                    estado = "Ocupado";
                    break;
                case 'M':
                    estado = "En Mantenimiento";
                    break;
                default:
                    estado = "Libre";
            }

            jTextFEstado.setText(estado);
        }
    }//GEN-LAST:event_jButtonBinocularActionPerformed

    private void jTextFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFEstadoActionPerformed

    private void jButtonAsignar_MantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignar_MantenimientoActionPerformed
        String numero = jTextFNro_Habitación.getText().trim();

        if (numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de habitación.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Habitacion habitacion = hotel.buscarHabitacionporNumero(numero);
        if (habitacion == null) {
            JOptionPane.showMessageDialog(this, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (habitacion.getEstado() == 'O') {
            JOptionPane.showMessageDialog(this, "No se puede poner en mantenimiento. La habitación está ocupada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si está libre, poner en mantenimiento
        if (habitacion.getEstado() == 'L') {
            habitacion.setEstado('M');
            jTextFEstado.setText("En Mantenimiento");
            JOptionPane.showMessageDialog(this, "Habitación marcada como 'En Mantenimiento'.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else if (habitacion.getEstado() == 'M') {
            JOptionPane.showMessageDialog(this, "La habitación ya está en mantenimiento.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAsignar_MantenimientoActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAsignar_Mantenimiento;
    private javax.swing.JButton jButtonBinocular;
    private javax.swing.JButton jButtonLupita;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFEstado;
    private javax.swing.JTextField jTextFID_Empleado;
    private javax.swing.JTextField jTextFNombre_Apellidos;
    private javax.swing.JTextField jTextFNro_Habitación;
    // End of variables declaration//GEN-END:variables
}
