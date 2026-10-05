package aula28;

import java.util.Scanner;

public class Ex03 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] meuArray = new  int[10];

        for (int i = 0; i < 10; i++) {
            meuArray[i] = lerInteiro(String.format("Informe o número [%d]: ", i + 1));
        }

        int num = lerInteiro("Informe o número que deseja procurar: ");

        if (buscar(meuArray, num) == -1) {
            System.out.println("Desculpe! O número não foi encontrado!");
        } else {
            System.out.printf("O número %d foi encontrado na posição %d", num, buscar(meuArray, num) + 1);
        }

    }

    public static int buscar(int[] meuArray, int num) {
        for (int i = 0; i < meuArray.length; i++) {
            if (meuArray[i] == num) {
                return i;
            }
        }
        return -1;
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
}
