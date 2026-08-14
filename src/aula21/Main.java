package aula21;

class Main {
    public static void main() {
        int r = 0;
        int c = 0;

        while (r <= 0) {
            r = Helpers.validateInteger("Quantidade de linhas: ");
            if (r <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        while (c <= 0) {
            c = Helpers.validateInteger("Quantidade de colunas: ");
            if (c <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        ex09(r, c);
        Helpers.sc.close();
    }

    static void initialExercise(int rows, int columns) {
        double[][] myArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateDouble("Preencha o valor da posição atual: ");
            }
        }

        double sum = 0;
        int qElements = (rows * columns);

        double min = myArray[0][0];
        double max = myArray[rows - 1][columns - 1];

        for (double[] row : myArray) {
            for (double element : row) {
                sum += element;
                if (element < min) min = element;
                if (element > max) max = element;
            }
        }
        System.out.printf("A média dos elementos do array é: %.2f%nO menor elemento é %.2f%nO maior elemento é %.2f", sum / qElements, min, max);
    }

    static void ex00(int rows, int columns) {
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateInteger("Preencha o valor da posição atual: ");
            }
        }

        for (int[] row : myArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void ex01(int rows, int columns) {
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateInteger("Preencha o valor da posição atual: ");
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 0; j--) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void ex02(int rows, int columns) {
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateInteger("Preencha o valor da posição atual: ");
            }
        }

        int[][] yourArray = new int[rows][columns];

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 0; j--) {
                yourArray[rows - 1 - i][columns - 1 - j] = myArray[i][j];
            }
        }

        for (int[] row : yourArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void ex03(int rows, int columns) {
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateInteger("Preencha a posição atual: ");
            }
        }

        int qEven = 0;

        for (int[] row : myArray) {
            for (int element : row) {
                if (element % 2 == 0) qEven++;
            }
        }

        int[] myEvenArray = new int[qEven];
        int evenInd = 0;

        for (int[] row : myArray) {
            for (int element : row) {
                if (element % 2 == 0) {
                    myEvenArray[evenInd] = element;
                    evenInd++;
                }
            }
        }

        for (int i : myEvenArray) {
            System.out.println(i);
        }
    }

    static void ex04(int rows, int columns) {
        char[][] myArray = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.getChar("Preencha o valor da posição atual: ");
            }
        }

        char searchedLetter = Helpers.getChar("Informe a letra a procurar: ");
        boolean found = false;

        for (char[] row : myArray) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] == searchedLetter) {
                    System.out.printf("Caractere %c encontrado na linha %d e coluna %d!", searchedLetter, i + 1, j + 1);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.printf("O caractere %c não foi encontrado.", searchedLetter);
    }

    static void ex05(int rows, int columns) {
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateInteger("Preencha o valor da posição atual: ");
            }
        }

        int rows2 = 0;
        int columns2 = 0;

        while (rows2 <= 0) {
            rows2 = Helpers.validateInteger("Quantidade de linhas do segundo array: ");
            if (rows2 <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        while (columns2 <= 0) {
            columns2 = Helpers.validateInteger("Quantidade de colunas do segundo array: ");
            if (columns2 <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        int[][] yourArray = new int[rows2][columns2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                yourArray[i][j] = Helpers.validateInteger("Preencha o valor da posição atual: ");
            }
        }

        int[] ourArray = new int[rows * columns + rows2 * columns];
        int indOurArray = 0;

        for (int[] row : myArray) {
            for (int element : row) {
                ourArray[indOurArray] = element;
                indOurArray++;
            }
        }

        for (int[] row : yourArray) {
            for (int element : row) {
                ourArray[indOurArray] = element;
                indOurArray++;
            }
        }

        for (int i : ourArray) {
            System.out.print(i + " ");
        }
    }

    static void ex06(int rows, int columns) {
        double[][] myArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateDouble("Preencha o valor da posição atual: ");
            }
        }

        int rows2 = 0;
        int columns2 = 0;

        while (rows2 <= 0) {
            rows2 = Helpers.validateInteger("Quantidade de linhas do segundo array: ");
            if (rows2 <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        while (columns2 <= 0) {
            columns2 = Helpers.validateInteger("Quantidade de colunas do segundo array: ");
            if (columns2 <= 0) System.out.println("ERRO: Precisa ser positivo!");
        }

        double[][] yourArray = new double[rows2][columns2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                yourArray[i][j] = Helpers.validateDouble("Preencha o valor da posição atual: ");
            }
        }

        double[] ourArray = new double[rows + rows2 + columns + columns2];
        int indOurArray = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] < 0) {
                    ourArray[indOurArray] = myArray[i][j];
                    indOurArray++;
                }
            }
        }

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                if (yourArray[i][j] < 0) {
                    ourArray[indOurArray] = yourArray[i][j];
                    indOurArray++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] >= 0) {
                    ourArray[indOurArray] = myArray[i][j];
                    indOurArray++;
                }
            }
        }

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                if (yourArray[i][j] >= 0) {
                    ourArray[indOurArray] = yourArray[i][j];
                    indOurArray++;
                }
            }
        }

        for (double i : ourArray) {
            System.out.print(i + " ");
        }
    }

    static void ex07(int rows, int columns) {
        char[][] myArray = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.getChar("Preencha o valor da posição atual: ");
            }
        }

        for (char[] row : myArray) {
            for (char element : row) {
                System.out.print(element + " ");
            }
        }
    }

    static void ex08(int rows, int columns) {
        double[][] myArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateDouble("Preencha o valor da posição atual: ");
            }
        }

        double soma = 0;
        int qElementos = (rows * columns);

        for (double[] row : myArray) {
            for (double element : row) {
                soma += element;
            }
        }

        System.out.printf("A média dentre todos os elementos apresentados no array é: %.2f", (soma / qElementos));
    }

    static void ex09(int rows, int columns) {
        double[][] myArray = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = Helpers.validateDouble("Preencha o valor da posição atual: ");
            }
        }

        double somaPares = 0;
        int qElementosPares = 0;

        for (double[] row: myArray) {
            for (double element: row ) {
                if (element % 2 == 0) {
                    qElementosPares++;
                    somaPares += element;
                }
            }
        }
        System.out.printf("A média dentre todos os elementos pares apresentados no array é: %.2f", (somaPares / qElementosPares));
    }
}

