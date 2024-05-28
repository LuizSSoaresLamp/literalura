package br.com.alura.literalura_desafio.model;

import br.com.alura.literalura_desafio.dto.AutorDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Livro {

    private Integer id;
    private String title;
    private List<AutorDTO> author;
    private String idioma;
    private Integer quantidadeDownloads;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AutorDTO> getAuthor() {
        return author;
    }

    public void setAuthor(List<AutorDTO> author) {
        this.author = author;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getQuantidadeDownloads() {
        return quantidadeDownloads;
    }

    public void setQuantidadeDownloads(Integer quantidadeDownloads) {
        this.quantidadeDownloads = quantidadeDownloads;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", idioma='" + idioma + '\'' +
                ", quantidadeDownloads=" + quantidadeDownloads +
                '}';
    }
}
