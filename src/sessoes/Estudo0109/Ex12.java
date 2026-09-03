package sessoes.Estudo0109;

public class Ex12 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""

                    ====== Menu de Utilitários ======

                    (1) Verificar se um número é par
                    (2) Calcular fatorial
                    (3) Encontrar o maior valor de um array
                    (4) Converter Celsius para Fahrenheit
                    (5) Converter Fahrenheit para Celsius
                    (6) Encerrar programa
                    """);

            int opcao = Ex10.lerNumeroInteiro();

            switch (opcao) {
                case 1 -> verificarParidade();
                case 2 -> calcularFatorial();
                case 3 -> encontrarMaiorValor();
                case 4 -> converterCelsiusParaFahrenheit();
                case 5 -> converterFahrenheitParaCelsius();
                case 6 -> {
                    System.out.println("Encerrando programa...");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void verificarParidade() {
        int numero = Ex10.lerNumeroInteiro();
        String resultado = Utilitarios.ePar(numero) ? "par" : "ímpar";
        System.out.printf("%d é %s.%n", numero, resultado);
    }

    private static void calcularFatorial() {
        int numero = Ex10.lerNumeroInteiroPositivo();
        System.out.printf("O fatorial de %d é %d.%n", numero, Utilitarios.calcularFatorial(numero));
    }

    private static void encontrarMaiorValor() {
        int quantidade = Ex10.lerNumeroInteiroPositivo();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o número %d de %d:%n", i + 1, quantidade);
            numeros[i] = Ex10.lerNumeroInteiro();
        }

        System.out.printf("O maior valor é %d.%n", Utilitarios.encontrarMaiorValor(numeros));
    }

    private static void converterCelsiusParaFahrenheit() {
        double celsius = Ex10.lerNumeroDecimalEmIntervalo(-100, 100);
        System.out.printf("%.2f°C equivalem a %.2f°F.%n", celsius,
                Utilitarios.celsiusParaFahrenheit(celsius));
    }

    private static void converterFahrenheitParaCelsius() {
        double fahrenheit = Ex10.lerNumeroDecimalEmIntervalo(-148, 212);
        System.out.printf("%.2f°F equivalem a %.2f°C.%n", fahrenheit,
                Utilitarios.fahrenheitParaCelsius(fahrenheit));
    }
}
