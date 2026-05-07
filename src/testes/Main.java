package testes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        t02();
    }

    public static void t01() {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int num;
        String r;
        do {

            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
            sc.nextLine();

            System.out.print("Você quer SAIR? [S/N]: ");
            r = sc.nextLine();

        } while(r.equals("N"));

        System.out.printf("A soma destes números é %d!", soma);
        sc.close();

    }

    public static void t02() {
        int i = 0;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        } while (i <=2000);

    }


}
