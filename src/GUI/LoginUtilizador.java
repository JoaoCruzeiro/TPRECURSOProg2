/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Administrador;
import BLL.Utilizador;
import BLL.Ficheiro;
import BLL.Repositorio;
import javax.swing.JComboBox;

/**
 *
 * @author PW
 */
public class LoginUtilizador extends javax.swing.JFrame {

    /**
     * Creates new form Login_users
     */
    public LoginUtilizador() {
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

        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        bLogin = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jcTipoUtilizador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Utilizador");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setText("Utilizador:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 60, 20);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(50, 70, 210, 30);

        jLabel3.setText("Palavra-passe:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 130, 90, 20);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(50, 150, 210, 30);

        bLogin.setText("Autenticar");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin);
        bLogin.setBounds(310, 310, 100, 30);

        bVoltar.setText("Cancelar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bVoltar);
        bVoltar.setBounds(200, 310, 100, 30);

        jcTipoUtilizador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gestor", "Equipa", "Municipio" }));
        jcTipoUtilizador.setOpaque(false);
        jcTipoUtilizador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcTipoUtilizadorItemStateChanged(evt);
            }
        });
        jcTipoUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoUtilizadorActionPerformed(evt);
            }
        });
        getContentPane().add(jcTipoUtilizador);
        jcTipoUtilizador.setBounds(50, 200, 210, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/administrador.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 460, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
       Entrada obj = new Entrada();
       obj.setVisible(true); 
       dispose();
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void jcTipoUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoUtilizadorActionPerformed
        
    }//GEN-LAST:event_jcTipoUtilizadorActionPerformed

    private void jcTipoUtilizadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcTipoUtilizadorItemStateChanged

    }//GEN-LAST:event_jcTipoUtilizadorItemStateChanged

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed

        switch(jcTipoUtilizador.getSelectedItem().toString()){
            case "Administrador":
                new AreaAdministrador().setVisible(true);
                dispose();
                break;
                
            case "Gestor":
                new AreaGestor().setVisible(true);
                dispose();
                break;
                
            case "Equipa":
                new AreaEquipa().setVisible(true);
                dispose();
                break;
            case "Municipio":
                new AreaMunicipio().setVisible(true);
                dispose();
                break;
            
        }

    }//GEN-LAST:event_bLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUtilizador().setVisible(true);
                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcTipoUtilizador;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}