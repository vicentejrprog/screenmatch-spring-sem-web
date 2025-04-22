package br.com.alura.screenmatch.ex;

public class SegundoExercicio {
    public static void main(String[] main){
        LambdaPrimo numero = (a) -> {
            if (a <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++){
                if (a % i == 0){
                    return false;
                }
            }

            return true;
            };

        System.out.println(numero.verificao(44));
    }
}
