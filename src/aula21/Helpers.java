package aula21;

import java.util.Scanner;

public class Helpers {
    public static final Scanner sc = new Scanner(System.in);
    public static int validateInteger(String message) {
        while (true) {
            System.out.print(message);
            final int number;

            try {
                number = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Digite um número inteiro!");
                continue;
            }
            return number;
        }
    }

    public static double validateDouble(String message) {
        while (true) {
            System.out.print(message);
            final double number;

            try {
                number = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Digite um número inteiro!");
                continue;
            }
            return number;
        }
    }
    public static char getChar(String message) {
        System.out.print(message);
        return sc.nextLine().charAt(0);
    }
}
