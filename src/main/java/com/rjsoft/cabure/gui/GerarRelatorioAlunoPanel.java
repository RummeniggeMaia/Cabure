/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JAEDSON
 */
public class GerarRelatorioAlunoPanel extends javax.swing.JPanel {

    /**
     * Creates new form RelatorioPanel
     */
    private AlunoCtrl ctrl;

    public GerarRelatorioAlunoPanel(AlunoCtrl ctrl) {
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

        buttonGroupTipoRelatorio = new javax.swing.ButtonGroup();
        buttonGroupTipoSituacaoAluno = new javax.swing.ButtonGroup();
        buttonGroupCategoriaPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelSituacao = new javax.swing.JLabel();
        labelErrTipoSituacaoAluno = new javax.swing.JLabel();
        buttonGerarRelatorioLivro = new javax.swing.JButton();
        radioButtonTipoSimplificado = new javax.swing.JRadioButton();
        radioButtonTipoCompleto = new javax.swing.JRadioButton();
        radioButtonSituacaoTodas = new javax.swing.JRadioButton();
        radioButtonSituacaoAtivos = new javax.swing.JRadioButton();
        radioButtonSituacaoInativos = new javax.swing.JRadioButton();
        labelTipoRelatorio = new javax.swing.JLabel();
        labelErrTipoRelatorioAluno = new javax.swing.JLabel();
        labelSituacao1 = new javax.swing.JLabel();
        radioButtonCategoriaTodas = new javax.swing.JRadioButton();
        radioButtonCategoriaAlunos = new javax.swing.JRadioButton();
        radioButtonCategoriaComunidade = new javax.swing.JRadioButton();
        radioButtonCategoriaProfessores = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerar Relatório de Pessoas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        labelSituacao.setText("Selecione o tipo de situação da Pessoa:");

        labelErrTipoSituacaoAluno.setForeground(new java.awt.Color(255, 0, 0));

        buttonGerarRelatorioLivro.setText("Gerar Relatório");
        buttonGerarRelatorioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarRelatorioLivroActionPerformed(evt);
            }
        });

        buttonGroupTipoRelatorio.add(radioButtonTipoSimplificado);
        radioButtonTipoSimplificado.setText("Simplificado");

        buttonGroupTipoRelatorio.add(radioButtonTipoCompleto);
        radioButtonTipoCompleto.setText("Completo");

        buttonGroupTipoSituacaoAluno.add(radioButtonSituacaoTodas);
        radioButtonSituacaoTodas.setText("Todas as situações (Ativo e Inativo)");

        buttonGroupTipoSituacaoAluno.add(radioButtonSituacaoAtivos);
        radioButtonSituacaoAtivos.setText("Ativos");

        buttonGroupTipoSituacaoAluno.add(radioButtonSituacaoInativos);
        radioButtonSituacaoInativos.setText("Inativos");

        labelTipoRelatorio.setText("Selecione o tipo de relatório:");

        labelErrTipoRelatorioAluno.setForeground(new java.awt.Color(255, 0, 0));

        labelSituacao1.setText("Selecione a categoria de Pessoa a ser pesquisada:");

        buttonGroupCategoriaPessoa.add(radioButtonCategoriaTodas);
        radioButtonCategoriaTodas.setText("Todas as categorias (Aluno, Professor e Comunidade)");
        radioButtonCategoriaTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCategoriaTodasActionPerformed(evt);
            }
        });

        buttonGroupCategoriaPessoa.add(radioButtonCategoriaAlunos);
        radioButtonCategoriaAlunos.setText("Alunos");

        buttonGroupCategoriaPessoa.add(radioButtonCategoriaComunidade);
        radioButtonCategoriaComunidade.setText("Comunidade");

        buttonGroupCategoriaPessoa.add(radioButtonCategoriaProfessores);
        radioButtonCategoriaProfessores.setText("Professores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonGerarRelatorioLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSituacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrTipoSituacaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(labelErrTipoRelatorioAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonTipoSimplificado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonTipoCompleto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonSituacaoTodas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoAtivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoInativos))
                            .addComponent(labelSituacao1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonCategoriaTodas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonCategoriaAlunos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonCategoriaComunidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonCategoriaProfessores)))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoRelatorio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelErrTipoRelatorioAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTipoRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTipoSimplificado)
                    .addComponent(radioButtonTipoCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelErrTipoSituacaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonSituacaoTodas)
                    .addComponent(radioButtonSituacaoAtivos)
                    .addComponent(radioButtonSituacaoInativos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSituacao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonCategoriaTodas)
                    .addComponent(radioButtonCategoriaAlunos)
                    .addComponent(radioButtonCategoriaComunidade)
                    .addComponent(radioButtonCategoriaProfessores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGerarRelatorioLivro)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonCategoriaTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCategoriaTodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCategoriaTodasActionPerformed

    private void buttonGerarRelatorioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarRelatorioLivroActionPerformed
        if (validacao()) {
            Boolean b = gerarCondicao();
            String categoria = gerarCategoriaPessoa();
            List<Aluno> listaAlunos = ctrl.pesquisarRelatorioAluno(b, categoria);

            gerarPDF(listaAlunos);

        }
    }//GEN-LAST:event_buttonGerarRelatorioLivroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerarRelatorioLivro;
    private javax.swing.ButtonGroup buttonGroupCategoriaPessoa;
    private javax.swing.ButtonGroup buttonGroupTipoRelatorio;
    private javax.swing.ButtonGroup buttonGroupTipoSituacaoAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrTipoRelatorioAluno;
    private javax.swing.JLabel labelErrTipoSituacaoAluno;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelSituacao1;
    private javax.swing.JLabel labelTipoRelatorio;
    private javax.swing.JRadioButton radioButtonCategoriaAlunos;
    private javax.swing.JRadioButton radioButtonCategoriaComunidade;
    private javax.swing.JRadioButton radioButtonCategoriaProfessores;
    private javax.swing.JRadioButton radioButtonCategoriaTodas;
    private javax.swing.JRadioButton radioButtonSituacaoAtivos;
    private javax.swing.JRadioButton radioButtonSituacaoInativos;
    private javax.swing.JRadioButton radioButtonSituacaoTodas;
    private javax.swing.JRadioButton radioButtonTipoCompleto;
    private javax.swing.JRadioButton radioButtonTipoSimplificado;
    // End of variables declaration//GEN-END:variables

    private boolean validacao() {
        boolean valido = true;
        if ((radioButtonSituacaoAtivos.isSelected() == false)
                && (radioButtonSituacaoInativos.isSelected() == false)
                && (radioButtonSituacaoTodas.isSelected() == false)) {
            valido = false;
            labelErrTipoSituacaoAluno.setText("* Tipo de relatório obrigatório.");
        }
        if ((radioButtonTipoCompleto.isSelected() == false)
                && (radioButtonTipoSimplificado.isSelected() == false)) {
            valido = false;
            labelErrTipoSituacaoAluno.setText("* Tipo de situação obrigatório.");
        }

        return valido;
    }

    private Boolean gerarCondicao() {
        Boolean condicao = null;

        if (radioButtonSituacaoAtivos.isSelected()) {
            condicao = true;
        }
        if (radioButtonSituacaoInativos.isSelected()) {
            condicao = false;
        }
        if (radioButtonSituacaoTodas.isSelected()) {
            // faz nada já que será o *
        }

        return condicao;
    }

    private void gerarPDF(List<Aluno> listaAlunos) {
        Document document = new Document();
        String dataHora = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
        String nomeArquivo = "Relatório de Pessoas_" + dataHora + ".pdf";
        JFileChooser jfc = new JFileChooser();
        jfc.setSelectedFile(new File(nomeArquivo));
        int esc = jfc.showSaveDialog(this);
        File arquivo = null;
        Phrase phrase;
        Paragraph paragraph;
        if (esc == JFileChooser.APPROVE_OPTION) {
            arquivo = jfc.getSelectedFile();
        } else {
            return;
        }

        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            MyFooter event = new MyFooter();
            PdfWriter.getInstance(document, new FileOutputStream(arquivo)).setPageEvent(event);
            document.open();

            PdfPTable cabecalho = criarTabelaCabecalho(document);
            document.add(cabecalho);

            // Criando relatório simplicado, caso contrário, será criado o relatório completo.
            if (radioButtonTipoSimplificado.isSelected()) {
                PdfPTable tabelaSimplificada = criarTabelaSimplificada(listaAlunos);
                document.add(tabelaSimplificada);
            } else {
                PdfPTable tabelaCompleta = criarTabelaCompleta(listaAlunos);
                document.add(tabelaCompleta);
            }

            if (listaAlunos.size() == 0) {
                Font fontSemResultado = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
                phrase = new Phrase("\r\nA consulta não retornou nenhum resultado!!!", fontSemResultado);
                paragraph = new Paragraph();
                paragraph.add(phrase);
                paragraph.setAlignment(Element.ALIGN_CENTER);
                document.add(paragraph);
            }

            JOptionPane.showMessageDialog(this, "Relatório de Pessoas emitido com sucesso!");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(GerarRelatorioAlunoPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        try {
            Desktop.getDesktop().open(arquivo);
        } catch (IOException ex) {
            Logger.getLogger(GerarRelatorioAlunoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private PdfPTable criarTabelaSimplificada(List<Aluno> listaAlunos) throws DocumentException {
        PdfPTable table = new PdfPTable(5);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        table.setWidths(new float[]{5, 20, 35, 25, 15});
        PdfPCell cell;

        Boolean b = gerarCondicao();

        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font font2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

        if (b == null) {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Ativas e Inativos", font));
            cell.setPaddingBottom(10.f);
        } else if (b == true) {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Ativas", font));
            cell.setPaddingBottom(10.f);
        } else {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Inativas", font));
            cell.setPaddingBottom(10.f);
        }
        cell.setColspan(5);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("#", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Matrícula", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nome", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("CPF", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Situação", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);

        int quantidade = 1;

        for (Aluno a : listaAlunos) {
            PdfPCell cellAux;
            cellAux = new PdfPCell(new Phrase(quantidade + "", font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cellAux = new PdfPCell(new Phrase(a.getMatricula(), font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cellAux = new PdfPCell(new Phrase(a.getNome(), font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cellAux = new PdfPCell(new Phrase(a.getCpf(), font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            if (a.getSituacao() == true) {
                cellAux = new PdfPCell(new Phrase("Ativo", font2));
            } else {
                cellAux = new PdfPCell(new Phrase("Inativo", font2));
            }

            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);

            quantidade += 1;
        }
        return table;
    }

    private PdfPTable criarTabelaCompleta(List<Aluno> listaAlunos) throws DocumentException {
        PdfPTable table = new PdfPTable(7);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        table.setWidths(new float[]{5, 16, 23, 17, 14, 14, 10});
        PdfPCell cell;

        Boolean b = gerarCondicao();

        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font font2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

        if (b == null) {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Ativas e Inativos", font));
        } else if (b == true) {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Ativas", font));
        } else {
            cell = new PdfPCell(new Phrase("Relatório de Pessoas Inativas", font));
        }
        cell.setColspan(7);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("#", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Matrícula", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nome", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("CPF", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Categoria", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nascimento", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Situação", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);

        int quantidade = 1;
        for (Aluno a : listaAlunos) {
            PdfPCell cellAux;
            cellAux = new PdfPCell(new Phrase(quantidade + "", font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cellAux = new PdfPCell(new Phrase(a.getMatricula(), font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cellAux = new PdfPCell(new Phrase(a.getNome(), font2));
            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);
            cell = new PdfPCell(new Phrase(a.getCpf(), font2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPaddingBottom(10.f);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(a.getCategoria(), font2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPaddingBottom(10.f);
            table.addCell(cell);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formato.format(a.getDataNascimento());
            cell = new PdfPCell(new Phrase(dataFormatada, font2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPaddingBottom(10.f);
            table.addCell(cell);
            if (a.getSituacao() == true) {
                cellAux = new PdfPCell(new Phrase("Ativo", font2));
            } else {
                cellAux = new PdfPCell(new Phrase("Inativo", font2));
            }

            cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cellAux);

            quantidade += 1;
        }
        return table;
    }

    private PdfPTable criarTabelaCabecalho(Document document) {
        PdfPTable table = new PdfPTable(2);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        try {
            table.setWidths(new float[]{40, 60});
        } catch (DocumentException ex) {
            Logger.getLogger(GerarRelatorioAlunoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        PdfPCell cellTitulo;
        PdfPCell cell1;
        PdfPCell cell2;
        Paragraph paragraph;
        Image image;
        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);

        try {
            image = Image.getInstance(getClass().getClassLoader().getResource("imagens/cabure_logo_gs.png"));
            image.setAlignment(Element.ALIGN_CENTER);
            cellTitulo = new PdfPCell(
                    new Phrase("Sistema de Gerenciamento de Biblioteca - Caburé",
                            new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD))
            );
            cellTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTitulo.setBorder(0);
            cellTitulo.setColspan(2);
            cellTitulo.setPaddingBottom(20f);
            table.addCell(cellTitulo);
            cell1 = new PdfPCell(image);
            cell1.setBorder(0);
            cell1.setPaddingLeft(20f);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell1);
            Paragraph p = new Paragraph();

            JsonReader jr = new JsonReader(new FileReader("cabecalho_relatorio.json"));
            JsonElement je = new JsonParser().parse(jr);
            JsonObject jo = je.getAsJsonObject();
            JsonArray ja = jo.get("frases").getAsJsonArray();
            JsonObject frases = ja.get(0).getAsJsonObject();
            for (int i = 0; i < frases.size(); i++) {
                p.add(new Phrase(frases.get("" + i).toString().replaceAll("\"", "") + "\r\n"));
            }

//            p.add(new Phrase("Governo do Estado do Rio Grande do Norte"));
//            p.add(new Phrase("\r\nEscola Estadual Joaquim José de Medeiros"));
//            p.add(new Phrase("\r\nEndereço: Praça Dr. Silvio Bezerra de Melo"));
//            p.add(new Phrase("\r\nCidade: Cruzeta-RN"));
//            p.add(new Phrase("\r\nCEP: 59375-000"));
//            p.add(new Phrase("\r\nTelefone: (84) 3473-2210"));
            cell2 = new PdfPCell(p);
            cell2.setPaddingRight(80f);
            cell2.setBorder(0);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell2);
            table.setSpacingAfter(40f);
            table.setSpacingBefore(10f);
        } catch (IOException | BadElementException ex) {
            Logger.getLogger(GerarRelatorioAlunoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return table;
    }

    private String gerarCategoriaPessoa() {
        if (radioButtonCategoriaAlunos.isSelected()) {
            return "Aluno";
        } else if (radioButtonCategoriaComunidade.isSelected()) {
            return "Comunidade";
        } else if (radioButtonCategoriaProfessores.isSelected()) {
            return "Professor";
        }
        return "Todos";
    }

    class MyFooter extends PdfPageEventHelper {

        Font ffont = new Font(Font.FontFamily.UNDEFINED, 10, Font.ITALIC);

        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
   //         Phrase header = new Phrase("this is a header", ffont);
            Paragraph paragraph = new Paragraph();
            Phrase footer = new Phrase("Sistema desenvolvido por RJ Soluções em Softwares - Tel: (84) 9  9701-7409 - Email: rjsolucoesdesoftware@gmail.com",ffont);
            paragraph.add(footer);
   //         ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
   //                 header,
   //                 (document.right() - document.left()) / 2 + document.leftMargin(),
   //                 document.top() + 10, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    paragraph,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.bottom() - 10, 0);
        }
    }
}
