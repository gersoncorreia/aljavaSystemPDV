/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aljava.view;

import com.aljava.classes.CategoryDAO;
import com.aljava.classes.DAO;
import com.aljava.model.entities.Categories;
import com.aljava.model.entities.Products;
import com.aljava.model.entities.Utilitarios;
import java.util.List;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SEFIN
 */
public class FormNovoProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormNovoProduto
     */
    public FormNovoProduto() {
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

        panelProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelFormProduto = new javax.swing.JPanel();
        buttonSalvarProduto = new javax.swing.JButton();
        txtCodigoBarra = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        buttonAdicionarCategoria = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                carregarDados(evt);
            }
        });

        panelProduto.setBackground(new java.awt.Color(50, 156, 155));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUTOS");

        buttonSalvarProduto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonSalvarProduto.setForeground(new java.awt.Color(50, 138, 138));
        buttonSalvarProduto.setText("SALVAR");
        buttonSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarProdutoActionPerformed(evt);
            }
        });

        txtCodigoBarra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigoBarra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código de Barras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        txtCodigoBarra.setPreferredSize(new java.awt.Dimension(11, 50));
        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });

        txtNomeProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeProduto.setToolTipText("Nome do Produto");
        txtNomeProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        txtNomeProduto.setPreferredSize(new java.awt.Dimension(11, 50));

        txtQtdEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        txtQtdEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQtdEstoque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtPreco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txtPreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        buttonAdicionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        buttonAdicionarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarCategoria(evt);
            }
        });
        buttonAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarCategoriaActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setBackground(new java.awt.Color(18, 30, 49));
        jComboBoxCategoria.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboBoxCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categórias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormProdutoLayout = new javax.swing.GroupLayout(panelFormProduto);
        panelFormProduto.setLayout(panelFormProdutoLayout);
        panelFormProdutoLayout.setHorizontalGroup(
            panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFormProdutoLayout.createSequentialGroup()
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAdicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(244, 244, 244))
            .addGroup(panelFormProdutoLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(buttonSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormProdutoLayout.setVerticalGroup(
            panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormProdutoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCategoria)
                    .addComponent(txtQtdEstoque)
                    .addComponent(buttonAdicionarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPreco))
                .addGap(33, 33, 33)
                .addComponent(buttonSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addComponent(panelFormProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panelFormProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarProdutoActionPerformed
        // TODO add your handling code here:
        Categories categoria = new Categories();
        categoria = (Categories) jComboBoxCategoria.getSelectedItem();

        String precoFormatado = txtPreco.getText().replace(".", "").replace(",", ".");
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        double precoDouble = 0;
        try {
            precoDouble = numberFormat.parse(precoFormatado).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(FormNovoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        Products produto = new Products(txtNomeProduto.getText(), txtCodigoBarra.getText(), precoDouble, Integer.parseInt(txtQtdEstoque.getText()), categoria);
        DAO<Object> dao = new DAO<>();
        dao.abrirT().incluir(produto).fecharT().fechar();
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!!");
        new Utilitarios().limpaTela(panelFormProduto);

    }//GEN-LAST:event_buttonSalvarProdutoActionPerformed

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraActionPerformed

    private void buttonAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarCategoriaActionPerformed

    private void adicionarCategoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarCategoria
        // TODO add your handling code here:
        FormCategoria tela = new FormCategoria();
        tela.setVisible(true);
    }//GEN-LAST:event_adicionarCategoria

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void carregarDados(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_carregarDados
        // TODO add your handling code here:
        CategoryDAO dao = new CategoryDAO();
        List<Categories> catetorias = dao.obterTodos(99, 0);
        jComboBoxCategoria.removeAllItems();
        for (Categories categoria : catetorias) {
            Categories obj = new Categories();
            obj.setId(categoria.getId());
            obj.setNome(categoria.getNome());
            jComboBoxCategoria.addItem(obj);
        }
    }//GEN-LAST:event_carregarDados

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
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNovoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarCategoria;
    private javax.swing.JButton buttonSalvarProduto;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFormProduto;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables
}
