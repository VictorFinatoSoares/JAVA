package aula12;

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

        System.out.println("Quantos patinhos foram passear? ");
        int patinhos = sc.nextInt();

        for (int i = patinhos; i > 0; i--) {

            if (i > 2)  System.out.printf("%d patinhos%nForam passear%nAlém das montanhas%nPara brincar%nA mamãe gritou%nQuack quack quack%nMas só %d patinhos%nVoltaram de lá%n%n", i,  i - 1);

            else if (i == 2)  System.out.print("2 patinhos\nForam passear\nAlém das montanhas\nPara brincar\nA mamãe gritou\nQuack quack quack\nMas só 1 patinho\nVoltou de lá\n\n");

            else System.out.print("1 patinho foi passear\nAlém das montanhas\nPara brincar\nA mamãe gritou\nQuack quack quack\nMas nenhum patinho\nVoltou de lá\n\n");

        }

        System.out.printf("A mamãe patinha%nFoi procurar%nAlém das montanhas%nNa beira do mar%nA mamãe gritou%nQuack quack quack%nE os %d patinhos%nVoltaram de lá", patinhos);
    }
}
