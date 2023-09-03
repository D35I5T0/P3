import java.util.Scanner;
public class Aluno {
    private String nome;
    private String cpf;
    private double[] notas = new double[4];

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void aplicarNotas(double n1, double n2, double n3, double n4) {
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notas[3] = n4;
    }

    public double calcularMedia() {
        double nota = 0;
        for (int i = 0; i < 4; i++) {
            nota += notas[i];
        }
        double media = nota / 4;
        return media;
    }

    public void alterarNotas (int posicao, double nota) {
        notas[posicao - 1] = nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();
        Aluno aluno = new Aluno (nome, cpf);

        System.out.println("Informe as 4 notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        aluno.aplicarNotas(n1, n2, n3, n4);
        double media = aluno.calcularMedia();
        System.out.println(media);

        System.out.println("Informe a nota nova: ");
        n2 = sc.nextDouble();
        aluno.alterarNotas(2, n2);
        media = aluno.calcularMedia();
        System.out.println(media);
        sc.close();
    }
}
