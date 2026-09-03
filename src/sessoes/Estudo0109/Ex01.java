package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número (1): ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Informe o número (2): ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("Informe o número (3): ");
        int num3 = Integer.parseInt(sc.nextLine());

        System.out.printf("Dentre os números informados, o maior é: %d", maiorNumero(num1, num2, num3));

        sc.close();
    }

    public static int maiorNumero(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
