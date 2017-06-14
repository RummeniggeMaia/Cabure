/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.modelo.Livro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jrpmaia
 */
public class CadastrarLivroPanel extends javax.swing.JPanel {

    private LivroCtrl ctrl;
    /**
     * Creates new form NewJPanel
     */
    public CadastrarLivroPanel(LivroCtrl ctrl) {
        this.ctrl = ctrl;
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

        labelId = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelEditora = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelSerie = new javax.swing.JLabel();
        labelErrId = new javax.swing.JLabel();
        labelISBN = new javax.swing.JLabel();
        labelErrSegundoAutor = new javax.swing.JLabel();
        textFieldPrimeiroAutor = new javax.swing.JTextField();
        labelErrPrimeiroAutor = new javax.swing.JLabel();
        textFieldTerceiroAutor = new javax.swing.JTextField();
        labelErrTerceiroAutor = new javax.swing.JLabel();
        textFieldSegundoAutor = new javax.swing.JTextField();
        labelErrCidade = new javax.swing.JLabel();
        textFieldLocal = new javax.swing.JTextField();
        textFieldNumeroEdicao = new javax.swing.JTextField();
        labelErrVolume = new javax.swing.JLabel();
        labelErrNumeroEdicao = new javax.swing.JLabel();
        textFieldPaginas = new javax.swing.JTextField();
        labelErrPaginas = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        labelErrTitulo = new javax.swing.JLabel();
        textFieldSubtitulo = new javax.swing.JTextField();
        labelErrSubtitulo = new javax.swing.JLabel();
        labelCadastroDeLivro = new javax.swing.JLabel();
        textFieldEditora = new javax.swing.JTextField();
        labelErrEditora = new javax.swing.JLabel();
        labelPrimeiroAutor = new javax.swing.JLabel();
        textFieldAno = new javax.swing.JTextField();
        labelErrAno = new javax.swing.JLabel();
        labelSegundoAutor = new javax.swing.JLabel();
        textFieldSerie = new javax.swing.JTextField();
        labelErrSerie = new javax.swing.JLabel();
        labelTerceiroAutor = new javax.swing.JLabel();
        textFieldISBN = new javax.swing.JTextField();
        labelErrISBN = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        textFieldVolume = new javax.swing.JTextField();
        labelNumeroEdicao = new javax.swing.JLabel();
        buttonCancelaID = new javax.swing.JButton();
        labelVolume = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        labelPaginas = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        labelQntEstante = new javax.swing.JLabel();
        textFieldQntEstante = new javax.swing.JTextField();
        labelErrQntEstante = new javax.swing.JLabel();

        labelId.setText("Id:");
        labelId.setOpaque(true);

        labelSubtitulo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSubtitulo.setText("Subtítulo:");

        labelEditora.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelEditora.setText("Editora:");

        labelAno.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelAno.setText("Ano:");

        labelSerie.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSerie.setText("Série:");

        labelErrId.setForeground(new java.awt.Color(255, 0, 0));

        labelISBN.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelISBN.setText("ISBN:");

        labelErrSegundoAutor.setForeground(new java.awt.Color(255, 0, 0));

        textFieldPrimeiroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrimeiroAutorActionPerformed(evt);
            }
        });

        labelErrPrimeiroAutor.setForeground(new java.awt.Color(255, 0, 0));

        textFieldTerceiroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTerceiroAutorActionPerformed(evt);
            }
        });

        labelErrTerceiroAutor.setForeground(new java.awt.Color(255, 0, 0));

        textFieldSegundoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSegundoAutorActionPerformed(evt);
            }
        });

        labelErrCidade.setForeground(new java.awt.Color(255, 0, 0));

        labelErrVolume.setForeground(new java.awt.Color(255, 0, 0));

        labelErrNumeroEdicao.setForeground(new java.awt.Color(255, 0, 0));

        labelErrPaginas.setForeground(new java.awt.Color(255, 0, 0));

        labelErrTitulo.setForeground(new java.awt.Color(255, 0, 0));

        labelErrSubtitulo.setForeground(new java.awt.Color(255, 0, 0));

        labelCadastroDeLivro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCadastroDeLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastroDeLivro.setText("Cadastro de Livro");

        labelErrEditora.setForeground(new java.awt.Color(255, 0, 0));

        labelPrimeiroAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelPrimeiroAutor.setText("1º Autor:");

        labelErrAno.setForeground(new java.awt.Color(255, 0, 0));

        labelSegundoAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSegundoAutor.setText("2º Autor:");

        labelErrSerie.setForeground(new java.awt.Color(255, 0, 0));

        labelTerceiroAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelTerceiroAutor.setText("3º Autor:");

        labelErrISBN.setForeground(new java.awt.Color(255, 0, 0));

        labelLocal.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelLocal.setText("Local (Cidade):");

        labelNumeroEdicao.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelNumeroEdicao.setText("Nº da Edição:");

        buttonCancelaID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelaID.setForeground(new java.awt.Color(255, 0, 0));
        buttonCancelaID.setText("×");
        buttonCancelaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelaIDActionPerformed(evt);
            }
        });

        labelVolume.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelVolume.setText("Volume:");

        textFieldId.setEditable(false);

        labelPaginas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelPaginas.setText("Páginas:");

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelTitulo.setText("Título:");

        buttonSalvar.setText("Salvar");
        buttonSalvar.setMaximumSize(new java.awt.Dimension(200, 28));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(200, 30));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);

        labelQntEstante.setText("Livros na estante:");

        textFieldQntEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQntEstanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastroDeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldEditora)
                    .addComponent(textFieldLocal)
                    .addComponent(textFieldTerceiroAutor)
                    .addComponent(textFieldSegundoAutor)
                    .addComponent(textFieldPrimeiroAutor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelId)
                        .addGap(6, 6, 6)
                        .addComponent(labelErrId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelQntEstante)
                        .addGap(17, 17, 17)
                        .addComponent(labelErrQntEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(buttonCancelaID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldQntEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPrimeiroAutor)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrPrimeiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSegundoAutor)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTerceiroAutor)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrTerceiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLocal)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumeroEdicao)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(labelVolume)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(labelPaginas)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(labelSubtitulo)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEditora)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAno)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrAno, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(labelSerie)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(labelISBN)
                                .addGap(6, 6, 6)
                                .addComponent(labelErrISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelCadastroDeLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelId)
                    .addComponent(labelErrId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelErrQntEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelQntEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCancelaID)
                        .addComponent(textFieldQntEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPrimeiroAutor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelErrPrimeiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(textFieldPrimeiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSegundoAutor)
                    .addComponent(labelErrSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(textFieldSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTerceiroAutor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelErrTerceiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(textFieldTerceiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLocal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelErrCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(textFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumeroEdicao)
                    .addComponent(labelErrNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVolume)
                    .addComponent(labelErrVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPaginas)
                    .addComponent(labelErrPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(labelErrTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubtitulo)
                    .addComponent(labelErrSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEditora)
                    .addComponent(labelErrEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(textFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAno)
                    .addComponent(labelErrAno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSerie)
                    .addComponent(labelErrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelISBN)
                    .addComponent(labelErrISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPrimeiroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPrimeiroAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPrimeiroAutorActionPerformed

    private void textFieldTerceiroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTerceiroAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTerceiroAutorActionPerformed

    private void buttonCancelaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelaIDActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        cadastrarLivro();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldQntEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQntEstanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldQntEstanteActionPerformed

    private void textFieldSegundoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSegundoAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSegundoAutorActionPerformed

    private void cadastrarLivro() {
        limparValidacao();
        if (validarCampos()) {
            try {
                Livro livro = new Livro();
                String id = textFieldId.getText();
                livro.setPrimeiroAutor(textFieldPrimeiroAutor.getText());
                livro.setSegundoAutor(textFieldSegundoAutor.getText());
                livro.setTerceiroAutor(textFieldTerceiroAutor.getText());
                livro.setLocalidade(textFieldLocal.getText());
                livro.setNumeroEdicao(textFieldNumeroEdicao.getText());
                livro.setVolume(textFieldPaginas.getText());
                livro.setNumeroPaginas(Integer.parseInt(textFieldPaginas.getText()));
                livro.setTitulo(textFieldTitulo.getText());
                livro.setSubtitulo(textFieldSubtitulo.getText());
                livro.setEditora(textFieldEditora.getText());
                DateFormat df = new SimpleDateFormat("yyyy");
                livro.setAno(
                        df.parse(textFieldAno.getText()));
                livro.setSerie(textFieldSerie.getText());
                livro.setIsbn(textFieldISBN.getText());
                livro.setQntEstante(Integer.parseInt(textFieldQntEstante.getText()));
                ctrl.setLivro(livro);
                ctrl.salvarLivro();
                limparCampos();

                JOptionPane.showMessageDialog(
                        this,
                        "Livro cadastrado com sucesso!",
                        "Erro cadastrar Livro",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Erro cadastrar Livro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Dados do Livro estão inválidos.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void limparCampos() {
        textFieldAno.setText("");
        textFieldEditora.setText("");
        textFieldISBN.setText("");
        textFieldId.setText("");
        textFieldLocal.setText("");
        textFieldNumeroEdicao.setText("");
        textFieldVolume.setText("");
        textFieldPrimeiroAutor.setText("");
        textFieldSegundoAutor.setText("");
        textFieldSerie.setText("");
        textFieldSubtitulo.setText("");
        textFieldTerceiroAutor.setText("");
        textFieldTitulo.setText("");
        textFieldPaginas.setText("");
        limparValidacao();
    }

    private void limparValidacao() {
        labelErrAno.setText("");
        labelErrCidade.setText("");
        labelErrEditora.setText("");
        labelErrISBN.setText("");
        labelErrId.setText("");
        labelErrVolume.setText("");
        labelErrPrimeiroAutor.setText("");
        labelErrSegundoAutor.setText("");
        labelErrSerie.setText("");
        labelErrSubtitulo.setText("");
        labelErrTerceiroAutor.setText("");
        labelErrTitulo.setText("");
        labelErrNumeroEdicao.setText("");
        labelErrPaginas.setText("");
    }

    private boolean validarCampos() {
        boolean valido = true;
        if (textFieldTitulo.getText().isEmpty()) {
            labelErrTitulo.setText("* Campo obrigatório");
            valido = false;
        }
        if (textFieldPrimeiroAutor.getText().length() < 2) {
            labelErrPrimeiroAutor.setText("* nome muito pequeno");
            valido = false;
        }
        if (textFieldVolume.getText().isEmpty()) {
            labelErrPaginas.setText("* Campo obrigatório");
            valido = false;
        }
        try {
            Integer.parseInt(textFieldVolume.getText());
        } catch (Exception ex) {
            labelErrNumeroEdicao.setText("* inválido");
            valido = false;
        }
        if (textFieldPaginas.getText().isEmpty()) {
            labelErrPaginas.setText("* Campo obrigatório");
            valido = false;
        }
        if (textFieldNumeroEdicao.getText().isEmpty()) {
            labelErrVolume.setText("* Campo obrigatório");
            valido = false;
        }
        if (textFieldEditora.getText().isEmpty()) {
            labelErrEditora.setText("* Campo obrigatório");
            valido = false;
        }
        return valido;
    }

    public void carregarLivro(int livroId) {
        limparCampos();
        Livro l = ctrl.pesquisarPorId(livroId);
        if (l != null) {
            textFieldAno.setText(
                    new SimpleDateFormat("yyyy").format(
                            l.getAno()));
            textFieldEditora.setText(l.getEditora());
            textFieldISBN.setText(l.getIsbn());
            textFieldId.setText(l.getID().toString());
            textFieldLocal.setText(l.getLocalidade());
            textFieldNumeroEdicao.setText(l.getNumeroEdicao());
            textFieldVolume.setText(l.getVolume());
            textFieldPrimeiroAutor.setText(l.getPrimeiroAutor());
            textFieldSegundoAutor.setText(l.getSegundoAutor());
            textFieldSerie.setText(l.getSerie());
            textFieldSubtitulo.setText(l.getSubtitulo());
            textFieldTerceiroAutor.setText(l.getTerceiroAutor());
            textFieldTitulo.setText(l.getTitulo());
            textFieldPaginas.setText(l.getNumeroPaginas().toString());
            textFieldQntEstante.setText(l.getQntEstante().toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelaID;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCadastroDeLivro;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelErrAno;
    private javax.swing.JLabel labelErrCidade;
    private javax.swing.JLabel labelErrEditora;
    private javax.swing.JLabel labelErrISBN;
    private javax.swing.JLabel labelErrId;
    private javax.swing.JLabel labelErrNumeroEdicao;
    private javax.swing.JLabel labelErrPaginas;
    private javax.swing.JLabel labelErrPrimeiroAutor;
    private javax.swing.JLabel labelErrQntEstante;
    private javax.swing.JLabel labelErrSegundoAutor;
    private javax.swing.JLabel labelErrSerie;
    private javax.swing.JLabel labelErrSubtitulo;
    private javax.swing.JLabel labelErrTerceiroAutor;
    private javax.swing.JLabel labelErrTitulo;
    private javax.swing.JLabel labelErrVolume;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelNumeroEdicao;
    private javax.swing.JLabel labelPaginas;
    private javax.swing.JLabel labelPrimeiroAutor;
    private javax.swing.JLabel labelQntEstante;
    private javax.swing.JLabel labelSegundoAutor;
    private javax.swing.JLabel labelSerie;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTerceiroAutor;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVolume;
    private javax.swing.JTextField textFieldAno;
    private javax.swing.JTextField textFieldEditora;
    private javax.swing.JTextField textFieldISBN;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldLocal;
    private javax.swing.JTextField textFieldNumeroEdicao;
    private javax.swing.JTextField textFieldPaginas;
    private javax.swing.JTextField textFieldPrimeiroAutor;
    private javax.swing.JTextField textFieldQntEstante;
    private javax.swing.JTextField textFieldSegundoAutor;
    private javax.swing.JTextField textFieldSerie;
    private javax.swing.JTextField textFieldSubtitulo;
    private javax.swing.JTextField textFieldTerceiroAutor;
    private javax.swing.JTextField textFieldTitulo;
    private javax.swing.JTextField textFieldVolume;
    // End of variables declaration//GEN-END:variables
}
