package Interfaz;

import Entidades.Habitacion;

import controlador.*;
import javax.swing.JOptionPane;

public class Habitaciones extends javax.swing.JFrame {

    private final Hotel hotel = SistemaHotel.getInstancia().getHotel(); // Usa el hotel compartido

    public Habitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFPrecioxHora.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFNroHabitacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFPrecioxHora = new javax.swing.JTextField();
        jButton2Guardar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE HABITACIÓN");

        jLabel1.setText("REGISTRO DE HABITACIÓN");

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nro Habitación: ");

        jTextFNroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNroHabitacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo:");

        jLabel4.setText("Precio por hora:");

        jLabel5.setText("Estado:");

        jTextFPrecioxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFPrecioxHoraActionPerformed(evt);
            }
        });

        jButton2Guardar.setBackground(new java.awt.Color(51, 51, 255));
        jButton2Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton2Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Guardar.gif"))); // NOI18N
        jButton2Guardar.setText("Guardar ");
        jButton2Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GuardarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Matrimonial " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFNroHabitacion)
                            .addComponent(jTextFPrecioxHora)
                            .addComponent(jComboBox1, 0, 125, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2Guardar)
                        .addGap(92, 92, 92)
                        .addComponent(jButton1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFPrecioxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2Guardar)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Ir a menú principal
        new Menu_principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFNroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNroHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNroHabitacionActionPerformed

    private void jTextFPrecioxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFPrecioxHoraActionPerformed
        // caja de precio
    }//GEN-LAST:event_jTextFPrecioxHoraActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Prueba precio 
        String selected = (String) jComboBox1.getSelectedItem();

        // Puedes hacer una lógica más avanzada aquí si quieres
        switch (selected) {
            case "Simple":
                jTextFPrecioxHora.setText("50");
                break;
            case "Doble":
                jTextFPrecioxHora.setText("100");
                break;
            case "Matrimonial ":
                jTextFPrecioxHora.setText("150");
                break;
            default:
                jTextFPrecioxHora.setText("");
                break;
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GuardarActionPerformed
        // Guardar 

        String numero = jTextFNroHabitacion.getText().trim();
        String tipoSeleccionado = ((String) jComboBox1.getSelectedItem()).trim();
        String estadoSeleccionado = (String) jComboBox2.getSelectedItem();

        if (numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de habitación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar si ya existe una habitación con ese número
        if (hotel.buscarHabitacionporNumero(numero) != null) {
            JOptionPane.showMessageDialog(this, "El número de habitación ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener tipo de habitación
        char tipo;
        switch (tipoSeleccionado) {
            case "Simple":
                tipo = 'S';
                break;
            case "Doble":
                tipo = 'D';
                break;
            case "Matrimonial":
                tipo = 'M';
                break;
            default:
                JOptionPane.showMessageDialog(this, "Tipo de habitación inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        // Obtener estado
        char estado = estadoSeleccionado.equals("Ocupado") ? 'O' : 'D';

        try {
            double precioHora = Double.parseDouble(jTextFPrecioxHora.getText().trim());

            Habitacion hab = new Habitacion(numero, tipo, estado, precioHora);
            hotel.registrarHabitacion(hab); // Usamos directamente el hotel ya instanciado

            JOptionPane.showMessageDialog(this, "Habitación registrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar campos después del registro
            jTextFNroHabitacion.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jTextFPrecioxHora.setText("50"); // Por defecto

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio por hora no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2Guardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFNroHabitacion;
    private javax.swing.JTextField jTextFPrecioxHora;
    // End of variables declaration//GEN-END:variables
}
