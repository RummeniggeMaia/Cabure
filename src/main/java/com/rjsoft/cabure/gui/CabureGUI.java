package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.gui.listeners.AcordeonListener;
import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.controle.LivroCtrl;
import com.rjsoft.cabure.gui.listeners.TableListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jrpmaia
 */
public class CabureGUI extends javax.swing.JFrame
        implements AcordeonListener, TableListener {

    /**
     * Creates new form Cabure
     */
    private HomePanel home;
    private CadastrarAlunoPanel cadastrarAluno;
    private PesquisarAlunoPanel pesquisarAluno;
    private CadastrarLivroPanel cadastrarLivro;
    private PesquisarLivroPanel pesquisarLivro;
    private GerenciarEmprestimosPanel gerenciarEmprestimos;
    private GerarRelatorioAlunoPanel relatorioAlunoPanel;
    private GerarRelatorioEmprestimoPanel relatorioEmprestimoPanel;
    private GerarRelatorioLivroPanel relatorioLivroPanel;
    private JPanel painelCentro;
    //Controles
    private AlunoCtrl alunoCtrl;
    private LivroCtrl livroCtrl;
    private EmprestimoCtrl emprestimoCtrl;
    private EmprestimoCtrl homeAtrasadosCtrl;
    private EmprestimoCtrl homeRealizadosCtrl;
    //Constantes
    private static final Dimension TAMANHO_MINIMO = new Dimension(600, 400);
    private static final Dimension TAMANHO_MAXIMO = new Dimension(800, 600);
    private static final String TITULO = "Cabure - Sistema de Gerenciamento de Biblioteca";

    public CabureGUI() {
//        EntityManager em = JPAUtil.EMF.createEntityManager();
//        alunoCtrl = new AlunoCtrl(em);
//        livroCtrl = new LivroCtrl(em);
//        emprestimoCtrl = new EmprestimoCtrl(em);
//        homeAtrasadosCtrl = new EmprestimoCtrl(em);
//        homeRealizadosCtrl = new EmprestimoCtrl(em);

        initComponents();

        setSize(TAMANHO_MAXIMO);
        setResizable(true);
        setMinimumSize(TAMANHO_MINIMO);
        setTitle(TITULO);
        try {
            setIconImage(
                    new ImageIcon(
                            ImageIO.read(
                                    getClass().getResourceAsStream("/imagens/cabure_logo_gs.png")
                            )
                    ).getImage()
            );
        } catch (Exception ex) {
        }
    }

    public void iniciarPaineis() {
        home = new HomePanel(homeRealizadosCtrl, homeAtrasadosCtrl);
        cadastrarAluno = new CadastrarAlunoPanel(alunoCtrl);
        pesquisarAluno = new PesquisarAlunoPanel(alunoCtrl);
        cadastrarLivro = new CadastrarLivroPanel(livroCtrl);
        pesquisarLivro = new PesquisarLivroPanel(livroCtrl);
        relatorioAlunoPanel = new GerarRelatorioAlunoPanel(alunoCtrl);
        relatorioLivroPanel = new GerarRelatorioLivroPanel(livroCtrl, emprestimoCtrl);
        relatorioEmprestimoPanel = new GerarRelatorioEmprestimoPanel(emprestimoCtrl, livroCtrl, alunoCtrl);
        gerenciarEmprestimos = new GerenciarEmprestimosPanel(alunoCtrl, livroCtrl, emprestimoCtrl);

        home.pesquisarEA();
        home.pesquisarER();

        painelCentro = home;
        add(painelCentro, BorderLayout.CENTER);

        //Listeners
        acordeon1.addListener(this);
        pesquisarAluno.addTableListener(this);
        pesquisarLivro.addTableListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        acordeon1 = new com.rjsoft.cabure.gui.Acordeon();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuIniciar = new javax.swing.JMenu();
        menuItemIniciar = new javax.swing.JMenuItem();
        menuAluno = new javax.swing.JMenu();
        menuItemCadAluno = new javax.swing.JMenuItem();
        menuItemPesAluno = new javax.swing.JMenuItem();
        menuLivro = new javax.swing.JMenu();
        menuItemCadLivro = new javax.swing.JMenuItem();
        menuItemPesLivro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemEmprestimos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemRelAlunos = new javax.swing.JMenuItem();
        menuItemLivros = new javax.swing.JMenuItem();
        menuItemRelEmprestimos = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(acordeon1, java.awt.BorderLayout.WEST);

        //try {
            //    menuIniciar.setIcon(new ImageIcon(ImageIO.read(new File("imagens/home.png"))));
            //} catch (Exception ex) {
            //}
        menuIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        menuIniciar.setText("Inicio");
        menuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarActionPerformed(evt);
            }
        });

        menuItemIniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        menuItemIniciar.setText("Menu Inicial");
        menuItemIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIniciarActionPerformed(evt);
            }
        });
        menuIniciar.add(menuItemIniciar);

        jMenuBar1.add(menuIniciar);

        //try {
            //    menuAluno.setIcon(new ImageIcon(ImageIO.read(new File("imagens/pessoas.png"))));
            //} catch (Exception ex) {
            //}
        menuAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas.png"))); // NOI18N
        menuAluno.setText("Pessoas");

        //try {
            //    menuItemCadAluno.setIcon(new ImageIcon(ImageIO.read(new File("imagens/add.png"))));
            //} catch (Exception ex) {
            //}
        menuItemCadAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuItemCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        menuItemCadAluno.setText("Cadastrar Pessoa");
        menuItemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadAlunoActionPerformed(evt);
            }
        });
        menuAluno.add(menuItemCadAluno);

        //try {
            //    menuItemPesAluno.setIcon(new ImageIcon(ImageIO.read(new File("imagens/pesquisar.png"))));
            //} catch (Exception ex) {
            //}
        menuItemPesAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuItemPesAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        menuItemPesAluno.setText("Pesquisar Pessoa");
        menuItemPesAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesAlunoActionPerformed(evt);
            }
        });
        menuAluno.add(menuItemPesAluno);

        jMenuBar1.add(menuAluno);

        //try {
            //    menuLivro.setIcon(new ImageIcon(ImageIO.read(new File("imagens/livros.png"))));
            //} catch (Exception ex) {
            //}
        menuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livros.png"))); // NOI18N
        menuLivro.setText("Livros");

        //try {
            //    menuItemCadLivro.setIcon(new ImageIcon(ImageIO.read(new File("imagens/add.png"))));
            //} catch (Exception ex) {
            //}
        menuItemCadLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuItemCadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        menuItemCadLivro.setText("Cadastrar Livro");
        menuItemCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadLivroActionPerformed(evt);
            }
        });
        menuLivro.add(menuItemCadLivro);

        //try {
            //    menuItemPesLivro.setIcon(new ImageIcon(ImageIO.read(new File("imagens/pesquisar.png"))));
            //} catch (Exception ex) {
            //}
        menuItemPesLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuItemPesLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        menuItemPesLivro.setText("Pesquisar Livro");
        menuItemPesLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesLivroActionPerformed(evt);
            }
        });
        menuLivro.add(menuItemPesLivro);

        jMenuBar1.add(menuLivro);

        //try {
            //    jMenu2.setIcon(new ImageIcon(ImageIO.read(new File("imagens/emprestimos.png"))));
            //} catch (Exception ex) {
            //}
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/emprestimos.png"))); // NOI18N
        jMenu2.setText("Empréstimos");

        menuItemEmprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuItemEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/emprestimos.png"))); // NOI18N
        menuItemEmprestimos.setText("Realizar Empréstimos");
        menuItemEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmprestimosActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEmprestimos);

        jMenuBar1.add(jMenu2);

        //try {
            //    jMenu1.setIcon(new ImageIcon(ImageIO.read(new File("imagens/relatorio.png"))));
            //} catch (Exception ex) {
            //}
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu1.setText("Relatórios");

        menuItemRelAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuItemRelAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio_pessoas.png"))); // NOI18N
        menuItemRelAlunos.setText("Relatório de Alunos");
        menuItemRelAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelAlunosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemRelAlunos);

        menuItemLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuItemLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio_livros.png"))); // NOI18N
        menuItemLivros.setText("Relatório de Livros");
        menuItemLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLivrosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLivros);

        menuItemRelEmprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menuItemRelEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio_emprestimos.png"))); // NOI18N
        menuItemRelEmprestimos.setText("Relatório de Empréstimos");
        menuItemRelEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelEmprestimosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemRelEmprestimos);

        jMenuBar1.add(jMenu1);

        //try {
            //    menuSobre.setIcon(new ImageIcon(ImageIO.read(new File("imagens/info.png"))));
            //} catch (Exception ex) {
            //}
        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/info.png"))); // NOI18N
        menuSobre.setText("Sobre");

        menuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/info.png"))); // NOI18N
        menuItemSobre.setText("Informações");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemSobre);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemPesLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesLivroActionPerformed
        botaoAcordeonPressionado(AcordeonListener.BOT_PES_LIVRO);
    }//GEN-LAST:event_menuItemPesLivroActionPerformed

    private void menuItemCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadLivroActionPerformed
        botaoAcordeonPressionado(AcordeonListener.BOT_CAD_LIVRO);
    }//GEN-LAST:event_menuItemCadLivroActionPerformed

    private void menuItemPesAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesAlunoActionPerformed
        botaoAcordeonPressionado(AcordeonListener.BOT_PES_ALUNO);
    }//GEN-LAST:event_menuItemPesAlunoActionPerformed

    private void menuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadAlunoActionPerformed
        botaoAcordeonPressionado(AcordeonListener.BOT_CAD_ALUNO);
    }//GEN-LAST:event_menuItemCadAlunoActionPerformed

    private void menuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuIniciarActionPerformed

    private void menuItemIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIniciarActionPerformed
        botaoAcordeonPressionado(AcordeonListener.MENU_INICIO);
    }//GEN-LAST:event_menuItemIniciarActionPerformed

    private void menuItemEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmprestimosActionPerformed
        botaoAcordeonPressionado(AcordeonListener.MENU_EMPRESTIMO);
    }//GEN-LAST:event_menuItemEmprestimosActionPerformed

    private void menuItemRelAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelAlunosActionPerformed
        botaoAcordeonPressionado(AcordeonListener.MENU_RELATORIO_ALUNOS);
    }//GEN-LAST:event_menuItemRelAlunosActionPerformed

    private void menuItemLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLivrosActionPerformed
        botaoAcordeonPressionado(AcordeonListener.MENU_RELATORIO_LIVROS);
    }//GEN-LAST:event_menuItemLivrosActionPerformed

    private void menuItemRelEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelEmprestimosActionPerformed
        botaoAcordeonPressionado(AcordeonListener.MENU_RELATORIO_EMPRESTIMOS);
    }//GEN-LAST:event_menuItemRelEmprestimosActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        JOptionPane.showMessageDialog(this,
                "Sistema de Gerenciamento de Biblioteca - Caburé\n"
                + "Versão: 1.0.0.0\n"
                + "Desenvolvedores:\n"
                + "    Rummenigge Maia\n"
                + "    Jaedson Araújo\n"
                + "Tel: (84) 9 9701-7409\n"
                + "Email: rjsolucoesdesoftware@gmail.com",
                "Sobre o sistema Caburé 1.0.0.0",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItemSobreActionPerformed

    public AlunoCtrl getAlunoCtrl() {
        return alunoCtrl;
    }

    public void setAlunoCtrl(AlunoCtrl alunoCtrl) {
        this.alunoCtrl = alunoCtrl;
    }

    public LivroCtrl getLivroCtrl() {
        return livroCtrl;
    }

    public void setLivroCtrl(LivroCtrl livroCtrl) {
        this.livroCtrl = livroCtrl;
    }

    public EmprestimoCtrl getEmprestimoCtrl() {
        return emprestimoCtrl;
    }

    public void setEmprestimoCtrl(EmprestimoCtrl emprestimoCtrl) {
        this.emprestimoCtrl = emprestimoCtrl;
    }

    public EmprestimoCtrl getHomeAtrasadosCtrl() {
        return homeAtrasadosCtrl;
    }

    public void setHomeAtrasadosCtrl(EmprestimoCtrl homeAtrasadosCtrl) {
        this.homeAtrasadosCtrl = homeAtrasadosCtrl;
    }

    public EmprestimoCtrl getHomeRealizadosCtrl() {
        return homeRealizadosCtrl;
    }

    public void setHomeRealizadosCtrl(EmprestimoCtrl homeRealizadosCtrl) {
        this.homeRealizadosCtrl = homeRealizadosCtrl;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rjsoft.cabure.gui.Acordeon acordeon1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuAluno;
    private javax.swing.JMenu menuIniciar;
    private javax.swing.JMenuItem menuItemCadAluno;
    private javax.swing.JMenuItem menuItemCadLivro;
    private javax.swing.JMenuItem menuItemEmprestimos;
    private javax.swing.JMenuItem menuItemIniciar;
    private javax.swing.JMenuItem menuItemLivros;
    private javax.swing.JMenuItem menuItemPesAluno;
    private javax.swing.JMenuItem menuItemPesLivro;
    private javax.swing.JMenuItem menuItemRelAlunos;
    private javax.swing.JMenuItem menuItemRelEmprestimos;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenu menuLivro;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables

    private void setPainelCentro() {

        add(painelCentro, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    @Override
    public void botaoAcordeonPressionado(int botao) {
        remove(painelCentro);
        switch (botao) {
            case AcordeonListener.MENU_INICIO: {
                home.pesquisarEA();
                home.pesquisarER();
                painelCentro = home;
                break;
            }
            case AcordeonListener.BOT_CAD_ALUNO: {
                cadastrarAluno.limparCampos();
                painelCentro = cadastrarAluno;
                break;
            }
            case AcordeonListener.BOT_PES_ALUNO: {
                pesquisarAluno.pesquisar();
                painelCentro = pesquisarAluno;
                break;
            }
            case AcordeonListener.BOT_CAD_LIVRO: {
                cadastrarLivro.limparCampos();
                painelCentro = cadastrarLivro;
                break;
            }
            case AcordeonListener.BOT_PES_LIVRO: {
                pesquisarLivro.pesquisar();
                painelCentro = pesquisarLivro;
                break;
            }
            case AcordeonListener.MENU_EMPRESTIMO: {
                painelCentro = gerenciarEmprestimos;
                break;
            }
            case AcordeonListener.MENU_RELATORIO_ALUNOS: {
                painelCentro = relatorioAlunoPanel;
                break;
            }
            case AcordeonListener.MENU_RELATORIO_LIVROS: {
                painelCentro = relatorioLivroPanel;
                break;
            }
            case AcordeonListener.MENU_RELATORIO_EMPRESTIMOS: {
                painelCentro = relatorioEmprestimoPanel;
                break;
            }
            default: {
                home.pesquisarEA();
                home.pesquisarER();
                painelCentro = home;
            }
        }
        setPainelCentro();
    }

    @Override
    public void linhaSelecionada(int fonte, int idEntidade) {
        if (fonte == TableListener.TELA_PES_ALUNO) {
            remove(painelCentro);
            cadastrarAluno.carregarAluno(idEntidade);
            painelCentro = cadastrarAluno;
            setPainelCentro();
        } else if (fonte == TableListener.TELA_PES_LIVRO) {
            remove(painelCentro);
            cadastrarLivro.carregarLivro(idEntidade);
            painelCentro = cadastrarLivro;
            setPainelCentro();
        }
    }

    private JFrame getThis() {
        return this;
    }
}
