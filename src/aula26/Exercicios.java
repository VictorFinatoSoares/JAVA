package aula26;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("\n=== Teste do Exercício 20: ===\n\nInforme a quantidade de segundos: ");
                int qtdSegundos = Integer.parseInt(sc.nextLine());

                imprimirHorasMinutosSegundos(qtdSegundos);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um NÚMERO INTEIRO!");
            }
        }
    }

    public static void imprimirGremioImortal() {
        System.out.println("Grêmio Imortal");
    }

    public static int dobrarNumero(int numero) {
        return numero * 2;
    }

    public static void verificarMaiorIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }

    public static double verificarMediaNotas(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static int maximo(int a, int b) {
        return Math.max(a, b);
    }

    public static void vogalOuConsoante(char letra) {
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};

        for (char vogal : vogais) {
            if (vogal == letra) {
                System.out.println("É vogal.");
                return;
            }
        }

        System.out.println("É consoante.");
    }

    public static double calcularRaioCirculo(double raio) {
        return (raio * raio) * Math.PI;
    }

    public static int verificarParidade(int numero) {
        if (numero % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void calcularFatorial(int numero) {
        if (numero <= 0) {
            System.out.println("O número precisa ser POSITIVO!");
            return;
        }

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d\n", numero, fatorial);
    }

    public static void reaisParaDolares(double reais) {
        System.out.printf("R$ %.2f equivale a $ %.2f dólares\n", reais, reais * 5);
    }

    public static double calculoComOperacoes(double num1, double num2, char operador) {
        return switch (operador) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Erro: DIVISÃO POR ZERO!");
                    yield -1;
                }
                yield num1 / num2;
            }
            default -> {
                System.out.println("Operador INVÁLIDO!");
                yield -1;
            }
        };
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void imprimirQuadrado(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static int somarAteN(int n) {
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        return soma;
    }

    public static int verificarPrimo(int n) {
        int qDivisores = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                qDivisores++;
            }
        }

        if (qDivisores == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void imprimirVetor(int[][] vetor) {
        for (int[] linha: vetor) {
            for (int elemento: linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void imprimirHorasMinutosSegundos(int qSegundos) {
        int qMinutos = qSegundos / 60;
        int qHoras = qMinutos / 60;

        qSegundos -= 60 * qMinutos;
        qMinutos -= 60 * qHoras;

        System.out.printf("%02dh:%02dm:%02ds", qHoras, qMinutos, qSegundos);

    }

}
