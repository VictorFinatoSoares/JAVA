package aula27;

import java.util.Scanner;

public class ImortalVictorFinato {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciarNovaSimulacao();
    }

    public static void iniciarNovaSimulacao() {
        System.out.println("\n=== IMORTAL-1 – SISTEMA DE BORDO ===\n");

        int quantLeituras;

        while (true) {
            quantLeituras = lerInteiro("Quantas leituras vão ser realizadas (3-100)? ");

            if (quantLeituras < 3 || quantLeituras > 100) {
                System.out.println("Você precisa escolher entre 3 a 100 leituras!\n");
                continue;
            }

            break;
        }

        double[] leituras = realizarLeituras(quantLeituras);
        mainMenu(leituras);
    }

    public static double[] realizarLeituras(int quantLeituras) {
        double[] leituras = new double[quantLeituras];

        for (int i = 0; i < quantLeituras; i++) {
            double leitura = gerarNumero(2000);
            System.out.printf("Leitura %d: %.2f\n", i + 1, leitura);
            leituras[i] = leitura;
        }
        System.out.println();

        return leituras;
    }

    public static void mainMenu(double[] leituras) {
        System.out.println("""
                ============ MENU ============
                \s
                [1] Calcular média
                [2] Calcular valor máximo e mínimo
                [3] Calcular desvio de cada leitura em relação à média
                [4] Verificar se valores estão dentro da faixa segura
                [5] Gerar relatório completo
               """);

        while (true) {
            int opcao = lerInteiro("Escolha uma opção (1-5): ");

            if (opcao < 1 || opcao > 6) {
                System.out.println("OPÇÃO INVÁLIDA! Escolha entre uma opção entre 1 e 5.\n");
                continue;
            }

            if (opcao == 1) {
                System.out.printf("A média das leituras é: %.2f\n\n", calcularMedia(leituras));
            } else if (opcao == 2) {
                System.out.printf("Valor máximo: %.2f\nValor mínimo: %.2f\n\n", encontrarMaximo(leituras), encontrarMinimo(leituras));
            } else if (opcao == 3) {
                exibirDesvios(leituras);
            } else if (opcao == 4) {
                while (true) {
                    double min = lerDouble("Mínimo aceitável: ");
                    double max = lerDouble("Máximo aceitável: ");

                    if (min >= max) {
                        System.out.println("O valor mínimo precisa ser MENOR que o valor máximo!\n");
                        continue;
                    }

                    verificarFaixa(leituras, min, max);
                    break;
                }
            } else {
                exibirRelatorioCompleto(leituras);
            }

            System.out.print("Deseja realizar outra operação? (S/N) ");
            char res = sc.nextLine().charAt(0);

            if (res == 'N') {
                System.out.print("Deseja iniciar uma nova simulação (S/N)? ");
                char resposta = sc.nextLine().charAt(0);

                if (resposta == 'S') {
                    iniciarNovaSimulacao();
                } else {
                    System.out.println("Encerrando sistema...");
                    break;
                }
            }
        }
    }

    public static double calcularMedia(double[] leituras) {
        double soma = 0;

        for (double leitura : leituras) {
            soma += leitura;
        }

        return soma / leituras.length;
    }

    public static double encontrarMinimo(double[] leituras) {
        double menorValor = leituras[0];

        for (double leitura : leituras) {
            if (leitura < menorValor) {
                menorValor = leitura;
            }
        }

        return menorValor;
    }

    public static double encontrarMaximo(double[] leituras) {
        double maiorValor = 0;

        for (double leitura : leituras) {
            if (leitura > maiorValor) {
                maiorValor = leitura;
            }
        }

        return maiorValor;
    }

    public static void exibirDesvios(double[] leituras) {
        double media = calcularMedia(leituras);

        System.out.println("\n====== DESVIOS EM RELAÇÃO À MÉDIA ======\n");

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] - media > 0) {
                System.out.printf(" [ACIMA] Leitura %d: %.2f | DESVIO: %.2f\n", i + 1, leituras[i], leituras[i] - media);
            } else {
                System.out.printf(" [ABAIXO] Leitura %d: %.2f | DESVIO: %.2f\n", i + 1, leituras[i], leituras[i] - media);
            }
        }

        System.out.println();
    }

    public static void verificarFaixa(double[] leituras, double min, double max) {
        System.out.printf("\n====== VERIFICAÇÃO DA FAIXA (%.2f a %.2f) ======\n\n", min, max);

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] < min) {
                System.out.printf("Leitura %d: ABAIXO DO LIMITE!\n", i + 1);
            } else if (leituras[i] > max) {
                System.out.printf("Leitura %d: ACIMA DO LIMITE!\n", i + 1);
            } else {
                System.out.printf("Leitura %d: OK!\n", i + 1);
            }
        }

        System.out.println();
    }

    public static void exibirRelatorioCompleto(double[] leituras) {
        System.out.println("\n====== RELATÓRIO COMPLETO ======\n");
        System.out.printf("Quantidade de leituras: %d\n\n", leituras.length);

        for (int i = 0; i < leituras.length; i++) {
            System.out.printf("Leitura %d: %.2f\n", i + 1, leituras[i]);
        }

        System.out.printf("\nMédia: %.2f\n", calcularMedia(leituras));
        System.out.printf("Máximo: %.2f\n", encontrarMaximo(leituras));
        System.out.printf("Mínimo: %.2f\n", encontrarMinimo(leituras));

        exibirDesvios(leituras);
        verificarFaixa(leituras, 500, 1600);
    }

    public static double gerarNumero(int max) {
        return Math.random() * max;
    }

    public static int lerInteiro(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número INTEIRO!");
            }
        }
    }

    public static double lerDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número DOUBLE!");
            }
        }
    }
}
