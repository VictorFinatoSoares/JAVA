package aula15;

import java.util.Scanner;
import java.util.Arrays;

public class Aula15_EX {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ex21();
    }

    public static void ex01() {
        int[] meuArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = meuArray.length - 1; i >= 0; i--) {
            System.out.println(meuArray[i]);
        }
    }

    public static void ex02() {
        int[] meuArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] segundoArray = new int[meuArray.length];

        for (int i = meuArray.length - 1; i >= 0; i--) {
            segundoArray[meuArray.length - 1 - i] = meuArray[i];
        }

        for (int i : segundoArray) {
            System.out.println(i);
        }
    }

    public static void ex03() {
        int[] meuArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int qPares = 0;

        for (int i: meuArray) {
            if (i % 2 == 0) qPares++;
        }

        int[] paresArray = new int[qPares];
        int indPares = 0;

        for (int i = 0; i < meuArray.length; i++) {
            if (meuArray[i] % 2 == 0) {
                paresArray[indPares] = meuArray[i];
                indPares++;
            }
        }
        for (int i: paresArray) {
            System.out.println(i);
        }
    }

    public static void ex04() {
        String[] meuArray = {"A", "E", "I", "O", "U"};
        String meuValor = "X";
        boolean foiEncontrado = false;

        for (int i = 0; i < meuArray.length; i++) {
            if (meuValor.equalsIgnoreCase(meuArray[i])) {
                System.out.printf("%s foi encontrado na posição %d!", meuValor, i);
                foiEncontrado = true;
            }
        }

        if (!foiEncontrado) System.out.printf("%s NÃO foi encontrado. %d", meuValor, -1);
    }

    public static void ex05() {
        boolean[] meuArray = {false, true, false, true, false};
        int[] numbersArray = new int[meuArray.length];

        for (int i = 0; i < meuArray.length; i++) {
            if (meuArray[i] == false) {
                numbersArray[i] = 0;
            }

            else numbersArray[i] = 1;

        }

        for (int i: numbersArray) {
            System.out.println(i);
        }



    }

    public static void ex06() {
        int[] A = {1,3,5,7,9};
        int[] B = {2,4,6,8,10};
        int[] C = new int[A.length + B.length];

        int indC = 0;

        for (int i = 0; i < A.length; i++) {
            C[indC] = A[i];
            indC++;
        }
        
        for (int i = 0; i < B.length; i++) {
            C[indC] = B[i];
            indC++;
        }

        for (int i: C) {
            System.out.println(i);
        }



    }

    public static void ex07() {
        int[] A = {-3, -2, -1, 0, 1, 2, 3};
        int[] B = {10, 9, 8, 7, 6, 5, 4};

        int[] C = new int[A.length + B.length];

        int indC = 0;

        for(int i: A) {
            if (i < 0) {
                C[indC] = i;
                indC++;
            }
        }

        for(int i: B) {
            if (i < 0) {
                C[indC] = i;
                indC++;
            }
        }
        for(int i: A) {
            if (i >= 0) {
                C[indC] = i;
                indC++;
            }
        }

        for(int i: B) {
            if (i >= 0) {
                C[indC] = i;
                indC++;
            }
        }


        for (int i: C) {
            System.out.println(i);
        }

    }

    public static void ex08() {
        char[] caracteres = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }

    }

    public static void ex09() {
        int[] A = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};

        int soma = 0;
        
        for (int i: A) {
            soma += i;
        }

        double media = (double) soma / A.length;
        System.out.printf("A média de todos os seus elementos é %.2f", media);
    }

    public static void ex10() {
        int[] A = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somaPares = 0;
        int quantPares = 0;

        for (int i: A) {
            if (i % 2 == 0) {
                somaPares += i;
                quantPares++;
            }
        }

        double media = (double) somaPares / quantPares;
        System.out.printf("A média de todos os seus elementos pares é %.2f", media);
    }

    public static void ex11() {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while(true) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            if (x >= 0 && x < A.length) System.out.printf("Número no índice [%d]: %d%n", x, A[x]);
            else {
                System.out.println("Saindo...");
                break;
            }

        }

        sc.close();

    }

    public static void ex12() {
        double[] meuArray = {0.0, 1.0, 2.3, 3.5, 4.6, 6.7, 6.9};
        for (int i = 0; i < meuArray.length; i++) {
            if (meuArray[i] < 0) {
                System.out.println(true);
                break;
            }

            if (i == meuArray.length - 1)   System.out.println(false);

        }
    }

    public static void ex13_14() {

        int[] meuArray = {1,2,3,4,50,5,6,7,8,9,10};

        Arrays.sort(meuArray);
        System.out.printf("O maior elemento do array se encontra na posição [%d] e tem o valor %d.", meuArray.length - 1, meuArray[meuArray.length - 1]);
    }

    public static void ex15_16() {
        int[] meuArray = {1,2,3,4,50,5,6,7,8,9,10, -48};

        Arrays.sort(meuArray);
        System.out.printf("O menor elemento do array se encontra na posição [0] e tem o valor %d.", meuArray[0]);
    
    }

    public static void ex17() {
        int[] meuArray = {7,5,1};
        int[] seuArray = {7,5,1};

        if (meuArray.length == seuArray.length) {
            int elementosIguais = 0;
            for (int i = 0; i < meuArray.length; i++) {
                if (meuArray[i] == seuArray[i]) elementosIguais++;
                else break;
            }

            if (elementosIguais == meuArray.length) System.out.println(true);
            else System.out.println(false);

        }

        else {
            System.out.println(false);
        }


    }

    public static void ex18() {
        char[] meuArray = {'G', 'R', 'E', 'M', 'I', 'S', 'T', 'A'};
        for (int i = 0; i < meuArray.length; i++) {
            System.out.print(meuArray[i]);
        }
    }

    public static void ex19() {
        System.out.print("Digite N: ");
        int N = Integer.parseInt(sc.nextLine());

        String[] meuArray = new String[N];

        int i = 0;

        while (i < meuArray.length) {
            System.out.print("Digite uma palavra: ");
            String p = sc.nextLine();
            meuArray[i] = p;
            i++;

        }

        for (int j = 0; j < meuArray.length; j++) {
            System.out.println(meuArray[j]);
        }
    }

    public static void ex20() {
        String[] meuArray = {"Abacaxi", "Banana", "Cereja", "Damasco"};
        int removerElemento = 1;

        String[] seuArray = new String[meuArray.length - 1];
        int j = 0;

        for (int i = 0; i < meuArray.length; i++) {
            if (i != removerElemento) {
                seuArray[j] = meuArray[i];
                j++;
            }
        }

        for (String i: seuArray) {
            System.out.println(i);
        }
    }

    public static void ex21() {
        double[] meuArray = {-0.33, 0.33, 0.34, 0.35, 1.6, 1.5, 2.2, 2.7};

        for (int i = 0; i < meuArray.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("Posição [%d]%nValor armazenado: %.2f%n", i, meuArray[i]);
            }
        }


    }
    
}
