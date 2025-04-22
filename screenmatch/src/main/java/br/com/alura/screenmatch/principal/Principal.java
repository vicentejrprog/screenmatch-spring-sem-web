package br.com.alura.screenmatch.principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

public class Principal {
    private Scanner leitura = new Scanner (System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY   = "&apikey=af61110c";
    ConsumoApi consumoApi = new ConsumoApi();

    public void exibeMenu(){
        System.out.println("Digite o nome da série para pesquisar:");
        var nomeSerie = leitura.nextLine();
        var json = consumoApi.obterDado(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        ConverteDados converteDados = new ConverteDados();
        DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dados);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for(int i = 1; i <= dados.totalTemporadas(); i++){
            json = consumoApi.obterDado(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            ConverteDados converteDados1 = new ConverteDados();
            DadosTemporada temporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(temporada);
        }

        temporadas.forEach(System.out::println);

//        for(int i = 0; i < temporadas.size(); i++){
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//           ;for(int j = 0; j < episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));






    }

}
