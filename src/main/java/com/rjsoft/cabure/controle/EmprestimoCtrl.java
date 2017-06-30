package com.rjsoft.cabure.controle;

import com.rjsoft.cabure.controle.tabela.Paginador;
import com.rjsoft.cabure.dao.EmprestimoJpaController;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.modelo.Emprestimo;
import com.rjsoft.cabure.modelo.Livro;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author jrpmaia
 */
public class EmprestimoCtrl {

    private Aluno aluno;
    private Livro livro;
    private Emprestimo emprestimo;
    private final EmprestimoJpaController dao;
    private final Paginador paginador;

    public EmprestimoCtrl(EntityManager em) {
        emprestimo = new Emprestimo();
        aluno = new Aluno();
        livro = new Livro();
        dao = new EmprestimoJpaController(em);
        paginador = new Paginador();
    }

    public void salvarEmprestimo() {
        dao.salvar(emprestimo);
    }

    public List<Emprestimo> pesquisarEmprestimos() {
        return dao.pesquisarTudo(paginador.getOffset(), paginador.getLimit());
    }

    public List<Emprestimo> pesquisar() {
        contar();
        return dao.pesquisarTudo( 
                paginador.getOffset(), 
                paginador.getLimit());
    }
    
    public Emprestimo pesquisarPorId(int id) {
        return dao.pesquisarPorId(id);
    }
    
    public List<Emprestimo> pesquisarAtrasados() {
        contar();
        return dao.pesquisarAtrasados(
                paginador.getOffset(), 
                paginador.getLimit());
    }
    
    public List<Emprestimo> pesquisarRealizados() {
        contar();
        return dao.pesquisarRealizados(
                paginador.getOffset(), 
                paginador.getLimit());
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        this.emprestimo.setAluno(aluno);
        this.emprestimo.setLivro(livro);
    }

    public Paginador getPaginador() {
        return paginador;
    }
    
    private void contar() {
        long contagem = dao.contar(paginador.getCondicao());
        paginador.setCont(contagem);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void fecharConexao() {
        if (dao != null) {
            dao.fechar();
        }
    }
}
