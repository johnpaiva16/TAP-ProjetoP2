/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Cliente_ = new javax.swing.JMenuItem();
        jMenuItem_Produto_ = new javax.swing.JMenuItem();
        jMenuItem_Fornecedor_ = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_Exibir_Estoque_ = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_NovaVenda = new javax.swing.JMenuItem();
        jMenuItem_ExibirVenda = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_Fazer_Logoff_ = new javax.swing.JMenuItem();
        jMenuItem_Sair_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/topo-anais-farmacia-2016.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-230, -240, 1670, 1290);

        jMenu1.setText("Cadastro");

        jMenuItem_Cliente_.setText("Cliente");
        jMenuItem_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Cliente_ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Cliente_);

        jMenuItem_Produto_.setText("Produto");
        jMenuItem_Produto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Produto_ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Produto_);

        jMenuItem_Fornecedor_.setText("Fornecedor");
        jMenuItem_Fornecedor_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fornecedor_ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Fornecedor_);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Estoque");

        jMenuItem_Exibir_Estoque_.setText("Gerenciar");
        jMenuItem_Exibir_Estoque_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Exibir_Estoque_ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Exibir_Estoque_);
        jMenu3.add(jSeparator1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Vendas");

        jMenuItem_NovaVenda.setText("Nova");
        jMenuItem_NovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NovaVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_NovaVenda);

        jMenuItem_ExibirVenda.setText("Exibir");
        jMenuItem_ExibirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExibirVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_ExibirVenda);

        jMenuBar1.add(jMenu2);
        if(!TelaLog.getUsuario().isAdmin()){
            jMenuItem_NovaVenda.setVisible(false);
        }

        jMenu5.setText("Sair");

        jMenuItem_Fazer_Logoff_.setText("Fazer Logoff");
        jMenuItem_Fazer_Logoff_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fazer_Logoff_ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_Fazer_Logoff_);

        jMenuItem_Sair_.setText("Sair");
        jMenuItem_Sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Sair_ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_Sair_);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1437, 920));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_Fazer_Logoff_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fazer_Logoff_ActionPerformed
        TelaLog tela = new TelaLog();
        tela.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Fazer_Logoff_ActionPerformed

    private void jMenuItem_Sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Sair_ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Sair_ActionPerformed

    private void jMenuItem_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Cliente_ActionPerformed
        TelaCliente tela = null;
        try {
            tela = new TelaCliente();
            tela.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Cliente_ActionPerformed

    private void jMenuItem_Produto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Produto_ActionPerformed
        TelaProduto tela = null;
        try {
            tela = new TelaProduto();
            tela.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Produto_ActionPerformed

    private void jMenuItem_Fornecedor_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fornecedor_ActionPerformed
        TelaFornecedor tela = new TelaFornecedor();
        tela.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Fornecedor_ActionPerformed

    private void jMenuItem_ExibirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExibirVendaActionPerformed
        TelaVendaExibir tela = new TelaVendaExibir();
        tela.setVisible(true);
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ExibirVendaActionPerformed

    private void jMenuItem_NovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NovaVendaActionPerformed
        TelaVendaNova tela = new TelaVendaNova();
        tela.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_NovaVendaActionPerformed

    private void jMenuItem_Exibir_Estoque_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Exibir_Estoque_ActionPerformed
        TelaEstoque tela;
        try {
            tela = new TelaEstoque();
            tela.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Exibir_Estoque_ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Cliente_;
    private javax.swing.JMenuItem jMenuItem_ExibirVenda;
    private javax.swing.JMenuItem jMenuItem_Exibir_Estoque_;
    private javax.swing.JMenuItem jMenuItem_Fazer_Logoff_;
    private javax.swing.JMenuItem jMenuItem_Fornecedor_;
    private javax.swing.JMenuItem jMenuItem_NovaVenda;
    private javax.swing.JMenuItem jMenuItem_Produto_;
    private javax.swing.JMenuItem jMenuItem_Sair_;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
