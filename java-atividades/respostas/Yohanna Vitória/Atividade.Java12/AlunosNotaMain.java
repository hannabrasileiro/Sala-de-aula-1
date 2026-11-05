public class AlunosNotaMain {

    public static void main(String[] args) {

        AlunosNota aluno1 = new AlunosNota();
        AlunosNota aluno2 = new AlunosNota();

        aluno1.nome = "Maria";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        aluno2.nome = "João";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();

    }
}