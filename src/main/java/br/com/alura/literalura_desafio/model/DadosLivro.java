package br.com.alura.literalura_desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("title") String nomeLivro,
                         @JsonAlias("download_count") Integer quantidadeDownloads,
                         @JsonAlias("languages")List<String> idiomas) {
}
