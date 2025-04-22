package br.com.alura.screenmatch.ex;

public class QuartoExercicio {
    public static void main(String[] args){
        LambdaPalindromo palindromo = a -> {
            if (a.equals(new StringBuilder(a).reverse().toString())){
                return true;
            }else {
                return false;
            }

        };

        System.out.println(palindromo.verificarPalindromo("ovo"));


    }
}
