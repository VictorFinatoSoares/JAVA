package aula12;

import java.util.Scanner;

public class Aula12EX_2 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ex15();
        sc.close();

    }

    public static void ex01() {
        System.out.print("Digite um número: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o número da pessoa [%d]: ", i);
            String nome = sc.nextLine();

        }

        System.out.println("Encerrando...");

    }

    public static void ex02() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.printf("Número: %d%n", i);
        }

    }

    public static void ex03() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                if (i % 2 ==0) {
                    System.out.printf("Número: %d%n", i);
                }

            }
        }

        else System.out.println("ERRO! VALOR NEGATIVO!");

    }

    public static void ex04() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num >= 0) {
            for (int i = num; i >= 0; i--) {
                System.out.printf("Número: %d%n", i);
            }
        }

        else System.out.println("ERRO! VALOR NEGATIVO!");
    }

    public static void ex05() {
        System.out.print("Digite um número: ");

        int n = Integer.parseInt(sc.nextLine());
        int torcGremio = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o time da pessoa [%d]: ", i);
            String time = sc.nextLine();

            if (time.strip().equalsIgnoreCase("Grêmio")) torcGremio++;
        }

        System.out.printf("Número de torcedores do Grêmio: %d%nEncerrando...", torcGremio);
    }

    public static void ex06() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número decimal: ");
            double num = sc.nextDouble();
            soma += num;

        }

        System.out.printf("A soma destes números é %.2f", soma);

    }

    public static void ex07() {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o número [%d]: ", i);
            int n = sc.nextInt();
            soma += n;

        }

        System.out.printf("A soma dos números digitados é %d", soma);

    }

    public static void ex08() {
        System.out.print("Quantos números você irá digitar? ");
        int quant = sc.nextInt();

        for (int i = 1; i <= quant; i++) {
            System.out.printf("%nDigite o número [%d]: ", i);
            int num = sc.nextInt();

            if (num > 0) System.out.printf("%d é POSITIVO!", num);
            else if (num == 0) System.out.printf("%d é ZERO!", num);
            else System.out.printf("%d é NEGATIVO!", num);

        }


    }

    public static void ex09() {
        System.out.print("Digite o primeiro valor: ");
        int val1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int val2 = sc.nextInt();

        if (val1 >= 0 && val2 >= 0) {
            int menor = Math.min(val1, val2); int maior = Math.max(val1, val2);
            for (int i = menor; i <= maior; i++) {
                if (i % 2 == 0) {
                    System.out.printf("Número PAR: %d%n", i);
                }
            }

        } else System.out.print("[ERRO] VALOR NEGATIVO!");

    }

    public static void ex10() {
        int soma = 0;

        for (int i = 0; i <= 198; i++) {
            soma += i;
        }

        System.out.printf("A soma dos números de 0 a 198 é: %d", soma);
    }

    public static void ex11() {
        System.out.print("Digite o primeiro valor: ");
        int val1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int val2 = sc.nextInt();

        int menor = Math.min(val1, val2); int maior = Math.max(val1, val2);
        int soma = 0;

        for (int i = menor + 1; i < maior; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
        }

        System.out.printf("A soma dos ímpares entre: %d e %d é %d", menor, maior, soma);

    }

    public static void ex12() {

        int q = 0;
        double s = 0;

        for (;;) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();

            if (n >= 0) {
                q++;
                s += n;
            }

            else break;

        }

        double media = (s/q);

        System.out.printf("A média dos números digitados é %.2f", media);



    }

    public static void ex13() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d", num, fatorial);

    }

    public static void ex14() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int div = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }

        if (div == 2) System.out.printf("%d é PRIMO!", num);
        else System.out.printf("%d não é PRIMO!", num);


    }

    public static void ex15() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int div = 0;
        int soma = 0;

        for (int i = 0; i <= n; i++) {
            div = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }

            if (div == 2) {
                System.out.printf("PRIMO ENCONTRADO: %d%n", i);
                soma += i;
            }

        }

        System.out.printf("A soma dos números primos entre 0 e %d é %d", n, soma);

    }

}
