package aula28;

import java.util.Scanner;

public class Ex06 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerInteiro("Informe N: ");
        int[] meuArray = new  int[n];

        for (int i = 0; i < n; i++) {
            meuArray[i] = lerInteiro(String.format("Informe o número [%d]: ", i + 1));
        }

        System.out.println("Seu array ficou assim:");
        exibir(meuArray);

        System.out.println(verificarOrdenacao(meuArray) ? "O array está ordenado!" : "O array não está ordenado!");
    }

    public static boolean verificarOrdenacao(int[] meuArray) {
        for (int i = 0; i < meuArray.length - 1; i++) {
            if (meuArray[i] > meuArray[i + 1]) {
                return false;
            }
        }
        return true;
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
