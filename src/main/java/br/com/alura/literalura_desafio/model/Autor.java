package br.com.alura.literalura_desafio.model;

public class Autor {

    private Integer dataNascimento;
    private Integer dataFalecimento;
    private String nome;

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(Integer dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "dataNascimento=" + dataNascimento +
                ", dataFalecimento=" + dataFalecimento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
