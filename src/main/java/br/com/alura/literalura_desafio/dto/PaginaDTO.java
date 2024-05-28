package br.com.alura.literalura_desafio.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaginaDTO(@JsonAlias("count") String quantidade,
                        @JsonAlias("results") List<LivroDTO> results){
}
