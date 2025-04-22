package br.com.alura.screenmatch.ex;

public class TerceiroExercicio {
    public static void main(String[] args){
        LambdaUpper capsLoc = a -> {
            return  a.toUpperCase();
        };

        System.out.println(capsLoc.maiusculo("oi"));


    }
}
