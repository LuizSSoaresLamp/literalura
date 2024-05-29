package br.com.alura.literalura_desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Pagina {

    private String quantidade;
    private String proximo;
    private String anterior;
    private List<Livro> resultado;
    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
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
        return "Pagina{" +
                "quantidade='" + quantidade + '\'' +
                ", proximo='" + proximo + '\'' +
                ", anterior='" + anterior + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
