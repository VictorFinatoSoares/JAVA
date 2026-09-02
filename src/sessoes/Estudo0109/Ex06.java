package sessoes.Estudo0109;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double n1 = Double.parseDouble(sc.nextLine());

        System.out.print("Informe o segundo número: ");
        double n2 = Double.parseDouble(sc.nextLine());

        System.out.println("""
   
                    ====== Operações Disponíveis ======
                    
                    (+) Adição
                    (-) Subtração
                    (*) Multiplicação
                    (/) Divisão
                    """);

        System.out.print("Informe a operação: ");
        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f",n1, n2, somar(n1, n2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f",n1, n2, subtrair(n1, n2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f",n1, n2, multiplicar(n1, n2));
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("ERRO: Divisão por ZERO!");
                    break;
                }

                System.out.printf("%.2f / %.2f = %.2f",n1, n2, dividir(n1, n2));
                break;
            default:
                System.out.println("ERRO: Essa operação não existe!");
                break;
        }

    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
