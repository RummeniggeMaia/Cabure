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
import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.modelo.Emprestimo;
import com.rjsoft.cabure.modelo.Livro;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAEDSON
 */
public class GerarRelatorioLivroPanel extends javax.swing.JPanel {

    /**
     * Creates new form GerarRelatorioLivroPanel
     */
    LivroCtrl ctrlLivro;
    EmprestimoCtrl ctrlEmprestimo;

    public GerarRelatorioLivroPanel() {
        initComponents();
    }

    public GerarRelatorioLivroPanel(LivroCtrl ctrlLivro, EmprestimoCtrl ctrlEmprestimo) {
        this.ctrlLivro = ctrlLivro;
        this.ctrlEmprestimo = ctrlEmprestimo;
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

        buttonGroupTipoRelatorioLivro = new javax.swing.ButtonGroup();
        buttonGroupSituacaoLivros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTipoRelatorio = new javax.swing.JLabel();
        radioButtonTipoSimplificado = new javax.swing.JRadioButton();
        radioButtonTipoCompleto = new javax.swing.JRadioButton();
        labelErrTipoRelatorioLivros = new javax.swing.JLabel();
        labelSituacaoLivro = new javax.swing.JLabel();
        labelErrTipoSituacaoLivros = new javax.swing.JLabel();
        radioButtonSituacaoTodas = new javax.swing.JRadioButton();
        radioButtonSituacaoEmprestado = new javax.swing.JRadioButton();
        radioButtonSituacaoNaoEmprestado = new javax.swing.JRadioButton();
        buttonGerarRelatorioAluno = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerar Relatório de Livros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        labelTipoRelatorio.setText("Selecione o tipo de relatório:");

        buttonGroupTipoRelatorioLivro.add(radioButtonTipoSimplificado);
        radioButtonTipoSimplificado.setText("Simplificado");

        buttonGroupTipoRelatorioLivro.add(radioButtonTipoCompleto);
        radioButtonTipoCompleto.setText("Completo");

        labelErrTipoRelatorioLivros.setForeground(new java.awt.Color(255, 0, 0));

        labelSituacaoLivro.setText("Selecione o tipo de situação que o Livro se encontra:");

        labelErrTipoSituacaoLivros.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroupSituacaoLivros.add(radioButtonSituacaoTodas);
        radioButtonSituacaoTodas.setText("Todas as situações (Emprestado e Não Emprestado)");

        buttonGroupSituacaoLivros.add(radioButtonSituacaoEmprestado);
        radioButtonSituacaoEmprestado.setText("Emprestado");

        buttonGroupSituacaoLivros.add(radioButtonSituacaoNaoEmprestado);
        radioButtonSituacaoNaoEmprestado.setText("Não Emprestado");

        buttonGerarRelatorioAluno.setText("Gerar Relatório");
        buttonGerarRelatorioAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarRelatorioAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrTipoRelatorioLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioButtonTipoSimplificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonTipoCompleto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSituacaoLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrTipoSituacaoLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioButtonSituacaoTodas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonSituacaoEmprestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonSituacaoNaoEmprestado)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGerarRelatorioAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTipoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrTipoRelatorioLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTipoSimplificado)
                    .addComponent(radioButtonTipoCompleto))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelErrTipoSituacaoLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSituacaoLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonSituacaoTodas)
                    .addComponent(radioButtonSituacaoEmprestado)
                    .addComponent(radioButtonSituacaoNaoEmprestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGerarRelatorioAluno)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGerarRelatorioAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarRelatorioAlunoActionPerformed
        if (validacao()) {
            Boolean b = gerarCondicao();

            List<Livro> listaLivros = ctrlLivro.pesquisarRelatorioLivro(b);
            List<Emprestimo> listaEmprestimos = ctrlEmprestimo.pesquisarEmprestimos();

            gerarPDF(listaLivros, listaEmprestimos);

        }
    }//GEN-LAST:event_buttonGerarRelatorioAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerarRelatorioAluno;
    private javax.swing.ButtonGroup buttonGroupSituacaoLivros;
    private javax.swing.ButtonGroup buttonGroupTipoRelatorioLivro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrTipoRelatorioLivros;
    private javax.swing.JLabel labelErrTipoSituacaoLivros;
    private javax.swing.JLabel labelSituacaoLivro;
    private javax.swing.JLabel labelTipoRelatorio;
    private javax.swing.JRadioButton radioButtonSituacaoEmprestado;
    private javax.swing.JRadioButton radioButtonSituacaoNaoEmprestado;
    private javax.swing.JRadioButton radioButtonSituacaoTodas;
    private javax.swing.JRadioButton radioButtonTipoCompleto;
    private javax.swing.JRadioButton radioButtonTipoSimplificado;
    // End of variables declaration//GEN-END:variables

    private boolean validacao() {
        boolean valido = true;
        if ((radioButtonTipoCompleto.isSelected() == false)
                && (radioButtonTipoSimplificado.isSelected() == false)) {
            valido = false;
            labelErrTipoRelatorioLivros.setText("* Tipo de relatório obrigatório.");
        }
        if ((radioButtonSituacaoTodas.isSelected() == false)
                && (radioButtonSituacaoEmprestado.isSelected() == false)
                && (radioButtonSituacaoNaoEmprestado.isSelected() == false)) {
            valido = false;
            labelErrTipoSituacaoLivros.setText("* Tipo de situação obrigatório.");
        }

        return valido;
    }

    private Boolean gerarCondicao() {
        Boolean condicao = null;

        if (radioButtonSituacaoEmprestado.isSelected()) {
            condicao = true;
        }
        if (radioButtonSituacaoNaoEmprestado.isSelected()) {
            condicao = false;
        }
        if (radioButtonSituacaoTodas.isSelected()) {
            // faz nada já que será o *
        }

        return condicao;
    }

    private void gerarPDF(List<Livro> listaLivros, List<Emprestimo> listaEmprestimos) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("Relatório de Livros.pdf"));

            document.open();

            PdfPTable cabecalho = criarTabelaCabecalho(document);
            document.add(cabecalho);

            // Criando relatório simplicado, caso contrário, será criado o relatório completo.
            if (radioButtonTipoSimplificado.isSelected()) {
                PdfPTable tabelaSimplificada = criarTabelaSimplificada(listaLivros, listaEmprestimos);
                document.add(tabelaSimplificada);
            } else {
                PdfPTable tabelaCompleta = criarTabelaCompleta(listaLivros, listaEmprestimos);
                document.add(tabelaCompleta);
            }

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(GerarRelatorioLivroPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }

        try {
            Desktop.getDesktop().open(new File("Relatório de Livros.pdf"));
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

    private PdfPTable criarTabelaSimplificada(List<Livro> listaLivros, List<Emprestimo> listaEmprestimos) throws DocumentException {
        PdfPTable table = new PdfPTable(5);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        table.setWidths(new float[]{5, 35, 25, 18, 17});
        PdfPCell cell;

        Boolean b = gerarCondicao();

        Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

        if (b == null) {
            cell = new PdfPCell(new Phrase("Relatório de Livros Emprestados e Não Emprestados", font));
            cell.setPaddingBottom(10.f);
        } else if (b == true) {
            cell = new PdfPCell(new Phrase("Relatório de Livros Emprestados", font));
            cell.setPaddingBottom(10.f);
        } else {
            cell = new PdfPCell(new Phrase("Relatório de Livros Não Emprestados", font));
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
        cell = new PdfPCell(new Phrase("Título do Livro", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Autor do Livro", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Quantidade\r\nem\r\nEstante", font));
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Quantidade\r\nem\r\nEmpréstimo", font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPaddingBottom(10.f);
        table.addCell(cell);

        Map<Integer, Integer> array = new HashMap<Integer, Integer>();

        for (int i = 0; i < listaEmprestimos.size(); i++) {
            if (!array.containsKey(listaEmprestimos.get(i).getLivro().getID())) {
                array.put(listaEmprestimos.get(i).getLivro().getID(), listaEmprestimos.get(i).getQuantidade());
            } else {
                int qtd = (int) array.get(listaEmprestimos.get(i).getLivro().getID());
                array.put(listaEmprestimos.get(i).getLivro().getID(), qtd + listaEmprestimos.get(i).getQuantidade());
            }
        }
        int numeracao = 1;
        if (gerarCondicao() == null) {

            for (Livro l : listaLivros) {
                PdfPCell cellAux;
                cellAux = new PdfPCell(new Phrase(numeracao + "", font));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                table.addCell(l.getTitulo());
                table.addCell(l.getPrimeiroAutor());
                cellAux = new PdfPCell(new Phrase(l.getQntEstante() + ""));
                cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(cellAux);
                if (array.containsKey(l.getID())) {
                    int quantidade = (int) array.get(l.getID());
                    cellAux = new PdfPCell(new Phrase(quantidade + ""));
                    cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table.addCell(cellAux);
                } else {
                    cellAux = new PdfPCell(new Phrase(0 + ""));
                    cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table.addCell(cellAux);
                }
                numeracao += 1;
            }

        } else if (gerarCondicao() == true) {

            for (Livro l : listaLivros) {
                if (array.containsKey(l.getID())) {
                    PdfPCell cellAux;
                    cellAux = new PdfPCell(new Phrase(numeracao + "", font));
                    cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table.addCell(cellAux);
                    table.addCell(l.getTitulo());
                    table.addCell(l.getPrimeiroAutor());
                    cellAux = new PdfPCell(new Phrase(l.getQntEstante() + ""));
                    cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table.addCell(cellAux);
                    int quantidade = (int) array.get(l.getID());
                    cellAux = new PdfPCell(new Phrase(quantidade + ""));
                    cellAux.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellAux.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table.addCell(cellAux);
                }
            }

        } else {

            for (Livro l : listaLivros) {
                if (!array.containsKey(l.getID())) {
                    table.addCell(l.getTitulo());
                    table.addCell(l.getPrimeiroAutor());
                    table.addCell(l.getQntEstante() + "");
                    table.addCell(l.getQntEstante() - l.getQntEstante() + "");
                }
            }

        }

        return table;
    }

    private PdfPTable criarTabelaCompleta(List<Livro> listaAlunos, List<Emprestimo> listaEmprestimos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
