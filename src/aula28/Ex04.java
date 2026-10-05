package aula28;

import java.util.Scanner;

public class Ex04 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerInteiro("Informe N: ");
        int[] meuArray = new int[n];

        for (int i = 0; i < n; i++) {
            meuArray[i] = lerInteiro(String.format("Informe o número [%d]: ", i + 1));
        }

        exibir(meuArray);
        exibir(inverter(meuArray));
    }

    public static int lerInteiro(String msg) {
        int num;

        while (true) {
            try {
                System.out.printf(msg);
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você precisa informar um número INTEIRO!");
            }
        }
        return num;
    }

    public static int[] inverter(int[] meuArray) {
        int[] meuArrayInvertido = new int[meuArray.length];

        for (int i = 0; i < meuArray.length; i++) {
            meuArrayInvertido[meuArray.length - 1 - i] = meuArray[i];
        }

        return meuArrayInvertido;
    }

    public static void exibir(int[] meuArray) {
        System.out.print("[");
        for (int i = 0; i < meuArray.length; i++) {
            if (i < meuArray.length - 1) {
                System.out.print(meuArray[i] + ", ");
            } else {
                System.out.print(meuArray[i]);
            }
        }
        System.out.print("]\n");
    }

}
