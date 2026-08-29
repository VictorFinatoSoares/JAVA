package sessoes.Estudo2908;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;
        } else {
            System.out.println("ERRO: O valor depositado é INVÁLIDO!");
        }
    }

    public void sacar(double valorSacado) {
        if (valorSacado > 0 && valorSacado <= this.saldo) {
            this.saldo -= valorSacado;
        } else {
            System.out.println("ERRO: O valor sacado é INVÁLIDO!");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: R$ %.2f%n", this.titular, this.saldo);
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void transferir(Conta destino, double valorTransferido) {
        if (valorTransferido > 0 && valorTransferido <= this.saldo) {
            this.saldo -= valorTransferido;
            destino.depositar(valorTransferido);
        } else {
            System.out.println("ERRO: Valor transferido INVÁLIDO!");
        }
    }


}
