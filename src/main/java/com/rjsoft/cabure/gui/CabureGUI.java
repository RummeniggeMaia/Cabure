package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.gui.listeners.AcordeonListener;
import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.gui.listeners.TableListener;
import com.rjsoft.cabure.util.JPAUtil;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author jrpmaia
 */
public class CabureGUI extends javax.swing.JFrame
        implements AcordeonListener, TableListener {

    /**
     * Creates new form Cabure
     */
    private HomePanel home;
    private CadastrarAlunoPane cadastrarAluno;
    private PesquisarAlunoPanel pesquisarAluno;
    private CadastrarLivroPanel cadastrarLivro;
    private PesquisarLivroPanel pesquisarLivro;
    private GerenciarEmprestimosPanel gerenciarEmprestimos;
    private JPanel painelCentro;
    //Controles
    private AlunoCtrl alunoCtrl;
    private LivroCtrl livroCtrl;
    private EmprestimoCtrl emprestimoCtrl;
    private EmprestimoCtrl homeCtrl;
    //Constantes
    private static final Dimension TAMANHO_MINIMO = new Dimension(600, 400);
    private static final Dimension TAMANHO_MAXIMO = new Dimension(800, 600);
    private static final String TITULO = "Cabure - Sistema de Gerenciamento de Biblioteca";

    public CabureGUI() {
        alunoCtrl = new AlunoCtrl(JPAUtil.EMF.createEntityManager());
        livroCtrl = new LivroCtrl(JPAUtil.EMF.createEntityManager());
        emprestimoCtrl = new EmprestimoCtrl(JPAUtil.EMF.createEntityManager());
        homeCtrl = new EmprestimoCtrl(JPAUtil.EMF.createEntityManager());
        initComponents();

        home = new HomePanel(homeCtrl);
        cadastrarAluno = new CadastrarAlunoPane(alunoCtrl);
        pesquisarAluno = new PesquisarAlunoPanel(alunoCtrl);
        cadastrarLivro = new CadastrarLivroPanel(livroCtrl);
        pesquisarLivro = new PesquisarLivroPanel(livroCtrl);
        gerenciarEmprestimos = new GerenciarEmprestimosPanel(alunoCtrl, livroCtrl, emprestimoCtrl);
        
        home.carregarEmprestimosAtrasados();
        
        painelCentro = home;
        add(painelCentro, BorderLayout.CENTER);
        //Listeners
        acordeon1.addListener(this);
        pesquisarAluno.addTableListener(this);
        setSize(TAMANHO_MAXIMO);
        setResizable(true);
        setMinimumSize(TAMANHO_MINIMO);
        setTitle(TITULO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        acordeon1 = new com.rjsoft.cabure.gui.Acordeon();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(acordeon1, java.awt.BorderLayout.LINE_START);

        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Menu Inicial");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aluno");

        jMenuItem1.setText("Cadastrar Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Pesquisar Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Livro");

        jMenuItem3.setText("Cadastrar Livro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Pesquisar Livro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rjsoft.cabure.gui.Acordeon acordeon1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables

    private void setPainelCentro() {
        
        add(painelCentro, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    @Override
    public void botaoAcordeonPressionado(int botao) {
        remove(painelCentro);
        switch (botao) {
            case AcordeonListener.MENU_INICIO: {
                painelCentro = home;
                break;
            }
            case AcordeonListener.BOT_CAD_ALUNO: {
                painelCentro = cadastrarAluno;
                break;
            }
            case AcordeonListener.BOT_PES_ALUNO: {
                pesquisarAluno.pesquisar();
                painelCentro = pesquisarAluno;
                break;
            }
            case AcordeonListener.BOT_CAD_LIVRO: {
                painelCentro = cadastrarLivro;
                break;
            }
            case AcordeonListener.BOT_PES_LIVRO: {
                painelCentro = pesquisarLivro;
                break;
            }
            case AcordeonListener.MENU_EMPRESTIMO: {
                painelCentro = gerenciarEmprestimos;
                break;
            }
            default: {
                painelCentro = home;
            }
        }
        setPainelCentro();
    }

    @Override
    public void linhaSelecionada(int fonte, int idEntidade) {
        if (fonte == TableListener.TELA_PES_ALUNO) {
            remove(painelCentro);
            cadastrarAluno.carregarAluno(idEntidade);
            painelCentro = cadastrarAluno;
            setPainelCentro();
        } else if (fonte == TableListener.TELA_PES_LIVRO) {
            remove(painelCentro);
            cadastrarLivro.carregarLivro(idEntidade);
            painelCentro = cadastrarLivro;
            setPainelCentro();
        }
    }
}
