package br.com.alura.literalura_desafio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosPagina {


    private int quantidade;
    private String proximo;
    private String anterior;
    private List<Livro> resultado;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProximo() {
        return proximo;
    }

    public void setProximo(String proximo) {
        this.proximo = proximo;
    }

    public String getAnterior() {
        return anterior;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public List<Livro> getResultado() {
        return resultado;
    }

    public void setResultado(List<Livro> resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return
                "quantidade= " + quantidade +
                ", próximo= " + proximo + '\'' +
                ", anterior= " + anterior + '\'' +
                ", resultado= " + resultado + '\'';
    }
}
