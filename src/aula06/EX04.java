package aula06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("O menor é: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("O menor é: " + b);
        } else {
            System.out.println("O menor é: " + c);
        }

        sc.close();
    }
}
