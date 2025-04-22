package br.com.alura.screenmatch.ex;

import java.util.Arrays;
import java.util.List;

public class SextoExercicio {
    public static void main(String[] args){
        List<String> lista = Arrays.asList("batman", "superman", "aquaman");
        lista.sort((a, b) -> a.compareTo(b));
        System.out.println(lista);
    }
}
