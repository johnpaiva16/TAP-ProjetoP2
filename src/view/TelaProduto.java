/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author L
 */
public class TelaProduto extends javax.swing.JFrame {

    protected ProdutoController controller = new ProdutoController();

    public TelaProduto() {
        initComponents();
        preencheJTable();
        // TelaProdutoCadastro tpc = new TelaProdutoCadastro(this,true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_COD_Produto_ = new javax.swing.JTextField();
        jButton_Pesquisa_Produto_ = new javax.swing.JButton();
        jButton_Novo_Produto_ = new javax.swing.JButton();
        jButton_Editar_Produto_ = new javax.swing.JButton();
        jButton_Excluir_Produto_ = new javax.swing.JButton();
        jButton_Listar_Produto_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_produto = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_VoltarMenu_ = new javax.swing.JMenuItem();
        jMenuItem_Fazer_Logoff_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField_COD_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_COD_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_COD_Produto_);
        jTextField_COD_Produto_.setBounds(30, 110, 50, 30);

        jButton_Pesquisa_Produto_.setText("Pesquisar");
        jButton_Pesquisa_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesquisa_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pesquisa_Produto_);
        jButton_Pesquisa_Produto_.setBounds(100, 110, 100, 30);

        jButton_Novo_Produto_.setText("Novo");
        jButton_Novo_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Novo_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Novo_Produto_);
        jButton_Novo_Produto_.setBounds(710, 680, 80, 30);
        if(!TelaLog.getUsuario().isAdmin()){
            jButton_Novo_Produto_.setVisible(false);
        }

        jButton_Editar_Produto_.setText("Editar");
        jButton_Editar_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Editar_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Editar_Produto_);
        jButton_Editar_Produto_.setBounds(810, 680, 80, 30);
        if(!TelaLog.getUsuario().isAdmin()){
            jButton_Editar_Produto_.setVisible(false);
        }

        jButton_Excluir_Produto_.setText("Excluir");
        jButton_Excluir_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Excluir_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Excluir_Produto_);
        jButton_Excluir_Produto_.setBounds(900, 680, 80, 30);
        if(!TelaLog.getUsuario().isAdmin()){
            jButton_Excluir_Produto_.setVisible(false);
        }

        jButton_Listar_Produto_.setText("Listar");
        jButton_Listar_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Listar_Produto_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Listar_Produto_);
        jButton_Listar_Produto_.setBounds(900, 113, 80, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Produto");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 20, 90, 40);

        jTable_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço"
            }
        ));
        jScrollPane2.setViewportView(jTable_produto);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 170, 950, 450);

        jMenu2.setText("Opções");

        jMenuItem_VoltarMenu_.setText("Voltar para o menu principal");
        jMenuItem_VoltarMenu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VoltarMenu_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_VoltarMenu_);

        jMenuItem_Fazer_Logoff_.setText("Fazer Logoff");
        jMenuItem_Fazer_Logoff_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fazer_Logoff_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Fazer_Logoff_);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1040, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_Fazer_Logoff_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fazer_Logoff_ActionPerformed
        TelaLog tela = new TelaLog();
        tela.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Fazer_Logoff_ActionPerformed

    private void jMenuItem_VoltarMenu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VoltarMenu_ActionPerformed
        TelaMenu tela = new TelaMenu();
        tela.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_VoltarMenu_ActionPerformed

    private void jButton_Novo_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Novo_Produto_ActionPerformed
        TelaProdutoCadastro dialog = new TelaProdutoCadastro(new JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.getjTextField_COD_Produto_().setEnabled(false);
        dialog.setVisible(true);

    }//GEN-LAST:event_jButton_Novo_Produto_ActionPerformed

    private void jButton_Listar_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Listar_Produto_ActionPerformed
        preencheJTable();

    }//GEN-LAST:event_jButton_Listar_Produto_ActionPerformed

    protected void preencheJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable_produto.getModel();
        model.setNumRows(0);
        List<Produto> listaProdutos = controller.findAllProdutos();

        for (Produto p : listaProdutos) {
            Object rowData[] = new Object[3];
            rowData[0] = p.getCod();
            rowData[1] = p.getDescricao();
            rowData[2] = p.getPreco();
            model.addRow(rowData);
        }
    }

    private void jButton_Editar_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Editar_Produto_ActionPerformed
        int row = jTable_produto.getSelectedRow();
        TelaProdutoCadastro dialog = new TelaProdutoCadastro(new JFrame(), true);

        dialog.getjTextField_COD_Produto_().setText((String.valueOf(jTable_produto.getValueAt(row, 0))));
        dialog.getjTextField_Descricao_Produto_().setText((String.valueOf(jTable_produto.getValueAt(row, 1).toString())));
        dialog.getjTextField_Preco_Produto().setText((String.valueOf(jTable_produto.getValueAt(row, 2))));
        dialog.setLocationRelativeTo(null);
        dialog.getjTextField_COD_Produto_().setEnabled(false);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton_Editar_Produto_ActionPerformed

    private void jButton_Excluir_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Excluir_Produto_ActionPerformed
        int row = jTable_produto.getSelectedRow();
        int op = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir este produto?");
        if (op == JOptionPane.YES_OPTION) {
            controller.deleteProduto((int) jTable_produto.getValueAt(row, 0));
            preencheJTable();
        }
    }//GEN-LAST:event_jButton_Excluir_Produto_ActionPerformed

    private void jButton_Pesquisa_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisa_Produto_ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable_produto.getModel();
        model.setNumRows(0);
        Produto p = controller.findProdutoByCod(Integer.parseInt(jTextField_COD_Produto_.getText()));
        if (p != null) {
            Object rowData[] = new Object[3];
            rowData[0] = p.getCod();
            rowData[1] = p.getDescricao();
            rowData[2] = p.getPreco();
            model.addRow(rowData);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Código de produto não encontrado.");
        }
    }//GEN-LAST:event_jButton_Pesquisa_Produto_ActionPerformed

    private void jTextField_COD_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_COD_Produto_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_COD_Produto_ActionPerformed
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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Editar_Produto_;
    private javax.swing.JButton jButton_Excluir_Produto_;
    private javax.swing.JButton jButton_Listar_Produto_;
    private javax.swing.JButton jButton_Novo_Produto_;
    private javax.swing.JButton jButton_Pesquisa_Produto_;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Fazer_Logoff_;
    private javax.swing.JMenuItem jMenuItem_VoltarMenu_;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_produto;
    private javax.swing.JTextField jTextField_COD_Produto_;
    // End of variables declaration//GEN-END:variables
}
