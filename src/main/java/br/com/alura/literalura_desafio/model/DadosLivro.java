package br.com.alura.literalura_desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("id") Integer id,
                         @JsonAlias("title")String titulo,
                         @JsonAlias("authors") List<DadosAutor> autor,
                         @JsonAlias("languages") List<String> idioma,
                         @JsonAlias("download_count") Integer numeroDownload) {
    @Override
    public String toString() {
        return
                "\n Id = " + id + "\n" +
                "Titulo = " + titulo + "\n" +
                "Autor = " + autor + "\n" +
                "Idioma(s) = " + idioma + "\n" +
                "Numero de Downloads= " + numeroDownload+
                "\n****************************";
    }
}

