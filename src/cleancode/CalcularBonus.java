package cleancode;

import java.util.Scanner;

public class CalcularBonus {
    public static final int SAIR = 0;
    public static final int GERENTE = 1;
    public static final int DESENVOLVEDOR = 2;
    public static final int ESTAGIARIO = 3;
    public static final double VINTE_PORCENTO = 0.20;
    public static final double DEZ_PORCENTO = 0.10;
    public static final double CINCO_PORCENTO = 0.05;
    public static final double ADICIONAL_GERENTE = 1000.0;
    public static final double ADICIONAL_DESENVOLVEDOR = 300.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int opcao;

            System.out.println("(1) Calcular Bonus\n(0) Sair");

            System.out.print("Escolha uma opcão: ");
            opcao = sc.nextInt();

            if (opcao == SAIR) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Nome: ");
            String nomeFuncionario = sc.nextLine();

            System.out.print("Salário: ");
            double salarioFuncionario = Double.parseDouble(sc.nextLine());

            System.out.println("Cargos:\n(1) Gerente\n(2) Desenvolvedor\n(3)Estagiário)");
            System.out.print("Informe seu cargo: ");

            int cargoFuncionario = Integer.parseInt(sc.nextLine());

            if (!cargoValido(cargoFuncionario)) {
                System.out.println("Cargo não existe!");
                continue;
            }

            double bonusSalarial = calcularBonus(cargoFuncionario, salarioFuncionario);

            double totalSalario = salarioFuncionario + bonusSalarial;
            System.out.printf("Funcionário: %s%nBônus do salário: %.2f%nSalário total: %.2f", nomeFuncionario, bonusSalarial, totalSalario);

        }
        sc.close();
    }

    public static boolean cargoValido(int cargoFuncionario) {
        int[] cargosExistentes = {ESTAGIARIO, DESENVOLVEDOR, GERENTE};

        for (int cargo: cargosExistentes) {
            if (cargoFuncionario == cargo) {
                return true;
            }
        }

        return false;
    }

    public static double calcularBonus(int cargoFuncionario, double salarioFuncionario) {
        if (cargoFuncionario == GERENTE) {
            return (salarioFuncionario * VINTE_PORCENTO) + ADICIONAL_GERENTE;
        } else if (cargoFuncionario == DESENVOLVEDOR) {
            return (salarioFuncionario * DEZ_PORCENTO) + ADICIONAL_DESENVOLVEDOR;
        } else if (cargoFuncionario == ESTAGIARIO) {
            return salarioFuncionario * CINCO_PORCENTO;
        }

        return 0;
    }
}
