package com.rjsoft.cabure;

import com.jtattoo.plaf.texture.TextureLookAndFeel;
import com.rjsoft.cabure.gui.CabureGUI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * Cabure - Sistema de Gerenciamento de Bibliotecas Escolares
 *
 * @author jrpmaia
 */
public class Cabure {

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
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//            TextureLookAndFeel.setTheme("Textile", "", "");
            UIManager.setLookAndFeel(new TextureLookAndFeel());
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CabureGUI gui = new CabureGUI();
                    gui.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
                    gui.setVisible(true);
                } catch (ExceptionInInitializerError eiie) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Não foi possível se conectar com o banco de dados, sistema será finalizado.", "Erro ao iniciar Cabure",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }

            }
        });
        //</editor-fold>
        //</editor-fold>

//        EntityManager em = JPAUtil.EMF.createEntityManager();
//        em.close();
    }

}
