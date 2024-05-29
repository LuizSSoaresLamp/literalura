package br.com.alura.literalura_desafio.principal;

import br.com.alura.literalura_desafio.model.DadosPagina;
import br.com.alura.literalura_desafio.model.Livro;
import br.com.alura.literalura_desafio.model.Pagina;
import br.com.alura.literalura_desafio.service.ConsumoApi;
import br.com.alura.literalura_desafio.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books/";
    private List<DadosPagina> dadosPagina = new ArrayList<>();


    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = ("""
                    --------Escolha uma opção pelo numero--------
                    1 - buscar livro pelo titulo
                    2 - listar livros registrados
                    3 - listar autores registrados
                    4 - listar autores vivos em um determinado ano
                    5 - lista livros em um determinado idioma
                    0 - sair
                    """);

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroPorTitulo();
                    break;
                case 2:
                    buscarLivroRegistrado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");


            }
        }

    }



    private void buscarLivroPorTitulo() {
        DadosPagina dados = getDadosPagina();
        dadosPagina.add(dados);
        System.out.println(dados);

    }

    private DadosPagina getDadosPagina(){
        System.out.println("Digite o nome do titulo para busca: ");
        var nomeLivro = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO +"?search=" + nomeLivro.replace(" ", "%20").toLowerCase());
        DadosPagina dados = conversor.obterDados(json, DadosPagina.class);
        return dados;
    }

    private void buscarLivroRegistrado() {
        dadosPagina.forEach(System.out::println);
    }

    }

