package com.finatodev;

import java.util.Scanner;

public class Aula12EX {
    public static void main(String[] args) {
        ex03();
    }

    public static void ex01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de usuários: ");
        int users = Integer.parseInt(sc.nextLine());

        int torcGremio = 0;

        for (int i = 0; i < users; i++) {
            System.out.printf("Informe o time do torcedor [%d]: ", i + 1);
            String time = sc.nextLine().strip();

            if (time.equalsIgnoreCase("Grêmio")) {
                torcGremio++;
            }

        }

        System.out.printf("Entre %d usuários, %d são torcedores do Grêmio!", users, torcGremio);
        sc.close();


    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos patinhos foram passear? ");
        int patinhos = sc.nextInt();

        int j = 0;

        for (int i = patinhos; i > 0; i--) {
            j++;

            if (i > 2) {
                System.out.printf("%d patinhos%n" +
                        "Foram passear%n" +
                        "Além das montanhas%n" +
                        "Para brincar%n" +
                        "A mamãe gritou%n" +
                        "Quack quack quack%n" +
                        "Mas só %d patinhos%n" +
                        "Voltaram de lá%n%n", i, patinhos - j);
            } else if (i == 2) {
                System.out.printf("2 patinhos%n" +
                        "Foram passear%n" +
                        "Além das montanhas%n" +
                        "Para brincar%n" +
                        "A mamãe gritou%n" +
                        "Quack quack quack%n" +
                        "Mas só 1 patinho%n" +
                        "Voltou de lá%n%n");
            } else {
                System.out.printf("1 patinho foi passear%n" +
                        "Além das montanhas%n" +
                        "Para brincar%n" +
                        "A mamãe gritou%n" +
                        "Quack quack quack%n" +
                        "Mas nenhum patinho%n" +
                        "Voltou de lá%n%n");
            }


        }

        System.out.printf("A mamãe patinha%n" +
                "Foi procurar%n" +
                "Além das montanhas%n" +
                "Na beira do mar%n" +
                "A mamãe gritou%n" +
                "Quack quack quack%n" +
                "E os %d patinhos%n" +
                "Voltaram de lá", patinhos);

        sc.close();


    }
}
