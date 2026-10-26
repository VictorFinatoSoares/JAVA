package aula30;

public class ExemploInicial {
    public static void main(String[] args) {
        String melhorTime = "GREMIO--É--O--MELHOR--TIME";

        String[] stringSeparada = melhorTime.split("--");

        for (String palavra : stringSeparada) {
            System.out.println(palavra);
        }
    }
}
