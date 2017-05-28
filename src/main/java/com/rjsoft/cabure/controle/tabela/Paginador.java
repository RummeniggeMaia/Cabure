package com.rjsoft.cabure.controle.tabela;

/**
 *
 * @author jrpmaia
 */
public class Paginador {

    private int offset;
    private int limit;
    private long cont;
    private String condicao;
    private final int[] limites;

    public Paginador() {
        this.offset = 0;
        this.limites = new int[]{5, 10, 15, 25, 50, 100};
        this.limit = limites[0];
        this.cont = 0;
        this.condicao = "";
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getCont() {
        return cont;
    }

    public void setCont(long cont) {
        this.cont = cont;
        if (this.cont == limit) {
            offset = 0;
        }
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public int[] getLimites() {
        return limites;
    }

    public void primeira() {
        offset = 0;
    }

    public void anterior() {
        offset -= limit;
        if (offset < 0) {
            offset = 0;
        }
    }

    public void proxima() {
        if (offset + limit < cont) {
            offset += limit;
        }
    }

    public void ultima() {
        offset = (int) (totalDePaginas() - 1) * limit;
    }
    
    public int paginaAtual() {
        if (cont > 0) {
            return offset / limit + 1;
        }
        return 0;
    }

    public long totalDePaginas() {
        long quociente = cont / limit;
        if (cont % limit != 0) {
            return quociente + 1;
        } else {
            return quociente;
        }
    }
    
    public boolean podeVoltar() {
        return paginaAtual() > 1;
    }

    public boolean podeSeguir() {
        return paginaAtual() < totalDePaginas();
    }

    public void pular(int pagina) {
        if (pagina > 0 && pagina <= totalDePaginas()) {
            offset = (pagina - 1) * limit;
        }
    }

    public void resetar() {
        this.offset = 0;
        this.limit = limites[0];
        this.cont = 0;
        this.condicao = "";
    }
}
