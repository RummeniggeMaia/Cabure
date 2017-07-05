/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.modelo.Emprestimo;
import com.rjsoft.cabure.modelo.Livro;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAEDSON
 */
public class GerarRelatorioEmprestimoPanel extends javax.swing.JPanel {

    /**
     * Creates new form GerarRelatorioEmprestimoPanel
     */
    EmprestimoCtrl ctrlEmprestimo;
    LivroCtrl ctrlLivro;
    AlunoCtrl ctrlAluno;

    public GerarRelatorioEmprestimoPanel() {
        initComponents();
    }

    public GerarRelatorioEmprestimoPanel(EmprestimoCtrl emprestimoCtrl, LivroCtrl ctrlLivro, AlunoCtrl ctrlAluno) {
        this.ctrlEmprestimo = emprestimoCtrl;
        this.ctrlLivro = ctrlLivro;
        this.ctrlAluno = ctrlAluno;
        initComponents();
    }

    private boolean validacao() {
        boolean valido = true;
        if ((radioButtonTipoCompleto.isSelected() == false)
                && (radioButtonTipoSimplificado.isSelected() == false)) {
            valido = false;
            labelErrTipoRelatorioEmprestimos.setText("* Tipo de relatório obrigatório.");
        }
        if ((radioButtonSituacaoTodosEmprestimos.isSelected() == false)
                && (radioButtonSituacaoEmprestimoAtrasado.isSelected() == false)
                && (radioButtonSituacaoEmprestimoEmDia.isSelected() == false)) {
            valido = false;
            labelErrTipoSituacaoEmprestimo.setText("* Tipo de situação obrigatório.");
        }

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataInicial = formato.parse(dataInicialEmprestimos.getText());
            Date dataFinal = formato.parse(dataFinalEmprestimos.getText());

        } catch (ParseException ex) {
            Logger.getLogger(GerarRelatorioEmprestimoPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return valido;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoRelatorioEmprestimo = new javax.swing.ButtonGroup();
        buttonGroupSituacaoEmprestimos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTipoRelatorio = new javax.swing.JLabel();
        labelErrTipoRelatorioEmprestimos = new javax.swing.JLabel();
        radioButtonTipoSimplificado = new javax.swing.JRadioButton();
        radioButtonTipoCompleto = new javax.swing.JRadioButton();
        labelTipoRelatorioDataInicialEmprestimos = new javax.swing.JLabel();
        labelErrDataInicialEmprestimo = new javax.swing.JLabel();
        dataInicialEmprestimos = new javax.swing.JFormattedTextField();
        labelTipoRelatorioDataFinalEmprestimos = new javax.swing.JLabel();
        dataFinalEmprestimos = new javax.swing.JFormattedTextField();
        labelSituacaoEmprestimos = new javax.swing.JLabel();
        labelErrTipoSituacaoEmprestimo = new javax.swing.JLabel();
        radioButtonSituacaoTodosEmprestimos = new javax.swing.JRadioButton();
        radioButtonSituacaoEmprestimoAtrasado = new javax.swing.JRadioButton();
        radioButtonSituacaoEmprestimoEmDia = new javax.swing.JRadioButton();
        buttonGerarRelatorioEmprestimo = new javax.swing.JButton();
        labelErrDataFinalEmprestimo = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerar Relatório de Empréstimos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        labelTipoRelatorio.setText("Selecione o tipo de relatório:");

        labelErrTipoRelatorioEmprestimos.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonTipoSimplificado);
        radioButtonTipoSimplificado.setText("Simplificado");

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonTipoCompleto);
        radioButtonTipoCompleto.setText("Completo");

        labelTipoRelatorioDataInicialEmprestimos.setText("Selecione a data inicial dos empréstimos:");

        labelErrDataInicialEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        try {
            dataInicialEmprestimos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTipoRelatorioDataFinalEmprestimos.setText("Selecione a data inicial dos empréstimos:");

        try {
            dataFinalEmprestimos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelSituacaoEmprestimos.setText("Selecione o tipo da situação do empréstimo:");

        labelErrTipoSituacaoEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroupSituacaoEmprestimos.add(radioButtonSituacaoTodosEmprestimos);
        radioButtonSituacaoTodosEmprestimos.setText("Todos os empréstimos");

        buttonGroupSituacaoEmprestimos.add(radioButtonSituacaoEmprestimoAtrasado);
        radioButtonSituacaoEmprestimoAtrasado.setText("Empréstimos em atraso");

        buttonGroupSituacaoEmprestimos.add(radioButtonSituacaoEmprestimoEmDia);
        radioButtonSituacaoEmprestimoEmDia.setText("Empréstimo em dia");

        buttonGerarRelatorioEmprestimo.setText("Gerar Relatório");
        buttonGerarRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarRelatorioEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonTipoSimplificado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonTipoCompleto))
                            .addComponent(dataInicialEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataFinalEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSituacaoEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTipoSituacaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonSituacaoTodosEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoEmprestimoAtrasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoEmprestimoEmDia)))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorioDataFinalEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrDataFinalEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorioDataInicialEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrDataInicialEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTipoRelatorioEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGerarRelatorioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoRelatorio)
                    .addComponent(labelErrTipoRelatorioEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTipoSimplificado)
                    .addComponent(radioButtonTipoCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelErrDataInicialEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTipoRelatorioDataInicialEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataInicialEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoRelatorioDataFinalEmprestimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFinalEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSituacaoEmprestimos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelErrDataFinalEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelErrTipoSituacaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonSituacaoTodosEmprestimos)
                    .addComponent(radioButtonSituacaoEmprestimoAtrasado)
                    .addComponent(radioButtonSituacaoEmprestimoEmDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGerarRelatorioEmprestimo)
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

    private void buttonGerarRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarRelatorioEmprestimoActionPerformed
        if (validacao()) {
            Boolean b = gerarCondicao();

            List<Emprestimo> listaEmprestimos = ctrlEmprestimo.pesquisarEmprestimos();
            List<Emprestimo> listaEmprestimosAtrasados = ctrlEmprestimo.pesquisarAtrasados();

            gerarPDF(listaEmprestimos, listaEmprestimosAtrasados);

        }
    }//GEN-LAST:event_buttonGerarRelatorioEmprestimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerarRelatorioEmprestimo;
    private javax.swing.ButtonGroup buttonGroupSituacaoEmprestimos;
    private javax.swing.ButtonGroup buttonGroupTipoRelatorioEmprestimo;
    private javax.swing.JFormattedTextField dataFinalEmprestimos;
    private javax.swing.JFormattedTextField dataInicialEmprestimos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrDataFinalEmprestimo;
    private javax.swing.JLabel labelErrDataInicialEmprestimo;
    private javax.swing.JLabel labelErrTipoRelatorioEmprestimos;
    private javax.swing.JLabel labelErrTipoSituacaoEmprestimo;
    private javax.swing.JLabel labelSituacaoEmprestimos;
    private javax.swing.JLabel labelTipoRelatorio;
    private javax.swing.JLabel labelTipoRelatorioDataFinalEmprestimos;
    private javax.swing.JLabel labelTipoRelatorioDataInicialEmprestimos;
    private javax.swing.JRadioButton radioButtonSituacaoEmprestimoAtrasado;
    private javax.swing.JRadioButton radioButtonSituacaoEmprestimoEmDia;
    private javax.swing.JRadioButton radioButtonSituacaoTodosEmprestimos;
    private javax.swing.JRadioButton radioButtonTipoCompleto;
    private javax.swing.JRadioButton radioButtonTipoSimplificado;
    // End of variables declaration//GEN-END:variables

    private Boolean gerarCondicao() {

        Boolean condicao = null;

        if (radioButtonSituacaoEmprestimoEmDia.isSelected()) {
            condicao = true;
        }
        if (radioButtonSituacaoEmprestimoAtrasado.isSelected()) {
            condicao = false;
        }
        if (radioButtonSituacaoTodosEmprestimos.isSelected()) {
            // faz nada já que será o *
            condicao = null;
        }

        return condicao;
    }

    private void gerarPDF(List<Emprestimo> listaEmprestimos, List<Emprestimo> listaEmprestimosAtrasados) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Relatório de Emprestimos.pdf"));

            document.open();

            PdfPTable cabecalho = criarTabelaCabecalho(document);
            document.add(cabecalho);

            // Criando relatório simplicado, caso contrário, será criado o relatório completo.
            if (radioButtonTipoSimplificado.isSelected()) {
                PdfPTable tabelaSimplificada = criarTabelaSimplificada(listaEmprestimos, listaEmprestimosAtrasados);
                document.add(tabelaSimplificada);
            } else {
                PdfPTable tabelaCompleta = criarTabelaCompleta(listaEmprestimos, listaEmprestimosAtrasados);
                document.add(tabelaCompleta);
            }

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(GerarRelatorioLivroPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }

        try {
            Desktop.getDesktop().open(new File("Relatório de Emprestimos.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(GerarRelatorioLivroPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private PdfPTable criarTabelaCabecalho(Document document) {
        PdfPTable table = new PdfPTable(2);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        try {
            table.setWidths(new float[]{40, 60});
        } catch (DocumentException ex) {
            Logger.getLogger(GerarRelatorioLivroPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        PdfPCell cell1;
        PdfPCell cell2;
        Paragraph paragraph;
        Image image;
        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);

        try {
            image = Image.getInstance("imagens/cabure_logo.png");
            image.setAlignment(Element.ALIGN_CENTER);
            cell1 = new PdfPCell(image);
            cell1.setBorder(0);
            table.addCell(cell1);
            Paragraph p = new Paragraph();
            p.add(new Phrase("Governo do Estado do Rio Grande do Norte"));
            p.add(new Phrase("\r\nEscola Estadual Joaquim José de Medeiros"));
            p.add(new Phrase("\r\nEndereço: Praça Dr. Silvio Bezerra de Melo"));
            p.add(new Phrase("\r\nCidade: Cruzeta-RN"));
            p.add(new Phrase("\r\nCEP: 59375-000"));
            p.add(new Phrase("\r\nTelefone: (84) 3473-2210"));
            cell2 = new PdfPCell(p);
            cell2.setBorder(0);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell2);
            table.setSpacingAfter(40f);
            table.setSpacingBefore(10f);
        } catch (IOException | BadElementException ex) {
            Logger.getLogger(GerarRelatorioLivroPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return table;
    }

    private PdfPTable criarTabelaSimplificada(List<Emprestimo> listaEmprestimos, List<Emprestimo> listaEmprestimosAtrasados) throws DocumentException {
        PdfPTable table = new PdfPTable(5);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        table.setWidths(new float[]{5, 35, 25, 18, 17});
        PdfPCell cell;

        Boolean b = gerarCondicao();

        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font font2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

        if (b == null) {
            cell = new PdfPCell(new Phrase("Relatório de Todos os Empréstimos", font));
            cell.setPaddingBottom(10.f);
        } else if (b == true) {
            cell = new PdfPCell(new Phrase("Relatório de Todos os Empréstimos em Dia", font));
            cell.setPaddingBottom(10.f);
        } else {
            cell = new PdfPCell(new Phrase("Relatório de Todos os Empréstimos em Atraso", font));
            cell.setPaddingBottom(10.f);
        }
        cell.setColspan(5);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(10.f);

        List<Emprestimo> auxiliarEmDia = new ArrayList<Emprestimo>();
        for (int i = 0; i < listaEmprestimos.size(); i++) {
            Date dataFinal = listaEmprestimos.get(i).getPrazo();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dataAtual = null;
            try {
                String dataDeHoje = df.format(new Date());
                dataAtual = df.parse(dataDeHoje);
            } catch (ParseException ex) {
                Logger.getLogger(GerarRelatorioEmprestimoPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (dataAtual.after(dataFinal)) {
                auxiliarEmDia.add(listaEmprestimos.get(i));
            }
        }

        table.addCell(cell);
        cell = new PdfPCell(new Phrase("#", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Título do Livro", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nome do Aluno", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Data Empréstimo", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Prazo Entrega", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);

        int numeracao = 1;
        if (gerarCondicao() == null) {
            for (int i = 0; i < listaEmprestimos.size(); i++) {
                PdfPCell cellAux;
                cellAux = new PdfPCell(new Phrase(numeracao + "", font2));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                Livro livro = ctrlLivro.pesquisarPorId(listaEmprestimos.get(i).getLivro().getID());
                cellAux = new PdfPCell(new Phrase(livro.getTitulo(), font2));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                Aluno aluno = ctrlAluno.pesquisarPorId(listaEmprestimos.get(i).getAluno().getID());
                cellAux = new PdfPCell(new Phrase(aluno.getNome(), font2));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String dataEmprestimo = df.format(listaEmprestimos.get(i).getDataEmprestimo());
                cellAux = new PdfPCell(new Phrase(dataEmprestimo, font2));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                String dataPrazo = df.format(listaEmprestimos.get(i).getPrazo());
                cellAux = new PdfPCell(new Phrase(dataPrazo, font2));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);

                numeracao += 1;
            }
        }

        return table;
    }

    private PdfPTable criarTabelaCompleta(List<Emprestimo> listaEmprestimos, List<Emprestimo> listaEmprestimosAtrasados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
