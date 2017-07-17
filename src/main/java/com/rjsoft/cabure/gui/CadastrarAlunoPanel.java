package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Pattern;
import javax.persistence.PersistenceException;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author jrpmaia
 */
public class CadastrarAlunoPanel extends javax.swing.JPanel {

    private AlunoCtrl ctrl;

    /**
     * Creates new form Cadastrar_Aluno
     */
    public CadastrarAlunoPanel(AlunoCtrl ctrl) {
        this.ctrl = ctrl;
        initComponents();
    }

    private void cadastrarAluno() {
        limparValidacao();
        if (validarCampos()) {
            try {
                Aluno aluno = new Aluno();
                String id = textFieldId.getText();
                aluno.setID(id.isEmpty() ? 0 : Integer.parseInt(id));
                aluno.setBairro(textFieldBairro.getText());
                DateFormat df = DateFormat.getDateInstance();
                aluno.setDataNascimento(
                        df.parse(textFieldDataDeNascimento.getText()));
                aluno.setCpf(textFieldCPF.getText());
                aluno.setEmail(textFieldEmail.getText());
                aluno.setEndereco(textFieldEndereco.getText());
                aluno.setMatricula(textFieldMatricula.getText());
                aluno.setNome(textFieldNome.getText());
                aluno.setNumero(Integer.parseInt(textFieldNumero.getText()));
                aluno.setObservacao(textAreaObservacao.getText());
                aluno.setRg(textFieldRG.getText());
                if (radioButtonAluno.isSelected()) {
                    aluno.setCategoria(Aluno.CATEGORIA_ALUNO);
                } else if (radioButtonProfessor.isSelected()) {
                    aluno.setCategoria(Aluno.CATEGORIA_PROFESSOR);
                } else if (RadioButtonComunidade.isSelected()) {
                    aluno.setCategoria(Aluno.CATEGORIA_COMUNIDADE);
                }
                aluno.setSexo(radioButtonMasculino.isSelected() ? 'M' : 'F');
                aluno.setSituacao(radioButtonAtivo.isSelected());
                aluno.setTelefone(textFieldTelefone.getText());

                ctrl.setAluno(aluno);
                ctrl.salvarAluno();
                limparCampos();

                JOptionPane.showMessageDialog(
                        this,
                        "Dados do Aluno salvos com sucesso!",
                        "Sucesso ao cadastrar Aluno",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (PersistenceException pe) {
                JOptionPane.showMessageDialog(
                        this,
                        "Já existe um aluno com essa matrícula, email, cpf ou rg no sistema.",
                        "Erro cadastrar Aluno",
                        JOptionPane.ERROR_MESSAGE);
            } catch (Exception pe) {
                JOptionPane.showMessageDialog(
                        this,
                        "Aluno não pode ser cadastrado no sistema.",
                        "Erro cadastrar Aluno",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Dados do Aluno estão inválidos.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean validarCampos() {
        boolean valido = true;
        if (textFieldNome.getText().isEmpty()) {
            labelErrNome.setText("* nome vazio");
            valido = false;
        } else if (textFieldNome.getText().length() < 4) {
            labelErrNome.setText("* nome muito pequeno");
            valido = false;
        }
        if (textFieldMatricula.getText().isEmpty()) {
            labelErrMatricula.setText("* matrícula vazia");
            valido = false;
        }
        try {
            Integer.parseInt(textFieldNumero.getText());
        } catch (Exception ex) {
            labelErrNumero.setText("* número inválido");
            valido = false;
        }
        if (!Pattern.matches("([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})",
                textFieldEmail.getText())) {
            labelErrEmail.setText("* e-mail inválido");
            valido = false;
        }
        if (textFieldBairro.getText().isEmpty()) {
            labelErrBairro.setText("* nome do bairro vazio");
            valido = false;
        } else if (textFieldBairro.getText().length() < 4) {
            labelErrBairro.setText("* nome do bairro muito pequeno");
            valido = false;
        }
        if (!Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}", textFieldCPF.getText())) {
            labelErrCpf.setText("* CPF inválido");
            valido = false;
        }
        if (!Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}", textFieldRG.getText())) {
            labelErrRg.setText("* RG inválido");
            valido = false;
        }
        if (!Pattern.matches("\\d{2}/\\d{2}/\\d{4}", textFieldDataDeNascimento.getText())) {
            labelErrDataNasc.setText("* Data inválida, ex:dd/mm/aaaa");
            valido = false;
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                Date dn = sdf.parse(textFieldDataDeNascimento.getText());
                if (new Date().compareTo(dn) < 0) {
                    labelErrDataNasc.setText("* Data de nascimento deve ser anterior a atual");
                    valido = false;
                }
            } catch (Exception ex) {
                labelErrDataNasc.setText("* Data de nascimento inválida, verifique o dia e o mês ");
                valido = false;
            }
        }
        return valido;
    }

    public void limparCampos() {
        textFieldNome.setText("");
        textFieldMatricula.setText("");
        textFieldEndereco.setText("");
        textFieldBairro.setText("");
        textFieldNumero.setText("");
        textFieldEmail.setText("");
        textAreaObservacao.setText("");
        textFieldCPF.setText("");
        textFieldRG.setText("");
        textFieldTelefone.setText("");
        textFieldDataDeNascimento.setText("");
        textFieldId.setText("");
        limparValidacao();
    }

    private void limparValidacao() {
        labelErrBairro.setText("");
        labelErrNumero.setText("");
        labelErrCpf.setText("");
        labelErrDataNasc.setText("");
        labelErrEmail.setText("");
        labelErrEndereco.setText("");
        labelErrMatricula.setText("");
        labelErrNome.setText("");
        labelErrRg.setText("");
        labelErrTelefone.setText("");
    }

    public void carregarAluno(int alunoId) {
        limparCampos();
        Aluno a = ctrl.pesquisarPorId(alunoId);
        if (a != null) {
            textFieldNome.setText(a.getNome());
            textFieldMatricula.setText(a.getMatricula());
            textFieldEndereco.setText(a.getEndereco());
            textFieldBairro.setText(a.getBairro());
            textFieldNumero.setText(a.getNumero().toString());
            textFieldEmail.setText(a.getEmail());
            textAreaObservacao.setText(a.getObservacao());
            textFieldCPF.setText(a.getCpf());
            textFieldRG.setText(a.getCpf());
            textFieldTelefone.setText(a.getTelefone());
            textFieldDataDeNascimento.setText(
                    new SimpleDateFormat("dd/MM/yyyy").format(
                            a.getDataNascimento()));
            textFieldId.setText(a.getID().toString());
            Enumeration<AbstractButton> cats = buttonGrupoCategoria.getElements();
            while(cats.hasMoreElements()) {
                AbstractButton ab = cats.nextElement();
                if (ab.getActionCommand().equals(a.getCategoria())) {
                    ab.setSelected(true);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupSituacao = new javax.swing.ButtonGroup();
        buttonGrupoCategoria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        botRemoverAluno = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelErrNome = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelErrMatricula = new javax.swing.JLabel();
        textFieldMatricula = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelErrNumero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        labelErrBairro = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        textFieldBairro = new javax.swing.JTextField();
        labelRG = new javax.swing.JLabel();
        labelErrRg = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        labelErrCpf = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelErrDataNasc = new javax.swing.JLabel();
        textFieldRG = new javax.swing.JFormattedTextField();
        textFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        labelErrEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelErrTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JFormattedTextField();
        scrollObservacao = new javax.swing.JScrollPane();
        textAreaObservacao = new javax.swing.JTextArea();
        labelObservacao = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        labelErrEndereco = new javax.swing.JLabel();
        textFieldCPF = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        radioButtonAluno = new javax.swing.JRadioButton();
        radioButtonProfessor = new javax.swing.JRadioButton();
        RadioButtonComunidade = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        radioButtonAtivo = new javax.swing.JRadioButton();
        radioButtonInativo = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        radioButtonMasculino = new javax.swing.JRadioButton();
        radioButtonFeminino = new javax.swing.JRadioButton();

        buttonGroupSexo.add(radioButtonMasculino);
        buttonGroupSexo.add(radioButtonFeminino);
        radioButtonMasculino.setSelected(true);

        buttonGroupSituacao.add(radioButtonAtivo);
        buttonGroupSituacao.add(radioButtonInativo);
        radioButtonAtivo.setSelected(true);

        buttonGrupoCategoria.add(radioButtonAluno);
        buttonGrupoCategoria.add(radioButtonProfessor);
        buttonGrupoCategoria.add(RadioButtonComunidade);
        radioButtonAluno.setSelected(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Alunos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel1.setText("Id:");
        jLabel1.setOpaque(true);

        textFieldId.setEditable(false);

        botRemoverAluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botRemoverAluno.setForeground(new java.awt.Color(255, 0, 0));
        botRemoverAluno.setText("×");
        botRemoverAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRemoverAlunoActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelNome.setText("Nome:");

        labelErrNome.setForeground(new java.awt.Color(255, 0, 0));

        labelMatricula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelMatricula.setText("Matrícula:");

        labelErrMatricula.setForeground(new java.awt.Color(255, 0, 0));

        textFieldMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        textFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMatriculaActionPerformed(evt);
            }
        });

        labelEndereco.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelEndereco.setText("Endereço:");

        labelNumero.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelNumero.setText("Nº:");

        labelErrNumero.setForeground(new java.awt.Color(255, 0, 0));

        labelErrBairro.setForeground(new java.awt.Color(255, 0, 0));

        labelBairro.setText("Bairro:");

        labelRG.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelRG.setText("RG:");

        labelErrRg.setForeground(new java.awt.Color(255, 0, 0));

        labelCPF.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelCPF.setText("CPF:");

        labelErrCpf.setForeground(new java.awt.Color(255, 0, 0));

        labelDataDeNascimento.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelDataDeNascimento.setText("Data de Nascimento:");

        labelErrDataNasc.setForeground(new java.awt.Color(255, 0, 0));

        try {
            textFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelEmail.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelEmail.setText("Email:");

        labelErrEmail.setForeground(new java.awt.Color(255, 0, 0));

        labelTelefone.setText("Telefone:");

        labelErrTelefone.setForeground(new java.awt.Color(255, 0, 0));

        try {
            textFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        textAreaObservacao.setColumns(20);
        textAreaObservacao.setRows(5);
        scrollObservacao.setViewportView(textAreaObservacao);

        labelObservacao.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelObservacao.setText("Observação:");

        buttonSalvar.setText("Salvar");
        buttonSalvar.setMaximumSize(new java.awt.Dimension(200, 28));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(200, 30));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        labelErrEndereco.setForeground(new java.awt.Color(255, 0, 0));

        try {
            textFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        radioButtonAluno.setText("Aluno");

        radioButtonProfessor.setText("Professor");

        RadioButtonComunidade.setText("Comunidade");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(radioButtonAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButtonComunidade))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radioButtonAluno)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RadioButtonComunidade)
                .addComponent(radioButtonProfessor))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        radioButtonAtivo.setText("Ativo");

        radioButtonInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(radioButtonAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonInativo)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(radioButtonAtivo)
                .addComponent(radioButtonInativo))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        radioButtonMasculino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        radioButtonMasculino.setText("Masculino");

        radioButtonFeminino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        radioButtonFeminino.setText("Feminino");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(radioButtonMasculino)
                .addGap(0, 0, 0)
                .addComponent(radioButtonFeminino))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radioButtonMasculino)
            .addComponent(radioButtonFeminino)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldNumero)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelErrNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(textFieldBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(botRemoverAluno))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMatricula)
                                    .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelErrTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 151, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(textFieldDataDeNascimento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRG)
                        .addGap(6, 6, 6)
                        .addComponent(labelErrRg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelCPF)
                        .addGap(6, 6, 6)
                        .addComponent(labelErrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelDataDeNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollObservacao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botRemoverAluno))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelErrNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelMatricula)
                        .addGap(6, 6, 6)
                        .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco)
                    .addComponent(labelErrEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(labelErrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBairro)
                    .addComponent(labelErrBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(textFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRG)
                    .addComponent(labelErrRg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF)
                    .addComponent(labelErrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataDeNascimento)
                    .addComponent(labelErrDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone)
                            .addComponent(labelErrTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(labelObservacao)
                        .addGap(6, 6, 6)
                        .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        cadastrarAluno();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMatriculaActionPerformed

    private void botRemoverAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRemoverAlunoActionPerformed
        limparCampos();
        limparValidacao();
    }//GEN-LAST:event_botRemoverAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonComunidade;
    private javax.swing.JButton botRemoverAluno;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.ButtonGroup buttonGroupSituacao;
    private javax.swing.ButtonGroup buttonGrupoCategoria;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelErrBairro;
    private javax.swing.JLabel labelErrCpf;
    private javax.swing.JLabel labelErrDataNasc;
    private javax.swing.JLabel labelErrEmail;
    private javax.swing.JLabel labelErrEndereco;
    private javax.swing.JLabel labelErrMatricula;
    private javax.swing.JLabel labelErrNome;
    private javax.swing.JLabel labelErrNumero;
    private javax.swing.JLabel labelErrRg;
    private javax.swing.JLabel labelErrTelefone;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelObservacao;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JRadioButton radioButtonAluno;
    private javax.swing.JRadioButton radioButtonAtivo;
    private javax.swing.JRadioButton radioButtonFeminino;
    private javax.swing.JRadioButton radioButtonInativo;
    private javax.swing.JRadioButton radioButtonMasculino;
    private javax.swing.JRadioButton radioButtonProfessor;
    private javax.swing.JScrollPane scrollObservacao;
    private javax.swing.JTextArea textAreaObservacao;
    private javax.swing.JTextField textFieldBairro;
    private javax.swing.JFormattedTextField textFieldCPF;
    private javax.swing.JFormattedTextField textFieldDataDeNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JFormattedTextField textFieldMatricula;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JFormattedTextField textFieldRG;
    private javax.swing.JFormattedTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
