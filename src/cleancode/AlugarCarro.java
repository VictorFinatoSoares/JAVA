package cleancode;

import java.util.Scanner;

public class AlugarCarro {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = Entrada.nome(scanner);
        int idade = Entrada.idade(scanner);
        int tipo = Entrada.tipoVeiculo(scanner);
        int dias = Entrada.dias(scanner);

        if (!Validacao.idade(idade) || !Validacao.dias(dias)) {
            scanner.close();
            return;
        }

        double valor = Aluguel.calcular(tipo, dias);

        if (valor == Aluguel.TIPO_INVALIDO) {
            System.out.println("Erro: tipo de veiculo invalido.");
        } else {
            Recibo.exibir(nome, valor);
        }

        scanner.close();
    }

    static class Entrada {

        static String nome(Scanner s) {
            System.out.print("Nome: ");
            return s.next();
        }

        static int idade(Scanner s) {
            System.out.print("Idade: ");
            return s.nextInt();
        }

        static int tipoVeiculo(Scanner s) {
            System.out.print("Tipo veiculo (1-Carro, 2-Moto): ");
            return s.nextInt();
        }

        static int dias(Scanner s) {
            System.out.print("Qtd dias: ");
            return s.nextInt();
        }
    }

    static class Validacao {

        private static final int IDADE_MINIMA = 18;

        static boolean idade(int idade) {
            if (idade < IDADE_MINIMA) {
                System.out.println("Erro: menor de idade nao pode alugar.");
                return false;
            }
            return true;
        }

        static boolean dias(int dias) {
            if (dias <= 0) {
                System.out.println("Erro: qtd de dias invalida.");
                return false;
            }
            return true;
        }
    }

    static class Aluguel {

        static final double TIPO_INVALIDO = -1;

        private static final int CARRO = 1;
        private static final int MOTO = 2;

        private static final double DIARIA_CARRO = 100.0;
        private static final double DIARIA_MOTO = 50.0;

        private static final int LIMITE_CARRO = 7;
        private static final int LIMITE_MOTO = 5;

        private static final double DESCONTO_CARRO = 0.10;
        private static final double DESCONTO_MOTO = 0.05;

        static double calcular(int tipo, int dias) {
            double diaria;
            int limite;
            double desconto;

            if (tipo == CARRO) {
                diaria = DIARIA_CARRO;
                limite = LIMITE_CARRO;
                desconto = DESCONTO_CARRO;

            } else if (tipo == MOTO) {
                diaria = DIARIA_MOTO;
                limite = LIMITE_MOTO;
                desconto = DESCONTO_MOTO;

            } else {
                return TIPO_INVALIDO;
            }

            double total = dias * diaria;

            if (dias > limite) {
                total -= total * desconto;
            }

            return total;
        }
    }

    static class Recibo {

        static void exibir(String nome, double valor) {
            System.out.println("\nRecibo:");
            System.out.println("Cliente: " + nome + " | Total a pagar: R$ " + valor);
        }
    }
}