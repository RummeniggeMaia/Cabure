/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui.outros;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author jrpmaia
 */
public class PainelTextura extends JPanel {

    public PainelTextura() {
        setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paint(g2d); //To change body of generated methods, choose Tools | Templates.
//        try {
//            BufferedImage textura = ImageIO.read(new File("imagens/textura.jpg"));
//            g2d.setPaint(new TexturePaint(textura, new Rectangle2D.Double(0, 0, 150, 70)));
//            g2d.fillRect(0, 0, getWidth(), getHeight());
//        } catch (Exception ex) {
//            System.out.println(">>> erro textura: " + ex.getMessage());
//        }
    }
}
