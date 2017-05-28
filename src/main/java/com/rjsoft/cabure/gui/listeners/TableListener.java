package com.rjsoft.cabure.gui.listeners;

/**
 *
 * @author jrpmaia
 */
public interface TableListener {
    
    public static final int TELA_PES_ALUNO = 0;
    public static final int TELA_PES_LIVRO = 1;
    
    /**
     * Método utilizado para informar ao CabureGUI que uma entidade foi
     * selecionada, o id é passado para o controle da entidade para ser
     * carregada no formulário.
     * 
     * @param fonte Painel fonte de que contém a tabela onde foi selecionada a
     * entidade.
     * @param idEntidade Id da entidade a ser pesquisada na base de dados.
     */
    public void linhaSelecionada(int fonte, int idEntidade);
}
