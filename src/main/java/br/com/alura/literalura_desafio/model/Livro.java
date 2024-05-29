package br.com.alura.literalura_desafio.model;

import java.util.List;
import java.util.Optional;

public class Livro {

    private Integer id;
    private String titulo;
    private List<DadosAutor> autor;
    private List<String> idioma;
    private Integer numeroDownloads;

    public Livro(DadosLivro dadosLivro){
        this.id = Optional.of(Integer.valueOf(dadosLivro.id())).orElse(0);
        this.titulo = dadosLivro.titulo();
        this.autor = dadosLivro.autor();
        this.idioma = dadosLivro.idioma();
        this.numeroDownloads = Optional.of(Integer.valueOf(dadosLivro.numeroDownload())).orElse(0);

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<DadosAutor> getAutor() {
        return autor;
    }

    public void setAutor(List<DadosAutor> autor) {
        this.autor = autor;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public Integer getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(Integer numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autores='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", numeroDownloads='" + numeroDownloads + '\'';
    }
}
