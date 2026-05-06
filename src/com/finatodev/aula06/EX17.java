import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano (0-2026): ");
        int ano = sc.nextInt();
        System.out.print("Mês (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Dia: ");
        int dia = sc.nextInt();

        if (ano < 0 || ano > 2026 || mes < 1 || mes > 12) {
            System.out.println("Ano ou mês inválido!");
        } else {
            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            int maxDias;
            if (mes == 2)
                maxDias = bissexto ? 29 : 28;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                maxDias = 30;
            else
                maxDias = 31;

            if (dia < 1 || dia > maxDias) {
                System.out.println("Dia inválido para este mês!");
            } else {
                System.out.printf("Data válida: %02d/%02d/%04d%n", dia, mes, ano);
            }
        }

        sc.close();
    }
}
