package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();

		var json = consumoApi.obterDado("https://www.omdbapi.com/?t=breaking+bad&apikey=af61110c");

		ConverteDados conversor = new ConverteDados();

		DadosSerie serie = conversor.obterDados(json, DadosSerie.class);

		System.out.println(serie);

	}
}
