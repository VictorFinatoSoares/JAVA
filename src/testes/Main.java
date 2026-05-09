package testes;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nQual teste executar? (0 para sair): ");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
                continue;
            }

            int teste = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            if (teste == 0) {
                continuar = false;
            } else {
                Testes.executar(sc, teste);
            }
        }

        sc.close();
        System.out.println("Encerrando...");
    }
}

class Testes {

    public static void executar(Scanner sc, int teste) {
        switch (teste) {
            case 1:
                t01(sc);
                break;
            case 2:
                t02();
                break;

            default:
                System.out.println("Teste " + teste + " não encontrado.");
        }
    }

    public static void t01(Scanner sc) {
        System.out.print("Escreva algo: ");
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Invertido: " + reversed);
    }

    public static void t02() {

        int i = 0;
        int soma = 0;
        int q = 0;

        while (i <= 200) {
            int j = 1;
            int div = 0;


            while (j <= i) {
                if (i % j == 0) {
                    div++;
                }
                j++;
            }

            if (div == 2) {
                System.out.printf("PRIMO: %d%n", i);
                q++;
                soma += i;
            }


            i++;
        }

        System.out.printf("A soma é %d%n", soma);
        System.out.printf("Quantidade de primos: %d", q);

    }


}