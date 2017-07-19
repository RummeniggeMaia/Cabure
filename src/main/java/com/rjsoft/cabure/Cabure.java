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
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//            TextureLookAndFeel.setTheme("Textile", "", "");
//            UIManager.setLookAndFeel(new TextureLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabureGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (m()) {
                    try {
                        iniciarSplash();

                        EntityManager em = JPAUtil.EMF.createEntityManager();
                        AlunoCtrl alunoCtrl = new AlunoCtrl(em);
                        LivroCtrl livroCtrl = new LivroCtrl(em);
                        EmprestimoCtrl emprestimoCtrl = new EmprestimoCtrl(em);
                        EmprestimoCtrl homeAtrasadosCtrl = new EmprestimoCtrl(em);
                        EmprestimoCtrl homeRealizadosCtrl = new EmprestimoCtrl(em);

                        CabureGUI gui = new CabureGUI();
                        gui.setAlunoCtrl(alunoCtrl);
                        gui.setLivroCtrl(livroCtrl);
                        gui.setEmprestimoCtrl(emprestimoCtrl);
                        gui.setHomeAtrasadosCtrl(homeAtrasadosCtrl);
                        gui.setHomeRealizadosCtrl(homeRealizadosCtrl);

                        gui.iniciarPaineis();
                        gui.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
                        gui.setVisible(true);

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
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "Este computador não foi registrado!\n"
                                    + "Por favor entrar em contato com a equipe de desenvolvimento.",
                            "PC não habilitado a usar o sistema Caburé",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        });
    }

    public static boolean m() {
        try {
            //Colocar o mac da máquina do cliente aqui!
            byte[] m = new byte[]{92, -55, -45, 99, -3, 106};

            InetAddress ia = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(ia);
            byte[] x = ni.getHardwareAddress();
            
            /** Descomente aqui pra saber o MAC da máquina.
                Depois copie e cole no vertor "byte[] m" acima. */
            //System.out.println(Arrays.toString(x));
            
            return Arrays.equals(m, x);
        } catch (Exception ex) {
            return false;
        }
    }
}
