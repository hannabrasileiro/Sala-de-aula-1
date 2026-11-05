public class AlunoMain {

    public static void main(String[] args) {

        AlunoCadastro aluno1 = new AlunoCadastro();
        AlunoCadastro aluno2 = new AlunoCadastro();
        AlunoCadastro aluno3 = new AlunoCadastro();

        aluno1.nome = "Maria";
        aluno1.idade = 20;
        aluno1.curso = "ADS";
        aluno1.matricula = "2026001";

        aluno2.nome = "João";
        aluno2.idade = 22;
        aluno2.curso = "Engenharia";
        aluno2.matricula = "2026002";

        aluno3.nome = "Ana";
        aluno3.idade = 19;
        aluno3.curso = "Direito";
        aluno3.matricula = "2026003";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();

    }
}