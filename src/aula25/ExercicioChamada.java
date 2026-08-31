package aula25;

import java.util.Scanner;

public class ExercicioChamada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int n = sc.nextInt();

        int[] meuArray = new int[n];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("Preencha a posição %d: ", i);
            meuArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numeroPrimo(meuArray[i])) System.out.printf("%d é primo!%n", meuArray[i]);
        }
    }

    public static boolean numeroPrimo(int numero) {
        int qDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) qDivisores++;
        }

        return qDivisores == 2;
    }
}
