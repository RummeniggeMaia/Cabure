/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsoft.cabure.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.Min;

/**
 *
 * @author JAEDSON
 */
@Entity
public class Livro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false, length = 100, unique = true)
    private String subtitulo;
    @Column(nullable = false, length = 100)
    private String editora;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ano;
    @Column(length = 10)
    private String serie;
    @Column(length = 100)
    private String isbn;
    @Column(length = 100)
    private String numeroEdicao;
    @Column(length = 100)
    private String volume;
    @Min(0)
    private Integer numeroPaginas;
    @Column(length = 100)
    private String local;
    @Column(length = 100)
    private String primeiroAutor;
    @Column(length = 100)
    private String segundoAutor;
    @Column(length = 100)
    private String terceiroAutor;
    
    public Livro(){
    }
    
    public Livro(
            String titulo,
            String subtitulo,
            String editora,
            Date ano,
            String serie,
            String isbn,
            String numero_edicao,
            String volume,
            Integer numero_paginas,
            String cidade,
            String primeiro_autor,
            String segundo_autor,
            String terceiro_autor){
        
        titulo = this.titulo;
        subtitulo = this.subtitulo;
        editora = this.editora;
        ano = this.ano;
        serie = this.serie;
        isbn = this.isbn;
        numero_edicao = this.numeroEdicao;
        volume = this.volume;
        numero_paginas = this.numeroPaginas;
        cidade = this.local;
        primeiro_autor = this.primeiroAutor;
        segundo_autor = this.segundoAutor;
        terceiro_autor = this.terceiroAutor;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(String numero_edicao) {
        this.numeroEdicao = numero_edicao;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numero_paginas) {
        this.numeroPaginas = numero_paginas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPrimeiroAutor() {
        return primeiroAutor;
    }

    public void setPrimeiroAutor(String primeiro_autor) {
        this.primeiroAutor = primeiro_autor;
    }

    public String getSegundoAutor() {
        return segundoAutor;
    }

    public void setSegundoAutor(String segundo_autor) {
        this.segundoAutor = segundo_autor;
    }

    public String getTerceiroAutor() {
        return terceiroAutor;
    }

    public void setTerceiroAutor(String terceiro_autor) {
        this.terceiroAutor = terceiro_autor;
    }
        
    
}
