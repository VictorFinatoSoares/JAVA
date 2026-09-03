package cleancode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RealizarCheckIn {
    public static final int QUARTO_STANDARD = 1;
    public static final int QUARTO_LUXO = 2;
    public static final double PRECO_STANDARD = 150.0;
    public static final double PRECO_LUXO = 300.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o número do quarto: ");
        int numeroQuarto = Integer.parseInt(sc.nextLine());

        System.out.println("Tipos de quarto:\n(1) Standard\n(2) Luxo");
        int tipoQuarto = Integer.parseInt(sc.nextLine());

        try {
            System.out.print("Data check-in (dd/MM/yyyy): ");
            LocalDate dataCheckIn = LocalDate.parse(sc.next(), formatoData);

            System.out.print("Data check-out (dd/MM/yyyy): ");
            LocalDate dataCheckOut = LocalDate.parse(sc.next(), formatoData);

            LocalDate dataAtual = LocalDate.now();

            if (dataCheckIn.isBefore(dataAtual) || dataCheckOut.isBefore(dataAtual)) {
                System.out.println("Erro: A reserva não pode ser no passado.");
                return;
            }

            if (!dataCheckOut.isAfter(dataCheckIn)) {
                System.out.println("Erro: Check-out deve ser após o check-in.");
                return;
            }

            long diasEstadia = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);
            double valorEstadia = 0;

            if (tipoQuarto == QUARTO_STANDARD) {
                valorEstadia = diasEstadia * PRECO_STANDARD;
            } else if (tipoQuarto == QUARTO_LUXO) {
                valorEstadia = diasEstadia * PRECO_LUXO;
            } else {
                System.out.println("Tipo de quarto INVÁLIDO!");
            }

            System.out.println("Reserva feita! Quarto: " + numeroQuarto + " | Total: R$ " + valorEstadia);
        } catch (Exception e) {
            System.out.println("Deu erro no sistema.");
        }

        sc.close();
    }
}
