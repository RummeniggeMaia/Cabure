/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui.outros;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author jrpmaia
 */
public class BotaoIcone extends JButton implements ActionListener {

    public static final int ICON_HOME = 0;
    public static final int ICON_LIVRO = 1;
    public static final int ICON_ALUNO = 2;
    public static final int ICON_EMPRESTIMO = 3;
    public static final int ICON_ADD = 4;
    public static final int ICON_PESQUISAR = 5;
    public static final int ICON_RELATORIO = 6;
    public static final int ICON_PESSOAS = 7;
    public static final int ICON_RELATORIO_PESSOA = 8;
    public static final int ICON_RELATORIO_LIVRO = 9;
    public static final int ICON_RELATORIO_EMPRESTIMO = 10;

    private boolean expandivel;
    private boolean expandido;

    private Image iconeImg;
    private Image collapsedImg;
    private Image expandedImg;

    private int distIconEsq;

    public BotaoIcone(String text, int tipo, boolean expandivel) {
        super(text);
        String imgNome = "/imagens/";
        distIconEsq = 8;
        switch (tipo) {
            case ICON_HOME: {
                imgNome += "home.png";
                break;
            }
            case ICON_LIVRO: {
                imgNome += "livros.png";
                break;
            }
            case ICON_ALUNO: {
                imgNome += "alunos.png";
                break;
            }
            case ICON_PESSOAS: {
                imgNome += "pessoas.png";
                break;
            }
            case ICON_EMPRESTIMO: {
                imgNome += "emprestimos.png";
                break;
            }
            case ICON_ADD: {
                imgNome += "add.png";
                distIconEsq = 35;
                break;
            }
            case ICON_PESQUISAR: {
                imgNome += "pesquisar.png";
                distIconEsq = 35;
                break;
            }
            case ICON_RELATORIO: {
                imgNome += "relatorio.png";
                break;
            }
            case ICON_RELATORIO_PESSOA: {
                imgNome += "relatorio_pessoas.png";
                distIconEsq = 30;
                break;
            }
            case ICON_RELATORIO_LIVRO: {
                imgNome += "relatorio_livros.png";
                distIconEsq = 30;
                break;
            }
            case ICON_RELATORIO_EMPRESTIMO: {
                imgNome += "relatorio_emprestimos.png";
                distIconEsq = 30;
                break;
            }
        }
        try {
            iconeImg = new ImageIcon(getClass().getResource(imgNome)).getImage();
            expandedImg = new ImageIcon(getClass().getResource("/imagens/expand.png")).getImage();
            collapsedImg = new ImageIcon(getClass().getResource("/imagens/collapse.png")).getImage();
//            System.out.println(">>>> " + new ImageIcon(getClass().getResource("/imagens/expand.png")));
//            iconeImg = ImageIO.read(getClass().getClassLoader().getResourceAsStream(imgNome));
//            ImageIcon ii = new ImageIcon(getClass().getClassLoader().getResource("\\imagens\\collapse.png"));
//            collapsedImg = (BufferedImage) ii.getImage();
//            ii = new ImageIcon(getClass().getClassLoader().getResource("\\imagens\\expand.png"));
//            expandedImg = (BufferedImage) ii.getImage();
//            collapsedImg = ImageIO.read(getClass().getClassLoader().getResource("resources/imagens/collapse.png"));
//            expandedImg = ImageIO.read(getClass().getClassLoader().getResource("resources/imagens/expand.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.expandivel = expandivel;
        addActionListener(this);
    }

    public boolean isExpandivel() {
        return expandivel;
    }

    public void setExpandivel(boolean expandivel) {
        this.expandivel = expandivel;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d); //To change body of generated methods, choose Tools | Templates.
        if (iconeImg == null || expandedImg == null || collapsedImg == null) {
            return;
        }
        g2d.drawImage(iconeImg, distIconEsq, 10, null);
        if (expandivel) {
            if (expandido) {
                g2d.drawImage(expandedImg, getWidth() - 25, 12, null);
            } else {
                g2d.drawImage(collapsedImg, getWidth() - 25, 12, null);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        expandido = !expandido;
    }
}
