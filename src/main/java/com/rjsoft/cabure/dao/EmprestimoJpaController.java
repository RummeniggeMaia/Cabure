package com.rjsoft.cabure.dao;

import com.rjsoft.cabure.modelo.Emprestimo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jrpmaia
 */
public class EmprestimoJpaController {

    private final EntityManager entityManager;

    public EmprestimoJpaController(EntityManager em) {
        entityManager = em;
    }

    public Emprestimo salvar(Emprestimo emprestimo) {
        Emprestimo aux = null;
        entityManager.getTransaction().begin();
        try {
            aux = entityManager.merge(emprestimo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        }
        return aux;
    }

    public List<Emprestimo> pesquisarTudo(int offset, int limit) {
        Query query = entityManager.createQuery("SELECT e Emprestimo e");
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

//    public List<Aluno> pesquisar(String condicao, int offset, int limit) {
//        Query query = entityManager.createQuery(
//                "SELECT a FROM Aluno a WHERE a.id IS NOT NULL " + condicao);
//        query.setFirstResult(offset);
//        query.setMaxResults(limit);
//        return query.getResultList();
//    }

    public long contar(String condicao) {
        Query query = entityManager.createQuery(
                "SELECT COUNT(a) FROM Emprestimo e");
        return (Long) query.getSingleResult();
    }

    public Emprestimo pesquisarPorId(int id) {
        return entityManager.find(Emprestimo.class, id);
    }

    public void fechar() {
        if (entityManager != null) {
            entityManager.close();
        }
    }
}
