package com.rjsoft.cabure.gui.listeners;

/**
 *
 * @author jrpmaia
 */
public interface AcordeonListener {
    
    public static final int BOT_CAD_ALUNO = 0;
    public static final int BOT_PES_ALUNO = 1;
    public static final int BOT_CAD_LIVRO = 2;
    public static final int BOT_PES_LIVRO = 3;
    public static final int MENU_INICIO = 4;
    public static final int MENU_EMPRESTIMO = 5;
    
    public void botaoAcordeonPressionado(int botao);
}
