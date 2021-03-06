/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EstoqueController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import model.Estoque;

/**
 *
 * @author jesp
 */
public class TelaEstoqueEntrada extends javax.swing.JDialog {

    EstoqueController controller = new EstoqueController();
    
    public TelaEstoqueEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    TelaEstoqueEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Descricao_Produto_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_COD_Produto_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_qtd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Descricao_Produto_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Descricao_Produto_.setEnabled(false);
        getContentPane().add(jTextField_Descricao_Produto_, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 326, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Descrição");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jTextField_COD_Produto_.setEnabled(false);
        getContentPane().add(jTextField_COD_Produto_, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 52, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Cod Produto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Estoque - Entrada de produto ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Quantidade");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 107, 30));
        getContentPane().add(jTextField_qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 83, 30));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 85, 31));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 87, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int idProduto = Integer.parseInt(jTextField_COD_Produto_.getText());
        int qtdEntrada = Integer.parseInt(jTextField_qtd.getText());
        try {
            Estoque e = controller.findByCodProdutoEstoque(idProduto);
            e.setQtd(e.getQtd() + qtdEntrada);
            controller.updateEstoque(e);
            dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoqueEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEstoqueEntrada dialog = new TelaEstoqueEntrada(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTextField getjTextField_COD_Produto_() {
        return jTextField_COD_Produto_;
    }

    public void setjTextField_COD_Produto_(JTextField jTextField_COD_Produto_) {
        this.jTextField_COD_Produto_ = jTextField_COD_Produto_;
    }

    public JTextField getjTextField_qtd() {
        return jTextField_qtd;
    }

    public void setjTextField_qtd(JTextField jTextField_qtd) {
        this.jTextField_qtd = jTextField_qtd;
    }

    public JTextField getjTextField_Descricao_Produto_() {
        return jTextField_Descricao_Produto_;
    }

    public void setjTextField_Descricao_Produto_(JTextField jTextField_Descricao_Produto_) {
        this.jTextField_Descricao_Produto_ = jTextField_Descricao_Produto_;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_COD_Produto_;
    private javax.swing.JTextField jTextField_Descricao_Produto_;
    private javax.swing.JTextField jTextField_qtd;
    // End of variables declaration//GEN-END:variables
}
