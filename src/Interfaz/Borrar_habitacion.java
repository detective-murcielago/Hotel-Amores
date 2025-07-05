package Interfaz;

import controlador.*;
import Entidades.Habitacion;
import javax.swing.JOptionPane;

public class Borrar_habitacion extends javax.swing.JFrame {

    private final Hotel hotel = SistemaHotel.getInstancia().getHotel();
    private Habitacion habitacionEncontrada = null;

    public Borrar_habitacion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonLupita = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonBorrar_habitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BORRAR HABITACIÓN");

        jLabel1.setText("Nro Habitación: ");

        jButtonLupita.setBackground(new java.awt.Color(255, 255, 255));
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

        jButtonBorrar_habitacion.setBackground(new java.awt.Color(51, 51, 255));
        jButtonBorrar_habitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrar_habitacion.setText("Borrar habitación");
        jButtonBorrar_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrar_habitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonLupita))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBorrar_habitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegresar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLupita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar_habitacion)
                    .addComponent(jButtonRegresar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        new Menu_hotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonBorrar_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrar_habitacionActionPerformed

        if (habitacionEncontrada == null) {
            JOptionPane.showMessageDialog(this, "Primero busque una habitación con el botón de búsqueda.");
            return;
        }

        if (habitacionEncontrada.getEstado() == 'O') {
            JOptionPane.showMessageDialog(this, "No se puede borrar una habitación ocupada.");
            return;
        }

        hotel.eliminarHabitacion(habitacionEncontrada.getNumero());
        JOptionPane.showMessageDialog(this, "Habitación eliminada correctamente.");
        jTextField1.setText("");
        habitacionEncontrada = null;

    }//GEN-LAST:event_jButtonBorrar_habitacionActionPerformed

    private void jButtonLupitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLupitaActionPerformed
        String numero = jTextField1.getText().trim();

        if (numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de habitación.");
            habitacionEncontrada = null;
            return;
        }

        Habitacion h = hotel.buscarHabitacionporNumero(numero);

        if (h != null) {
            habitacionEncontrada = h;

            if (h.getEstado() == 'O') {
                JOptionPane.showMessageDialog(this, "No se puede borrar la habitación (está ocupada).");
            } else {
                JOptionPane.showMessageDialog(this, "Se puede borrar la habitación.");
            }
        } else {
            habitacionEncontrada = null;
            JOptionPane.showMessageDialog(this, "No se encontró la habitación.");
        }
    }//GEN-LAST:event_jButtonLupitaActionPerformed

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
            java.util.logging.Logger.getLogger(Borrar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrar_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar_habitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar_habitacion;
    private javax.swing.JButton jButtonLupita;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
