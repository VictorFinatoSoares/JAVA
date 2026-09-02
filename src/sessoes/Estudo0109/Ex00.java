package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = Integer.parseInt(sc.nextLine());

        if (numeroPar(num)) {
            System.out.printf("%d É PAR!", num);
        } else {
            System.out.printf("%d É ÍMPAR!", num);
        }

        sc.close();
    }

    public static boolean numeroPar(int number) {
        return number  % 2 == 0;
    }
}
