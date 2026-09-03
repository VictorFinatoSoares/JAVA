package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex10 {
    public static final Scanner sc = new Scanner(System.in);
    public static int lerNumeroInteiro() {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Insira um número inteiro.");
            }
        }
    }

    public static int lerNumeroInteiroPositivo() {
        int num = 0;

        while (true) {
            try {
                System.out.print("Digite um número inteiro POSITIVO: ");
                num = Integer.parseInt(sc.nextLine());

                if (num <= 0) {
                    System.out.println("O número precisa ser POSITIVO!");
                    continue;
                }

                return num;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Insira um número inteiro.");
            }
        }
    }

    public static int lerNumeroInteiroNaoNegativo() {
        int num = 0;

        while (true) {
            try {
                System.out.print("Digite um número inteiro NÃO NEGATIVO: ");
                num = Integer.parseInt(sc.nextLine());

                if (num < 0) {
                    System.out.println("O número precisa ser NÃO NEGATIVO!");
                    continue;
                }

                return num;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Insira um número inteiro.");
            }
        }
    }

    public static double lerNumeroDecimalEmIntervalo(int inicio, int fim) {
        double num = 0;

        while (true) {
            try {
                System.out.printf("Digite um número entre %d e %d: ", inicio, fim);
                num = Double.parseDouble(sc.nextLine());

                if (num < inicio || num > fim) {
                    System.out.printf("O número precisa estar no intervalo (%d, %d)!%n", inicio, fim);
                    continue;
                }

                return num;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Insira um número.");
            }
        }
    }
}
