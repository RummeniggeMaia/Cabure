package com.rjsoft.cabure.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jrpmaia
 */
@Entity()
public class Emprestimo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @ManyToOne(fetch = FetchType.EAGER)
    private Aluno aluno;
    @ManyToOne(fetch = FetchType.EAGER)
    private Livro livro;
    private int quantidade;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataEmprestimo;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date prazo;
    private boolean finalizado;
    

    public Emprestimo() {
    }

    public Emprestimo(Aluno aluno, Livro livro, int quantidade) {
        this.aluno = aluno;
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer Id) {
        this.ID = Id;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
