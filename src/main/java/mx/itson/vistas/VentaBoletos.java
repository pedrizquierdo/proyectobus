/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import mx.itson.proyectobus.Asiento;

/**
 *
 * @author pedrizquierdo
 */
public class VentaBoletos extends javax.swing.JFrame {

    /**
     * Creates new form VentaBoletos
     */
    private static final int NUM_ASIENTOS = 20; 
    private static final Color DISPONIBLE_COLOR = Color.GREEN;
    private static final Color OCUPADO_COLOR = Color.RED;
    private int asientoSeleccionado = -1;
    
    
    private List<Asiento> asientos = new ArrayList<>();
 
    private double gananciaTotal = 0.0;

    private String[] terminales = {"Navojoa", "Obregón", "Empalme", "Guaymas", "Hermosillo", "Santa Ana", "Magdalena", "Imuris", "Nogales"};
    private int terminalActual = 0; 

    public VentaBoletos() {
    initComponents();
    for (String terminal : terminales) {
    jComboBox1.addItem(terminal);
}
    for (int i = 0; i < 20; i++) { 
        asientos.add(new Asiento());
    }
    agregarListenerAAsientos();

    actualizarTerminal();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTerminalActual = new javax.swing.JLabel();
        btnActualizarTerminal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnA2 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        btnMostrarReporte = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnB1 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnB7 = new javax.swing.JButton();
        btnB9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnB2 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB6 = new javax.swing.JButton();
        btnB8 = new javax.swing.JButton();
        btnB10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setText("Venta de Boletos");

        lblTerminalActual.setFont(new java.awt.Font("SF Pro Display", 3, 18)); // NOI18N
        lblTerminalActual.setText("Terminal actual: Navojoa");
        jPanel1.add(lblTerminalActual);

        btnActualizarTerminal.setText("Actualizar Terminal");
        btnActualizarTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTerminalActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarTerminal);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 0, 1));

        btnA1.setText("A1");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnA1);

        btnA3.setText("A3");
        jPanel2.add(btnA3);

        btnA5.setText("A5");
        btnA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnA5);

        btnA7.setText("A7");
        jPanel2.add(btnA7);

        btnA9.setText("A9");
        jPanel2.add(btnA9);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(5, 2));

        btnA2.setText("A2");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnA2);

        btnA4.setText("A4");
        jPanel3.add(btnA4);

        btnA6.setText("A6");
        jPanel3.add(btnA6);

        btnA8.setText("A8");
        jPanel3.add(btnA8);

        btnA10.setText("A10");
        jPanel3.add(btnA10);

        jPanel5.setLayout(new java.awt.GridLayout(3, 3));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel2.setText("Ingrese su nombre:");

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel3.setText("Ingrese su destino:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel8);

        jLabel5.setText("Precio:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel10);

        btnComprar.setText("Comprar boleto(s)");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnMostrarReporte.setText("Mostrar Reporte");
        btnMostrarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnMostrarReporte)
                .addGap(53, 53, 53))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnMostrarReporte))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridLayout(5, 2));

        btnB1.setText("B1");
        jPanel4.add(btnB1);

        btnB3.setText("B3");
        jPanel4.add(btnB3);

        btnB5.setText("B5");
        jPanel4.add(btnB5);

        btnB7.setText("B7");
        jPanel4.add(btnB7);

        btnB9.setText("B9");
        jPanel4.add(btnB9);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.GridLayout(5, 2));

        btnB2.setText("B2");
        jPanel7.add(btnB2);

        btnB4.setText("B4");
        jPanel7.add(btnB4);

        btnB6.setText("B6");
        jPanel7.add(btnB6);

        btnB8.setText("B8");
        jPanel7.add(btnB8);

        btnB10.setText("B10");
        jPanel7.add(btnB10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed

        seleccionarAsiento(4);
        
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed

        seleccionarAsiento(0);

        
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed

        seleccionarAsiento(1);
        
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnMostrarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarReporteActionPerformed
        StringBuilder reporte = new StringBuilder("Reporte de Viaje:\n\n");

    for (int i = 0; i < asientos.size(); i++) {
        Asiento asiento = asientos.get(i);
        if (asiento.isOcupado()) {
            reporte.append("Nombre: ").append(asiento.getNombrePasajero()).append("\n")
                   .append("Origen: ").append(asiento.getOrigen()).append("\n")
                   .append("Destino: ").append(asiento.getDestino()).append("\n")
                   .append("Precio: ").append(asiento.getPrecio()).append("\n")
                   .append("Asiento: ").append(i + 1).append("\n\n");
        }
    }

    reporte.append("Ganancia Total: ").append(gananciaTotal);
    JOptionPane.showMessageDialog(this, reporte.toString(), "Reporte Final", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_btnMostrarReporteActionPerformed

    private void btnActualizarTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTerminalActionPerformed

        if (terminalActual >= terminales.length - 1) {
        JOptionPane.showMessageDialog(this, "Ya estás en la última terminal.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    
    int pasajerosBajados = 0;
    for (Asiento asiento : asientos) {
        if (asiento.isOcupado() && asiento.getDestino().equals(terminales[terminalActual])) {
            pasajerosBajados++;
            asiento.setOcupado(false);
            asiento.setNombrePasajero(null);
            asiento.setOrigen(null);
            asiento.setDestino(null);
            asiento.setPrecio(0.0);
        }
    }

    
    JOptionPane.showMessageDialog(this,
        "Se bajaron " + pasajerosBajados + " pasajeros en la terminal: " + terminales[terminalActual],
        "Terminal Actualizada",
        JOptionPane.INFORMATION_MESSAGE
    );

    
    terminalActual++;
    actualizarTerminal();
        
    }//GEN-LAST:event_btnActualizarTerminalActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        if (asientoSeleccionado == -1) {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String nombre = txtNombre.getText().trim();
    String destino = (String) jComboBox1.getSelectedItem();
    double precio;

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa el nombre del pasajero.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        precio = Double.parseDouble(txtPrecio.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    Asiento asiento = asientos.get(asientoSeleccionado);
    asiento.setOcupado(true);
    asiento.setNombrePasajero(nombre);
    asiento.setDestino(destino);
    asiento.setOrigen(terminales[terminalActual]);
    asiento.setPrecio(precio);

    gananciaTotal += precio;

    
    JButton btn = obtenerBotonPorIndice(asientoSeleccionado);
    btn.setBackground(Color.RED);
    btn.setEnabled(false);

    JOptionPane.showMessageDialog(this, "Boleto comprado para: " + nombre + " en el asiento " + (asientoSeleccionado + 1), "Compra Exitosa", JOptionPane.INFORMATION_MESSAGE);

    
    asientoSeleccionado = -1;
    txtNombre.setText("");
    txtPrecio.setText("");

        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void agregarListenerAAsientos() {
        
        for (int i = 0; i < NUM_ASIENTOS; i++) {
            JButton boton = obtenerBotonPorIndice(i);
            final int asientoIndice = i;
            boton.addActionListener(evt -> seleccionarAsiento(asientoIndice));
        }
    }

    private void actualizarTerminal() {
    lblTerminalActual.setText("Terminal actual: " + terminales[terminalActual]);
    mostrarAsientosDisponibles();

    
    btnActualizarTerminal.setEnabled(terminalActual < terminales.length - 1);
}


    private void mostrarAsientosDisponibles() {
    for (int i = 0; i < asientos.size(); i++) {
        JButton btn = obtenerBotonPorIndice(i);
        Asiento asiento = asientos.get(i);

        if (asiento.isOcupado()) {
            btn.setBackground(Color.RED);
            btn.setEnabled(false);
        } else if (i == asientoSeleccionado) {
            btn.setBackground(Color.YELLOW); 
            btn.setEnabled(true);
        } else {
            btn.setBackground(Color.GREEN); 
            btn.setEnabled(true);
        }
    }
}


    private JButton obtenerBotonPorIndice(int indice) {
        
        switch (indice) {
            case 0: return btnA1; case 1: return btnA2; case 2: return btnA3; case 3: return btnA4;
            case 4: return btnA5; case 5: return btnA6; case 6: return btnA7; case 7: return btnA8;
            case 8: return btnA9; case 9: return btnA10; case 10: return btnB1; case 11: return btnB2;
            case 12: return btnB3; case 13: return btnB4; case 14: return btnB5; case 15: return btnB6;
            case 16: return btnB7; case 17: return btnB8; case 18: return btnB9; case 19: return btnB10;
            default: return null;
        }
    }

    private void seleccionarAsiento(int indice) {
    if (asientoSeleccionado != -1) {
        JButton btnAnterior = obtenerBotonPorIndice(asientoSeleccionado);
        Asiento asientoAnterior = asientos.get(asientoSeleccionado);
        btnAnterior.setBackground(asientoAnterior.isOcupado() ? Color.RED : Color.GREEN);
    }

    asientoSeleccionado = indice;
    JButton btnActual = obtenerBotonPorIndice(asientoSeleccionado);
    btnActual.setBackground(Color.YELLOW); 
}


  




    
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
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaBoletos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnActualizarTerminal;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB10;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnB5;
    private javax.swing.JButton btnB6;
    private javax.swing.JButton btnB7;
    private javax.swing.JButton btnB8;
    private javax.swing.JButton btnB9;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMostrarReporte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblTerminalActual;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
