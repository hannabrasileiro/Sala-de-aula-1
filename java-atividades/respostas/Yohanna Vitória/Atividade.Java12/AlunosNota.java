public class AlunosNota {

    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + calcularMedia());

        if (calcularMedia() >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println("----------------------");
    }

}