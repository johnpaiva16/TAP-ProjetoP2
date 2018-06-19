/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author L
 */
public class TelaLog extends javax.swing.JFrame {

    private static Usuario usuario;
    
    public TelaLog() {
        util.CreateTables.executaSQL();
        initComponents();
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Login_ = new javax.swing.JTextField();
        jPasswordField_Senha_ = new javax.swing.JPasswordField();
        jToggleButton_acessar_ = new javax.swing.JToggleButton();
        jToggleButton_sair_ = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 160, 60, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(314, 209, 62, 22);

        jTextField_Login_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_Login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Login_ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Login_);
        jTextField_Login_.setBounds(376, 160, 190, 28);

        jPasswordField_Senha_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField_Senha_);
        jPasswordField_Senha_.setBounds(376, 206, 190, 28);

        jToggleButton_acessar_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton_acessar_.setText("Acessar");
        jToggleButton_acessar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_acessar_ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_acessar_);
        jToggleButton_acessar_.setBounds(376, 252, 103, 31);

        jToggleButton_sair_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton_sair_.setText("Sair");
        jToggleButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_sair_ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_sair_);
        jToggleButton_sair_.setBounds(496, 252, 70, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/topo-anais-farmacia-2016.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-680, -160, 1340, 690);

        setSize(new java.awt.Dimension(616, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_sair_ActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_jToggleButton_sair_ActionPerformed

    private void jToggleButton_acessar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_acessar_ActionPerformed
        UsuarioController control = new UsuarioController();
        usuario = control.authenticate(jTextField_Login_.getText(), jPasswordField_Senha_.getText());
        if (usuario != null) {
            TelaMenu janela = new TelaMenu();
            janela.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuário ou senha inválido. Tente novamente!");
        }
    }//GEN-LAST:event_jToggleButton_acessar_ActionPerformed

    private void jTextField_Login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Login_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Login_ActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField_Senha_;
    private javax.swing.JTextField jTextField_Login_;
    private javax.swing.JToggleButton jToggleButton_acessar_;
    private javax.swing.JToggleButton jToggleButton_sair_;
    // End of variables declaration//GEN-END:variables
}
