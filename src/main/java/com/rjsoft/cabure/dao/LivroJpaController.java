/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.dao;

import com.rjsoft.cabure.modelo.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author JAEDSON
 */
public class LivroJpaController {

    private final EntityManager entityManager;

    public LivroJpaController(EntityManager em) {
        entityManager = em;
    }

    public Livro salvar(Livro aluno) {
        Livro aux = null;
        entityManager.getTransaction().begin();
        try {
            aux = entityManager.merge(aluno);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        }
        return aux;
    }

    public List<Livro> pesquisarTudo(int offset, int limit) {
        Query query = entityManager.createQuery("SELECT l FROM Livro l");
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public List<Livro> pesquisar(String condicao, int offset, int limit) {
        Query query = entityManager.createQuery(
                "SELECT l FROM Livro l WHERE l.id IS NOT NULL " + condicao);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public long contar(String condicao) {
        Query query = entityManager.createQuery(
                "SELECT COUNT(l) FROM Livro l WHERE l.id IS NOT NULL " + condicao);
        return (Long) query.getSingleResult();
    }

    public Livro pesquisarPorId(int id) {
        return entityManager.find(Livro.class, id);
    }

    public void fechar() {
        if (entityManager != null) {
            entityManager.close();
        }
    }
    
}
