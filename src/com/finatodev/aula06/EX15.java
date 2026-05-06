import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 3 valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int abBC = Math.abs(b - c);
        int abAC = Math.abs(a - c);
        int abAB = Math.abs(a - b);

        if (abBC < a && a < b + c
         && abAC < b && b < a + c
         && abAB < c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIÂNGULO ISÓSCELES");
            } else {
                System.out.println("TRIÂNGULO ESCALENO");
            }
        } else {
            System.out.println("NÃO FORMA UM TRIÂNGULO");
        }

        sc.close();
    }
}
