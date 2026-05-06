package com.finatodev;

import java.util.Scanner;

public class Aula10EX {
    static void main() {
        ex05();
    }

    public static void ex01() {
        System.out.println("RODANDO EXERCÍCIO #01:");
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double soma = 0;

        while (i <= 20) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            soma += num;
            i++;
        }

        sc.close();
        System.out.printf("A soma de todos estes números é %.2f!", soma);

    }

    public static void ex02() {
        System.out.println("RODANDO EXERCÍCIO #02:");
        int i = 0;
        while (i <= 1000) {
            System.out.println(i);
            i++;
        }

    }

    public static void ex03() {
        System.out.println("RODANDO EXERCÍCIO #03:");
        int i = 0;
        while (i <= 2000) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

            i++;
        }
    }

    public static void ex04() {
        System.out.println("RODANDO EXERCÍCIO #04:");
        int i = 1000;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    public static void ex05() {
        System.out.println("RODANDO EXERCÍCIO #05:");
        Scanner sc = new Scanner(System.in);

        int qVogais = 0;
        int qConsoantes = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite uma letra: ");
            String line = sc.nextLine();
            if (!line.isEmpty()) {
                char l = line.charAt(0);
                char upperL = Character.toUpperCase(l);

                switch (upperL) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        qVogais++;
                        break;
                    default:
                        qConsoantes++;
                }

                i++;
            } else {
                System.out.println("VAZIO! TENTE NOVAMENTE!");

            }


        }

        System.out.printf("Quantidade de vogais: %d%n", qVogais);
        System.out.printf("Quantidade de consoantes: %d", qConsoantes);
        sc.close();

    }

    public static void ex06() {
        System.out.println("RODANDO EXERCÍCIO #06:");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número decimal: ");
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println("O número inserido é VÁLIDO!");
                break;
            } else {
                System.out.println("O número inserido é INVÁLIDO!");
                System.out.println("TENTE NOVAMENTE!");
            }


        }
        sc.close();

    }

    public static void ex07() {
        System.out.println("RODANDO EXERCÍCIO #07:");
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int soma = 0;

        while (i <= 10) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            soma += num;
            i++;
        }

        sc.close();
        System.out.printf("A soma de todos estes números é %d!", soma);

    }

    public static void ex08() {
        System.out.println("RODANDO EXERCÍCIO #08:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você irá digitar?");
        int quant = sc.nextInt();
        int i = 1;
        while (i <= quant) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println("POSITIVO!");
            } else if (num == 0) {
                System.out.println("ZERO!");
            } else {
                System.out.println("NEGATIVO!");
            }

            i++;
        }

        sc.close();


    }

    public static void ex09() {
        System.out.println("RODANDO EXERCÍCIO #09:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int val1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int val2 = sc.nextInt();

        if (val1 >= 0 && val2 >= 0) {
            int menor = Math.min(val1, val2);
            int maior = Math.max(val1, val2);
            int i = menor;
            while (i <= maior) {

                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;

            }

        } else {
            System.out.println("Não pode ser negativo.");
        }

        sc.close();


    }

    public static void ex10() {
        System.out.println("RODANDO EXERCÍCIO #10:");

        int i = 0;
        int soma = 0;

        while (i <= 198) {
            soma += i;
            i++;
        }

        System.out.printf("A soma de todos os números de 0 a 198 é: %d", soma);


    }

    public static void ex11() {
        System.out.println("RODANDO EXERCÍCIO #11:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Início: ");
        int inicio = sc.nextInt();

        System.out.print("Fim: ");
        int fim = sc.nextInt();

        int somaPares = 0;
        int somaImpares = 0;
        if (inicio <= fim) {
            while (inicio <= fim) {
                if (inicio % 2 == 0) {
                    somaPares += inicio;
                } else {
                    somaImpares += inicio;
                }

                inicio++;
            }

            System.out.printf("A soma dos pares é %d%n", somaPares);
            System.out.printf("A soma dos ímpares é %d", somaImpares);

        } else {
            System.out.println("O início precisa ser MENOR que o fim!");
        }

        sc.close();

    }

    public static void ex12() {
        System.out.println("RODANDO EXERCÍCIO #12:");
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int qtd = 0;

        while (true) {
            System.out.print("Escreva um número: ");
            double num = sc.nextDouble();

            if (num >= 0) {
                soma += num;
                qtd++;
            } else {
                System.out.printf("A média destes números é: %.2f", (soma / qtd));
                break;
            }
        }
        sc.close();

    }

    public static void ex13() {
        System.out.println("RODANDO EXERCÍCIO #13:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        int i = 1;
        int fatorial = 1;

        if (num >= 0) {
            while (i <= num) {

                fatorial *= i;
                i++;
            }

            System.out.printf("O fatorial de %d é %d.", num, fatorial);

        } else {
            System.out.println("O NÚMERO PRECISA SER POSITIVO!");
        }

        sc.close();


    }

    public static void ex14() {
        System.out.println("RODANDO EXERCÍCIO #14:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int num = sc.nextInt();

        int i = 1;
        int divisores = 0;

        while (i <= num) {
            if (num % i == 0) {
                divisores++;
            }

            i++;
        }

        if (divisores == 2) {
            System.out.printf("%d é PRIMO!", num);
        } else {
            System.out.printf("%d NÃO é PRIMO!", num);
        }


        sc.close();

    }

    public static void ex15() {
        System.out.println("RODANDO EXERCÍCIO #15:");

        int i = 1;
        int soma = 0;
        while (i <= 200) {

            int j = 1;
            int divisores = 0;


            while (j <= i) {
                if (i % j == 0) {
                    divisores++;
                }
                j++;
            }

            if (divisores == 2) {
                System.out.println(i);
                soma += i;
            }


            i++;
        }

        System.out.printf("A soma é %d!", soma);


    }
}
