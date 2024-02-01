/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Ficheiro;
import BLL.TiposResiduos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PW
 */
public class CriarTiposResiduos extends javax.swing.JFrame {

    /**
     * Creates new form CriarTiposResiduos
     */
    public CriarTiposResiduos() {
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
        txtTipoResiduos = new javax.swing.JTextField();
        bCriar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Tipo de Resíduo");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setText("Tipo de Resíduo:");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 160, 97, 16);

        txtTipoResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoResiduosActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipoResiduos);
        txtTipoResiduos.setBounds(80, 180, 260, 22);

        bCriar.setText("Criar");
        bCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarActionPerformed(evt);
            }
        });
        getContentPane().add(bCriar);
        bCriar.setBounds(250, 250, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/administrador.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 670, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoResiduosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoResiduosActionPerformed

    private void bCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarActionPerformed
        // TODO add your handling code here:
       
        TiposResiduos tiposResiduos = new TiposResiduos();
        
        tiposResiduos.setNomeTipo(txtTipoResiduos.getText());
        
            try {
                Ficheiro.getRepo().addTiposResiduos(tiposResiduos);
            } catch (Exception ex) {
                Logger.getLogger(CriarTiposResiduos.class.getName()).log(Level.SEVERE, null, ex);
                
           }
        Ficheiro.serializar("Repositorio.dat");
        JOptionPane.showMessageDialog(null, "Registado com sucesso!");
        
        new AreaAdministrador().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bCriarActionPerformed

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
            java.util.logging.Logger.getLogger(CriarTiposResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarTiposResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarTiposResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarTiposResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarTiposResiduos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCriar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTipoResiduos;
    // End of variables declaration//GEN-END:variables
}
