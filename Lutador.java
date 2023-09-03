public class Lutador {
    private String nome;
    private int forca;
    private int energia;

    public Lutador(String nome, int forca, int energia) {
        this.nome = nome;
        this.forca = forca;
        this.energia = energia;
    }

    public void reduzirEnergia (int qtd) {
        energia -= qtd;
    }
    
    public void aplicarGolpe(Lutador oponente) {
        int dano = this.forca;
        oponente.reduzirEnergia(dano);
    }

     public int getEnergia() {
        return energia;
    }

    public static void main(String[] args) {
        Lutador Ryu = new Lutador("Ryu", 10, 100);
        Lutador Bison = new Lutador("Bison", 12, 100);

        for (int i = 0; i < 3; i++) {
            Ryu.aplicarGolpe(Bison);
        }

        System.out.println(Bison.getEnergia());

        for (int i = 0; i < 8; i++) {
            Bison.aplicarGolpe(Ryu);
        }

        System.out.println(Ryu.getEnergia());
    }
}
