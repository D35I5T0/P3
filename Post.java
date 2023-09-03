import java.util.Scanner;
public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public Post(String texto, String link, int numeroCurtidas, int numeroCompartilhamentos) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = numeroCurtidas;
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public void curtir() {
        numeroCurtidas++;
    }
    
    public void compartilhar() {
        numeroCompartilhamentos++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite um link: ");
        String link = sc.nextLine();

        Post novoPost = new Post(texto, link, 0, 0);

        for (int i = 0; i < 3; i++) {
            novoPost.curtir();;
        }

        System.out.println(novoPost.getNumeroCurtidas());

        for (int i = 0; i < 2; i++) {
            novoPost.compartilhar();
        }

        System.out.println(novoPost.getNumeroCompartilhamentos());
        sc.close();
    }
}
