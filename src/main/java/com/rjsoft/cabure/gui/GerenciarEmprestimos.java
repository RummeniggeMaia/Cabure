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
public class GerenciarEmprestimos extends javax.swing.JPanel {

    /**
     * Creates new form GerenciarEmprestimos
     */
    public GerenciarEmprestimos() {
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

        labelPesquisarAluno = new javax.swing.JLabel();
        labelErroId = new javax.swing.JLabel();
        painelTabbed = new javax.swing.JTabbedPane();
        livroPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        textFieldQuantidade = new javax.swing.JTextField();
        labelIdLivro = new javax.swing.JLabel();
        labelForIdLivro = new javax.swing.JLabel();
        labelTituloLivro = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelForSubtitulo = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelForAutor = new javax.swing.JLabel();
        labelSegundoAutor = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelEditora = new javax.swing.JLabel();
        labelIsbn = new javax.swing.JLabel();
        labelForTitulo = new javax.swing.JLabel();
        labelForSegundoAutor = new javax.swing.JLabel();
        labelForEditora = new javax.swing.JLabel();
        labelForLocal = new javax.swing.JLabel();
        labelForAno = new javax.swing.JLabel();
        labelForIsbn = new javax.swing.JLabel();
        labelErrTitulo = new javax.swing.JLabel();
        labelErrQuantidade = new javax.swing.JLabel();
        alunoPanel = new javax.swing.JPanel();
        labelMatricula = new javax.swing.JLabel();
        textFieldMatricula = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelMatriculaAluno = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelAtivo = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelForEndereco = new javax.swing.JLabel();
        labelForNome = new javax.swing.JLabel();
        labelForMatriculaAluno = new javax.swing.JLabel();
        labelForNascimento = new javax.swing.JLabel();
        labelForCpf = new javax.swing.JLabel();
        labelForTelefone = new javax.swing.JLabel();
        labelForId = new javax.swing.JLabel();
        labelForAtivo = new javax.swing.JLabel();
        labelForNascimento1 = new javax.swing.JLabel();
        labelErrMatricula = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        labelPesquisarAluno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelPesquisarAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPesquisarAluno.setText("Gerenciar Empréstimo");
        labelPesquisarAluno.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelTitulo.setText("Título:");

        textFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTituloActionPerformed(evt);
            }
        });

        labelQuantidade.setText("Quantidade:");

        labelIdLivro.setText("Id:");

        labelTituloLivro.setText("Título:");

        labelSubtitulo.setText("Subtítulo:");

        labelAutor.setText("Autor:");

        labelSegundoAutor.setText("Segundo Autor:");

        labelAno.setText("Ano:");

        labelLocal.setText("Local:");

        labelEditora.setText("Editora:");

        labelIsbn.setText("ISBN:");

        javax.swing.GroupLayout livroPanelLayout = new javax.swing.GroupLayout(livroPanel);
        livroPanel.setLayout(livroPanelLayout);
        livroPanelLayout.setHorizontalGroup(
            livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelIdLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelForIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelTituloLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelForTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelForAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addComponent(labelSubtitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelForSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, livroPanelLayout.createSequentialGroup()
                                .addComponent(labelSegundoAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelForSegundoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEditora)
                            .addGroup(livroPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAno)
                                    .addComponent(labelLocal)))
                            .addComponent(labelIsbn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelForEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelForLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelForAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelForIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addGap(247, 247, 247))))
        );
        livroPanelLayout.setVerticalGroup(
            livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livroPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(labelErrQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIdLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelForIdLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTituloLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelForTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubtitulo)
                            .addComponent(labelForSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEditora)
                            .addComponent(labelForEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLocal)
                            .addComponent(labelForLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAutor)
                            .addComponent(labelForAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelSegundoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelForSegundoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(livroPanelLayout.createSequentialGroup()
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAno)
                            .addComponent(labelForAno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(livroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIsbn)
                            .addComponent(labelForIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        painelTabbed.addTab("Livro", livroPanel);

        labelMatricula.setText("Matrícula:");

        labelId.setText("Id:");

        labelNome.setText("Nome:");

        labelMatriculaAluno.setText("Matrícula:");

        labelEndereco.setText("Endereço:");

        labelAtivo.setText("Ativo:");

        labelNascimento.setText("Nascimento:");

        labelRg.setText("RG:");

        labelCpf.setText("CPF:");

        labelTelefone.setText("Telefone:");

        labelForEndereco.setText("342432");

        labelForNome.setText("432423");

        labelForMatriculaAluno.setText("4234234");

        labelForNascimento.setText("432423");

        labelForCpf.setText("234234");

        labelForTelefone.setText("23423");

        labelForId.setText("23423423");

        labelForAtivo.setText("43242");

        labelForNascimento1.setText("432423");

        javax.swing.GroupLayout alunoPanelLayout = new javax.swing.GroupLayout(alunoPanel);
        alunoPanel.setLayout(alunoPanelLayout);
        alunoPanelLayout.setHorizontalGroup(
            alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunoPanelLayout.createSequentialGroup()
                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alunoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(alunoPanelLayout.createSequentialGroup()
                                .addComponent(labelMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(alunoPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAtivo)
                            .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEndereco)
                                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNome)
                                    .addComponent(labelMatriculaAluno)
                                    .addComponent(labelId))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alunoPanelLayout.createSequentialGroup()
                                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelForId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelForNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelForMatriculaAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(labelForEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelRg, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunoPanelLayout.createSequentialGroup()
                                .addComponent(labelForAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTelefone)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(labelForNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelForTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelForNascimento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        alunoPanelLayout.setVerticalGroup(
            alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTelefone)
                        .addComponent(labelForTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alunoPanelLayout.createSequentialGroup()
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelId)
                            .addComponent(labelForId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(labelNascimento)
                            .addComponent(labelForNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelForNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMatriculaAluno)
                            .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelRg)
                                .addComponent(labelForNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelForMatriculaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alunoPanelLayout.createSequentialGroup()
                                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEndereco)
                                    .addComponent(labelForEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(alunoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAtivo)
                                    .addComponent(labelForAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelForCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        painelTabbed.addTab("Aluno", alunoPanel);

        jButton1.setText("Processar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabbed)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(labelErroId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPesquisarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErroId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAtivo;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelErrMatricula;
    private javax.swing.JLabel labelErrQuantidade;
    private javax.swing.JLabel labelErrTitulo;
    private javax.swing.JLabel labelErroId;
    private javax.swing.JLabel labelForAno;
    private javax.swing.JLabel labelForAtivo;
    private javax.swing.JLabel labelForAutor;
    private javax.swing.JLabel labelForCpf;
    private javax.swing.JLabel labelForEditora;
    private javax.swing.JLabel labelForEndereco;
    private javax.swing.JLabel labelForId;
    private javax.swing.JLabel labelForIdLivro;
    private javax.swing.JLabel labelForIsbn;
    private javax.swing.JLabel labelForLocal;
    private javax.swing.JLabel labelForMatriculaAluno;
    private javax.swing.JLabel labelForNascimento;
    private javax.swing.JLabel labelForNascimento1;
    private javax.swing.JLabel labelForNome;
    private javax.swing.JLabel labelForSegundoAutor;
    private javax.swing.JLabel labelForSubtitulo;
    private javax.swing.JLabel labelForTelefone;
    private javax.swing.JLabel labelForTitulo;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIdLivro;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelMatriculaAluno;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPesquisarAluno;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelSegundoAutor;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloLivro;
    private javax.swing.JPanel livroPanel;
    private javax.swing.JTabbedPane painelTabbed;
    private javax.swing.JTextField textFieldMatricula;
    private javax.swing.JTextField textFieldQuantidade;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
