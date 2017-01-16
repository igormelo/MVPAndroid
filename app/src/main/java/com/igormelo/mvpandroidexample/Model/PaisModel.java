package com.igormelo.mvpandroidexample.Model;

/**
 * Created by root on 12/01/17.
 */
public class PaisModel {
    private String nome;
    private String continente;
    private String urlDaImagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getUrlDaImagem() {
        return urlDaImagem;
    }

    public void setUrlDaImagem(String urlDaImagem) {
        this.urlDaImagem = urlDaImagem;
    }
}
