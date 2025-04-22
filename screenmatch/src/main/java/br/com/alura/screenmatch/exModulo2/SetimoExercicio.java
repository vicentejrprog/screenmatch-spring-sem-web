package br.com.alura.screenmatch.ex;

public class SetimoExercicio {

    public static void main(String[] main){
        LambdaDivisor divisor = (a, b) -> {
            if(b == 0) throw  new ArithmeticException("Não é possível dividir por zero");
            return a / b;
        };

        try {
            System.out.println(divisor.dividir(15,5));
            System.out.println(divisor.dividir(15,0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
