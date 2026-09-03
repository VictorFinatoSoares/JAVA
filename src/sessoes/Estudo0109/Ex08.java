package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a dimensão do array: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Preencha a posição (%d): ", i + 1);
            meuArray[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Informe o valor que deseja procurar: ");
        int x  = Integer.parseInt(sc.nextLine());

        if (contaOcorrencias(meuArray, x) == 0) {
            System.out.printf("%d não foi encontrado no array!", x);
        } else {
            informarPosicoes(meuArray, x);
        }

        sc.close();
    }

    public static int contaOcorrencias(int[] array, int valor) {
        int ocorrencias = 0;

        for (int i: array) {
            if (i == valor) {
                ocorrencias++;
            }
        }

        return ocorrencias;
    }

    public static void informarPosicoes(int[] array, int valor) {
        System.out.print("Posições encontradas: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                if (i < array.length - 1) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
