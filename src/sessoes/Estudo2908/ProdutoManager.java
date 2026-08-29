package sessoes.Estudo2908;

class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
    public int getEstoque() {
        return this.estoque;
    }

    public void adicionarEstoque(int estoque) {
        if (estoque > 0) {
            this.estoque += estoque;
        } else {
            System.out.println("Estoque negativo");
        }

    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
        } else {
            System.out.println("ERRO: Quantidade INVÁLIDA!");
        }
    }

    public void exibirDados() {
        System.out.printf("Produto: %s%nPreço: R$ %.2f%nQuantidade no estoque: %d%n", this.nome, this.preco, this.estoque);
    }

}

public class ProdutoManager {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado Gamer", 299.99, 10);

        teclado.exibirDados();

        teclado.adicionarEstoque(5);
        teclado.exibirDados();

        teclado.vender(4);
        teclado.exibirDados();

        teclado.vender(500);

    }
}
