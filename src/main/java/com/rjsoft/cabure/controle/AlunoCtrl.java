package com.rjsoft.cabure.controle;

import com.rjsoft.cabure.controle.tabela.Paginador;
import com.rjsoft.cabure.dao.AlunoJpaController;
import com.rjsoft.cabure.modelo.Aluno;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author jrpmaia
 */
public class AlunoCtrl {

    private Aluno aluno;
    private final AlunoJpaController dao;
    private final Paginador paginador;

    public AlunoCtrl(EntityManager em) {
        aluno = new Aluno();
        dao = new AlunoJpaController(em);
        paginador = new Paginador();
    }

    public void salvarAluno() {
        dao.salvar(aluno);
    }

    public List<Aluno> pesquisarAlunos() {
        return dao.pesquisarTudo(paginador.getOffset(), paginador.getLimit());
    }

    public List<Aluno> pesquisar() {
        contar();
        return dao.pesquisar(
                paginador.getCondicao(), 
                paginador.getOffset(), 
                paginador.getLimit());
    }
    
    public Aluno pesquisarPorId(int id) {
        return dao.pesquisarPorId(id);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Paginador getPaginador() {
        return paginador;
    }
    
    private void contar() {
        long contagem = dao.contar(paginador.getCondicao());
        paginador.setCont(contagem);
    }

    public void fecharConexao() {
        if (dao != null) {
            dao.fechar();
        }
    }
}
