package sessoes.Estudo2908;

class Lampada {
    private String comodo;
    private boolean ligada;

    public Lampada(String comodo) {
        this.comodo = comodo;
        this.ligada = false;
    }

    public void  ligar() {
        this.ligada = true;
    }

    public void  desligar() {
        this.ligada = false;
    }

    public void alternar() {
        this.ligada = !this.ligada;
    }

    public void exibirEstado() {
        System.out.printf("Estado de %s: %s%n", this.comodo, this.ligada);
    }

    public String getComodo() {
        return this.comodo;
    }

    public boolean getState() {
        return this.ligada;
    }


}

public class LampadaManager {
    public static void main(String[] args) {
        Lampada quarto = new Lampada("Quarto");
        Lampada sala = new Lampada("Sala");

        quarto.exibirEstado();
        sala.exibirEstado();

        quarto.ligar();

        quarto.exibirEstado();
        sala.exibirEstado();

        sala.alternar();

        quarto.exibirEstado();
        sala.exibirEstado();
    }
}
