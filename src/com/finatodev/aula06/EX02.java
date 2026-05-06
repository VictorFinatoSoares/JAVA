import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior é: " + a);
        } else if (b > a) {
            System.out.println("O maior é: " + b);
        } else {
            System.out.println("Os dois valores são iguais!");
        }

        sc.close();
    }
}
