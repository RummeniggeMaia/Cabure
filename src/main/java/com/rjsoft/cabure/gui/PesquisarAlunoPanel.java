/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.gui.listeners.TableListener;
import com.rjsoft.cabure.modelo.Aluno;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrpmaia
 */
public class PesquisarAlunoPanel extends javax.swing.JPanel {

    private AlunoCtrl ctrl;
    private String[] colunas;
    private List<TableListener> listeners;

    /**
     * Creates new form pes_aluno
     */
    public PesquisarAlunoPanel(AlunoCtrl ctrl) {
        this.ctrl = ctrl;
        colunas = new String[]{
            "Id",
            "Nome",
            "Matricula",
            "Endereço",
            "Bairro",
            "Nascimento",
            "RG",
            "CPF",
            "E-Mail",
            "Telefone",
            "Sexo",
            "Situação"
        };
        listeners = new ArrayList<>();
        initComponents();
    }

    public void addTableListener(TableListener tl) {
        listeners.add(tl);
    }

    public void removeTableListener(TableListener tl) {
        listeners.remove(tl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldMatricula = new javax.swing.JTextField();
        scrollTabelaAlunos = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();
        buttonPesquisar = new javax.swing.JButton();
        labelPesquisarAluno = new javax.swing.JLabel();
        botPagPrimeira = new javax.swing.JButton();
        botPagAnterior = new javax.swing.JButton();
        labelTotalPaginas = new javax.swing.JLabel();
        botPagProxima = new javax.swing.JButton();
        botPagUltima = new javax.swing.JButton();
        comboLimite = new javax.swing.JComboBox<>();
        textFieldPagina = new javax.swing.JFormattedTextField();

        labelNome.setText("Nome:");

        labelMatricula.setText("Matrícula:");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMatriculaActionPerformed(evt);
            }
        });

        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Matricula", "Endereço", "Bairro", "Nascimento", "RG", "CPF", "E-Mail", "Telefone", "Sexo", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAlunos.getTableHeader().setReorderingAllowed(false);
        scrollTabelaAlunos.setViewportView(tableAlunos);
        tableAlunos.setRowSelectionAllowed(true);
        tableAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tableAlunos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
                    int linhaSelecionada = tableAlunos.getSelectedRow();
                    Object idObj = tableAlunos.getValueAt(linhaSelecionada, 0);
                    Integer id = null;
                    try {
                        id = Integer.parseInt(idObj.toString());
                    } catch (Exception ex) {
                    }
                    if (id != null) {
                        for (TableListener tl : listeners) {
                            tl.linhaSelecionada(TableListener.TELA_PES_ALUNO, id);
                        }
                    }
                }
            }
        });

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        labelPesquisarAluno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelPesquisarAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPesquisarAluno.setText("Pesquisar Aluno");
        labelPesquisarAluno.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        botPagPrimeira.setText("|<");
        botPagPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagPrimeiraActionPerformed(evt);
            }
        });

        botPagAnterior.setText("<<");
        botPagAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagAnteriorActionPerformed(evt);
            }
        });

        labelTotalPaginas.setText("de 9999");

        botPagProxima.setText(">>");
        botPagProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagProximaActionPerformed(evt);
            }
        });

        botPagUltima.setText(">|");
        botPagUltima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagUltimaActionPerformed(evt);
            }
        });

        int[] limites = ctrl.getPaginador().getLimites();
        for (int i = 0; i < limites.length; i++) {
            comboLimite.addItem("" + limites[i]);
        }
        comboLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLimiteActionPerformed(evt);
            }
        });

        textFieldPagina.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNome)
                    .addComponent(scrollTabelaAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelMatricula)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(textFieldMatricula, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botPagPrimeira)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botPagAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotalPaginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botPagProxima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botPagUltima)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelPesquisarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPesquisarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabelaAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botPagPrimeira)
                    .addComponent(botPagAnterior)
                    .addComponent(labelTotalPaginas)
                    .addComponent(botPagProxima)
                    .addComponent(botPagUltima)
                    .addComponent(comboLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMatriculaActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        ctrl.getPaginador().setCondicao(gerarCondicao());
        pesquisar();
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private String gerarCondicao() {
        String condicao = "";
        String matricula = textFieldMatricula.getText();
        String nome = textFieldNome.getText();
        if (!matricula.isEmpty()) {
            condicao += String.format(" AND a.matricula = '%s'", matricula);
        }
        if (!nome.isEmpty()) {
            condicao += String.format(" AND a.nome like '%%%s%%'", nome);
        }
        return condicao;
    }
    private void botPagPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagPrimeiraActionPerformed
        ctrl.getPaginador().primeira();
        pesquisar();
    }//GEN-LAST:event_botPagPrimeiraActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void botPagAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagAnteriorActionPerformed
        ctrl.getPaginador().anterior();
        pesquisar();
    }//GEN-LAST:event_botPagAnteriorActionPerformed

    private void botPagProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagProximaActionPerformed
        ctrl.getPaginador().proxima();
        pesquisar();
    }//GEN-LAST:event_botPagProximaActionPerformed

    private void botPagUltimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagUltimaActionPerformed
        ctrl.getPaginador().ultima();
        pesquisar();
    }//GEN-LAST:event_botPagUltimaActionPerformed

    private void comboLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLimiteActionPerformed
        try {
            int l = ctrl.getPaginador().getLimites()[comboLimite.getSelectedIndex()];
            ctrl.getPaginador().setLimit(l);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_comboLimiteActionPerformed

    public void pesquisar() {
        List<Aluno> alunos = ctrl.pesquisar();
        listarAlunos(alunos);
        verificarPaginacao();
    }

    private void listarAlunos(List<Aluno> alunos) {
        Object[][] data = new Object[alunos.size()][colunas.length];
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            data[i][0] = a.getID();
            data[i][1] = a.getNome();
            data[i][2] = a.getMatricula();
            data[i][3] = a.getEndereco() + " Nº: " + a.getNumero();
            data[i][4] = a.getBairro();
            data[i][5] = new SimpleDateFormat("dd/MM/yyyy").format(a.getDataNascimento());
            data[i][6] = a.getRg();
            data[i][7] = a.getCpf();
            data[i][8] = a.getEmail();
            data[i][9] = a.getTelefone();
            data[i][10] = a.getSexo() == 'M' ? "Masculino" : "Feminino";
            data[i][11] = a.getSituacao() ? "Ativo" : "Inativo";
        }
        DefaultTableModel dtm = new DefaultTableModel(data, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableAlunos.setModel(dtm);
    }

    private void verificarPaginacao() {
        botPagAnterior.setEnabled(ctrl.getPaginador().podeVoltar());
        botPagPrimeira.setEnabled(ctrl.getPaginador().podeVoltar());
        botPagProxima.setEnabled(ctrl.getPaginador().podeSeguir());
        botPagUltima.setEnabled(ctrl.getPaginador().podeSeguir());
        comboLimite.setSelectedItem(ctrl.getPaginador().getLimit());
        labelTotalPaginas.setText(" de " + ctrl.getPaginador().totalDePaginas());
        textFieldPagina.setText("" + ctrl.getPaginador().paginaAtual());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botPagAnterior;
    private javax.swing.JButton botPagPrimeira;
    private javax.swing.JButton botPagProxima;
    private javax.swing.JButton botPagUltima;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JComboBox<String> comboLimite;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPesquisarAluno;
    private javax.swing.JLabel labelTotalPaginas;
    private javax.swing.JScrollPane scrollTabelaAlunos;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JTextField textFieldMatricula;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JFormattedTextField textFieldPagina;
    // End of variables declaration//GEN-END:variables
}
