package com.rjsoft.cabure.dao;

import com.rjsoft.cabure.modelo.Emprestimo;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;

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
        Query query = entityManager.createQuery("SELECT e FROM Emprestimo e");
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public long contar(String condicao) {
        Query query = entityManager.createQuery(
                "SELECT COUNT(e) FROM Emprestimo e");
        return (Long) query.getSingleResult();
    }

    public Emprestimo pesquisarPorId(int id) {
        return entityManager.find(Emprestimo.class, id);
    }
    
    public List<Emprestimo> pesquisarAtrasados(int offset, int limit) {
        Query query = entityManager.createQuery(
                "SELECT e FROM Emprestimo e WHERE e.prazo < :hoje");
        query.setParameter("hoje", new Date(), TemporalType.DATE);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public void fechar() {
        if (entityManager != null) {
            entityManager.close();
        }
    }
}
