package sessoes.Estudo0609;

import java.util.Scanner;

// Testando o "operador ternário" do java.

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o horário do dia (0-23): ");
        int horario = Integer.parseInt(sc.nextLine());

        System.out.println(horario <= 12 ? "Você está na primeira metade do dia!" : "Você está na segunda metade do dia!");
    }
}
