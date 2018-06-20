/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import exception.CPFInvalidoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityExistsException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Cliente;
import model.Endereco;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author jesp
 */
public class TelaClienteCadastro extends javax.swing.JDialog {

    ClienteController cc = new ClienteController();

    public TelaClienteCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Nome_Cliente_ = new javax.swing.JTextField();
        jTextField_CPF_Cliente_ = new javax.swing.JTextField();
        jTextField_DataNasc_Cliente_ = new javax.swing.JTextField();
        jTextField_Bairro = new javax.swing.JTextField();
        jTextField_Logradouro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton_F = new javax.swing.JRadioButton();
        jRadioButton_M1 = new javax.swing.JRadioButton();
        jTextField_Telefone_Cliente_1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_UF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Cep = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Data de Nasc.:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Fone:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Bairro:");

        jTextField_Nome_Cliente_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_CPF_Cliente_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_DataNasc_Cliente_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_Bairro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BairroActionPerformed(evt);
            }
        });

        jTextField_Logradouro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Cliente");

        buttonGroup1.add(jRadioButton_F);
        jRadioButton_F.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_F.setText("F");

        buttonGroup1.add(jRadioButton_M1);
        jRadioButton_M1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_M1.setText("M");
        jRadioButton_M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_M1ActionPerformed(evt);
            }
        });

        jTextField_Telefone_Cliente_1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Telefone_Cliente_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Telefone_Cliente_1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Logradouro:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Cidade:");

        jTextField_Cidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CidadeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("UF");

        jTextField_UF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UFActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("CEP:");

        jTextField_Cep.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CepActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jTextField_CPF_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jTextField_Nome_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButton_M1)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton_F)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_DataNasc_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jTextField_Telefone_Cliente_1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jTextField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CPF_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Nome_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_M1)
                    .addComponent(jRadioButton_F)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DataNasc_Cliente_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Telefone_Cliente_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BairroActionPerformed

    private void jTextField_Telefone_Cliente_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Telefone_Cliente_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Telefone_Cliente_1ActionPerformed

    private void jTextField_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CidadeActionPerformed

    private void jTextField_UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UFActionPerformed

    private void jTextField_CepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String cpf = jTextField_CPF_Cliente_.getText();
        
        try {
        Cliente c = cc.findClientByCpf(cpf) ;
            if (c == null) {
                incluir();
            } else {
                System.out.println("Cod c: "+ c.getCod() +"\n Cod end: "+c.getEndereco().getCod());
                alterar(c.getCod(), c.getEndereco().getCod());
            }
        } catch (CPFInvalidoException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (EntityExistsException | ConstraintViolationException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, "O CPF já está cadastrado.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Erro no banco banco de dados.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Erro inesperado.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void incluir() throws CPFInvalidoException, EntityExistsException, SQLException {
        Cliente c = camposParaObjeto();

        cc.saveClient(c);
        new TelaCliente().preencheJTable(cc.findAllClients());
        dispose();

    }

    private void alterar(int codCliente, int codEnd) {
        Cliente c = camposParaObjeto();
        c.setCod(codCliente);
        c.getEndereco().setCod(codEnd);
        cc.updateClient(c);
        new TelaCliente().preencheJTable(cc.findAllClients());
        dispose();
    }

    private Cliente camposParaObjeto() {
        Cliente cAux = new Cliente();
        cAux.setCpf(jTextField_CPF_Cliente_.getText());
        cAux.setDataNascimento(jTextField_DataNasc_Cliente_.getText());
        cAux.setNome(jTextField_Nome_Cliente_.getText());

        if (jRadioButton_M1.isSelected()) {
            cAux.setSexo("M");
        } else if (jRadioButton_F.isSelected()) {
            cAux.setSexo("F");
        }
        cAux.setTelefone(jTextField_Telefone_Cliente_1.getText());

        Endereco end = new Endereco();
        end.setLogradouro(jTextField_Logradouro.getText());
        end.setBairro(jTextField_Bairro.getText());
        end.setCidade(jTextField_Cidade.getText());
        end.setEstado(jTextField_UF.getText());
        end.setCep(jTextField_Cep.getText());

        cAux.setEndereco(end);
        return cAux;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton_M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_M1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_M1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaClienteCadastro dialog = new TelaClienteCadastro(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton_F;
    private javax.swing.JRadioButton jRadioButton_M1;
    private javax.swing.JTextField jTextField_Bairro;
    private javax.swing.JTextField jTextField_CPF_Cliente_;
    private javax.swing.JTextField jTextField_Cep;
    private javax.swing.JTextField jTextField_Cidade;
    private javax.swing.JTextField jTextField_DataNasc_Cliente_;
    private javax.swing.JTextField jTextField_Logradouro;
    private javax.swing.JTextField jTextField_Nome_Cliente_;
    private javax.swing.JTextField jTextField_Telefone_Cliente_1;
    private javax.swing.JTextField jTextField_UF;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextField_Bairro() {
        return jTextField_Bairro;
    }

    public void setjTextField_Bairro(JTextField jTextField_Bairro) {
        this.jTextField_Bairro = jTextField_Bairro;
    }

    public JTextField getjTextField_CPF_Cliente_() {
        return jTextField_CPF_Cliente_;
    }

    public void setjTextField_CPF_Cliente_(JTextField jTextField_CPF_Cliente_) {
        this.jTextField_CPF_Cliente_ = jTextField_CPF_Cliente_;
    }

    public JTextField getjTextField_Cep() {
        return jTextField_Cep;
    }

    public void setjTextField_Cep(JTextField jTextField_Cep) {
        this.jTextField_Cep = jTextField_Cep;
    }

    public JTextField getjTextField_Cidade() {
        return jTextField_Cidade;
    }

    public void setjTextField_Cidade(JTextField jTextField_Cidade) {
        this.jTextField_Cidade = jTextField_Cidade;
    }

    public JTextField getjTextField_DataNasc_Cliente_() {
        return jTextField_DataNasc_Cliente_;
    }

    public void setjTextField_DataNasc_Cliente_(JTextField jTextField_DataNasc_Cliente_) {
        this.jTextField_DataNasc_Cliente_ = jTextField_DataNasc_Cliente_;
    }

    public JTextField getjTextField_Logradouro() {
        return jTextField_Logradouro;
    }

    public void setjTextField_Logradouro(JTextField jTextField_Logradouro) {
        this.jTextField_Logradouro = jTextField_Logradouro;
    }

    public JTextField getjTextField_Nome_Cliente_() {
        return jTextField_Nome_Cliente_;
    }

    public void setjTextField_Nome_Cliente_(JTextField jTextField_Nome_Cliente_) {
        this.jTextField_Nome_Cliente_ = jTextField_Nome_Cliente_;
    }

    public JTextField getjTextField_Telefone_Cliente_1() {
        return jTextField_Telefone_Cliente_1;
    }

    public void setjTextField_Telefone_Cliente_1(JTextField jTextField_Telefone_Cliente_1) {
        this.jTextField_Telefone_Cliente_1 = jTextField_Telefone_Cliente_1;
    }

    public JTextField getjTextField_UF() {
        return jTextField_UF;
    }

    public void setjTextField_UF(JTextField jTextField_UF) {
        this.jTextField_UF = jTextField_UF;
    }

    public JRadioButton getjRadioButton_F() {
        return jRadioButton_F;
    }

    public void setjRadioButton_F(JRadioButton jRadioButton_F) {
        this.jRadioButton_F = jRadioButton_F;
    }

    public JRadioButton getjRadioButton_M1() {
        return jRadioButton_M1;
    }

    public void setjRadioButton_M1(JRadioButton jRadioButton_M1) {
        this.jRadioButton_M1 = jRadioButton_M1;
    }

}
