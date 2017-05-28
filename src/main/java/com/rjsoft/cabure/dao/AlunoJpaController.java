package com.rjsoft.cabure.dao;

import com.rjsoft.cabure.modelo.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jrpmaia
 */
public class AlunoJpaController {

    private final EntityManager entityManager;

    public AlunoJpaController(EntityManager em) {
        entityManager = em;
    }

    public Aluno salvar(Aluno aluno) {
        Aluno aux = null;
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

    public List<Aluno> pesquisarTudo(int offset, int limit) {
        Query query = entityManager.createQuery("SELECT a FROM Aluno a");
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public List<Aluno> pesquisar(String condicao, int offset, int limit) {
        Query query = entityManager.createQuery(
                "SELECT a FROM Aluno a WHERE a.id IS NOT NULL " + condicao);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public long contar(String condicao) {
        Query query = entityManager.createQuery(
                "SELECT COUNT(a) FROM Aluno a WHERE a.id IS NOT NULL " + condicao);
        return (Long) query.getSingleResult();
    }

    public Aluno pesquisarPorId(int id) {
        return entityManager.find(Aluno.class, id);
    }

    public void fechar() {
        if (entityManager != null) {
            entityManager.close();
        }
    }
}
