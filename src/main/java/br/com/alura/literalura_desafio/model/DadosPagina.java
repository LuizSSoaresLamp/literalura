package br.com.alura.literalura_desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPagina(@JsonAlias("count") Integer quantidade,
                          @JsonAlias("results") List<DadosLivro> results){
    @Override
    public String toString() {
        return "**************************\n" +
                "\nQuantidade de livros com esse titulo = " + quantidade + "\n" +
                "Resultados da busca=" + results;

    }
}
