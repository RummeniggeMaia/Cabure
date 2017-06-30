/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.controle;

import com.rjsoft.cabure.controle.tabela.Paginador;
import com.rjsoft.cabure.dao.LivroJpaController;
import com.rjsoft.cabure.modelo.Livro;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author JAEDSON
 */
public class LivroCtrl {
    private Livro livro;
    private final LivroJpaController dao;
    private final Paginador paginador;

    public LivroCtrl(EntityManager em) {
        livro = new Livro();
        dao = new LivroJpaController(em);
        paginador = new Paginador();
    }

    public void salvarLivro() {
        dao.salvar(livro);
    }

    public List<Livro> pesquisarAlunos() {
        return dao.pesquisarTudo(paginador.getOffset(), paginador.getLimit());
    }

    public List<Livro> pesquisar() {
        contar();
        return dao.pesquisar(
                paginador.getCondicao(), 
                paginador.getOffset(), 
                paginador.getLimit());
    }
    
    public Livro pesquisarPorId(int id) {
        return dao.pesquisarPorId(id);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Paginador getPaginador() {
        return paginador;
    }
    
    private void contar() {
        long contagem = dao.contar(paginador.getCondicao());
        paginador.setCont(contagem);
    }
    
    public LivroJpaController getDao() {
        return dao;
    }

    public void fecharConexao() {
        if (dao != null) {
            dao.fechar();
        }
    }
    
    public List<Livro> pesquisarRelatorioLivro(Boolean condicao) {
        return dao.pesquisarRelatorioLivro(condicao);
    }
}
