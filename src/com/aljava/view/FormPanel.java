/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aljava.view;

import java.awt.Color;

/**
 *
 * @author GERSON
 */
public class FormPanel extends javax.swing.JFrame {

    /**
     * Creates new form FormPanel
     */
    public FormPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fecharJalena = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JLabel();
        panelCliente = new javax.swing.JLabel();
        panelProdutos = new javax.swing.JLabel();
        panelEstoque = new javax.swing.JLabel();
        panelPDV = new javax.swing.JLabel();
        panelRelatorios = new javax.swing.JLabel();
        panelConfiguracoes = new javax.swing.JLabel();
        closeSystem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 40, 0, 0));
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(50, 156, 155));

        fecharJalena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_24px.png"))); // NOI18N
        fecharJalena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharJalenaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(956, Short.MAX_VALUE)
                .addComponent(fecharJalena)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecharJalena)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        jPanel3.setBackground(new java.awt.Color(29, 30, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_male_user_64px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gerson Correia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Online");

        panelPrincipal.setBackground(new java.awt.Color(44, 59, 66));
        panelPrincipal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_speedometer_24px.png"))); // NOI18N
        panelPrincipal.setText("Painel Principal");
        panelPrincipal.setOpaque(true);
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
        });

        panelCliente.setBackground(new java.awt.Color(29, 30, 31));
        panelCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelCliente.setForeground(new java.awt.Color(255, 255, 255));
        panelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_groups_24px_1.png"))); // NOI18N
        panelCliente.setText("Clientes");
        panelCliente.setOpaque(true);
        panelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelClienteMouseClicked(evt);
            }
        });

        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelProdutos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelProdutos.setForeground(new java.awt.Color(255, 255, 255));
        panelProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_big_parcel_24px.png"))); // NOI18N
        panelProdutos.setText("Produtos");
        panelProdutos.setOpaque(true);
        panelProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelProdutosMouseClicked(evt);
            }
        });

        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelEstoque.setForeground(new java.awt.Color(255, 255, 255));
        panelEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_trolley_24px.png"))); // NOI18N
        panelEstoque.setText("Estoque");
        panelEstoque.setOpaque(true);
        panelEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEstoqueMouseClicked(evt);
            }
        });

        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelPDV.setForeground(new java.awt.Color(255, 255, 255));
        panelPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cash_counter_24px.png"))); // NOI18N
        panelPDV.setText("PDV");
        panelPDV.setOpaque(true);
        panelPDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPDVMouseClicked(evt);
            }
        });

        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        panelRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_combo_chart_24px.png"))); // NOI18N
        panelRelatorios.setText("Relatórios");
        panelRelatorios.setOpaque(true);
        panelRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRelatoriosMouseClicked(evt);
            }
        });

        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelConfiguracoes.setForeground(new java.awt.Color(255, 255, 255));
        panelConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_automation_24px.png"))); // NOI18N
        panelConfiguracoes.setText("Configurações");
        panelConfiguracoes.setOpaque(true);
        panelConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelConfiguracoesMouseClicked(evt);
            }
        });

        closeSystem.setBackground(new java.awt.Color(29, 30, 31));
        closeSystem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        closeSystem.setForeground(new java.awt.Color(255, 255, 255));
        closeSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_export_24px.png"))); // NOI18N
        closeSystem.setText("Sair");
        closeSystem.setOpaque(true);
        closeSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeSystemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(71, 71, 71)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 610));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 770, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Botão para sair do sistema, o sistema encerra direto!*/
    private void closeSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeSystemMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeSystemMouseClicked
    
    /*Abre a janela de clientes*/
    private void panelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClienteMouseClicked
        panelCliente.setBackground(new java.awt.Color(44, 59, 66));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
        
        FormClient tela = new FormClient();
        tela.setVisible(true);
    }//GEN-LAST:event_panelClienteMouseClicked

    /*Muda a cor da barra do menu que foi clicando(Principal)*/
    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(44, 59, 66));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
    }//GEN-LAST:event_panelPrincipalMouseClicked

    /*Abre a janela de Produtos*/
    private void panelProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProdutosMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(44, 59, 66));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
    }//GEN-LAST:event_panelProdutosMouseClicked

    /*Abre a janela de Estoque*/
    private void panelEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstoqueMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(44, 59, 66));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
    }//GEN-LAST:event_panelEstoqueMouseClicked

    /*Abre a janela de PDV*/
    private void panelPDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPDVMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(44, 59, 66));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
    }//GEN-LAST:event_panelPDVMouseClicked

    /*Abre a janela de Relatórios*/
    private void panelRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRelatoriosMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(44, 59, 66));
        panelConfiguracoes.setBackground(new java.awt.Color(29, 30, 31));
    }//GEN-LAST:event_panelRelatoriosMouseClicked

    /*Abre a janela de configurações*/
    private void panelConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConfiguracoesMouseClicked
        panelCliente.setBackground(new java.awt.Color(29, 30, 31));//44,59,66 
        panelPrincipal.setBackground(new java.awt.Color(29, 30, 31));//29,30,31
        panelProdutos.setBackground(new java.awt.Color(29, 30, 31));
        panelPDV.setBackground(new java.awt.Color(29, 30, 31));
        panelEstoque.setBackground(new java.awt.Color(29, 30, 31));
        panelRelatorios.setBackground(new java.awt.Color(29, 30, 31));
        panelConfiguracoes.setBackground(new java.awt.Color(44, 59, 66));
    }//GEN-LAST:event_panelConfiguracoesMouseClicked

    /*Ação para fechar a janela principal*/
    private void fecharJalenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharJalenaMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fecharJalenaMouseClicked

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
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeSystem;
    private javax.swing.JLabel fecharJalena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel panelCliente;
    private javax.swing.JLabel panelConfiguracoes;
    private javax.swing.JLabel panelEstoque;
    private javax.swing.JLabel panelPDV;
    private javax.swing.JLabel panelPrincipal;
    private javax.swing.JLabel panelProdutos;
    private javax.swing.JLabel panelRelatorios;
    // End of variables declaration//GEN-END:variables
}
