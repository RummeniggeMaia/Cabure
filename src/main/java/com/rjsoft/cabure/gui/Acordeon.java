/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.gui.botoes.BotaoIcone;
import com.rjsoft.cabure.gui.listeners.AcordeonListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;

/**
 *
 * @author jrpmaia
 */
public class Acordeon extends javax.swing.JPanel {

    private List<AcordeonListener> listeners;
    private boolean acordAluno;
    private boolean acordLivro;
    /**
     * Creates new form Acordeon
     */
    public Acordeon() {
        initComponents();
        listeners = new ArrayList();
        botCadAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoPressionado(AcordeonListener.BOT_CAD_ALUNO);
            }
        });
        botPesAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoPressionado(AcordeonListener.BOT_PES_ALUNO);
            }
        });
        botCadLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoPressionado(AcordeonListener.BOT_CAD_LIVRO);
            }
        });
        botPesLivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoPressionado(AcordeonListener.BOT_PES_LIVRO);
            }
        });
    }

    public void addListener(AcordeonListener al) {
        listeners.add(al);
    }
    
    public void removeListener(AcordeonListener al) {
        listeners.remove(al);
    }
    
    private void botaoPressionado(int bot) {
        for (AcordeonListener al : listeners) {
            al.botaoAcordeonPressionado(bot);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botCadAluno = new javax.swing.JButton();
        botPesAlunos = new javax.swing.JButton();
        botCadLivro = new javax.swing.JButton();
        botPesLivros = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        menuInicio = new javax.swing.JButton();
        menuAluno = new javax.swing.JButton();
        menuLivro = new javax.swing.JButton();
        menuEmprestimo = new javax.swing.JButton();
        menuRelatorioAlunos = new javax.swing.JButton();
        menuRelatorioLivros = new javax.swing.JButton();
        menuRelatorioEmprestimos = new javax.swing.JButton();

        botCadAluno.setBackground(new java.awt.Color(255, 255, 255));
        botCadAluno.setText("Cadastrar");
        botCadAluno = new BotaoIcone("Cadastrar", BotaoIcone.ICON_ADD, false);
        botCadAluno.setBackground(new java.awt.Color(200, 200, 200));
        botCadAluno.setMaximumSize(new java.awt.Dimension(1000, 32));

        botPesAlunos.setBackground(new java.awt.Color(255, 255, 255));
        botPesAlunos.setText("Pesquisar");
        botPesAlunos = new BotaoIcone("Pesquisar", BotaoIcone.ICON_PESQUISAR, false);
        botPesAlunos.setBackground(new java.awt.Color(200, 200, 200));
        botPesAlunos.setMaximumSize(new java.awt.Dimension(1000, 32));

        botCadLivro.setBackground(new java.awt.Color(255, 255, 255));
        botCadLivro.setText("Cadastrar");
        botCadLivro = new BotaoIcone("Cadastrar", BotaoIcone.ICON_ADD, false);
        botCadLivro.setBackground(new java.awt.Color(200, 200, 200));
        botCadLivro.setMaximumSize(new java.awt.Dimension(1000, 32));

        botPesLivros.setBackground(new java.awt.Color(255, 255, 255));
        botPesLivros.setText("Pesquisar");
        botPesLivros = new BotaoIcone("Pesquisar", BotaoIcone.ICON_PESQUISAR, false);
        botPesLivros.setBackground(new java.awt.Color(200, 200, 200));
        botPesLivros.setMaximumSize(new java.awt.Dimension(1000, 32));

        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(200, 100));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        try {
            ImageIcon ii = new ImageIcon(ImageIO.read(new File("imagens/cabure_logo.png")));
            logo.setIcon(ii);
        } catch (Exception ex) {
        }
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(logo);

        menuInicio.setText("Inicio");
        menuInicio.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuInicio = new BotaoIcone("Inicio", BotaoIcone.ICON_HOME, false);
        menuInicio.setMaximumSize(new Dimension(1000, 32));
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        add(Box.createRigidArea(new Dimension(1, 30)));
        add(menuInicio);

        menuAluno.setText("Alunos");
        menuAluno.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuAluno = new BotaoIcone("Alunos", BotaoIcone.ICON_ALUNO, true);
        menuAluno.setMaximumSize(new Dimension(1000, 32));
        menuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlunoActionPerformed(evt);
            }
        });
        add(menuAluno);

        menuLivro.setText("Livros");
        menuLivro.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuLivro = new BotaoIcone("Livros", BotaoIcone.ICON_LIVRO, true);
        menuLivro.setMaximumSize(new Dimension(1000, 32));
        menuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivroActionPerformed(evt);
            }
        });
        add(menuLivro);

        menuEmprestimo.setText("Empréstimos");
        menuEmprestimo.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuEmprestimo = new BotaoIcone("Empréstimos", BotaoIcone.ICON_EMPRESTIMO, false);
        menuEmprestimo.setMaximumSize(new Dimension(1000, 32));
        menuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmprestimoActionPerformed(evt);
            }
        });
        add(menuEmprestimo);

        menuRelatorioAlunos.setText("Relatório Alunos");
        menuRelatorioAlunos = new BotaoIcone("Relatório Alunos", BotaoIcone.ICON_RELATORIO, false);
        menuRelatorioAlunos.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuEmprestimo = new BotaoIcone("Empréstimos", BotaoIcone.ICON_EMPRESTIMO, false);
        menuEmprestimo.setMaximumSize(new Dimension(1000, 32));
        menuRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioAlunosActionPerformed(evt);
            }
        });
        add(menuRelatorioAlunos);

        menuRelatorioLivros.setText("Relatório Livros");
        menuRelatorioLivros = new BotaoIcone("Relatório Livros", BotaoIcone.ICON_RELATORIO, false);
        menuRelatorioLivros.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuEmprestimo = new BotaoIcone("Empréstimos", BotaoIcone.ICON_EMPRESTIMO, false);
        menuEmprestimo.setMaximumSize(new Dimension(1000, 32));
        menuRelatorioLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioLivrosActionPerformed(evt);
            }
        });
        add(menuRelatorioLivros);

        menuRelatorioEmprestimos.setText("Relatório Empréstimos");
        menuRelatorioEmprestimos = new BotaoIcone("Relatório Empréstimos", BotaoIcone.ICON_RELATORIO, false);
        menuRelatorioEmprestimos.setMaximumSize(new java.awt.Dimension(1000, 32));
        menuEmprestimo = new BotaoIcone("Empréstimos", BotaoIcone.ICON_EMPRESTIMO, false);
        menuEmprestimo.setMaximumSize(new Dimension(1000, 32));
        menuRelatorioEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioEmprestimosActionPerformed(evt);
            }
        });
        add(menuRelatorioEmprestimos);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlunoActionPerformed
        acordAluno = !acordAluno;
        int index = getComponentZOrder(menuAluno);
        if (acordAluno) {
            add(botCadAluno, index + 1);
            add(botPesAlunos, index + 2);
        } else {
            remove(botCadAluno);
            remove(botPesAlunos);
        }
        revalidate();
    }//GEN-LAST:event_menuAlunoActionPerformed

    private void menuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivroActionPerformed
        acordLivro = !acordLivro;
        int index = getComponentZOrder(menuLivro);
        if (acordLivro) {
            add(botCadLivro, index + 1);
            add(botPesLivros, index + 2);
        } else {
            remove(botCadLivro);
            remove(botPesLivros);
        }
        revalidate();
    }//GEN-LAST:event_menuLivroActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        botaoPressionado(AcordeonListener.MENU_INICIO);
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmprestimoActionPerformed
        botaoPressionado(AcordeonListener.MENU_EMPRESTIMO);
    }//GEN-LAST:event_menuEmprestimoActionPerformed

    private void menuRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioAlunosActionPerformed
        botaoPressionado(AcordeonListener.MENU_RELATORIO_ALUNOS);
    }//GEN-LAST:event_menuRelatorioAlunosActionPerformed

    private void menuRelatorioLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioLivrosActionPerformed
         botaoPressionado(AcordeonListener.MENU_RELATORIO_LIVROS);
    }//GEN-LAST:event_menuRelatorioLivrosActionPerformed

    private void menuRelatorioEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioEmprestimosActionPerformed
         botaoPressionado(AcordeonListener.MENU_RELATORIO_EMPRESTIMOS);
    }//GEN-LAST:event_menuRelatorioEmprestimosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCadAluno;
    private javax.swing.JButton botCadLivro;
    private javax.swing.JButton botPesAlunos;
    private javax.swing.JButton botPesLivros;
    private javax.swing.JLabel logo;
    private javax.swing.JButton menuAluno;
    private javax.swing.JButton menuEmprestimo;
    private javax.swing.JButton menuInicio;
    private javax.swing.JButton menuLivro;
    private javax.swing.JButton menuRelatorioAlunos;
    private javax.swing.JButton menuRelatorioEmprestimos;
    private javax.swing.JButton menuRelatorioLivros;
    // End of variables declaration//GEN-END:variables
}
