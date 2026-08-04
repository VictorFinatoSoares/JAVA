package lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        exercicioInicial();
    }

    public static void exercicioInicial() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }
        
        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        double[][] meuArray = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        double soma = 0;
        int qElementos = (l * c);

        double menorElemento = meuArray[0][0];
        double maiorElemento = meuArray[l - 1][c - 1];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                soma += meuArray[i][j];
                if (meuArray[i][j] < menorElemento) menorElemento = meuArray[i][j];
                if (meuArray[i][j] > maiorElemento) maiorElemento = meuArray[i][j];
            }
        }

        System.out.printf("A média dos elementos do array é: %.2f%nO menor elemento é %.2f%nO maior elemento é %.2f", soma / qElementos, menorElemento, maiorElemento);
    }

    public static void ex00() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch(InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex01() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch(InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        for (int i = l - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex02() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha a posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch(InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        int[][] seuArray = new int[l][c];

        for (int i = l - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                seuArray[l - 1 - i][c - 1 - j] = meuArray[i][j];
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(seuArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex03() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        int qPares = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] % 2 == 0) qPares++;
            }
        }

        int[] meuArrayDePares = new int[qPares];
        int indPares = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] % 2 == 0) {
                    meuArrayDePares[indPares] = meuArray[i][j];
                    indPares++;
                }
            }
        }

        for (int i: meuArrayDePares) {
            System.out.println(i);
        }

    }

    public static void ex04() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        char[][] meuArray = new char[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.next().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        System.out.print("Informe o caractere a procurar: ");
        char searchedLetter = sc.next().charAt(0);
        boolean found = false;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(meuArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] == searchedLetter) {
                    System.out.printf("Caractere %c encontrado na linha %d e coluna %d!", searchedLetter, i + 1 , j + 1);
                    found = true;
                    break;
                }
            }
        }

        if (!found) System.out.printf("O caractere %c não foi encontrado.", searchedLetter);

    }

    public static void ex05() {
        int l; int c;

        System.out.print("Quantidade de linhas do primeiro array: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas do primeiro array: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] meuArray = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        int l2; int c2;

        System.out.print("Quantidade de linhas do segundo array: ");
        try {
            l2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas do segundo array: ");
        try {
            c2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        int[][] seuArray = new int[l2][c2];

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    seuArray[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        int[] nossoArray = new int[l + l2 + c + c2];
        int indNossoArray = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                nossoArray[indNossoArray] = meuArray[i][j];
                indNossoArray++;
            }
        }

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                nossoArray[indNossoArray] = seuArray[i][j];
                indNossoArray++;
            }
        }

        for (int i: nossoArray) {
            System.out.print(i + " ");
        }



    }

    public static void ex06() {
        int l; int c;

        System.out.print("Quantidade de linhas do primeiro array: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas do primeiro array: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        double[][] meuArray = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        int l2; int c2;

        System.out.print("Quantidade de linhas do segundo array: ");
        try {
            l2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas do segundo array: ");
        try {
            c2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        double[][] seuArray = new double[l2][c2];

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    seuArray[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        double[] nossoArray = new double[l + l2 + c + c2];
        int indNossoArray = 0;

        // Primeira parte
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] < 0) {
                    nossoArray[indNossoArray] = meuArray[i][j];
                    indNossoArray++;
                }
            }
        }

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                if (seuArray[i][j] < 0) {
                    nossoArray[indNossoArray] = seuArray[i][j];
                    indNossoArray++;
                }
            }
        }

        // Segunda parte
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (meuArray[i][j] >= 0) {
                    nossoArray[indNossoArray] = meuArray[i][j];
                    indNossoArray++;
                }
            }
        }

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                if (seuArray[i][j] >= 0) {
                    nossoArray[indNossoArray] = seuArray[i][j];
                    indNossoArray++;
                }
            }
        }

        for (double i: nossoArray) {
            System.out.print(i + " ");
        }
    }

    public static void ex07() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        char[][] meuArray = new char[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.next().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(meuArray[i][j] + " ");
            }
        }

    }

    public static void ex08() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        double[][] meuArray = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        double soma = 0;
        int qElementos = (l * c);

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                soma += meuArray[i][j];
            }
        }

        System.out.printf("A média dentre todos os elementos apresentados no array é: %.2f", (soma / qElementos));
    }

    public static void ex09() {
        int l; int c;

        System.out.print("Quantidade de linhas: ");
        try {
            l = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        System.out.print("Quantidade de colunas: ");
        try {
            c = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida!");
            return;
        }

        double[][] meuArray = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Preencha o valor da posição [%d][%d]: ", i + 1, j + 1);
                try {
                    meuArray[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida!");
                    return;
                }
            }
        }

        double somaPares = 0;
        int qElementosPares = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if(meuArray[i][j] % 2 == 0) {
                    qElementosPares++;
                    somaPares += meuArray[i][j];
                }
            }
        }

        System.out.printf("A média dentre todos os elementos pares apresentados no array é: %.2f", (somaPares / qElementosPares));
    }

}
