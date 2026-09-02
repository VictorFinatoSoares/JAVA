package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibe o menu de opções
        while (true) {
            System.out.println("""
   
                    ====== Menu ======
                    
                    (1) Converter Celsius para Fahrenheit
                    (2) Converter Fahrenheit para Celsius
                    (3) Encerrar programa
                    """);

            System.out.print("Qual opção você quer? ");
            int opcao = Integer.parseInt(sc.nextLine());

            // Continua conforme o que foi escolhido
            if (opcao == 1) {
                System.out.print("Informe a temperatura em °C: ");

                double tempCelsius = Double.parseDouble(sc.nextLine());
                celsiusParaFahrenheit(tempCelsius);
            } else if (opcao == 2) {
                System.out.print("Informe a temperatura em °F: ");

                double tempFahrenheit = Double.parseDouble(sc.nextLine());
                fahrenheitParaCelsius(tempFahrenheit);
            } else if (opcao == 3) {
                System.out.println("Encerrando programa...");
                break;
            } else {
                System.out.println("Desculpe! Essa opção não está no menu, tente novamente!");
            }
        }
    }

    public static void celsiusParaFahrenheit(double tempCelsius) {
        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("\n%.2f°C equivalem a %.2f°F%n",tempCelsius, tempFahrenheit);
    }

    public static void fahrenheitParaCelsius(double tempFahrenheit) {
        double tempCelsius = (tempFahrenheit - 32) * 1.8;

        System.out.printf("\n%.2f°F equivalem a %.2f°C%n",tempFahrenheit, tempCelsius);
    }
}
