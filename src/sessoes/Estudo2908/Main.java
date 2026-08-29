package sessoes.Estudo2908;

public class Main {
    public static void main(String[] args) {
        Conta contaJoao = new Conta("João", 25);
        Conta contaMessi = new Conta("Messi", 375);

        contaJoao.exibirSaldo();
        contaMessi.exibirSaldo();

        contaJoao.depositar(50);
        contaJoao.depositar(-10);

        contaJoao.sacar(15);
        contaJoao.sacar(100);

        contaMessi.sacar(75);

        contaJoao.exibirSaldo();
        contaMessi.exibirSaldo();

        // Teste de getter:
        if (contaJoao.getSaldo() > 50) {
            System.out.println("O saldo de João é maior que 50.");
        }

        contaJoao.transferir(contaMessi, 20);

        contaJoao.exibirSaldo();
        contaMessi.exibirSaldo();

        contaJoao.transferir(contaMessi, 100);

        contaJoao.exibirSaldo();
        contaMessi.exibirSaldo();

        contaJoao.transferir(contaMessi, -10);

        contaJoao.exibirSaldo();
        contaMessi.exibirSaldo();

    }
}
