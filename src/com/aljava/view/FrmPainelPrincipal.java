/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aljava.view;

/**
 *
 * @author Gerson
 */
public class FrmPainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPainelPrincipal
     */
    public FrmPainelPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFornecedores = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuProdutos = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuVendas = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(889, 60));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuClientes.setBackground(new java.awt.Color(0, 255, 255));
        menuClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        menuClientes.setText("Controle de Clientes");
        menuClientes.setPreferredSize(new java.awt.Dimension(223, 40));
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(menuClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fornecedores.png"))); // NOI18N
        jMenu2.setText("Fornecedores");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        menuFornecedores.setText("Controle de Fornecedores");
        menuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedoresActionPerformed(evt);
            }
        });
        jMenu2.add(menuFornecedores);

        jMenuBar1.add(jMenu2);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        jMenu7.setText("Produtos");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        menuProdutos.setText("Pesquisar Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        jMenu7.add(menuProdutos);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jMenuItem8.setText("Controle de Estoque");
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jMenu4.setText("Vendas");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuVendas.setText("Abrir PDV");
        menuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmVendas(evt);
            }
        });
        jMenu4.add(menuVendas);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setText("Ponto do Dia");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem5.setText("Relatório de Vendas");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracoes.png"))); // NOI18N
        jMenu5.setText("Configurações");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(3, 10, 3, 10));

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jMenuItem6.setText("Controle de Usuários");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jMenu6.setText("Sair");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(3, 10, 3, 10));
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // TODO add your handling code here:
        FormClient tela = new FormClient();
        tela.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void FrmVendas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmVendas
        // TODO add your handling code here:
        FormVendas tela = new FormVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_FrmVendas

    private void menuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuFornecedoresActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        // TODO add your handling code here:
        FormProdutos tela = new FormProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_menuProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuFornecedores;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuVendas;
    // End of variables declaration//GEN-END:variables
}
