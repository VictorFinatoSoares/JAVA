package testes;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        t02();

    }

    public static void t01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva algo neste formato -> SEUTEXTOAQUI: ");
        String text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));

        }

        sc.close();
    }

    public static void t02() {
        int[] n = {5, 7, 2, 3, 11, 19, 29, 23, 21};

        Arrays.sort(n);

        for (int i : n) {
            System.out.println(i);
        }

    }


}

