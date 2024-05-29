package br.com.alura.literalura_desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAutor(@JsonAlias("name") String nome,
                         @JsonAlias("birth_year") Integer dataNascimento,
                         @JsonAlias("death_year") Integer dataFalecimento) {
    @Override
    public String toString() {
        return
                "Nome = " + nome +
                " DataNascimento = " + dataNascimento +
                " DataFalecimento = " + dataFalecimento;

    }
}
