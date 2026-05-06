import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é PAR.");
        } else {
            System.out.println("O número " + n + " é ÍMPAR.");
        }

        sc.close();
    }
}
