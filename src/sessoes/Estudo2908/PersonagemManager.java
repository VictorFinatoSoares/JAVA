package sessoes.Estudo2908;

class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void receberDano(int dano) {
        if (dano > 0) {
            if (dano <= this.vida) this.vida -= dano;
            else this.vida = 0;
        } else {
            System.out.println("ERRO: Quantidade de dano INVÁLIDO!");
        }
    }

    public void curar(int cura) {
        if (cura > 0 && cura <= 100 - this.vida) {
            this.vida += cura;
        } else {
            System.out.println("ERRO: Quantidade de cura inválida!");
        }
    }

    public void atacar(Personagem alvo, int dano) {
        alvo.receberDano(dano);
    }

    public void exibirEstado() {
        System.out.printf("Personagem: %s%nVida: %d%n", this.nome, this.vida);
    }


}

public class PersonagemManager {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("FinatoDev");
        Personagem p2 = new Personagem("FinaDODev");

        p1.exibirEstado();
        p2.exibirEstado();

        p1.atacar(p2, 30);
        p1.exibirEstado();
        p2.exibirEstado();


        p2.curar(20);
        p1.exibirEstado();
        p2.exibirEstado();


        p2.atacar(p1, -30);
        p1.exibirEstado();
        p2.exibirEstado();


        p1.atacar(p2, 200);
        p1.exibirEstado();
        p2.exibirEstado();
    }
}
