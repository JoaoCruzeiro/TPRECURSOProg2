/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Utilizador;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author PW
 */
public class AreaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form AreaAdministrador
     */
    public AreaAdministrador() {
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

        bSair = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mUtilizador = new javax.swing.JMenu();
        miCriarUtilizador = new javax.swing.JMenuItem();
        miListarUtilizador = new javax.swing.JMenuItem();
        miAlterarUtilizador = new javax.swing.JMenuItem();
        mTiposResiduos = new javax.swing.JMenu();
        miCriarTiposResiduos = new javax.swing.JMenuItem();
        miListarTiposResiduos = new javax.swing.JMenuItem();
        miAlterarTiposResiduos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área Administrador");
        setMinimumSize(new java.awt.Dimension(550, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        getContentPane().add(bSair);
        bSair.setBounds(450, 340, 80, 30);

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bVoltar);
        bVoltar.setBounds(450, 380, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/administrador.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, -50, 640, 640);

        mUtilizador.setText("Utilizador");
        mUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUtilizadorActionPerformed(evt);
            }
        });

        miCriarUtilizador.setText("Criar Utilizador");
        miCriarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarUtilizadorActionPerformed(evt);
            }
        });
        mUtilizador.add(miCriarUtilizador);

        miListarUtilizador.setText("Listar Utilizador");
        miListarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarUtilizadorActionPerformed(evt);
            }
        });
        mUtilizador.add(miListarUtilizador);

        miAlterarUtilizador.setText("Alterar Utilizador");
        mUtilizador.add(miAlterarUtilizador);

        jMenuBar1.add(mUtilizador);

        mTiposResiduos.setText("Tipos Resíduos");

        miCriarTiposResiduos.setText("Criar Tipo de Resíduo");
        miCriarTiposResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarTiposResiduosActionPerformed(evt);
            }
        });
        mTiposResiduos.add(miCriarTiposResiduos);

        miListarTiposResiduos.setText("Listar Tipos de Resíduos");
        miListarTiposResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarTiposResiduosActionPerformed(evt);
            }
        });
        mTiposResiduos.add(miListarTiposResiduos);

        miAlterarTiposResiduos.setText("Alterar Tipos de Resíduos");
        mTiposResiduos.add(miAlterarTiposResiduos);

        jMenuBar1.add(mTiposResiduos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miListarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarUtilizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarUtilizadorActionPerformed

    private void miListarTiposResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarTiposResiduosActionPerformed
        // TODO add your handling code here:
        Set<Utilizador> utilizadores;
          
         //Você pode implementar com HashSet
         utilizadores = new HashSet<Utilizador>();
    
         /*
          * Percorrer todo SET com iterator usnado foreach
          * */
         for(Iterator<Utilizador> iter = utilizadores.iterator(); 
           iter.hasNext();) {
             Utilizador utilizadorAtual = iter.next();
         }
        
    }//GEN-LAST:event_miListarTiposResiduosActionPerformed

    private void mUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUtilizadorActionPerformed
        // TODO add your handling code here:
        new ListarUtilizadores.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_mUtilizadorActionPerformed

    private void miCriarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarUtilizadorActionPerformed
        // TODO add your handling code here:
        
        new CriarUtilizador().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_miCriarUtilizadorActionPerformed

    private void miCriarTiposResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarTiposResiduosActionPerformed
        // TODO add your handling code here:
        new CriarTiposResiduos().setVisible(true);
        dispose();
    }//GEN-LAST:event_miCriarTiposResiduosActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
        new LoginUtilizador().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

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
            java.util.logging.Logger.getLogger(AreaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSair;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mTiposResiduos;
    private javax.swing.JMenu mUtilizador;
    private javax.swing.JMenuItem miAlterarTiposResiduos;
    private javax.swing.JMenuItem miAlterarUtilizador;
    private javax.swing.JMenuItem miCriarTiposResiduos;
    private javax.swing.JMenuItem miCriarUtilizador;
    private javax.swing.JMenuItem miListarTiposResiduos;
    private javax.swing.JMenuItem miListarUtilizador;
    // End of variables declaration//GEN-END:variables
}
