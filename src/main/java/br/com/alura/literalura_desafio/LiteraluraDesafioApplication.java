package br.com.alura.literalura_desafio;

import br.com.alura.literalura_desafio.model.DadosLivro;
import br.com.alura.literalura_desafio.service.ConsumoApi;
import br.com.alura.literalura_desafio.service.ConvertDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraDesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraDesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://gutendex.com/books/?search=dom+casmurro");
		System.out.println(json);
		ConvertDados conversor = new ConvertDados();
		DadosLivro dados = conversor.obterDados(json, DadosLivro.class);
		System.out.println(dados);

	}
}
