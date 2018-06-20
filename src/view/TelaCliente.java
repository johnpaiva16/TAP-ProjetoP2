/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Endereco;

/**
 *
 * @author L
 */
public class TelaCliente extends javax.swing.JFrame {

    protected ClienteController controller = new ClienteController();

    public TelaCliente() {
        initComponents();
        preencheJTable(controller.findAllClients());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_COD_Cliente_ = new javax.swing.JTextField();
        jButton_Pesquisa_Cliente_ = new javax.swing.JButton();
        jButton_Novo_Cliente_ = new javax.swing.JButton();
        jButton_Editar_Cliente_ = new javax.swing.JButton();
        jButton_Excluir_Cliente_ = new javax.swing.JButton();
        jButton_Listar_Cliente_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente_ = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_VoltarMenu_ = new javax.swing.JMenuItem();
        jMenuItem_Fazer_Logoff_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CPF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 80, 30);

        jTextField_COD_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_COD_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_COD_Cliente_);
        jTextField_COD_Cliente_.setBounds(70, 110, 140, 30);

        jButton_Pesquisa_Cliente_.setText("Pesquisar");
        jButton_Pesquisa_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesquisa_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pesquisa_Cliente_);
        jButton_Pesquisa_Cliente_.setBounds(230, 110, 100, 30);

        jButton_Novo_Cliente_.setText("Novo");
        jButton_Novo_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Novo_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Novo_Cliente_);
        jButton_Novo_Cliente_.setBounds(710, 670, 90, 30);

        jButton_Editar_Cliente_.setText("Editar");
        jButton_Editar_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Editar_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Editar_Cliente_);
        jButton_Editar_Cliente_.setBounds(820, 670, 90, 30);

        jButton_Excluir_Cliente_.setText("Excluir");
        jButton_Excluir_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Excluir_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Excluir_Cliente_);
        jButton_Excluir_Cliente_.setBounds(930, 670, 90, 30);

        jButton_Listar_Cliente_.setText("Listar");
        jButton_Listar_Cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Listar_Cliente_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Listar_Cliente_);
        jButton_Listar_Cliente_.setBounds(20, 240, 90, 30);

        jTable_Cliente_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Sexo", "Data de Nascimento", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(jTable_Cliente_);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 1000, 350);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Cliente");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(440, 0, 90, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clientes.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 20, 350, 250);

        jMenu2.setText("Sair");

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

        setSize(new java.awt.Dimension(1154, 814));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_COD_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_COD_Cliente_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_COD_Cliente_ActionPerformed

    private void jMenuItem_VoltarMenu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VoltarMenu_ActionPerformed
        TelaMenu tela = new TelaMenu();
        tela.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_VoltarMenu_ActionPerformed

    private void jMenuItem_Fazer_Logoff_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fazer_Logoff_ActionPerformed
        TelaLog tela = new TelaLog();
        tela.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Fazer_Logoff_ActionPerformed

    private void jButton_Novo_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Novo_Cliente_ActionPerformed
        TelaClienteCadastro dialog = new TelaClienteCadastro(new JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton_Novo_Cliente_ActionPerformed

    private void jButton_Editar_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Editar_Cliente_ActionPerformed
        int row = jTable_Cliente_.getSelectedRow();
        TelaClienteCadastro tcc = new TelaClienteCadastro(new JFrame(), true);

        try {
            Cliente c = controller.findClientByCpf((String) jTable_Cliente_.getValueAt(row, 0));
            tcc.getjTextField_CPF_Cliente_().setText(c.getCpf());
            tcc.getjTextField_CPF_Cliente_().setEnabled(false);
            
            tcc.getjTextField_Nome_Cliente_().setText(c.getNome());
            if (c.getSexo().equals("M")) {
                tcc.getjRadioButton_M1().setSelected(true);
            } else if (c.getSexo().equals("F")){
                tcc.getjRadioButton_F().setSelected(true);
            }
            tcc.getjTextField_DataNasc_Cliente_().setText(c.getDataNascimento());
            tcc.getjTextField_Telefone_Cliente_1().setText(c.getTelefone());
            tcc.getjTextField_Logradouro().setText(c.getEndereco().getLogradouro());
            tcc.getjTextField_Bairro().setText(c.getEndereco().getBairro());
            tcc.getjTextField_Cidade().setText(c.getEndereco().getCidade());
            tcc.getjTextField_UF().setText(c.getEndereco().getEstado());
            tcc.getjTextField_Cep().setText(c.getEndereco().getCep());
            tcc.setVisible(true);
            
            preencheJTable(controller.findAllClients());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no banco de dados.\n" + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado.\n" + ex.getMessage());
        }

    }//GEN-LAST:event_jButton_Editar_Cliente_ActionPerformed

    private void jButton_Listar_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Listar_Cliente_ActionPerformed
        preencheJTable(controller.findAllClients());
    }//GEN-LAST:event_jButton_Listar_Cliente_ActionPerformed

    private void jButton_Excluir_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Excluir_Cliente_ActionPerformed
        int row = jTable_Cliente_.getSelectedRow();
        if (JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir este cliente?") == JOptionPane.YES_OPTION) {
            Cliente c = null;
            try {
                c = controller.findClientByCpf((String) jTable_Cliente_.getValueAt(row, 0));
                controller.deleteClient(c.getCod());
                preencheJTable(controller.findAllClients());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro no banco de dados.\n" + ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro inesperado.\n" + ex.getMessage());
            }

        }


    }//GEN-LAST:event_jButton_Excluir_Cliente_ActionPerformed

    private void jButton_Pesquisa_Cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisa_Cliente_ActionPerformed
        List<Cliente> lista = new ArrayList<>();
        try {
            lista.add(controller.findClientByCpf((String) jTextField_COD_Cliente_.getText()));
            preencheJTable(lista);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no banco de dados.\n" + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado.\n" + ex.getMessage());
        }

    }//GEN-LAST:event_jButton_Pesquisa_Cliente_ActionPerformed

    protected void preencheJTable(List<Cliente> lista) {
        DefaultTableModel model = (DefaultTableModel) jTable_Cliente_.getModel();
        model.setNumRows(0);

        for (Cliente c : lista) {
            Object rowData[] = new Object[6];
            rowData[0] = c.getCpf();
            rowData[1] = c.getNome();
            rowData[2] = c.getSexo();
            rowData[3] = c.getDataNascimento();
            rowData[4] = c.getTelefone();
            rowData[5] = concatenaEnderecoEmString(c.getEndereco());
            model.addRow(rowData);
        }
    }

    private String concatenaEnderecoEmString(Endereco e) {
        return e.getLogradouro() + " - " + e.getBairro() + ", " + e.getCidade() + " - " + e.getEstado() + ", " + e.getCep();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Editar_Cliente_;
    private javax.swing.JButton jButton_Excluir_Cliente_;
    private javax.swing.JButton jButton_Listar_Cliente_;
    private javax.swing.JButton jButton_Novo_Cliente_;
    private javax.swing.JButton jButton_Pesquisa_Cliente_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Fazer_Logoff_;
    private javax.swing.JMenuItem jMenuItem_VoltarMenu_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cliente_;
    private javax.swing.JTextField jTextField_COD_Cliente_;
    // End of variables declaration//GEN-END:variables
}
