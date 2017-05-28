/*//GEN-LINE:variables
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.modelo.Livro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaedson Bruno
 */
public class CadastrarLivroPanel extends javax.swing.JPanel {

    private LivroCtrl ctrl;

    /**
     * Creates new form Cadastrar_Livro
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelCadastroDeLivro = new javax.swing.JLabel();
        labelPrimeiroAutor = new javax.swing.JLabel();
        labelSegundoAutor = new javax.swing.JLabel();
        labelTerceiroAutor = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelNumeroEdicao = new javax.swing.JLabel();
        labelVolume = new javax.swing.JLabel();
        labelPaginas = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelEditora = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelSerie = new javax.swing.JLabel();
        labelISBN = new javax.swing.JLabel();
        textFieldPrimeiroAutor = new javax.swing.JTextField();
        textFieldTerceiroAutor = new javax.swing.JTextField();
        textFieldSegundoAutor = new javax.swing.JTextField();
        textFieldLocal = new javax.swing.JTextField();
        textFieldNumeroEdicao = new javax.swing.JTextField();
        textFieldPaginas = new javax.swing.JTextField();
        textFieldTitulo = new javax.swing.JTextField();
        textFieldSubtitulo = new javax.swing.JTextField();
        textFieldEditora = new javax.swing.JTextField();
        textFieldAno = new javax.swing.JTextField();
        textFieldSerie = new javax.swing.JTextField();
        textFieldISBN = new javax.swing.JTextField();
        textFieldVolume = new javax.swing.JTextField();
        buttonCancelaID = new javax.swing.JButton();
        textFieldId = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        labelErrId = new javax.swing.JLabel();
        labelErrSegundoAutor = new javax.swing.JLabel();
        labelErrPrimeiroAutor = new javax.swing.JLabel();
        labelErrTerceiroAutor = new javax.swing.JLabel();
        labelErrCidade = new javax.swing.JLabel();
        labelErrNumeroEdicao = new javax.swing.JLabel();
        labelErrVolume = new javax.swing.JLabel();
        labelErrPaginas = new javax.swing.JLabel();
        labelErrTitulo = new javax.swing.JLabel();
        labelErrSubtitulo = new javax.swing.JLabel();
        labelErrEditora = new javax.swing.JLabel();
        labelErrAno = new javax.swing.JLabel();
        labelErrSerie = new javax.swing.JLabel();
        labelErrISBN = new javax.swing.JLabel();

        labelCadastroDeLivro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labelCadastroDeLivro.setText("Cadastro de Livro");

        labelPrimeiroAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelPrimeiroAutor.setText("1º Autor:");

        labelSegundoAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSegundoAutor.setText("2º Autor:");

        labelTerceiroAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelTerceiroAutor.setText("3º Autor:");

        labelLocal.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelLocal.setText("Local (Cidade):");

        labelNumeroEdicao.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelNumeroEdicao.setText("Nº da Edição:");

        labelVolume.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelVolume.setText("Volume:");

        labelPaginas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelPaginas.setText("Páginas:");

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelTitulo.setText("Título:");

        labelSubtitulo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSubtitulo.setText("Subtítulo:");

        labelEditora.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelEditora.setText("Editora:");

        labelAno.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelAno.setText("Ano:");

        labelSerie.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelSerie.setText("Série:");

        labelISBN.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelISBN.setText("ISBN:");

        textFieldPrimeiroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrimeiroAutorActionPerformed(evt);
            }
        });

        textFieldTerceiroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTerceiroAutorActionPerformed(evt);
            }
        });

        buttonCancelaID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelaID.setForeground(new java.awt.Color(255, 0, 0));
        buttonCancelaID.setText("×");
        buttonCancelaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelaIDActionPerformed(evt);
            }
        });

        textFieldId.setEditable(false);

        labelId.setText("Id:");
        labelId.setOpaque(true);

        buttonSalvar.setText("Salvar");
        buttonSalvar.setMaximumSize(new java.awt.Dimension(200, 28));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(200, 30));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);

        labelErrId.setForeground(new java.awt.Color(255, 0, 0));

        labelErrSegundoAutor.setForeground(new java.awt.Color(255, 0, 0));

        labelErrPrimeiroAutor.setForeground(new java.awt.Color(255, 0, 0));

        labelErrTerceiroAutor.setForeground(new java.awt.Color(255, 0, 0));

        labelErrCidade.setForeground(new java.awt.Color(255, 0, 0));

        labelErrNumeroEdicao.setForeground(new java.awt.Color(255, 0, 0));

        labelErrVolume.setForeground(new java.awt.Color(255, 0, 0));

        labelErrPaginas.setForeground(new java.awt.Color(255, 0, 0));

        labelErrTitulo.setForeground(new java.awt.Color(255, 0, 0));

        labelErrSubtitulo.setForeground(new java.awt.Color(255, 0, 0));

        labelErrEditora.setForeground(new java.awt.Color(255, 0, 0));

        labelErrAno.setForeground(new java.awt.Color(255, 0, 0));

        labelErrSerie.setForeground(new java.awt.Color(255, 0, 0));

        labelErrISBN.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCadastroDeLivro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSegundoAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrSegundoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textFieldEditora)
                    .addComponent(textFieldSubtitulo)
                    .addComponent(textFieldTitulo)
                    .addComponent(textFieldLocal)
                    .addComponent(textFieldTerceiroAutor)
                    .addComponent(textFieldSegundoAutor)
                    .addComponent(textFieldPrimeiroAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPrimeiroAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrPrimeiroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTerceiroAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrTerceiroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCancelaID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldAno)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelErrAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSerie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelErrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldSerie))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelISBN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSubtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumeroEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVolume)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrNumeroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPaginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrPaginas, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addComponent(textFieldPaginas))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelErrId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancelaID)))
                    .addComponent(labelCadastroDeLivro))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPrimeiroAutor)
                    .addComponent(labelErrPrimeiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPrimeiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSegundoAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelErrSegundoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTerceiroAutor))
                    .addComponent(labelErrTerceiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTerceiroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLocal)
                    .addComponent(labelErrCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelErrNumeroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNumeroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelErrVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPaginas)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNumeroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelErrPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelErrAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelErrISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSerie)
                            .addComponent(labelISBN))
                        .addComponent(labelAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelErrSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void textFieldPrimeiroAutorActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void buttonCancelaIDActionPerformed(java.awt.event.ActionEvent evt) {                                                
        limparCampos();
    }                                               

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cadastrarLivro();
    }                                            

    private void textFieldTerceiroAutorActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    // Variables declaration - do not modify                     
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
    private javax.swing.JTextField textFieldSegundoAutor;
    private javax.swing.JTextField textFieldSerie;
    private javax.swing.JTextField textFieldSubtitulo;
    private javax.swing.JTextField textFieldTerceiroAutor;
    private javax.swing.JTextField textFieldTitulo;
    private javax.swing.JTextField textFieldVolume;
    // End of variables declaration                   

    private void cadastrarLivro() {
        limparValidacao();
        if (validarCampos()) {
            try {
                Livro livro = new Livro();
                String id = textFieldId.getText();
                livro.setID(id.isEmpty() ? 0 : Integer.parseInt(id));
                livro.setPrimeiroAutor(textFieldPrimeiroAutor.getText());
                livro.setSegundoAutor(textFieldSegundoAutor.getText());
                livro.setTerceiroAutor(textFieldTerceiroAutor.getText());
                livro.setLocal(textFieldLocal.getText());
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
        labelErrNumeroEdicao.setText("");
        labelErrPrimeiroAutor.setText("");
        labelErrSegundoAutor.setText("");
        labelErrSerie.setText("");
        labelErrSubtitulo.setText("");
        labelErrTerceiroAutor.setText("");
        labelErrTitulo.setText("");
        labelErrVolume.setText("");
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
            labelErrPaginas.setText("* inválido");
            valido = false;
        }
        if (textFieldPaginas.getText().isEmpty()) {
            labelErrVolume.setText("* Campo obrigatório");
            valido = false;
        }
        if (textFieldNumeroEdicao.getText().isEmpty()) {
            labelErrNumeroEdicao.setText("* Campo obrigatório");
            valido = false;
        }
        if (textFieldEditora.getText().isEmpty()) {
            labelErrEditora.setText("* Campo obrigatório");
            valido = false;
        }
        return valido;
    }

    public void carregarAluno(int livroId) {
        limparCampos();
        Livro l = ctrl.pesquisarPorId(livroId);
        if (l != null) {
            textFieldAno.setText(
                    new SimpleDateFormat("yyyy").format(
                            l.getAno()));
            textFieldEditora.setText(l.getEditora());
            textFieldISBN.setText(l.getIsbn());
            textFieldId.setText(l.getID().toString());
            textFieldLocal.setText(l.getLocal());
            textFieldNumeroEdicao.setText(l.getNumeroEdicao());
            textFieldVolume.setText(l.getVolume());
            textFieldPrimeiroAutor.setText(l.getPrimeiroAutor());
            textFieldSegundoAutor.setText(l.getSegundoAutor());
            textFieldSerie.setText(l.getSerie());
            textFieldSubtitulo.setText(l.getSubtitulo());
            textFieldTerceiroAutor.setText(l.getTerceiroAutor());
            textFieldTitulo.setText(l.getTitulo());
            textFieldPaginas.setText(l.getNumeroPaginas().toString());
            
        }
    }
}
