/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure;

import com.rjsoft.cabure.controle.AlunoCtrl;
import com.rjsoft.cabure.modelo.Aluno;
import com.rjsoft.cabure.util.JPAUtil;
import java.util.Date;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jrpmaia
 */
public class AlunoCtrlTest {

    Aluno aluno;
    AlunoCtrl ctrl;

    public AlunoCtrlTest() {
    }

    @Before
    public void setUp() {
        EntityManager em = JPAUtil.EMF.createEntityManager();

        ctrl = new AlunoCtrl(em);

        aluno = new Aluno();
        aluno.setBairro("bairro 12");
        aluno.setCpf("123.456.7");
        aluno.setDataNascimento(new Date());
        aluno.setEmail("mail@mail.com");
        aluno.setEndereco("Endereço 1");
        aluno.setMatricula("123");
        aluno.setNome("Aluno Um");
        aluno.setNumero(321);
        aluno.setObservacao("obs");
        aluno.setRg("987.654.321");
        aluno.setSexo('M');
        aluno.setSituacao(true);
        aluno.setTelefone("(99) 9 9999-9999");

        ctrl.setAluno(aluno);
    }

    @After
    public void tearDown() {
        aluno = null;
        ctrl = null;
    }

    @Test()
    public void cadastrarAluno() {
//        try {
//            ctrl.cadastrarAluno();
//        } catch (PersistenceException ex) {
//            ConstraintViolationException cve = (ConstraintViolationException) ex.getCause();
//            fail("Chaves duplicatas " + cve.getConstraintName());
//        }
    }

    public void pesquisarAluno() {

    }
}
