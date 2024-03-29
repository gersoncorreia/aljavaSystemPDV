/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aljava.view;

import com.aljava.model.entities.Sales;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEFIN
 */
public class FormPagamento extends javax.swing.JFrame {

    DefaultTableModel itemsVendas;
    Sales venda;

    /**
     * Creates new form FormPagamento
     */
    public FormPagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalVendaPagamento = new javax.swing.JFormattedTextField();
        buttonFinalizarVenda1 = new javax.swing.JButton();
        buttonPagamentoDinheiro = new javax.swing.JButton();
        buttonPagamentoPix = new javax.swing.JButton();
        buttonPagamentoCartão = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamentos");

        jPanel2.setBackground(new java.awt.Color(50, 156, 155));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL:");

        txtTotalVendaPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtTotalVendaPagamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalVendaPagamento.setText("0");
        txtTotalVendaPagamento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTotalVendaPagamento.setMargin(new java.awt.Insets(2, 10, 2, 2));

        buttonFinalizarVenda1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonFinalizarVenda1.setForeground(new java.awt.Color(50, 138, 138));
        buttonFinalizarVenda1.setText("Finalizar Venda");
        buttonFinalizarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarVenda1ActionPerformed(evt);
            }
        });

        buttonPagamentoDinheiro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonPagamentoDinheiro.setForeground(new java.awt.Color(50, 138, 138));
        buttonPagamentoDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money_9648343.png"))); // NOI18N
        buttonPagamentoDinheiro.setText("DINHEIRO");
        buttonPagamentoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagamentoDinheiroActionPerformed(evt);
            }
        });

        buttonPagamentoPix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonPagamentoPix.setForeground(new java.awt.Color(50, 138, 138));
        buttonPagamentoPix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo pix.png"))); // NOI18N
        buttonPagamentoPix.setText("PIX");
        buttonPagamentoPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagamentoPixActionPerformed(evt);
            }
        });

        buttonPagamentoCartão.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonPagamentoCartão.setForeground(new java.awt.Color(50, 138, 138));
        buttonPagamentoCartão.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credit-card_2922888.png"))); // NOI18N
        buttonPagamentoCartão.setText("CARTÃO");
        buttonPagamentoCartão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagamentoCartãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPagamentoCartão, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPagamentoDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPagamentoPix, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(buttonFinalizarVenda1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalVendaPagamento)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPagamentoPix, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPagamentoCartão, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVendaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(buttonFinalizarVenda1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinalizarVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarVenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFinalizarVenda1ActionPerformed

    private void buttonPagamentoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagamentoDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPagamentoDinheiroActionPerformed

    private void buttonPagamentoPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagamentoPixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPagamentoPixActionPerformed

    private void buttonPagamentoCartãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagamentoCartãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPagamentoCartãoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFinalizarVenda1;
    private javax.swing.JButton buttonPagamentoCartão;
    private javax.swing.JButton buttonPagamentoDinheiro;
    private javax.swing.JButton buttonPagamentoPix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JFormattedTextField txtTotalVendaPagamento;
    // End of variables declaration//GEN-END:variables
}
