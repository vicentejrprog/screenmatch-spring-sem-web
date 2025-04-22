package br.com.alura.screenmatch.ex;

public class PrimeiroExercicio{
    public static void main(String[] main){
        LambdaConta multiplicacao = (a, b) -> a * b;
        System.out.println(multiplicacao.operacao(2,3));
    }
}
