package br.com.alura.literalura_desafio;


import br.com.alura.literalura_desafio.dto.PaginaDTO;
import br.com.alura.literalura_desafio.service.ConsumoApi;
import br.com.alura.literalura_desafio.service.ConverteDados;
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
		var json = consumoApi.obterDados("https://gutendex.com/books/?search=peter+pan");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		PaginaDTO dadosPagDTO = conversor.obterDados(json, PaginaDTO.class);
		System.out.println(dadosPagDTO);

	}
}
