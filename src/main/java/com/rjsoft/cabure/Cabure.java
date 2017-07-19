package com.rjsoft.cabure;

import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.gui.CabureGUI;
import com.rjsoft.cabure.gui.outros.SplashScreen;
import com.rjsoft.cabure.util.JPAUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * Cabure - Sistema de Gerenciamento de Bibliotecas Escolares
 *
 * @author jrpmaia
 */
public class Cabure {

    private static SplashScreen splash;

    private static void iniciarSplash() {
        splash = new SplashScreen();
        splash.setVisible(true);
    }

    private static void finalizarSplash() {
        if (splash != null) {
            splash.setVisible(false);
            splash.dispose();
            splash = null;
        }
    }

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
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//            TextureLookAndFeel.setTheme("Textile", "", "");
//            UIManager.setLookAndFeel(new TextureLookAndFeel());
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//            }
//        });
        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    iniciarSplash();
                    
                    splash.setProgresso(0.1);
                    EntityManager em = JPAUtil.EMF.createEntityManager();
                    splash.setProgresso(0.3);
                    AlunoCtrl alunoCtrl = new AlunoCtrl(em);
                    splash.setProgresso(0.35);
                    LivroCtrl livroCtrl = new LivroCtrl(em);
                    splash.setProgresso(0.40);
                    EmprestimoCtrl emprestimoCtrl = new EmprestimoCtrl(em);
                    splash.setProgresso(0.45);
                    EmprestimoCtrl homeAtrasadosCtrl = new EmprestimoCtrl(em);
                    splash.setProgresso(0.50);
                    EmprestimoCtrl homeRealizadosCtrl = new EmprestimoCtrl(em);

                    CabureGUI gui = new CabureGUI();
                    splash.setProgresso(0.80);
                    gui.setAlunoCtrl(alunoCtrl);
                    gui.setLivroCtrl(livroCtrl);
                    gui.setEmprestimoCtrl(emprestimoCtrl);
                    gui.setHomeAtrasadosCtrl(homeAtrasadosCtrl);
                    gui.setHomeRealizadosCtrl(homeRealizadosCtrl);
                    splash.setProgresso(0.95);

                    gui.iniciarPaineis();
                    gui.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
                    gui.setVisible(true);
                    splash.setProgresso(1);
                    finalizarSplash();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Não foi possível se conectar com o banco de dados, sistema será finalizado.", "Erro ao iniciar Cabure",
                            JOptionPane.ERROR_MESSAGE);
                    try {
                        String dataHora = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
                        PrintStream ps = new PrintStream(new File("Log_" + dataHora + ".txt"));
                        ex.printStackTrace(ps);
                    } catch (FileNotFoundException ex1) {
                        ex1.printStackTrace();
                    }

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
