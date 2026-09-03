package cleancode;

import java.util.Scanner;

public class NovaVenda {
    public static final int NOVA_VENDA = 1;
    public static final int SAIR = 0;
    public static final int CLIENTE_COMUM = 1;
    public static final int CLIENTE_VIP = 2;
    public static final int FUNCIONARIO = 3;
    public static final double DESCONTO_PIX = 0.05;
    public static final double DESCONTO_VIP = 0.10;
    public static final double DESCONTO_FUNCIONARIO = 0.20;
    public static final int PIX = 1;
    public static final int CARTAO = 2;
    public static final int INVALIDO = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = NOVA_VENDA;

        while (true) {
            System.out.println("(1) Nova Venda\n(0)Sair");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == SAIR) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Nome: ");
            String nomeCliente = sc.nextLine();

            System.out.print("Valor: ");
            double valorVenda = Double.parseDouble(sc.nextLine());

            System.out.println("Tipo de Clientes:\n(1) Comum\n(2) VIP\n(3) Funcionário");
            int tipoCliente = Integer.parseInt(sc.nextLine());

            System.out.print("Forma de pagamento:\n(1) Pix\n(2) Cartão\n");
            int formaPagamento = Integer.parseInt(sc.nextLine());

            double desconto = calcularDesconto(tipoCliente, valorVenda);

            if (desconto == INVALIDO) {
                continue;
            }

            double valorFinal = valorVenda - desconto;
            finalizarVenda(formaPagamento, valorFinal);

        }
        sc.close();
    }

    public static double calcularDesconto(int tipoCliente, double valorVenda) {
        double desconto = INVALIDO;

        if (tipoCliente == CLIENTE_COMUM) {
            desconto = 0;
        } else if (tipoCliente == CLIENTE_VIP) {
            desconto = valorVenda * DESCONTO_VIP;
        } else if (tipoCliente == FUNCIONARIO) {
            desconto = valorVenda * DESCONTO_FUNCIONARIO;
        } else {
            System.out.println("Esse tipo de cliente não existe!");
        }
        return desconto;
    }

    public static void finalizarVenda(int formaPagamento, double valorFinal) {
        if (formaPagamento == PIX) {
            double descontoPix = valorFinal * DESCONTO_PIX;
            valorFinal -= descontoPix;
            System.out.println("Pix gerado com sucesso. Total: " + valorFinal);
        } else if (formaPagamento == CARTAO) {
            System.out.println("Cartão aprovado na maquininha. Total: " + valorFinal);
        } else {
            System.out.println("Forma de pagamento invalida!");
        }
    }
}
