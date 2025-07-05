package Interfaz;

import Entidades.*;
import controlador.*;
import java.time.LocalDateTime;
import java.util.*;

import javax.swing.JOptionPane;

public class Asignar_Habitacion extends javax.swing.JFrame {

    private Hotel hotel = SistemaHotel.getInstancia().getHotel();

    public Asignar_Habitacion() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFBNameyApellidos.setEditable(false);
        jTextFBEstado.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFBDNIHuesped = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFBNameyApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1Lupa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFBnumeroHabitacion = new javax.swing.JTextField();
        jButton2BuscarHabitacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFBEstado = new javax.swing.JTextField();
        jButton3RegistrarHuesped = new javax.swing.JButton();
        jButton4Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASIGNAR HABITACIÓN A HUÉSPED");

        jLabel1.setText("Asignar Habitación a Huésped");

        jLabel2.setText("DNI de huésped:");

        jTextFBDNIHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFBDNIHuespedActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombres y apellidos:");

        jTextFBNameyApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFBNameyApellidosActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de huéspedes: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1Lupa.setBackground(new java.awt.Color(255, 255, 255));
        jButton1Lupa.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.gif"))); // NOI18N
        jButton1Lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LupaActionPerformed(evt);
            }
        });

        jLabel5.setText("N°- Habitación: ");

        jTextFBnumeroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFBnumeroHabitacionActionPerformed(evt);
            }
        });

        jButton2BuscarHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jButton2BuscarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButton2BuscarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar2.gif"))); // NOI18N
        jButton2BuscarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarHabitacionActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        jButton3RegistrarHuesped.setBackground(new java.awt.Color(51, 51, 255));
        jButton3RegistrarHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jButton3RegistrarHuesped.setText("Asignar Habitación");
        jButton3RegistrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3RegistrarHuespedActionPerformed(evt);
            }
        });

        jButton4Regresar.setBackground(new java.awt.Color(51, 51, 255));
        jButton4Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton4Regresar.setText("Regresar");
        jButton4Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton3RegistrarHuesped)
                        .addGap(72, 72, 72)
                        .addComponent(jButton4Regresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFBnumeroHabitacion))))
                        .addGap(51, 51, 51)
                        .addComponent(jButton2BuscarHabitacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFBDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1Lupa))
                            .addComponent(jTextFBNameyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1Lupa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFBDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFBNameyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2BuscarHabitacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFBnumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3RegistrarHuesped)
                    .addComponent(jButton4Regresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFBNameyApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFBNameyApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFBNameyApellidosActionPerformed

    private void jButton1LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LupaActionPerformed
        // Metodo lupa
        String dniStr3 = jTextFBDNIHuesped.getText().trim();
        if (dniStr3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI del huésped.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dni = Integer.parseInt(dniStr3);
        Huesped huesped = hotel.buscarHuespedPorDni(dni);
        if (huesped == null) {
            JOptionPane.showMessageDialog(this, "Huésped no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jTextFBNameyApellidos.setText(huesped.getNombre() + " " + huesped.getApellido());
        }

    }//GEN-LAST:event_jButton1LupaActionPerformed

    private void jTextFBnumeroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFBnumeroHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFBnumeroHabitacionActionPerformed

    private void jButton2BuscarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarHabitacionActionPerformed
        // Obtener el número de habitación desde el campo de texto
        String numero = jTextFBnumeroHabitacion.getText().trim();

        // Validar entrada vacía
        if (numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de habitación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar habitación en el sistema
        Habitacion habitacion = hotel.buscarHabitacionporNumero(numero);

        // Verificar si la habitación fue encontrada
        if (habitacion == null) {
            jTextFBEstado.setText("No existe");
            JOptionPane.showMessageDialog(this, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Traducir el estado de char a String legible
            String estado;
            switch (habitacion.getEstado()) {
                case 'D':
                    estado = "Disponible";
                    break;
                case 'O':
                    estado = "Ocupada";
                    break;
                default:
                    estado = "Estado desconocido";
            }

            jTextFBEstado.setText(estado);
        }
    }//GEN-LAST:event_jButton2BuscarHabitacionActionPerformed

    private void jButton3RegistrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RegistrarHuespedActionPerformed
        // Obtener y validar DNI
        String dniStr = jTextFBDNIHuesped.getText().trim();

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

        // Buscar huésped
        Huesped huesped = hotel.buscarHuespedPorDni(dni);
        if (huesped == null) {
            JOptionPane.showMessageDialog(this, "Huésped no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener número de habitación
        String numeroHabitacion = jTextFBnumeroHabitacion.getText().trim();
        if (numeroHabitacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de habitación.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Habitacion habitacion = hotel.buscarHabitacionporNumero(numeroHabitacion);
        if (habitacion == null) {
            JOptionPane.showMessageDialog(this, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (habitacion.getEstado() == 'O') {
            JOptionPane.showMessageDialog(this, "La habitación está ocupada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener cantidad de huéspedes
        int cantidadPersonas = Integer.parseInt((String) jComboBox1.getSelectedItem());

        // Crear lista de huéspedes 
        List<Huesped> listaHuespedes = new ArrayList<>();
        listaHuespedes.add(huesped);

        // Crear ID de ficha 
        String idFicha = "FH-" + UUID.randomUUID().toString().substring(0, 8);

        // Definir horas 
        int horas = 24;

        // Crear objeto FichaHospedaje
        FichaHospedaje ficha = new FichaHospedaje(idFicha, listaHuespedes, habitacion, horas, LocalDateTime.now(), cantidadPersonas);

        // Registrar ficha en el sistema
        hotel.registrarFichaHospedaje(ficha);

        // Cambiar estado de habitación
        habitacion.setEstado('O');

        // Confirmar registro
        JOptionPane.showMessageDialog(this, "Ficha de hospedaje registrada exitosamente.\nID: " + idFicha, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar campos
        jTextFBDNIHuesped.setText("");
        jTextFBNameyApellidos.setText("");
        jTextFBnumeroHabitacion.setText("");
        jTextFBEstado.setText("");
        jComboBox1.setSelectedIndex(0);

    }//GEN-LAST:event_jButton3RegistrarHuespedActionPerformed

    private void jButton4RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4RegresarActionPerformed
        // ir a menu principal
        new Menu_principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4RegresarActionPerformed

    private void jTextFBDNIHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFBDNIHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFBDNIHuespedActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Asignar_Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asignar_Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asignar_Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asignar_Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asignar_Habitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Lupa;
    private javax.swing.JButton jButton2BuscarHabitacion;
    private javax.swing.JButton jButton3RegistrarHuesped;
    private javax.swing.JButton jButton4Regresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFBDNIHuesped;
    private javax.swing.JTextField jTextFBEstado;
    private javax.swing.JTextField jTextFBNameyApellidos;
    private javax.swing.JTextField jTextFBnumeroHabitacion;
    // End of variables declaration//GEN-END:variables
}
