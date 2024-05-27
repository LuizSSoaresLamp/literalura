package br.com.alura.literalura_desafio.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class <T> classe);



}
