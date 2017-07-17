/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui.botoes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
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

    private boolean expandivel;
    private boolean expandido;

    private BufferedImage iconeImg;
    private BufferedImage collapsedImg;
    private BufferedImage expandedImg;
    
    private int distIconEsq;

    public BotaoIcone(String text, int tipo, boolean expandivel) {
        super(text);
        String imgUrl = "imagens/";
        distIconEsq = 8;
        switch (tipo) {
            case ICON_HOME: {
                imgUrl += "home.png";
                break;
            }
            case ICON_LIVRO: {
                imgUrl += "livros.png";
                break;
            }
            case ICON_ALUNO: {
                imgUrl += "alunos.png";
                break;
            }
            case ICON_EMPRESTIMO: {
                imgUrl += "emprestimos.png";
                break;
            }
            case ICON_ADD: {
                imgUrl += "add.png";
                distIconEsq = 35;
                break;
            }
            case ICON_PESQUISAR: {
                imgUrl += "persquisar.png";
                distIconEsq = 35;
                break;
            }
            case ICON_RELATORIO: {
                imgUrl += "relatorio.png";
                break;
            }
        }
        try {
            iconeImg = ImageIO.read(new File(imgUrl));
            collapsedImg = ImageIO.read(new File("imagens/collapse.png"));
            expandedImg = ImageIO.read(new File("imagens/expand.png"));
        } catch (Exception ex) {
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
        g2d.drawImage(iconeImg, null, distIconEsq, 10);
        if (expandivel) {
            if (expandido) {
                g2d.drawImage(expandedImg, null, getWidth() - 25, 12);
            } else {
                g2d.drawImage(collapsedImg, null, getWidth() - 25, 12);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        expandido = !expandido;
    }
}
