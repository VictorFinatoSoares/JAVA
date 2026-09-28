package aula27;

import java.util.Scanner;

public class IMORTAL_VICTOR_FINATO {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciarNovaSimulacao();
    }

    public static void iniciarNovaSimulacao() {
        boolean primeiraSimulacao = true;

        while (primeiraSimulacao || continuarSimulando()) {
            System.out.println("\n=== IMORTAL-1 – SISTEMA DE BORDO ===\n");
            int quantLeituras;

            while (true) {
                quantLeituras = lerInteiro("Quantas leituras vão ser realizadas (3-100)? ");

                if (quantLeituras < 3 || quantLeituras > 100) {
                    System.out.print("Você precisa escolher entre 3 a 100 leituras!\n\n");
                    continue;
                }
                break;
            }

            primeiraSimulacao = false;

            double[] leituras = realizarLeituras(quantLeituras);
            mainMenu(leituras);
        }

        System.out.print("Encerrando sistema...");
    }

    public static double[] realizarLeituras(int quantLeituras) {
        double[] leituras = new double[quantLeituras];

        for (int i = 0; i < quantLeituras; i++) {
            double leitura = gerarNumeroAleatorio(2000);
            leituras[i] = leitura;

            System.out.printf("Leitura %d: %.2f\n", i + 1, leitura);
        }

        return leituras;
    }

    public static void mainMenu(double[] leituras) {
        while (true) {
            System.out.print("""
                \s
                ============ MENU ============
                \s
                [1] Calcular média
                [2] Calcular valor máximo e mínimo
                [3] Calcular desvio de cada leitura em relação à média
                [4] Verificar se valores estão dentro da faixa segura
                [5] Gerar relatório completo
                [0] Sair do menu de operações
                \s
               """);

            int opcao = lerInteiro("Escolha uma opção (0-5): ");

            if (opcao < 0 || opcao > 5) {
                System.out.print("OPÇÃO INVÁLIDA! Escolha entre uma opção entre 0 e 5.\n\n");
                continue;
            } else if (opcao == 0) {
                System.out.print("Saindo do menu de operações...\n\n");
                return;
            }

            realizarOperacao(opcao, leituras);

            if (!continuarOperando()) {
                return;
            }
        }
    }

    public static void realizarOperacao(int opcaoMenu, double[] leituras) {
        if (opcaoMenu == 1) {
            System.out.printf("A média das leituras é: %.2f\n\n", calcularMedia(leituras));
        } else if (opcaoMenu == 2) {
            System.out.printf("Valor máximo: %.2f (Leitura %d)\n", encontrarMaximo(leituras), encontrarPosMaximo(leituras));
            System.out.printf("Valor mínimo: %.2f (Leitura %d)\n\n", encontrarMinimo(leituras), encontrarPosMinimo(leituras));
        } else if (opcaoMenu == 3) {
            exibirDesvios(leituras);
        } else if (opcaoMenu == 4) {
            while (true) {
                double min = lerDouble("Mínimo aceitável: ");
                double max = lerDouble("Máximo aceitável: ");

                if (min >= max) {
                    System.out.print("O valor mínimo precisa ser MENOR que o valor máximo!\n\n");
                    continue;
                }

                verificarFaixa(leituras, min, max);
                break;
            }
        } else {
            exibirRelatorioCompleto(leituras);
        }
    }

    public static boolean continuarOperando() {
        while (true) {
            System.out.print("Deseja realizar uma nova operação (S/N)? ");
            String resposta =  sc.nextLine();

            if (resposta.length() != 1 || (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"))) {
                System.out.print("ERRO: Resposta INVÁLIDA!\n\n");
                continue;
            }

            return resposta.equalsIgnoreCase("S");
        }
    }

    public static boolean continuarSimulando() {
        while (true) {
            System.out.print("Deseja iniciar uma nova simulação (S/N)? ");
            String resposta =  sc.nextLine();

            if (resposta.length() != 1 || (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"))) {
                System.out.print("ERRO: Resposta INVÁLIDA!\n\n");
                continue;
            }

            return resposta.equalsIgnoreCase("S");
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
        double maiorValor = leituras[0];

        for (double leitura : leituras) {
            if (leitura > maiorValor) {
                maiorValor = leitura;
            }
        }

        return maiorValor;
    }

    public static int encontrarPosMinimo(double[] leituras) {
        int posMenor = 1;

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] < leituras[posMenor - 1]) {
                posMenor = i + 1;
            }
        }

        return posMenor;
    }

    public static int encontrarPosMaximo(double[] leituras) {
        int posMaior = 1;

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] > leituras[posMaior - 1]) {
                posMaior = i + 1;
            }
        }

        return posMaior;
    }

    public static void exibirDesvios(double[] leituras) {
        System.out.print("\n====== DESVIOS EM RELAÇÃO À MÉDIA ======\n\n");
        double media = calcularMedia(leituras);

        for (int i = 0; i < leituras.length; i++) {
            System.out.printf(" Leitura %d: %.2f | DESVIO: %.2f\n", i + 1, leituras[i], leituras[i] - media);
        }

        System.out.println();
    }

    public static void verificarFaixa(double[] leituras, double min, double max) {
        System.out.printf("\n====== VERIFICAÇÃO DA FAIXA (%.2f a %.2f) ======\n\n", min, max);

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] < min) {
                System.out.printf(" Leitura %d: ABAIXO DO LIMITE!\n", i + 1);
            } else if (leituras[i] > max) {
                System.out.printf(" Leitura %d: ACIMA DO LIMITE!\n", i + 1);
            } else {
                System.out.printf(" Leitura %d: OK!\n", i + 1);
            }
        }
        System.out.println();
    }

    public static void exibirRelatorioCompleto(double[] leituras) {
        System.out.print("\n====== RELATÓRIO COMPLETO ======\n\n");
        System.out.printf("Quantidade de leituras: %d\n\n", leituras.length);

        for (int i = 0; i < leituras.length; i++) {
            System.out.printf("Leitura %d: %.2f\n", i + 1, leituras[i]);
        }

        System.out.printf("\nMédia: %.2f\n", calcularMedia(leituras));
        System.out.printf("Máximo: %.2f (Leitura %d)\n", encontrarMaximo(leituras), encontrarPosMaximo(leituras));
        System.out.printf("Mínimo: %.2f (Leitura %d)\n", encontrarMinimo(leituras), encontrarPosMinimo(leituras));

        exibirDesvios(leituras);
        verificarFaixa(leituras, 500, 1600);
    }

    public static double gerarNumeroAleatorio(int max) {
        return Math.random() * max;
    }

    public static int lerInteiro(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número INTEIRO!\n");
            }
        }
    }

    public static double lerDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número DOUBLE!\n");
            }
        }
    }
}
