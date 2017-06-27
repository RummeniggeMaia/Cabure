/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

/**
 *
 * @author JAEDSON
 */
public class GerarRelatorioEmprestimoPanel extends javax.swing.JPanel {

    /**
     * Creates new form GerarRelatorioEmprestimoPanel
     */
    public GerarRelatorioEmprestimoPanel() {
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

        buttonGroupTipoRelatorioEmprestimo = new javax.swing.ButtonGroup();
        buttonGroupSituacaoEmprestimos = new javax.swing.ButtonGroup();
        radioButtonSituacaoEmprestimoAtrasado = new javax.swing.JRadioButton();
        radioButtonSituacaoEmprestimoEmDia = new javax.swing.JRadioButton();
        labelSituacaoEmprestimos = new javax.swing.JLabel();
        labelErrTipoRelatorioEmprestimo = new javax.swing.JLabel();
        labelErrTipoSituacao = new javax.swing.JLabel();
        buttonGerarRelatorioEmprestimo = new javax.swing.JButton();
        labelRelatorioEmprestimos = new javax.swing.JLabel();
        labelTipoRelatorio = new javax.swing.JLabel();
        radioButtonTipoSimplificado = new javax.swing.JRadioButton();
        radioButtonTipoCompleto = new javax.swing.JRadioButton();
        radioButtonSituacaoTodosEmprestimos = new javax.swing.JRadioButton();
        labelTipoRelatorioDataInicialEmprestimos = new javax.swing.JLabel();
        dataInicialEmprestimos = new javax.swing.JFormattedTextField();
        labelTipoRelatorioDataFinalEmprestimos = new javax.swing.JLabel();
        dataFinalEmprestimos = new javax.swing.JFormattedTextField();
        labelErrDataInicialEmprestimo = new javax.swing.JLabel();
        labelErrDataFinalEmprestimo = new javax.swing.JLabel();
        labelErrTipoSituacaoEmprestimo = new javax.swing.JLabel();

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonSituacaoEmprestimoAtrasado);
        radioButtonSituacaoEmprestimoAtrasado.setText("Empréstimos em atraso");

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonSituacaoEmprestimoEmDia);
        radioButtonSituacaoEmprestimoEmDia.setText("Empréstimo em dia");

        labelSituacaoEmprestimos.setText("Selecione o tipo da situação do empréstimo:");

        labelErrTipoRelatorioEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        buttonGerarRelatorioEmprestimo.setText("Gerar Relatório");
        buttonGerarRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarRelatorioEmprestimoActionPerformed(evt);
            }
        });

        labelRelatorioEmprestimos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelRelatorioEmprestimos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRelatorioEmprestimos.setText("Relatório de Empréstimos");
        labelRelatorioEmprestimos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelTipoRelatorio.setText("Selecione o tipo de relatório:");

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonTipoSimplificado);
        radioButtonTipoSimplificado.setText("Simplificado");

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonTipoCompleto);
        radioButtonTipoCompleto.setText("Completo");

        buttonGroupTipoRelatorioEmprestimo.add(radioButtonSituacaoTodosEmprestimos);
        radioButtonSituacaoTodosEmprestimos.setText("Todos os empréstimos");

        labelTipoRelatorioDataInicialEmprestimos.setText("Selecione a data inicial dos empréstimos:");

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

        labelErrDataInicialEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        labelErrDataFinalEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        labelErrTipoSituacaoEmprestimo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRelatorioEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTipoRelatorioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonTipoSimplificado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonTipoCompleto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorioDataInicialEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrDataInicialEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTipoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSituacaoEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTipoSituacaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTipoRelatorioDataFinalEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrDataFinalEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonGerarRelatorioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonSituacaoTodosEmprestimos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoEmprestimoAtrasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonSituacaoEmprestimoEmDia))
                            .addComponent(dataInicialEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataFinalEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRelatorioEmprestimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoRelatorio)
                    .addComponent(labelErrTipoRelatorioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTipoSimplificado)
                    .addComponent(radioButtonTipoCompleto))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(labelErrTipoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoRelatorioDataInicialEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelErrDataInicialEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataInicialEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoRelatorioDataFinalEmprestimos)
                    .addComponent(labelErrDataFinalEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataFinalEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSituacaoEmprestimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonSituacaoTodosEmprestimos)
                            .addComponent(radioButtonSituacaoEmprestimoAtrasado)
                            .addComponent(radioButtonSituacaoEmprestimoEmDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonGerarRelatorioEmprestimo))
                    .addComponent(labelErrTipoSituacaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGerarRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarRelatorioEmprestimoActionPerformed
//        if (validacao()){
//            List<Aluno> listaAlunos = ctrl.pesquisarRelatorioAluno(gerarCondicao());
//
//        }
    }//GEN-LAST:event_buttonGerarRelatorioEmprestimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerarRelatorioEmprestimo;
    private javax.swing.ButtonGroup buttonGroupSituacaoEmprestimos;
    private javax.swing.ButtonGroup buttonGroupTipoRelatorioEmprestimo;
    private javax.swing.JFormattedTextField dataFinalEmprestimos;
    private javax.swing.JFormattedTextField dataInicialEmprestimos;
    private javax.swing.JLabel labelErrDataFinalEmprestimo;
    private javax.swing.JLabel labelErrDataInicialEmprestimo;
    private javax.swing.JLabel labelErrTipoRelatorioEmprestimo;
    private javax.swing.JLabel labelErrTipoSituacao;
    private javax.swing.JLabel labelErrTipoSituacaoEmprestimo;
    private javax.swing.JLabel labelRelatorioEmprestimos;
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
}
