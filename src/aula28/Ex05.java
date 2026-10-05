package aula28;

import java.util.Scanner;

public class Ex05 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] meuArray = new  int[15];

        for (int i = 0; i < 15; i++) {
            meuArray[i] = lerInteiro(String.format("Informe o número [%d]: ", i + 1));
        }

        System.out.printf("O array que você escreveu tem %d pares!\n",  contarPares(meuArray));
        System.out.printf("A soma dos ímpares é: %d\n", somarImpares(meuArray));
        System.out.println("O seu array de pares ficou assim:");
        exibir(separaPares(meuArray));
    }

    public static int contarPares(int[] meuArray) {
        int qPares = 0;

        for (int numero: meuArray) {
            if (numero % 2 == 0) {
                qPares++;
            }
        }
        return qPares;
    }

    public static int somarImpares(int[] meuArray) {
        int somaImpares = 0;

        for (int numero: meuArray) {
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }
        return somaImpares;
    }

    public static int[] separaPares(int[] meuArray) {
        int qPares = contarPares(meuArray);
        int[] arrayPares = new int[qPares];

        int indArrayPares = 0;

        for (int numero: meuArray) {
            if (numero % 2 == 0) {
                arrayPares[indArrayPares] = numero;
                indArrayPares++;
            }
        }
        return arrayPares;
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
