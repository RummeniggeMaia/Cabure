package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.modelo.Emprestimo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrpmaia
 */
public class HomePanel extends javax.swing.JPanel {

    private EmprestimoCtrl realizadosCtrl;
    private EmprestimoCtrl atrasadosCtrl;
    private String[] colunasRealizados;
    private String[] colunasAtrasados;

    /**
     * Creates new form Home
     */
    public HomePanel(EmprestimoCtrl realizados, EmprestimoCtrl atrasados) {
        this.realizadosCtrl = realizados;
        this.atrasadosCtrl = atrasados;
        realizados.getPaginador().setLimit(25);
        atrasados.getPaginador().setLimit(25);
        
        colunasRealizados = new String[]{
            "Matrícula",
            "Nome",
            "Livro",
            "Quantidade",
            "Data de entrega",
            "Prazo"
        };
        colunasAtrasados = new String[]{
            "Matrícula",
            "Nome",
            "Livro",
            "Quantidade",
            "Data de entrega",
            "Dias em atraso"
        };
        initComponents();
    }

    private void carregarEmprestimosRealizados() {
        List<Emprestimo> lista = realizadosCtrl.pesquisarRealizados();
        Object[][] data = new Object[lista.size()][colunasRealizados.length];
        for (int i = 0; i < lista.size(); i++) {
            Emprestimo e = lista.get(i);
            data[i][0] = e.getAluno().getMatricula();
            data[i][1] = e.getAluno().getNome();
            data[i][2] = e.getLivro().getTitulo();
            data[i][3] = e.getQuantidade();
            data[i][4] = new SimpleDateFormat("dd/MM/yyyy").format(e.getDataEmprestimo());
            data[i][5] = new SimpleDateFormat("dd/MM/yyyy").format(e.getPrazo());
        }
        DefaultTableModel dtm = new DefaultTableModel(data, colunasRealizados) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaRealizados.setModel(dtm);
    }

    private void carregarEmprestimosAtrasados() {
        List<Emprestimo> lista = this.atrasadosCtrl.pesquisarAtrasados();
        Object[][] data = new Object[lista.size()][colunasAtrasados.length];
        for (int i = 0; i < lista.size(); i++) {
            Emprestimo e = lista.get(i);
            data[i][0] = e.getAluno().getMatricula();
            data[i][1] = e.getAluno().getNome();
            data[i][2] = e.getLivro().getTitulo();
            data[i][3] = e.getQuantidade();
            Date prazo = e.getPrazo();
            data[i][4] = new SimpleDateFormat("dd/MM/yyyy").format(prazo);
            long mils = new Date().getTime() - prazo.getTime();
            data[i][5] = mils / 1000 / 60 / 60 / 24;
        }
        DefaultTableModel dtm = new DefaultTableModel(data, colunasAtrasados) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaAtrasos.setModel(dtm);
    }

    public void pesquisarEA() {
        carregarEmprestimosAtrasados();
        verificarPaginacaoEA();
    }

    public void pesquisarER() {
        carregarEmprestimosRealizados();
        verificarPaginacaoER();
    }

    private void verificarPaginacaoEA() {
        botPagAnteriorEA.setEnabled(atrasadosCtrl.getPaginador().podeVoltar());
        botPagPrimeiraEA.setEnabled(atrasadosCtrl.getPaginador().podeVoltar());
        botPagProximaEA.setEnabled(atrasadosCtrl.getPaginador().podeSeguir());
        botPagUltimaEA.setEnabled(atrasadosCtrl.getPaginador().podeSeguir());
        comboLimiteEA.setSelectedItem(atrasadosCtrl.getPaginador().getLimit());
        labelTotalPaginasEA.setText(" de " + atrasadosCtrl.getPaginador().totalDePaginas());
        textFieldPaginaEA.setText("" + atrasadosCtrl.getPaginador().paginaAtual());
    }

    private void verificarPaginacaoER() {
        botPagAnteriorER.setEnabled(realizadosCtrl.getPaginador().podeVoltar());
        botPagPrimeiraER.setEnabled(realizadosCtrl.getPaginador().podeVoltar());
        botPagProximaER.setEnabled(realizadosCtrl.getPaginador().podeSeguir());
        botPagUltimaER.setEnabled(realizadosCtrl.getPaginador().podeSeguir());
        comboLimiteER.setSelectedItem(realizadosCtrl.getPaginador().getLimit());
        labelTotalPaginasER.setText(" de " + realizadosCtrl.getPaginador().totalDePaginas());
        textFieldPaginaER.setText("" + realizadosCtrl.getPaginador().paginaAtual());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRealizados = new javax.swing.JTable();
        comboLimiteER = new javax.swing.JComboBox<>();
        botPagPrimeiraER = new javax.swing.JButton();
        botPagAnteriorER = new javax.swing.JButton();
        textFieldPaginaER = new javax.swing.JFormattedTextField();
        labelTotalPaginasER = new javax.swing.JLabel();
        botPagProximaER = new javax.swing.JButton();
        botPagUltimaER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtrasos = new javax.swing.JTable();
        comboLimiteEA = new javax.swing.JComboBox<>();
        botPagPrimeiraEA = new javax.swing.JButton();
        botPagAnteriorEA = new javax.swing.JButton();
        textFieldPaginaEA = new javax.swing.JFormattedTextField();
        labelTotalPaginasEA = new javax.swing.JLabel();
        botPagProximaEA = new javax.swing.JButton();
        botPagUltimaEA = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de empréstimos realizados e atrasados");

        tabelaRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Livro", "Quantidade", "Dia do empréstimo", "Prazo"
            }
        ));
        jScrollPane2.setViewportView(tabelaRealizados);

        int[] limitesER = realizadosCtrl.getPaginador().getLimites();
        for (int i = 0; i < limitesER.length; i++) {
            comboLimiteER.addItem("" + limitesER[i]);
        }
        comboLimiteER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLimiteERActionPerformed(evt);
            }
        });

        botPagPrimeiraER.setText("|<");
        botPagPrimeiraER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagPrimeiraERActionPerformed(evt);
            }
        });

        botPagAnteriorER.setText("<<");
        botPagAnteriorER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagAnteriorERActionPerformed(evt);
            }
        });

        textFieldPaginaER.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        labelTotalPaginasER.setText("de 9999");

        botPagProximaER.setText(">>");
        botPagProximaER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagProximaERActionPerformed(evt);
            }
        });

        botPagUltimaER.setText(">|");
        botPagUltimaER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagUltimaERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(comboLimiteER, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagPrimeiraER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagAnteriorER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPaginaER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalPaginasER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagProximaER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagUltimaER)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botPagPrimeiraER)
                    .addComponent(botPagAnteriorER)
                    .addComponent(labelTotalPaginasER)
                    .addComponent(botPagProximaER)
                    .addComponent(botPagUltimaER)
                    .addComponent(comboLimiteER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPaginaER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Empréstimos realizados", jPanel2);

        tabelaAtrasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Livro", "Quantidade", "Data de entrega", "Dias em atraso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAtrasos.setToolTipText("");
        jScrollPane1.setViewportView(tabelaAtrasos);

        int[] limitesEA = atrasadosCtrl.getPaginador().getLimites();
        for (int i = 0; i < limitesEA.length; i++) {
            comboLimiteEA.addItem("" + limitesEA[i]);
        }
        comboLimiteEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLimiteEAActionPerformed(evt);
            }
        });

        botPagPrimeiraEA.setText("|<");
        botPagPrimeiraEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagPrimeiraEAActionPerformed(evt);
            }
        });

        botPagAnteriorEA.setText("<<");
        botPagAnteriorEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagAnteriorEAActionPerformed(evt);
            }
        });

        textFieldPaginaEA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        labelTotalPaginasEA.setText("de 9999");

        botPagProximaEA.setText(">>");
        botPagProximaEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagProximaEAActionPerformed(evt);
            }
        });

        botPagUltimaEA.setText(">|");
        botPagUltimaEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagUltimaEAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(comboLimiteEA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagPrimeiraEA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagAnteriorEA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPaginaEA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalPaginasEA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagProximaEA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPagUltimaEA)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botPagPrimeiraEA)
                    .addComponent(botPagAnteriorEA)
                    .addComponent(labelTotalPaginasEA)
                    .addComponent(botPagProximaEA)
                    .addComponent(botPagUltimaEA)
                    .addComponent(comboLimiteEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPaginaEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Empréstimos atrasados", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboLimiteEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLimiteEAActionPerformed
        try {
            int l = atrasadosCtrl.getPaginador().getLimites()[comboLimiteEA.getSelectedIndex()];
            atrasadosCtrl.getPaginador().setLimit(l);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_comboLimiteEAActionPerformed

    private void botPagPrimeiraEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagPrimeiraEAActionPerformed
        atrasadosCtrl.getPaginador().primeira();
//        pesquisar();
    }//GEN-LAST:event_botPagPrimeiraEAActionPerformed

    private void botPagAnteriorEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagAnteriorEAActionPerformed
        atrasadosCtrl.getPaginador().anterior();
//        pesquisar();
    }//GEN-LAST:event_botPagAnteriorEAActionPerformed

    private void botPagProximaEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagProximaEAActionPerformed
        atrasadosCtrl.getPaginador().proxima();
//        pesquisar();
    }//GEN-LAST:event_botPagProximaEAActionPerformed

    private void botPagUltimaEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagUltimaEAActionPerformed
        atrasadosCtrl.getPaginador().ultima();
//        pesquisar();
    }//GEN-LAST:event_botPagUltimaEAActionPerformed

    private void comboLimiteERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLimiteERActionPerformed
        try {
            int l = realizadosCtrl.getPaginador().getLimites()[comboLimiteER.getSelectedIndex()];
            realizadosCtrl.getPaginador().setLimit(l);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_comboLimiteERActionPerformed

    private void botPagPrimeiraERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagPrimeiraERActionPerformed
        realizadosCtrl.getPaginador().primeira();
//        pesquisar();
    }//GEN-LAST:event_botPagPrimeiraERActionPerformed

    private void botPagAnteriorERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagAnteriorERActionPerformed
        realizadosCtrl.getPaginador().anterior();
//        pesquisar();
    }//GEN-LAST:event_botPagAnteriorERActionPerformed

    private void botPagProximaERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagProximaERActionPerformed
        realizadosCtrl.getPaginador().proxima();
//        pesquisar();
    }//GEN-LAST:event_botPagProximaERActionPerformed

    private void botPagUltimaERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagUltimaERActionPerformed
        realizadosCtrl.getPaginador().ultima();
//        pesquisar();
    }//GEN-LAST:event_botPagUltimaERActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botPagAnteriorEA;
    private javax.swing.JButton botPagAnteriorER;
    private javax.swing.JButton botPagPrimeiraEA;
    private javax.swing.JButton botPagPrimeiraER;
    private javax.swing.JButton botPagProximaEA;
    private javax.swing.JButton botPagProximaER;
    private javax.swing.JButton botPagUltimaEA;
    private javax.swing.JButton botPagUltimaER;
    private javax.swing.JComboBox<String> comboLimiteEA;
    private javax.swing.JComboBox<String> comboLimiteER;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelTotalPaginasEA;
    private javax.swing.JLabel labelTotalPaginasER;
    private javax.swing.JTable tabelaAtrasos;
    private javax.swing.JTable tabelaRealizados;
    private javax.swing.JFormattedTextField textFieldPaginaEA;
    private javax.swing.JFormattedTextField textFieldPaginaER;
    // End of variables declaration//GEN-END:variables
}
