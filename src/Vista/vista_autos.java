/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Myrian
 */
public class vista_autos extends javax.swing.JFrame {

    /**
     * Creates new form vista_autos
     */
    public vista_autos() {
        initComponents();
        
    }

    public JButton getBtn_foto() {
        return btn_foto;
    }

    public void setBtn_foto(JButton btn_foto) {
        this.btn_foto = btn_foto;
    }

    public JLabel getLabelmodelo() {
        return labelmodelo;
    }

    public void setLabelmodelo(JLabel labelmodelo) {
        this.labelmodelo = labelmodelo;
    }

    public JLabel getTxt_foto() {
        return txt_foto;
    }

    public void setTxt_foto(JLabel txt_foto) {
        this.txt_foto = txt_foto;
    }

    public JButton getBtn_eliminar1() {
        return btn_eliminar1;
    }

    public void setBtn_eliminar1(JButton btn_eliminar1) {
        this.btn_eliminar1 = btn_eliminar1;
    }
    

    public JButton getBtn_guardar() {
        return btn_guardar;
    }

    public void setBtn_guardar(JButton btn_guardar) {
        this.btn_guardar = btn_guardar;
    }

    public JButton getBtn_imprimir() {
        return btn_imprimir;
    }

    public JLabel getTxtnumeros() {
        return txtnumeros;
    }

    public void setTxtnumeros(JLabel txtnumeros) {
        this.txtnumeros = txtnumeros;
    }

    public void setBtn_imprimir(JButton btn_imprimir) {
        this.btn_imprimir = btn_imprimir;
    }

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public void setBtn_modificar(JButton btn_modificar) {
        this.btn_modificar = btn_modificar;
    }

    public JButton getBtn_nuevo() {
        return btn_nuevo;
    }

    public void setBtn_nuevo(JButton btn_nuevo) {
        this.btn_nuevo = btn_nuevo;
    }

    public JComboBox<String> getCombo_color() {
        return combo_color;
    }

    public void setCombo_color(JComboBox<String> combo_color) {
        this.combo_color = combo_color;
    }

    public JComboBox<String> getCombo_marca() {
        return combo_marca;
    }

    public void setCombo_marca(JComboBox<String> combo_marca) {
        this.combo_marca = combo_marca;
    }

    public JTable getTabla_autos() {
        return tabla_autos;
    }

    public void setTabla_autos(JTable tabla_autos) {
        this.tabla_autos = tabla_autos;
    }

    public JTextField getTxt_anio() {
        return txt_anio;
    }

    public void setTxt_anio(JTextField txt_anio) {
        this.txt_anio = txt_anio;
    }

    public JTextField getTxt_chasis() {
        return txt_chasis;
    }

    public void setTxt_chasis(JTextField txt_chasis) {
        this.txt_chasis = txt_chasis;
    }

    public JTextField getTxt_modelo() {
        return txt_modelo;
    }

    public void setTxt_modelo(JTextField txt_modelo) {
        this.txt_modelo = txt_modelo;
    }

    public JTextField getTxt_motor() {
        return txt_motor;
    }

    public void setTxt_motor(JTextField txt_motor) {
        this.txt_motor = txt_motor;
    }

    public JTextField getTxt_placa() {
        return txt_placa;
    }

    public void setTxt_placa(JTextField txt_placa) {
        this.txt_placa = txt_placa;
    }

    public JTextField getTxt_precio() {
        return txt_precio;
    }

    public void setTxt_precio(JTextField txt_precio) {
        this.txt_precio = txt_precio;
    }

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public JComboBox<String> getCombo_estado() {
        return combo_estado;
    }

    public void setCombo_estado(JComboBox<String> combo_estado) {
        this.combo_estado = combo_estado;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_eliminar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        combo_marca = new javax.swing.JComboBox<>();
        txt_anio = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_color = new javax.swing.JComboBox<>();
        txt_motor = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_chasis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox<>();
        txt_foto = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        labelmodelo = new javax.swing.JLabel();
        txtnumeros = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_autos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 28, 106, 43));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 28, 106, 43));

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 28, 106, 43));

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 100, 43));

        btn_eliminar.setText("Cambiar Estado");
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, 43));

        btn_eliminar1.setText("Eliminar");
        jPanel1.add(btn_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MARCA:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel2.setText("PLACA:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 16, -1, -1));

        jLabel3.setText("MODELO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel4.setText("AÑO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 20));
        jPanel2.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 7, 128, -1));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hyunday", "Mazda", "Toyota", "Chevrolet" }));
        combo_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_marcaActionPerformed(evt);
            }
        });
        jPanel2.add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 128, -1));
        jPanel2.add(txt_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, -1));

        txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modeloActionPerformed(evt);
            }
        });
        jPanel2.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 128, -1));

        jLabel5.setText("COLOR:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 11, -1, -1));

        jLabel6.setText("CHASIS:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel7.setText("MOTOR:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel8.setText("PRECIO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 50, 30));

        combo_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Azul", "Rojo", "Negro", "Blanco" }));
        jPanel2.add(combo_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 6, -1, -1));

        txt_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_motorActionPerformed(evt);
            }
        });
        jPanel2.add(txt_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 152, -1));
        jPanel2.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 156, 150, -1));
        jPanel2.add(txt_chasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 152, -1));

        jLabel9.setText("ESTADO:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 11, -1, -1));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel2.add(combo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 6, -1, -1));

        txt_foto.setBackground(new java.awt.Color(153, 255, 0));
        txt_foto.setForeground(new java.awt.Color(102, 255, 102));
        jPanel2.add(txt_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 220, 160));

        btn_foto.setText("Agregar Foto");
        jPanel2.add(btn_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 130, 20));

        labelmodelo.setBackground(new java.awt.Color(255, 51, 51));
        labelmodelo.setForeground(new java.awt.Color(255, 102, 102));
        labelmodelo.setText("SOLO LETRAS");
        jPanel2.add(labelmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        txtnumeros.setForeground(new java.awt.Color(255, 51, 51));
        txtnumeros.setText("solo numero");
        jPanel2.add(txtnumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 820, 240));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        tabla_autos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Año", "Color", "Motor", "Chasis", "Precio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla_autos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 820, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void txt_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_motorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motorActionPerformed

    private void combo_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(vista_autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_autos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminar1;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> combo_color;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelmodelo;
    private javax.swing.JTable tabla_autos;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_chasis;
    private javax.swing.JLabel txt_foto;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_motor;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JLabel txtnumeros;
    // End of variables declaration//GEN-END:variables
}