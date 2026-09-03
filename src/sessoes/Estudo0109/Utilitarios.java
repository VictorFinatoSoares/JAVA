package sessoes.Estudo0109;

public class Utilitarios {
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static int encontrarMaiorValor(int[] numeros) {
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
