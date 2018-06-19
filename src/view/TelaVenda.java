/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import controller.ProdutoController;
import controller.VendaController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Cliente;
import model.ItemVenda;
import model.Produto;
import model.Venda;

/**
 *
 * @author L
 */
public class TelaVenda extends javax.swing.JFrame {

    Venda venda = new Venda();
    Cliente c = null;

    public TelaVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Nome_Cliente = new javax.swing.JTextField();
        jTextField_COD_Produto_ = new javax.swing.JTextField();
        jTextField_Subtotal = new javax.swing.JTextField();
        jButton_ADD_Venda_ = new javax.swing.JButton();
        jButton_Cancelar_Venda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Valor_Total = new javax.swing.JTextField();
        jButton_ADD_Venda_1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Desconto = new javax.swing.JTextField();
        jButton_Finalizar_Venda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_CPF_Cliente = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem_Fazer_Logoff_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Cod. Item");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 190, 110, 30);

        jLabelNomeCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNomeCliente.setText("Nome do cliente");
        getContentPane().add(jLabelNomeCliente);
        jLabelNomeCliente.setBounds(70, 110, 120, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Subtotal");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 310, 90, 30);

        jTextField_Nome_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Nome_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nome_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nome_Cliente);
        jTextField_Nome_Cliente.setBounds(210, 110, 162, 30);
        jTextField_Nome_Cliente.setEnabled(false);

        jTextField_COD_Produto_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField_COD_Produto_);
        jTextField_COD_Produto_.setBounds(400, 190, 140, 28);

        jTextField_Subtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Subtotal.setText("0.00");
        jTextField_Subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Subtotal);
        jTextField_Subtotal.setBounds(760, 310, 120, 28);

        jButton_ADD_Venda_.setText("- Item");
        jButton_ADD_Venda_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_Venda_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ADD_Venda_);
        jButton_ADD_Venda_.setBounds(520, 600, 110, 30);

        jButton_Cancelar_Venda.setText("Cancelar");
        jButton_Cancelar_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancelar_VendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cancelar_Venda);
        jButton_Cancelar_Venda.setBounds(660, 550, 210, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Item", "Item", "Preço produto", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 240, 560, 350);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Venda");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 0, 90, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Valor Total");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(650, 410, 90, 30);

        jTextField_Valor_Total.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Valor_Total.setText("0.00");
        jTextField_Valor_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Valor_TotalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Valor_Total);
        jTextField_Valor_Total.setBounds(760, 410, 120, 28);

        jButton_ADD_Venda_1.setText("+ Item");
        jButton_ADD_Venda_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_Venda_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ADD_Venda_1);
        jButton_ADD_Venda_1.setBounds(560, 190, 70, 30);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 60, 100, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Desconto");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(650, 360, 90, 30);

        jTextField_Desconto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Desconto.setText("0.00");
        jTextField_Desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DescontoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Desconto);
        jTextField_Desconto.setBounds(760, 360, 120, 28);

        jButton_Finalizar_Venda.setText("Finalizar Venda");
        jButton_Finalizar_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Finalizar_VendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Finalizar_Venda);
        jButton_Finalizar_Venda.setBounds(660, 500, 210, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("CPF do cliente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 60, 120, 30);

        jTextField_CPF_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField_CPF_Cliente);
        jTextField_CPF_Cliente.setBounds(210, 60, 162, 30);

        jMenu2.setText("Sair");

        jMenuItem2.setText("Voltar para o menu principal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem_Fazer_Logoff_.setText("Fazer Logoff");
        jMenuItem_Fazer_Logoff_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fazer_Logoff_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Fazer_Logoff_);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaMenu tela = new TelaMenu();
        tela.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem_Fazer_Logoff_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fazer_Logoff_ActionPerformed
        TelaLog tela = new TelaLog();
        tela.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Fazer_Logoff_ActionPerformed

    private void jButton_Cancelar_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancelar_VendaActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja cancelar esta venda?");
        if (op == JOptionPane.YES_OPTION) {
            limpa();
        }
    }//GEN-LAST:event_jButton_Cancelar_VendaActionPerformed

    private void limpa() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        venda = new Venda();
        jTextField_COD_Produto_.setText("");
        jTextField_CPF_Cliente.setText("");
        jTextField_Nome_Cliente.setText("");
        atualizaValores();

    }
    private void jButton_ADD_Venda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_Venda_ActionPerformed
        removeItem();
    }//GEN-LAST:event_jButton_ADD_Venda_ActionPerformed

    private void jButton_ADD_Venda_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_Venda_1ActionPerformed
        addItem();
    }//GEN-LAST:event_jButton_ADD_Venda_1ActionPerformed

    private void jButton_Finalizar_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Finalizar_VendaActionPerformed
        VendaController vc = new VendaController();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja finalizar a venda?") == JOptionPane.YES_OPTION) {
                venda.setData(dtf.format(LocalDate.now()));
                venda.setHora(sdf.format(new Date()));

                if (vc.finalizaVenda(venda) != null) {
                    JOptionPane.showMessageDialog(rootPane, "Venda finalizada com sucesso. \nCódigo da venda: " + venda.getCod());

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não foi possível finalizar a venda.");

                }
                limpa();
                venda = new Venda();
               
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado. Tente novamente e se o problema persistir, entre em contato com o suporte técnico.");
           
        }
    }//GEN-LAST:event_jButton_Finalizar_VendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClienteController cc = new ClienteController();

        try {
            Cliente auxC = cc.findClientByCpf(jTextField_CPF_Cliente.getText());
            if (auxC != null) {
                c = auxC;
                venda.setCliente(c);
                jTextField_Nome_Cliente.setText(c.getNome());
            }

        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(rootPane, "CPF não encontrado.");
            jTextField_CPF_Cliente.setText(c.getCpf());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_SubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SubtotalActionPerformed

    }//GEN-LAST:event_jTextField_SubtotalActionPerformed

    private void jTextField_DescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DescontoActionPerformed

    private void jTextField_Nome_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nome_ClienteActionPerformed

    }//GEN-LAST:event_jTextField_Nome_ClienteActionPerformed

    private void jTextField_Valor_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Valor_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Valor_TotalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_ADD_Venda_;
    private javax.swing.JButton jButton_ADD_Venda_1;
    private javax.swing.JButton jButton_Cancelar_Venda;
    private javax.swing.JButton jButton_Finalizar_Venda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_Fazer_Logoff_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_COD_Produto_;
    private javax.swing.JTextField jTextField_CPF_Cliente;
    private javax.swing.JTextField jTextField_Desconto;
    private javax.swing.JTextField jTextField_Nome_Cliente;
    private javax.swing.JTextField jTextField_Subtotal;
    private javax.swing.JTextField jTextField_Valor_Total;
    // End of variables declaration//GEN-END:variables

    private void addItem() {
        ProdutoController pc = new ProdutoController();
        if (!jTextField_COD_Produto_.getText().isEmpty()) {
            int codProduto = Integer.parseInt(jTextField_COD_Produto_.getText());
            Produto p = pc.findProdutoByCod(codProduto);
            if (p != null) {
                ItemVenda item = new ItemVenda(p, 1);
                venda.adicionaItem(item);
                atualizaValores();
                preencheJTable(item);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Atenção: O código de produto não está cadastrado.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor, informe o código do produto.");
        }
    }

    private void preencheJTable(ItemVenda item) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object rowData[] = new Object[4];
        rowData[0] = item.getProduto().getCod();
        rowData[1] = item.getProduto().getDescricao();
        rowData[2] = item.getProduto().getPreco();
        rowData[3] = item.getQtd();
        model.addRow(rowData);

    }

    private void removeItem() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        venda.removeItem(row);
        model.removeRow(row);
        atualizaValores();

    }

    private void atualizaValores() {
        jTextField_Subtotal.setText(String.valueOf(venda.getSubtotal()));
        jTextField_Desconto.setText(String.valueOf(venda.getDesconto()));
        jTextField_Valor_Total.setText(String.valueOf(venda.getValorTotal()));
    }
}
