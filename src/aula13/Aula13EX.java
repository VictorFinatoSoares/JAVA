package aula13;

import java.util.Scanner;

public class Aula13EX {
    public static void main(String[] args) {
        ex06();
    }

    public static void ex01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int qPares = 0, qImpares = 0;
        int sPares = 0, sImpares = 0;

        while (num <= 0) {
            System.out.print("NÚMERO INVÁLIDO!\nDigite outro número: ");
            num = sc.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                qPares++;
                sPares += i;
            } else {
                qImpares++;
                sImpares += i;
            }
        }
        System.out.printf("%nA média dos números pares é: %d%nA média dos números ímpares é %d", (sPares / qPares), (sImpares / qImpares));
        sc.close();
    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = (3.14159 * (raio * raio));

        System.out.printf("A=%.4f", area);

        sc.close();

    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.printf("X = %d%n", n1 + n2);
        sc.close();

    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n < 0) {
            System.out.println("Fora de intervalo");
        } else if (n <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (n <= 50) {
            System.out.println("Intervalo (25, 50]");

        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();

    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double p = 0;

        if (cod == 1) p = 4 * qtd;
        if (cod == 2) p = 4.5 * qtd;
        if (cod == 3) p = 5 * qtd;
        if (cod == 4) p = 2 * qtd;
        if (cod == 5) p = 1.5 * qtd;

        System.out.printf("Total: R$ %.2f%n", p);
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);

        int qPar = 0;
        int qImpar = 0;
        int qPos = 0;
        int qNeg = 0;

        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) qPar++;
            if (n % 2 != 0) qImpar++;
            if (n > 0) qPos++;
            if (n < 0) qNeg++;

        }

        System.out.printf("%d valor(es) par(es)%n", qPar);
        System.out.printf("%d valor(es) impar(es)%n", qImpar);
        System.out.printf("%d valor(es) positivo(s)%n", qPos);
        System.out.printf("%d valor(es) negativo(s)%n", qNeg);

        sc.close();
    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();

    }


}
