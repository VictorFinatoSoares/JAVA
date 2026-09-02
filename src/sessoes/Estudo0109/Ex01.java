package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Informe o número (%d): ", i + 1);
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.printf("Dentre os números informados, o maior é: %d", maiorNumero(numbers));

        sc.close();
    }

    public static int maiorNumero(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
